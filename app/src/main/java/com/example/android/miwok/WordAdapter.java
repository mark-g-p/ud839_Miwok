package com.example.android.miwok;


import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.android.miwok.databinding.ListItemBinding;

import java.util.ArrayList;

/**
 *
 */

public class WordAdapter extends ArrayAdapter<Word> {

    WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        ListItemBinding binding;
        if (listItemView == null) {
            binding = DataBindingUtil.inflate(
                    LayoutInflater.from(getContext()),
                    R.layout.list_item, parent, false);
            listItemView = binding.getRoot();
        } else {
            binding = (ListItemBinding) listItemView.getTag();
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Check if an image is provided for this word or not
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            binding.image.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            binding.image.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            binding.image.setVisibility(View.GONE);
        }
        binding.miwokTextView.setText(currentWord.getMiwokTranslation());
        binding.defaultTextView.setText(currentWord.getDefaultTranslation());
        listItemView.setTag(binding);
        return listItemView;
    }
}

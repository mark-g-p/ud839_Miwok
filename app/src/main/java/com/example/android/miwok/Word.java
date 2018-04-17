package com.example.android.miwok;

class Word {

    /**
     * Default translation for the word
     */
    private String DefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String MiwokTranslation;

    private int ImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageId            is the id of an image resource associated with the word
     */
    Word(String defaultTranslation, String miwokTranslation, int imageId) {
        DefaultTranslation = defaultTranslation;
        MiwokTranslation = miwokTranslation;
        ImageResourceId = imageId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    Word(String defaultTranslation, String miwokTranslation) {
        DefaultTranslation = defaultTranslation;
        MiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    String getDefaultTranslation() {
        return DefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    String getMiwokTranslation() {
        return MiwokTranslation;
    }

    int getImageResourceId() {
        return ImageResourceId;
    }

    /**
     * +     * Returns whether or not there is an image for this word.
     * +
     */
    public boolean hasImage() {
        return ImageResourceId != NO_IMAGE_PROVIDED;
    }
}

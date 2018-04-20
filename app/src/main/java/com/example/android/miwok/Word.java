package com.example.android.miwok;

class Word {

    /**
     * Default translation for the word
     */
    private String defaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String miwokTranslation;

    private int imageResourceId = NO_IMAGE_PROVIDED;

    private int audioResourceId;
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
    Word(String defaultTranslation, String miwokTranslation, int imageId, int audioResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = imageId;
        this.audioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResourceId = audioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    String getDefaultTranslation() {
        return defaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    String getMiwokTranslation() {
        return miwokTranslation;
    }

    int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * +     * Returns whether or not there is an image for this word.
     * +
     */
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
    /**
     * Get the ID od the recording of the word.
     */
    public int getAudioResourceId() {
        return audioResourceId;
    }
}

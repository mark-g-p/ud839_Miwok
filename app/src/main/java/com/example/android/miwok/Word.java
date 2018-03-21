package com.example.android.miwok;

class Word {

    /** Default translation for the word */
    private String DefaultTranslation;

    /** Miwok translation for the word */
    private String MiwokTranslation;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
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
}

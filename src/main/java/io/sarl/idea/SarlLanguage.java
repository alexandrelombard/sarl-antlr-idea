package io.sarl.idea;

import com.intellij.lang.Language;

public class SarlLanguage extends Language {
    public static final SarlLanguage INSTANCE = new SarlLanguage();

    private SarlLanguage() {
        super("Sarl");
    }
}

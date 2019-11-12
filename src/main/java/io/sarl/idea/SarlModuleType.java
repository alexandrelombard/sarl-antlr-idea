package io.sarl.idea;

import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.ModuleTypeManager;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class SarlModuleType extends ModuleType<SarlModuleBuilder> {

    public static final String ID = "SARL_MODULE";

    public static final SarlModuleType INSTANCE = (SarlModuleType) ModuleTypeManager.getInstance().findByID(ID);

    protected SarlModuleType() {
        super(ID);
    }

    @NotNull
    @Override
    public SarlModuleBuilder createModuleBuilder() {
        return SarlModuleBuilder.INSTANCE;
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    @NotNull
    @Override
    public String getName() {
        return "Sarl";
    }

    @Nls(capitalization = Nls.Capitalization.Sentence)
    @NotNull
    @Override
    public String getDescription() {
        return "Sarl module";
    }

    @Override
    public Icon getNodeIcon(boolean isOpened) {
        return null;
    }
}

package io.sarl.idea;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SarlFileType extends LanguageFileType {
	public static final String FILE_EXTENSION = "sarl";
	public static final SarlFileType INSTANCE = new SarlFileType();

	protected SarlFileType() {
		super(SarlLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "Sarl";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "Sarl file";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return FILE_EXTENSION;
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return Icons.SARL_ICON;
	}
}

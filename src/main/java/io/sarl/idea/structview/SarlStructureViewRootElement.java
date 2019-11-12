package io.sarl.idea.structview;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class SarlStructureViewRootElement extends SarlStructureViewElement {
	public SarlStructureViewRootElement(PsiFile element) {
		super(element);
	}

	@NotNull
	@Override
	public ItemPresentation getPresentation() {
		return new SarlRootPresentation((PsiFile)element);
	}
}

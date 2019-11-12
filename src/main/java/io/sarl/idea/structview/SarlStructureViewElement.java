package io.sarl.idea.structview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import org.antlr.intellij.adaptor.xpath.XPath;
import org.jetbrains.annotations.NotNull;

import io.sarl.idea.SarlLanguage;
import io.sarl.idea.psi.SarlPSIFileRoot;

public class SarlStructureViewElement implements StructureViewTreeElement, SortableTreeElement {
	protected final PsiElement element;

	public SarlStructureViewElement(PsiElement element) {
		this.element = element;
	}

	@Override
	public Object getValue() {
		return element;
	}

	@Override
	public void navigate(boolean requestFocus) {
		if (element instanceof NavigationItem ) {
			((NavigationItem) element).navigate(requestFocus);
		}
	}

	@Override
	public boolean canNavigate() {
		return element instanceof NavigationItem &&
			   ((NavigationItem)element).canNavigate();
	}

	@Override
	public boolean canNavigateToSource() {
		return element instanceof NavigationItem &&
			   ((NavigationItem)element).canNavigateToSource();
	}

	@NotNull
	@Override
	public String getAlphaSortKey() {
		String s = element instanceof PsiNamedElement ? ((PsiNamedElement) element).getName() : null;
		if ( s==null ) return "unknown key";
		return s;
	}

	@NotNull
	@Override
	public ItemPresentation getPresentation() {
		return new SarlItemPresentation(element);
	}

	@NotNull
	@Override
	public TreeElement[] getChildren() {
		if ( element instanceof SarlPSIFileRoot) {
			Collection<? extends PsiElement> classes = XPath.findAll(SarlLanguage.INSTANCE, element, "/sarlFile/classDeclaration/identifier");
			List<TreeElement> treeElements = new ArrayList<>(classes.size());
			for (PsiElement el : classes) {
				treeElements.add(new SarlStructureViewElement(el));
			}
			return treeElements.toArray(new TreeElement[classes.size()]);
		}
		return new TreeElement[0];
	}
}

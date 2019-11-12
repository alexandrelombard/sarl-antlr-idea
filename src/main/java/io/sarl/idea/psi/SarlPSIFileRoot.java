package io.sarl.idea.psi;

import javax.swing.*;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;

import org.antlr.intellij.adaptor.SymtabUtils;
import org.antlr.intellij.adaptor.psi.ScopeNode;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import io.sarl.idea.Icons;
import io.sarl.idea.SarlFileType;
import io.sarl.idea.SarlLanguage;

public class SarlPSIFileRoot extends PsiFileBase implements ScopeNode {
    public SarlPSIFileRoot(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SarlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return SarlFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Sarl language file";
    }

    @Override
    public Icon getIcon(int flags) {
        return Icons.SARL_ICON;
    }

	/** Return null since a file scope has no enclosing scope. It is
	 *  not itself in a scope.
	 */
	@Override
	public ScopeNode getContext() {
		return null;
	}

	@Nullable
	@Override
	public PsiElement resolve(PsiNamedElement element) {
		System.out.println(getClass().getSimpleName()+
		                   ".resolve("+element.getName()+
		                   " at "+Integer.toHexString(element.hashCode())+")");
		if ( element.getParent() instanceof CallSubtree ) {
			return SymtabUtils.resolve(this, SarlLanguage.INSTANCE,
			                           element, "/script/function/ID");
		}
		return SymtabUtils.resolve(this, SarlLanguage.INSTANCE,
		                           element, "/script/vardef/ID");
	}
}

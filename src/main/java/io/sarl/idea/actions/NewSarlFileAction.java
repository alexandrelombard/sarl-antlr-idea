package io.sarl.idea.actions;

import com.intellij.ide.IdeBundle;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.ide.actions.CreateFromTemplateAction;
import com.intellij.ide.fileTemplates.FileTemplate;
import com.intellij.ide.fileTemplates.FileTemplateManager;
import com.intellij.ide.fileTemplates.FileTemplateUtil;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.InputValidatorEx;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import io.sarl.idea.Icons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Properties;

public class NewSarlFileAction extends CreateFromTemplateAction<PsiFile> {

    public NewSarlFileAction() {
        super("Sarl File", null, Icons.SARL_ICON);
    }

    @Nullable
    @Override
    protected PsiFile createFile(String name, String templateName, PsiDirectory dir) {
        final Project project = dir.getProject();
        final Properties props = new Properties(FileTemplateManager.getInstance(project).getDefaultProperties());
        props.setProperty(FileTemplate.ATTRIBUTE_NAME, name);

        final FileTemplate template = FileTemplateManager.getInstance(project).getInternalTemplate(templateName);

        try {
            final PsiElement element = FileTemplateUtil.createFromTemplate(template, name, props, dir, getClass().getClassLoader());
            return element.getContainingFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void buildDialog(Project project, PsiDirectory directory, CreateFileFromTemplateDialog.Builder builder) {
        builder.setTitle(IdeBundle.message("action.create.new.class"));

        for(FileTemplate fileTemplate : SarlFileTemplateUtil.getApplicableTemplates(project)) {
            builder.addKind(
                    fileTemplate.getName(),
                    Icons.SARL_ICON,
                    SarlFileTemplateUtil.getTemplateShortName(fileTemplate.getName()));
        }

        builder.setValidator(new InputValidatorEx() {
            public String getErrorText(String inputString) {
                if (inputString.length() > 0 && !StringUtil.isJavaIdentifier(inputString)) {
                    return "This is not a valid Sarl name";
                } else {
                    return null;
                }
            }

            public boolean checkInput(String inputString) {
                return true;
            }

            public boolean canClose(String inputString) {
                return !StringUtil.isEmptyOrSpaces(inputString) && getErrorText(inputString) == null;
            }
        });
    }

    @Override
    protected String getActionName(PsiDirectory directory, @NotNull String newName, String templateName) {
        return "Create file " + newName;
    }
}

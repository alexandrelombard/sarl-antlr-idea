package io.sarl.idea.actions;

import com.intellij.ide.fileTemplates.FileTemplate;
import com.intellij.ide.fileTemplates.FileTemplateManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Condition;
import com.intellij.util.SmartList;
import com.intellij.util.containers.ContainerUtil;
import io.sarl.idea.SarlFileType;

import java.util.List;

public class SarlFileTemplateUtil {

    public static final String SARL_TEMPLATE_PREFIX = "Sarl ";

    public static List<FileTemplate> getApplicableTemplates(Project project) {
        return getApplicableTemplates(project, (fileTemplate -> SarlFileType.FILE_EXTENSION.equals(fileTemplate.getExtension())));
    }

    public static List<FileTemplate> getApplicableTemplates(
            Project project,
            Condition<FileTemplate> filter) {
        final List<FileTemplate> applicableTemplates = new SmartList<>();
        applicableTemplates.addAll(ContainerUtil.findAll(FileTemplateManager.getInstance(project).getInternalTemplates(), filter));
        applicableTemplates.addAll(ContainerUtil.findAll(FileTemplateManager.getInstance(project).getAllTemplates(), filter));
        return applicableTemplates;
    }

    public static String getTemplateShortName(String templateName) {
        if (templateName.startsWith(SARL_TEMPLATE_PREFIX)) {
            return templateName.substring(SARL_TEMPLATE_PREFIX.length());
        } else {
            return templateName;
        }
    }
}

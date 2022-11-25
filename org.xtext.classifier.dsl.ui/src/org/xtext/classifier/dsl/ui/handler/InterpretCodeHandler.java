package org.xtext.classifier.dsl.ui.handler;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.xtext.classifier.dsl.generator.PClassifierPythonGenerator;
import org.xtext.classifier.dsl.ui.views.InterpreterView;

public class InterpretCodeHandler extends AbstractHandler implements IHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {

        IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
        IFile file = (IFile) activeEditor.getEditorInput().getAdapter(IFile.class);
        if (file != null) {
            IProject project = file.getProject();
            
            InterpreterView interpretorView;
            PClassifierPythonGenerator pythonInterpretor;
            try 
            {
                interpretorView = (InterpreterView) HandlerUtil.getActiveWorkbenchWindowChecked(event).getActivePage().showView("org.xtext.classifier.dsl.ui.views.InterpreterView");
            } catch (PartInitException e) 
            {
                e.printStackTrace();
                return null;
            }
            
            pythonInterpretor = new PClassifierPythonGenerator();


            if (activeEditor instanceof XtextEditor) {
                ((XtextEditor)activeEditor).getDocument().readOnly(new IUnitOfWork<Boolean, XtextResource>() {

                    @Override
                    public Boolean exec(XtextResource state) {
                    	interpretorView.setText("Execution en cours dans "+file.getLocationURI().getRawPath());
                    	
                    	String result = pythonInterpretor.doExecute(state.getResourceSet().getResources().get(0));
                    	//String result = pythonInterpretor.doGenerate(state.getResourceSet().getResources().get(0));
                    	interpretorView.setText(result);
                        return Boolean.TRUE;
                    }
                });

            }
        }
        return null;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
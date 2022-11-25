package org.xtext.classifier.dsl.ui.views;

import org.eclipse.swt.widgets.*;
import org.eclipse.ui.part.ViewPart;

public class InterpreterView extends ViewPart {
        private Label label;
        
        /**
         * Constructor
         */
        public InterpreterView() {
                super();
        }
     
        public void setFocus() {
                label.setFocus();
        }
     
        public void createPartControl(Composite parent) {
            label = new Label(parent, 0);
            label.setText("Interpréteur en attente");
        }
        
        public void setText(String str)
        {
            label.setText(str);
            label.setEnabled(true);
        }

}
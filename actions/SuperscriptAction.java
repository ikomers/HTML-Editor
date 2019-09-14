package com.javarush.task.task32.task3209.actions;

import org.omg.PortableServer.THREAD_POLICY_ID;

import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class SuperscriptAction extends StyledEditorKit.StyledTextAction {
    /**
     * Creates a new StyledTextAction from a string action name.
     *
     * @param nm the name of the action
     */
    public SuperscriptAction(String nm) {
        super(nm);
    }

    public SuperscriptAction() {
        super(DEFAULT);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.manager;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author kiki
 */
public class AssetButton extends JButton {
    Integer index;
    boolean multiSelection;

    public boolean isMultiSelection() {
        return multiSelection;
    }

    public void setMultiSelection(boolean MultiSelection) {
        this.multiSelection = MultiSelection;
    }

    public AssetButton() {
    }

    public AssetButton(Icon icon) {
        super(icon);
    }

    public AssetButton(String text) {
        super(text);
    }

    public AssetButton(Action a) {
        super(a);
    }

    public AssetButton(String text, Icon icon) {
        super(text, icon);
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}

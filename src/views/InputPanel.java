package views;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputPanel extends JPanel{
    JLabel label;
    JTextField field;

    public InputPanel() {
        this.initComponent();
        addComponent();
    }

    // a megjelenő szöveget paraméterként kérjük 
    public InputPanel(String text) {
        this.initComponent();
        this.label.setText(text);
        addComponent();
    }

    private void initComponent() {
        this.label = new JLabel();
        this.field = new JTextField();
    }
    
    public void setLabel(String text){
        this.label.setText(text);
    }
    
    public void setValue(String text){
        this.field.setText(text);
    }

    public String getValue(){
        return this.field.getText();
    }

    private void addComponent(){
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.add(this.label);
        this.add(this.field);
    }
}

package views;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame{

    InputPanel perimeterPanel;
    InputPanel longPanel;
    InputPanel weightPanel;

    public MainFrame() {        
        this.initComponent();
        this.addComponent();
        this.setFrame();        
    }
    
    private void initComponent(){
        this.perimeterPanel = new InputPanel("Kerület");
        this.longPanel = new InputPanel("Hossz");
        this.weightPanel = new InputPanel("Súly");
    }

    private void addComponent(){
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.add(this.perimeterPanel);
        this.add(longPanel);
        this.add(weightPanel);
    }

    private void setFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);

    }

}

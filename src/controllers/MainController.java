package controllers;

import views.MainFrame;

public class MainController {

    MainFrame mainFrame;

    public MainController() {
        this.mainFrame = new MainFrame();
        handleEvents();


        
    }

    private void handleEvents(){
        this.mainFrame.getCalcButton().addActionListener(e -> {
            this.startCalc();
        });
    }
    
    private void startCalc(){
        System.out.println("Működik");
        double perimeter = Double.parseDouble(this.mainFrame.getPerimeterPanel().getValue());
        double length = Double.parseDouble(this.mainFrame.getLongPanel().getValue());     
        Double weight = calcWeight(perimeter, length);
        this.mainFrame.getWeightPanel().setValue(weight.toString());

    }

    public double calcWeight(double perimeter, double length){
        double weight = (perimeter * perimeter * length) / 11877;
        return weight;
        // 30 * 35 = 2.6521848951755493
        // 130 * 135 = 192.0939631220005
        // 150 * 160 = 303.1068451629199
        // return 2.6521848951755493;
    }

}

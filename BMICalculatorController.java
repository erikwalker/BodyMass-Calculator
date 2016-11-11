/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Erik.Walker
 */
public class BMICalculatorController
{
    // GUI controls defined in FXML and used by controller 
    @FXML 
    private TextField weightTextField;
    
    @FXML
    private TextField heightTextField;
    
    @FXML
    private TextField bmiTextField;
    
    @FXML
    private RadioButton englishRadioButton;
    
    @FXML
    private RadioButton metricRadioButton;
    
    // calculates and displays the tip and total amounts
    
    @FXML
    private void calculateButtonPressed(ActionEvent Event)
    {
        double weight = Double.parseDouble(weightTextField.getText());
        double height = Double.parseDouble(heightTextField.getText());
        
        double bmi;
        if(englishRadioButton.isSelected())
        {
            bmi = (weight *703)/ (height *height);
            
        }
        
        else // metric
        {
            bmi = weight / (height * height);
        }
        
        bmiTextField.setText(String.format(".2f", bmi));
    }   
    
    // called by FXMLLoader it initialize the controller 
    public void initialize()
    {
        ToggleGroup group = new ToggleGroup();
        englishRadioButton.setToggleGroup(group);
        metricRadioButton.setToggleGroup(group);
    }
           
}

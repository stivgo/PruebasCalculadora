/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorgui;

import businessLogic.Calculadora;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Anabel
 */
public class FXMLDocumentController implements Initializable {
    
    private float data;
    private int operation = -1;
    private int cont = 0;
    
    @FXML
    private Button one;

    @FXML
    private Button eight;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button five;

    @FXML
    private Button seven;

    @FXML
    private Button four;

    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button mult;

    @FXML
    private Button zero;

    @FXML
    private Button equals;

    @FXML
    private Button clear;

    @FXML
    private Button div;
    
    @FXML
    private Button back;

    @FXML
    private Button mod;

    @FXML
    private Button signo;

    @FXML
    private Button coma;

    @FXML
    private Button tenPow;

    @FXML
    private Button sqrt;

    @FXML
    private Button nFact;

    @FXML
    private Button log;


    @FXML
    private TextField display;
    
    private boolean clearScreen = false;
    private float lastResult = Float.NaN;
    private boolean operatorOn = true;
    
    private void calculateDirectly(){
        equals.fire();
        operatorOn = true;
    }
    
    private float getFirstValue() throws Exception{
        if ( !display.getText().equals( "" ) ){
            return Float.parseFloat(display.getText());
        }
        else if ( lastResult != Float.NaN ){
            return lastResult;
        }
        else{
            throw new Exception("No data for such operator");
        }
        
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        try{
           if ( clearScreen ){
                display.setText("");
            }
            clearScreen = false;

            if (event.getSource() == one) {
                display.setText(display.getText() + "1");
                operatorOn = false;
            } else if (event.getSource() == two) {
                display.setText(display.getText() + "2");
                operatorOn = false;
            } else if (event.getSource() == three) {
                display.setText(display.getText() + "3");
                operatorOn = false;
            } else if (event.getSource() == four) {
                display.setText(display.getText() + "4");
                operatorOn = false;
            } else if (event.getSource() == five) {
                display.setText(display.getText() + "5");
                operatorOn = false;
            } else if (event.getSource() == six) {
                display.setText(display.getText() + "6");
                operatorOn = false;
            } else if (event.getSource() == seven) {
                display.setText(display.getText() + "7");
                operatorOn = false;
            } else if (event.getSource() == eight) {
                display.setText(display.getText() + "8");
                operatorOn = false;
            } else if (event.getSource() == nine) {
                display.setText(display.getText() + "9");
                operatorOn = false;
            } else if (event.getSource() == zero) {
                display.setText(display.getText() + "0");
                operatorOn = false;
            } else if (event.getSource() == clear) {
                display.setText("");
                operatorOn = true;
            }
            else if (event.getSource() == plus) {
                data = getFirstValue();
                operation = 1; //Addition
                display.setText("");
                operatorOn = true;
            } else if (event.getSource() == minus) {
                if ( operatorOn ){
                    display.setText(display.getText()+"-");
                    operatorOn = true;
                }
                else{
                    data = getFirstValue();
                    operation = 2; //Substraction
                    display.setText("");
                }            
            } else if (event.getSource() == mult) {
                data = getFirstValue();
                operation = 3; //Mul
                display.setText("");
                operatorOn = true;
            } else if (event.getSource() == div) {
                data = getFirstValue();
                operation = 4; //Division
                operatorOn = true;
                display.setText("");
            }else if (event.getSource() == back) {
                operation = 5; //Back
                calculateDirectly();
            }else if (event.getSource() == mod) {
                data = getFirstValue();
                operation = 6; //Module
                display.setText("");
            }else if (event.getSource() == signo) {
                data = getFirstValue();
                operation = 7; //Signo
                display.setText("");
                calculateDirectly();
            }else if (event.getSource() == coma) {
                String coma = Calculadora.coma(display.getText());
                display.setText(String.valueOf(coma));return;
            }else if (event.getSource() == tenPow) {
                data = getFirstValue();
                operation = 9; //tenPow
                display.setText("");
            }else if (event.getSource() == sqrt) {
                data = getFirstValue();
                operation = 10; //sqrt
                display.setText("");
                calculateDirectly();
            }else if (event.getSource() == nFact) {
                data = getFirstValue();
                operation = 11; //nFact
                display.setText("");
                calculateDirectly();
            }else if (event.getSource() == log) {
                data = getFirstValue();
                operation = 12; //log
                display.setText("");
                calculateDirectly();
            }
            else if (event.getSource() == equals) {
                cont = 0;
                float secondOperand; 
                float ans = 0;
                switch (operation) {
                    case 1: //Addition
                        secondOperand = Float.parseFloat(display.getText());
                        ans = Calculadora.add(data, secondOperand);
                        display.setText(String.valueOf(ans));break;
                    case 2: //Subtraction
                        secondOperand = Float.parseFloat(display.getText());
                        ans = Calculadora.substract(data, secondOperand);
                        display.setText(String.valueOf(ans));break;
                    case 3: //Mul
                        secondOperand = Float.parseFloat(display.getText());
                        ans = Calculadora.multiply(data, secondOperand);
                        display.setText(String.valueOf(ans));break;
                    case 4: //Div
                        secondOperand = Float.parseFloat(display.getText());
                        ans = 0f;
                        ans = Calculadora.div(data, secondOperand);                    
                        display.setText(String.valueOf(ans));break;
                    case 5: //back
                        String ans1 = Calculadora.back() + "";
                        display.setText(String.valueOf(ans1));break;
                    case 6: //module
                        secondOperand = Float.parseFloat(display.getText());
                        ans = Calculadora.module(data, secondOperand);
                        display.setText(String.valueOf(ans));break;
                    case 7: //Signo
                        ans = Calculadora.signo(data);
                        display.setText(String.valueOf(ans));break;
                    case 9: //tenPow
                        secondOperand = Float.parseFloat(display.getText());
                        ans = Calculadora.tenPow(data, secondOperand);
                        display.setText(String.valueOf(ans));break;
                    case 10: //sqrt
                        //secondOperand = Float.parseFloat(display.getText());
                        ans = Calculadora.sqrt(data);
                        display.setText(String.valueOf(ans));break;
                    case 11: //nFact
                        ans = Calculadora.nFact(data);
                        display.setText(String.valueOf(ans));break;
                    case 12: //Log
                        //secondOperand = Float.parseFloat(display.getText());
                        ans = Calculadora.log(data);
                        display.setText(String.valueOf(ans));break;              
                }
                lastResult = ans;
                clearScreen = true;
                operatorOn = false;
            } 
        }
        catch(Exception e){
            display.setText( e.getMessage() );
            clearScreen = true;
        }
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

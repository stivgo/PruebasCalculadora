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
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == clear) {
            display.setText("");
        }
        else if (event.getSource() == plus) {
            data = Float.parseFloat(display.getText());
            operation = 1; //Addition
            display.setText("");
        } else if (event.getSource() == minus) {
            if(display.getText().equalsIgnoreCase("")){
                display.setText(display.getText()+"-");
            }else{
                data = Float.parseFloat(display.getText());
                operation = 2; //Substraction
                display.setText("");
            }
            
            
        } else if (event.getSource() == mult) {
            data = Float.parseFloat(display.getText());
            operation = 3; //Mul
            display.setText("");
        } else if (event.getSource() == div) {
            data = Float.parseFloat(display.getText());
            operation = 4; //Division
            display.setText("");
        }else if (event.getSource() == back) {
            data = Float.parseFloat(display.getText());
            operation = 5; //Back
            display.setText("");
        }else if (event.getSource() == mod) {
            data = Float.parseFloat(display.getText());
            operation = 6; //Module
            display.setText("");
        }else if (event.getSource() == signo) {
            data = Float.parseFloat(display.getText());
            operation = 7; //Signo
            display.setText("");
        }else if (event.getSource() == coma) {
            if (cont == 0){
                display.setText(display.getText() + ".");
                cont++;
            }
             
        }else if (event.getSource() == tenPow) {
            data = Float.parseFloat(display.getText());
            operation = 9; //tenPow
            display.setText("");
        }else if (event.getSource() == sqrt) {
            data = Float.parseFloat(display.getText());
            operation = 10; //sqrt
            display.setText("");
        }else if (event.getSource() == nFact) {
            data = Float.parseFloat(display.getText());
            operation = 11; //nFact
            display.setText("");
        }else if (event.getSource() == log) {
            data = Float.parseFloat(display.getText());
            operation = 12; //log
            display.setText("");
        }
        else if (event.getSource() == equals) {
            cont = 0;
            float secondOperand; 
            switch (operation) {
                case 1: //Addition
                    secondOperand = Float.parseFloat(display.getText());
                    float ans = Calculadora.add(data, secondOperand);
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
                    String ans1 = Calculadora.back();
                    display.setText(String.valueOf(ans1));break;
                case 6: //module
                    secondOperand = Float.parseFloat(display.getText());
                    ans = Calculadora.module(data, secondOperand);
                    display.setText(String.valueOf(ans));break;
                case 7: //Signo
                    ans = Calculadora.signo(data);
                    display.setText(String.valueOf(ans));break;
                case 8: //Coma
                    char coma = Calculadora.coma();
                    display.setText(String.valueOf(coma));break;
                case 9: //tenPow
                    secondOperand = Float.parseFloat(display.getText());
                    ans = Calculadora.tenPow(data, secondOperand);
                    display.setText(String.valueOf(ans));break;
                case 10: //sqrt
                    secondOperand = Float.parseFloat(display.getText());
                    ans = Calculadora.sqrt(data, secondOperand);
                    display.setText(String.valueOf(ans));break;
                case 11: //nFact
                    ans = Calculadora.nFact(data);
                    display.setText(String.valueOf(ans));break;
                case 12: //Log
                    secondOperand = Float.parseFloat(display.getText());
                    ans = Calculadora.log(data, secondOperand);
                    display.setText(String.valueOf(ans));break;
                
               
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

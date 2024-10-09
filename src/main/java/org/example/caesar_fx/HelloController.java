package org.example.caesar_fx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;

public class HelloController {
    @FXML
    private TextArea outText;
    @FXML
    private TextArea inText;
    @FXML
    private TextField key;

    @FXML
    protected void codingButtonClick() {
         Cod cod=new Cod(inText.getText(), Integer.parseInt(key.getText()) );
         outText.setText(cod.coding());

    }
    @FXML
    protected void decodingButtonClick() {
        Cod cod=new Cod(inText.getText(), Integer.parseInt(key.getText()) );
        outText.setText(cod.decoding());
    }
    @FXML
    protected void brutForceButtonClick() {
        String[] masString=inText.getText().split(" ");
        String BrutForce="";
        String outBrut="";
        Cod brut;
        for (int i = 0; i < masString.length/2; i++) {
            BrutForce+=masString[i]+" ";
        }
        for (int j = 1; j <32 ; j++) {
            brut=new Cod(BrutForce,j);
            outBrut+="Сдвиг "+j+".\n"+brut.decoding();
            outBrut+="\n";
        }
        outBrut+="\nВведите подходящий ключ и нажмите кнопку расшифровать";
        outText.setText(outBrut);
    }
}
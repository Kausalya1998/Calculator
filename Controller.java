package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    Float data = 0f;
    int operation = -1;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btn0;

    @FXML
    private Button btncl;

    @FXML
    private Button btnsin;

    @FXML
    private Button btncos;

    @FXML
    private Button btnexp;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btnpnt;

    @FXML
    private Button btnadd;

    @FXML
    private Button btnsub;

    @FXML
    private Button btndiv;

    @FXML
    private Button btnMul;

    @FXML
    private Button btntan;

    @FXML
    private Button btneql;

    @FXML
    private TextField tf;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource()==btn0){
            tf.setText(tf.getText()+"0");
        } else if(event.getSource()==btn1)
        {
            tf.setText(tf.getText()+"1");
        } else if(event.getSource()==btn2)
        {
            tf.setText(tf.getText()+"2");
        } else if(event.getSource()==btn3){

            tf.setText(tf.getText()+"3");
        } else if(event.getSource()==btn4)
        {
            tf.setText(tf.getText()+"4");
        } else if(event.getSource()==btn5)
        {
            tf.setText(tf.getText()+"5");
        } else if(event.getSource()==btn6)
        {
            tf.setText(tf.getText()+"6");
        } else if(event.getSource()==btn7)
        {
            tf.setText(tf.getText()+"7");
        } else if(event.getSource()==btn8)
        {
            tf.setText(tf.getText()+"8");
        } else if(event.getSource()==btn9)
        {
            tf.setText(tf.getText()+"9");
        } else if(event.getSource()==btncl)
        {
            tf.setText(" ");
        } else if(event.getSource()==btnpnt)
        {
            if (tf.getText().contains(".")) {
                return;
            } else {
                tf.setText(tf.getText() + ".");
            }
        } else if(event.getSource()==btnadd)
        {
            data=Float.parseFloat(tf.getText());
            operation = 1;
            tf.setText(" ");
        } else if(event.getSource()==btnsub)
        {
            data=Float.parseFloat(tf.getText());
            operation = 2;
            tf.setText(" ");
        } else if(event.getSource()==btnMul)
        {
            data=Float.parseFloat(tf.getText());
            operation = 3;
            tf.setText(" ");
        } else if(event.getSource()==btndiv)
        {
            data=Float.parseFloat(tf.getText());
            operation = 4;
            tf.setText(" ");
        } else if(event.getSource()==btnexp)
        {
            data=Float.parseFloat(tf.getText());
            operation = 5;
            tf.setText(" ");
        } else if(event.getSource()==btnsin)
        {
            data=Float.parseFloat(tf.getText());
            operation = 6;
            tf.setText(" ");
        } else if(event.getSource()==btncos)
        {
            data=Float.parseFloat(tf.getText());
            operation = 7;
            tf.setText(" ");
        } else if(event.getSource()==btntan)
        {
            data=Float.parseFloat(tf.getText());
            operation = 8;
            tf.setText(" ");
        } else if(event.getSource()==btneql)
        {
            float secondOperand = Float.parseFloat(tf.getText());
            switch (operation){
                case 1:
                    float ans = data + secondOperand;
                    tf.setText(String.valueOf(ans));
                    break;

                case 2:
                    ans = data - secondOperand;
                    tf.setText(String.valueOf(ans));
                    break;

                case 3:
                    ans = data * secondOperand;
                    tf.setText(String.valueOf(ans));
                    break;

                case 4:
                    ans = 0f;
                    try {
                        ans = data / secondOperand;
                    } catch (Exception e){tf.setText("Error");}
                    tf.setText(String.valueOf(ans));
                    break;


                //don't know how to do mod sin cos and tan
                case 5:
                    ans = data * secondOperand;
                    tf.setText(String.valueOf(Math.sin(Math.toRadians(ans))));
                    break;

                case 6:
                    ans = data + secondOperand;
                    tf.setText(String.valueOf(ans));
                    break;

                case 7:
                    ans = data + secondOperand;
                    tf.setText(String.valueOf(ans));
                    break;

                case 8:
                    ans = data^secondOperand;
                    tf.setText(float.valueOf(Math.pow(ans));
                    break;

            }
        }


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

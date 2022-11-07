import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainFormController {

    public TextField txtInput;

    public void num1OnAction(MouseEvent mouseEvent) {
        setNumber(1);
    }

    public void num2OnAction(MouseEvent mouseEvent) {
        setNumber(2);
    }

    public void num5OnAction(MouseEvent mouseEvent) {
        setNumber(5);
    }

    public void num4OnAction(MouseEvent mouseEvent) {
        setNumber(4);
    }

    public void num3OnAction(MouseEvent mouseEvent) {
        setNumber(3);
    }

    public void num6OnAction(MouseEvent mouseEvent) {
        setNumber(6);
    }

    public void num7OnAction(MouseEvent mouseEvent) {
        setNumber(7);
    }

    public void num8OnAction(MouseEvent mouseEvent) {
        setNumber(8);
    }

    public void EqOnAction(MouseEvent mouseEvent) {

    }

    public void num0OnAction(MouseEvent mouseEvent) {
        setNumber(0);
    }

    public void num9OnAction(MouseEvent mouseEvent) {
        setNumber(9);
    }

    public void MulOnAction(MouseEvent mouseEvent) {
        exec('*');
    }

    public void DivOnAction(MouseEvent mouseEvent) {
        exec('/');
    }

    public void SubOnAction(MouseEvent mouseEvent) {
        exec('-');
    }

    public void SumOnAction(MouseEvent mouseEvent) {
        exec('+');
    }

    private double numberOne=0;
    private double numberTwo=0;
    private char exp='+';
    private void setNumber(int number){

        if(txtInput.getText().isEmpty() || Integer.parseInt(txtInput.getText())==0){
            txtInput.setText(String.valueOf(number));
            return;
        }
        txtInput.setText(txtInput.getText()+(number));
    }

    private  void exec(char exp){
        this.exp=exp;
        if(numberOne==0) {
            numberOne = Double.parseDouble(txtInput.getText());
            txtInput.clear();
        }
        else {
            numberTwo=Double.parseDouble(txtInput.getText());
            calculate();
        }

    }

    private  void calculate(){

        double answer=0;

        switch(exp){
            case '+': answer=numberOne+numberTwo; break;
            case '-': answer=numberOne+numberTwo; break;
            case '/': answer=numberOne+numberTwo; break;
            case '*': answer=numberOne+numberTwo; break;
        }
        txtInput.setText(String.valueOf(answer));
    }
}

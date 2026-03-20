package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends Frame{
    Label title;
    TextField inputBox;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btn_add;
    Button btn_sub;
    Button btn_multi;
    Button btn_div;
    Button btn_equal;
    Button btn_reset;
    Button btn_remove;

    Calculator(){
    
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.render();


    }

    public void render(){
        addWidget();
        addEventFn();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public void addEventFn(){
        btn1.addActionListener(new BtnEvent(btn1, inputBox));
        btn2.addActionListener(new BtnEvent(btn2, inputBox));
        btn3.addActionListener(new BtnEvent(btn3, inputBox));
        btn4.addActionListener(new BtnEvent(btn4, inputBox));
        btn5.addActionListener(new BtnEvent(btn5, inputBox));
        btn6.addActionListener(new BtnEvent(btn6, inputBox));
        btn7.addActionListener(new BtnEvent(btn7, inputBox));
        btn8.addActionListener(new BtnEvent(btn8, inputBox));
        btn9.addActionListener(new BtnEvent(btn9, inputBox));
        btn0.addActionListener(new BtnEvent(btn0, inputBox));
        btn_add.addActionListener(new BtnEvent(btn_add, inputBox));
        btn_sub.addActionListener(new BtnEvent(btn_sub, inputBox));
        btn_multi.addActionListener(new BtnEvent(btn_multi, inputBox));
        btn_div.addActionListener(new BtnEvent(btn_div, inputBox));
        btn_equal.addActionListener(new BtnEvent(btn_equal, inputBox));
        btn_reset.addActionListener(new BtnEvent(btn_reset, inputBox));
        btn_remove.addActionListener(new BtnEvent(btn_remove, inputBox));
    }
    public void addWidget(){
        int marginX = 50;
        int marginY = 50;
        int btnWidth = 50;
        int btnHeight = 50;

        title = new Label("Calc Value");
        title.setBounds(marginX, marginY,400,50);
        add(title);

        inputBox = new TextField();
        inputBox.setBounds(marginX, marginY+50,350,50);
        add(inputBox);

        btn_remove = new Button("<-");
        btn_remove.setBounds(marginX+380, marginY+50,btnWidth,btnHeight);
        add(btn_remove);

        btn1 = new Button("1");
        btn1.setBounds(marginX, marginY+150,btnWidth,btnHeight);
        add(btn1);

        btn2 = new Button("2");
        btn2.setBounds(marginX+100, marginY+150,btnWidth,btnHeight);
        add(btn2);

        btn3 = new Button("3");
        btn3.setBounds(marginX + 200, marginY+150,btnWidth,btnHeight);
        add(btn3);

        btn4 = new Button("4");
        btn4.setBounds(marginX, marginY+250,btnWidth,btnHeight);
        add(btn4);

        btn5 = new Button("5");
        btn5.setBounds(marginX+100, marginY+250,btnWidth,btnHeight);
        add(btn5);

        btn6 = new Button("6");
        btn6.setBounds(marginX + 200, marginY+250,btnWidth,btnHeight);
        add(btn6);

        btn7 = new Button("7");
        btn7.setBounds(marginX, marginY+350,btnWidth,btnHeight);
        add(btn7);

        btn8 = new Button("8");
        btn8.setBounds(marginX+100, marginY+350,btnWidth,btnHeight);
        add(btn8);

        btn9 = new Button("9");
        btn9.setBounds(marginX + 200, marginY+350,btnWidth,btnHeight);
        add(btn9);

        btn0 = new Button("0");
        btn0.setBounds(marginX+100, marginY+450,btnWidth,btnHeight);
        add(btn0);

        btn_reset = new Button("C");
        btn_reset.setBounds(marginX, marginY+450,btnWidth,btnHeight);
        add(btn_reset);

        btn_equal = new Button("=");
        btn_equal.setBounds(marginX + 200, marginY+450,btnWidth,btnHeight);
        add(btn_equal);

        btn_add = new Button("+");
        btn_add.setBounds(marginX+300, marginY+150,btnWidth,btnHeight);
        add(btn_add);

        btn_sub = new Button("-");
        btn_sub.setBounds(marginX+300, marginY+250,btnWidth,btnHeight);
        add(btn_sub);

        btn_multi = new Button("*");
        btn_multi.setBounds(marginX+300, marginY+350,btnWidth,btnHeight);
        add(btn_multi);

        btn_div = new Button("/");
        btn_div.setBounds(marginX+300, marginY+450,btnWidth,btnHeight);
        add(btn_div);



        setLayout(null);
        setSize(500,600);
        setVisible(true);
    }


}


class BtnEvent implements ActionListener {
    Button btn;
    TextField inputBox;
    BtnEvent(Button btn, TextField inputBox){
        this.btn = btn;
        this.inputBox = inputBox;
    }

    public void actionPerformed(ActionEvent e){
        String inputValue = inputBox.getText();
        String btnValue = btn.getLabel();
        if(btnValue.equals("=")){
            try {
                int output = BtnEvent.calculate(inputValue);
                String outputStr = String.valueOf(output);
                inputBox.setText(outputStr);
            } catch (Exception E) {
                inputBox.setText("#DEF");
            }
        }else if(btnValue.equals("C")){
            inputBox.setText("");    
        }else if(btnValue.equals("<-")){
            inputValue = inputValue.substring(0, inputValue.length() - 1);
            inputBox.setText(inputValue);
        }else{
            inputValue = inputValue + btnValue;
            inputBox.setText(inputValue);
        }
        
        
    }

    public static int calculate(String input) {

        char operator = ' ';
        int index = -1;

        // find operator
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operator = ch;
                index = i;
                break;
            }
        }

        // split numbers
        int num1 = Integer.parseInt(input.substring(0, index));
        int num2 = Integer.parseInt(input.substring(index + 1));

        // calculate
        switch (operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }
}
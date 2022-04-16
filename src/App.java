import java.awt.Font;

import javax.swing.*;

import java.awt.event.*;

class App extends JFrame {
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bclr, bmod, bdiv, bmul, badd, bsub, beq, bdeci;
    double n1, n2, re;
    String n,fin;
    JTextField outt = new JTextField("");

    App(String s) {
        super(s);
    }

    App() {
        //
    }

    void setcon() {
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        badd = new JButton("+");
        bsub = new JButton("-");
        bmul = new JButton("*");
        bdiv = new JButton("/");
        bmod = new JButton("%");
        beq = new JButton("=");
        bdeci = new JButton(".");
        bclr = new JButton("C");
        outt.setFont(new Font("Agency FB", Font.PLAIN, 55));
        setLayout(null);
        outt.setBounds(10, 10, 290, 65);
        bclr.setBounds(10, 85, 65, 65);
        bmod.setBounds(85, 85, 65, 65);
        bdiv.setBounds(160, 85, 65, 65);
        bmul.setBounds(235, 85, 65, 65);
        b9.setBounds(10, 160, 65, 65);
        b8.setBounds(85, 160, 65, 65);
        b7.setBounds(160, 160, 65, 65);
        badd.setBounds(235, 160, 65, 65);
        b6.setBounds(10, 235, 65, 65);
        b5.setBounds(85, 235, 65, 65);
        b4.setBounds(160, 235, 65, 65);
        bsub.setBounds(235, 235, 65, 65);
        b3.setBounds(10, 310, 65, 65);
        b2.setBounds(85, 310, 65, 65);
        b1.setBounds(160, 310, 65, 65);
        beq.setBounds(235, 310, 65, 140);
        b0.setBounds(10, 385, 140, 65);
        bdeci.setBounds(160, 385, 65, 65);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(badd);
        add(bsub);
        add(bmul);
        add(bdiv);
        add(bdeci);
        add(bclr);
        add(bmod);
        add(beq);
        add(outt);
    }

    void complist() {
        b0.addActionListener(new actionb0());
        b1.addActionListener(new actionb1());
        b2.addActionListener(new actionb2());
        b3.addActionListener(new actionb3());
        b4.addActionListener(new actionb4());
        b5.addActionListener(new actionb5());
        b6.addActionListener(new actionb6());
        b7.addActionListener(new actionb7());
        b8.addActionListener(new actionb8());
        b9.addActionListener(new actionb9());
        bclr.addActionListener(new actionclr());
        bdeci.addActionListener(new actiondeci());
        badd.addActionListener(new actionadd());
        bsub.addActionListener(new actionsub());
        bmul.addActionListener(new actionmul());
        bdiv.addActionListener(new actiondiv());
        bmod.addActionListener(new actionmod());
        beq.addActionListener(new actionequ());
    }

    public static void main(String[] args) {
        App f = new App("Calculator");
        f.setcon();
        f.setVisible(true);
        f.setSize(325, 495);
        f.setResizable(false);
        f.complist();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.outt.setEditable(false);
    }

    class actionb0 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            if (f.outt.getText() == null) {
                f.outt.setText("0");
            } else {
                String pre = outt.getText();
                pre = pre + "0";
                outt.setText(pre);
            }
        }
    }

    class actionb1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            if (f.outt.getText() == null) {
                f.outt.setText("1");
            } else {
                String pre = outt.getText();
                pre = pre + "1";
                outt.setText(pre);
            }
        }
    }

    class actionb2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            if (f.outt.getText() == null) {
                f.outt.setText("2");
            } else {
                String pre = outt.getText();
                pre = pre + "2";
                outt.setText(pre);
            }
        }
    }

    class actionb3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            if (f.outt.getText() == null) {
                f.outt.setText("3");
            } else {
                String pre = outt.getText();
                pre = pre + "3";
                outt.setText(pre);
            }
        }
    }

    class actionb4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            if (f.outt.getText() == null) {
                f.outt.setText("4");
            } else {
                String pre = outt.getText();
                pre = pre + "4";
                outt.setText(pre);
            }
        }
    }

    class actionb5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            if (f.outt.getText() == null) {
                f.outt.setText("5");
            } else {
                String pre = outt.getText();
                pre = pre + "5";
                outt.setText(pre);
            }
        }
    }

    class actionb6 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            if (f.outt.getText() == null) {
                f.outt.setText("6");
            } else {
                String pre = outt.getText();
                pre = pre + "6";
                outt.setText(pre);
            }
        }
    }

    class actionb7 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            if (f.outt.getText() == null) {
                f.outt.setText("7");
            } else {
                String pre = outt.getText();
                pre = pre + "7";
                outt.setText(pre);
            }
        }
    }

    class actionb8 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            if (f.outt.getText() == null) {
                f.outt.setText("8");
            } else {
                String pre = outt.getText();
                pre = pre + "8";
                outt.setText(pre);
            }
        }
    }

    class actionb9 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            if (f.outt.getText() == null) {
                f.outt.setText("9");
            } else {
                String pre = outt.getText();
                pre = pre + "9";
                outt.setText(pre);
            }
        }
    }

    class actionclr implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            outt.setText("");
        }
    }

    class actiondeci implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            if (f.outt.getText() == null || f.outt.getText() == "") {
                f.outt.setText("0.");
            } else {
                String pre = outt.getText();
                pre = pre + ".";
                outt.setText(pre);
            }
        }
    }

    class actionadd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            // n1 = f.getandparse();
            String prev = outt.getText();
            n1 = Double.parseDouble(prev);
            if (f.outt.getText() == null || f.outt.getText() == "") {
                f.outt.setText("0");
            } else {
                String pre = outt.getText();
                pre = pre + "+";
                outt.setText(pre);
            }
        }
    }

    class actionsub implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            // n1 = f.getandparse();
            String prev = outt.getText();
            n1 = Double.parseDouble(prev);
            if (f.outt.getText() == null || f.outt.getText() == "") {
                f.outt.setText("0");
            } else {
                String pre = outt.getText();
                pre = pre + "-";
                outt.setText(pre);
            }
        }
    }

    class actionmul implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            // n1 = f.getandparse();
            String prev = outt.getText();
            n1 = Double.parseDouble(prev);
            if (f.outt.getText() == null || f.outt.getText() == "") {
                f.outt.setText("0");
            } else {
                String pre = outt.getText();
                pre = pre + "*";
                outt.setText(pre);
            }
        }
    }

    class actiondiv implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            // n1 = f.getandparse();
            String prev = outt.getText();
            n1 = Double.parseDouble(prev);
            if (f.outt.getText() == null || f.outt.getText() == "") {
                f.outt.setText("0");
            } else {
                String pre = outt.getText();
                pre = pre + "/";
                outt.setText(pre);
            }
        }
    }

    class actionmod implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            String prev = outt.getText();
            n1 = Double.parseDouble(prev);
            if (f.outt.getText() == null || f.outt.getText() == "") {
                f.outt.setText("0");
            } else {
                String pre = outt.getText();
                pre = pre + "%";
                outt.setText(pre);
            }
        }
    }

    class actionequ implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            App f = new App();
            String expression = outt.getText().toString();
            n = f.evaluate(expression);
            outt.setText(f.check(n));
        }
    }
    String evaluate(String expression) {
        char[] arr = expression.toCharArray();
        String operand1 = "";String operand2 = "";String operator = "";
        double result = 0;
  
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
              if(operator.isEmpty()){
                 operand1 += arr[i];
              }else{
                 operand2 += arr[i];
              }
           }  
  
           if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*' || arr[i] == '%') {
              operator += arr[i];
           }
        }
  
        if (operator.equals("+"))
           result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
        else if (operator.equals("-"))
           result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
        else if (operator.equals("/"))
           result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
        else if (operator.equals("%")) 
            result = (Double.parseDouble(operand1) % Double.parseDouble(operand2));
        else
           result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));          
        return "="+result;
     } 
     public String check (String n){
        String a[] = n.split("=");
        int in = a[1].length();
        if (a[1].charAt(in-1) == '0' && a[1].charAt(in-2) == '.')
        {
            return a[1].substring(0, a[1].length() - 2);
        }
        else
        {
            return a[1];
        }
    }
}
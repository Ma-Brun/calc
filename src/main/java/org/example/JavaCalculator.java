package org.example;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import static java.awt.Color.white;
import static java.awt.SystemColor.text;


public class JavaCalculator extends JFrame {



        private JButton jbtNum1;
        private JButton jbtNum2;
        private JButton jbtNum3;
        private JButton jbtNum4;
        private JButton jbtNum5;
        private JButton jbtNum6;
        private JButton jbtNum7;
        private JButton jbtNum8;
        private JButton jbtNum9;
        private JButton jbtNum0;
        private JButton jbtEqual;
        private JButton jbtAdd;
        private JButton jbtSubtract;
        private JButton jbtMultiply;
        private JButton jbtDivide;
        private JButton jbtSolve;
        private JButton jbtExp;
        private JButton jbtClear;
        private double x;
        private double TEMP;
        private double SolveTEMP;
        private JTextField jtfResult;
        private JTextField jtfEquation;

        Boolean addBool = false;
        Boolean subBool = false;
        Boolean divBool = false;
        Boolean mulBool = false;
        Boolean expBool = false;

        String display = "";


        public JavaCalculator() {


            JPanel p1 = new JPanel();
            p1.setLayout(new GridLayout(4, 3));
            p1.add(jbtNum1 = new JButton("1"));
            p1.add(jbtNum2 = new JButton("2"));
            p1.add(jbtNum3 = new JButton("3"));
            p1.add(jbtNum4 = new JButton("4"));
            p1.add(jbtNum5 = new JButton("5"));
            p1.add(jbtNum6 = new JButton("6"));
            p1.add(jbtNum7 = new JButton("7"));
            p1.add(jbtNum8 = new JButton("8"));
            p1.add(jbtNum9 = new JButton("9"));
            p1.add(jbtNum0 = new JButton("0"));
            p1.add(jbtClear = new JButton("C"));

            JPanel p2 = new JPanel();
            p2.setLayout(new FlowLayout());
            p2.add(jtfResult = new JTextField(40), BorderLayout.NORTH);
            p2.add(jtfEquation = new JTextField(40), BorderLayout.SOUTH);
            jtfResult.setHorizontalAlignment(JTextField.CENTER);
            jtfResult.setEditable(false);
            jtfEquation.setEditable(false);

            JPanel p3 = new JPanel();
            p3.setLayout(new GridLayout(5, 1));
            p3.add(jbtAdd = new JButton("+"));
            p3.add(jbtSubtract = new JButton("-"));
            p3.add(jbtMultiply = new JButton("*"));
            p3.add(jbtDivide = new JButton("/"));
            p3.add(jbtExp = new JButton("^"));
            p3.add(jbtSolve = new JButton("="));


            JPanel p = new JPanel();
            p.setLayout(new GridLayout(3, 6));
            p.add(p2, BorderLayout.NORTH);
            p.add(p1, BorderLayout.CENTER);
            p.add(p3, BorderLayout.EAST);

            add(p);

            jbtNum1.addActionListener(new ListenToOne());
            jbtNum2.addActionListener(new ListenToTwo());
            jbtNum3.addActionListener(new ListenToThree());
            jbtNum4.addActionListener(new ListenToFour());
            jbtNum5.addActionListener(new ListenToFive());
            jbtNum6.addActionListener(new ListenToSix());
            jbtNum7.addActionListener(new ListenToSeven());
            jbtNum8.addActionListener(new ListenToEight());
            jbtNum9.addActionListener(new ListenToNine());
            jbtNum0.addActionListener(new ListenToZero());

            jbtAdd.addActionListener(new ListenToAdd());
            jbtSubtract.addActionListener(new ListenToSubtract());
            jbtMultiply.addActionListener(new ListenToMultiply());
            jbtDivide.addActionListener(new ListenToDivide());
            jbtSolve.addActionListener(new ListenToSolve());
            jbtExp.addActionListener(new ListenToExponent());
            jbtClear.addActionListener(new ListenToClear());
        } //JavaCalculator()

        class ListenToClear implements ActionListener {
            public void actionPerformed(ActionEvent e) {
//                display = jtfResult.getText();
                jtfResult.setText("");
                jtfEquation.setText("");
                addBool = false;
                subBool = false;
                mulBool = false;
                divBool = false;
                expBool = false;

                TEMP = 0;
                SolveTEMP = 0;
            }
        }

        class ListenToOne implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = jtfResult.getText();
                jtfResult.setText(display + "1");
            }
        }

        class ListenToTwo implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = jtfResult.getText();
                jtfResult.setText(display + "2");
            }
        }

        class ListenToThree implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = jtfResult.getText();
                jtfResult.setText(display + "3");
            }
        }

        class ListenToFour implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = jtfResult.getText();
                jtfResult.setText(display + "4");
            }
        }

        class ListenToFive implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = jtfResult.getText();
                jtfResult.setText(display + "5");
            }
        }

        class ListenToSix implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = jtfResult.getText();
                jtfResult.setText(display + "6");
            }
        }

        class ListenToSeven implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = jtfResult.getText();
                jtfResult.setText(display + "7");
            }
        }

        class ListenToEight implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = jtfResult.getText();
                jtfResult.setText(display + "8");
            }
        }

        class ListenToNine implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = jtfResult.getText();
                jtfResult.setText(display + "9");
            }
        }

        class ListenToZero implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                display = jtfResult.getText();
                jtfResult.setText("");
            }
        }

        class ListenToAdd implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TEMP = Double.parseDouble(jtfResult.getText());
                jtfResult.setText("");
                jtfEquation.setText(TEMP + " + ");
                addBool = true;
            }
        }

        class ListenToSubtract implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TEMP = Double.parseDouble(jtfResult.getText());
                jtfResult.setText("");
                jtfEquation.setText(TEMP + " - ");
                subBool = true;
            }
        }

        class ListenToMultiply implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TEMP = Double.parseDouble(jtfResult.getText());
                jtfResult.setText("");
                jtfEquation.setText(TEMP + " * ");
                mulBool = true;
            }
        }

        class ListenToDivide implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TEMP = Double.parseDouble(jtfResult.getText());
                jtfResult.setText("");
                jtfEquation.setText(TEMP + " / ");
                divBool = true;
            }
        }
        class ListenToExponent implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                TEMP = Double.parseDouble(jtfResult.getText());
                jtfResult.setText("");
                jtfEquation.setText(TEMP + " ^ ");
                expBool = true;
            }

        }

        class ListenToSolve implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                SolveTEMP = Double.parseDouble(jtfResult.getText());
                if (addBool) {
                    jtfEquation.setText(TEMP + " + ");
                    SolveTEMP = SolveTEMP + TEMP;
                    jtfResult.setText(TEMP +" + " + SolveTEMP);
                }
                else if (subBool) {
                    jtfEquation.setText(TEMP + " - " + SolveTEMP);
                    SolveTEMP = SolveTEMP - TEMP;
                    jtfResult.setText(TEMP +" - " + SolveTEMP);
                    }
                else if (mulBool) {
                    jtfEquation.setText(TEMP + " * " + SolveTEMP);
                    SolveTEMP = SolveTEMP * TEMP;
                    jtfResult.setText(TEMP +" * " + SolveTEMP);
                }
                else if (divBool) {
                    jtfEquation.setText(TEMP + " / " + SolveTEMP);
                    SolveTEMP = SolveTEMP / TEMP;
                    jtfResult.setText(TEMP +" / " + SolveTEMP);
                }
                else if (expBool) {
                    jtfEquation.setText(TEMP + " ^ " + SolveTEMP);
                    x = TEMP;
                    for (double z = 1; z < SolveTEMP; z++) {
                        double b = TEMP;
                        TEMP = b * x;
                    }
                    SolveTEMP = TEMP;
                }
                jtfResult.setText(Double.toString(SolveTEMP));

                addBool = false;
                subBool = false;
                mulBool = false;
                divBool = false;
                expBool = false;
            }
        }

        public static void key() {
            // TODO Auto-generated method stub
            Component hey = new Component() {
                @Override
                public Point getLocationOnScreen() {
                    return super.getLocationOnScreen();
                }

                @Override
                public void setBounds(Rectangle r) {
                    super.setBounds(r);
                }
            };
            JavaCalculator calc = new JavaCalculator();
            calc.pack();
            calc.setLocationRelativeTo(hey);
            calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            calc.setVisible(true);
        }



} //JavaCalculator


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class Calculator extends JFrame implements ActionListener
{

    static JFrame f;
    static JTextField tf;
    String s0,s1,s2;    //stores operands and operators

    public Calculator()
    {
        s0=s1=s2="";
    }

    public static void main(String args[])
    {
        JFrame f=new JFrame("Virtual Calculator");

        tf=new JTextField(30);
        tf.setEditable(false);  //Now the text field is non editable. Hence user can't edit from the text field. He solely has to depend on buttons


        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        Calculator calc=new Calculator();

        JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bdec,bequal,bdel,bclear,bexp,bpower,bsqrt,bsquare,bcube,bcuberoot,bsin,bcos,btan,barcsin,barccos,barctan,binv,blog,bln,bopen,bclose;

        b0=new JButton("0");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        badd=new JButton("+");
        bsub=new JButton("-");
        bmul=new JButton("*");
        bdiv=new JButton("/");
        bsin=new JButton("sin");
        bcos=new JButton("cos");
        btan=new JButton("tan");
        barcsin=new JButton("arcsin");
        barccos=new JButton("arccos");
        barctan=new JButton("arctan");
        bpower=new JButton("^");
        bexp=new JButton("exp");
        bln=new JButton("ln");
        blog=new JButton("log");
        bsquare=new JButton("^2");
        bsqrt=new JButton("^0.5");
        bcube=new JButton("^3");
        bcuberoot=new JButton("^0.33");
        bdec=new JButton(".");
        //bdel=new JButton("DEL");
        bclear=new JButton("C");
        bequal=new JButton("=");
        //bopen=new JButton("(");
        //bclose=new JButton(")");
        binv=new JButton("^-1");

        b0.addActionListener(calc);
        b1.addActionListener(calc);
        b2.addActionListener(calc);
        b3.addActionListener(calc);
        b4.addActionListener(calc);
        b5.addActionListener(calc);
        b6.addActionListener(calc);
        b7.addActionListener(calc);
        b8.addActionListener(calc);
        b9.addActionListener(calc);
        badd.addActionListener(calc);
        bsub.addActionListener(calc);
        bmul.addActionListener(calc);
        bdiv.addActionListener(calc);
        bsin.addActionListener(calc);
        bcos.addActionListener(calc);
        btan.addActionListener(calc);
        barcsin.addActionListener(calc);
        barccos.addActionListener(calc);
        barctan.addActionListener(calc);
        bpower.addActionListener(calc);
        bexp.addActionListener(calc);
        bln.addActionListener(calc);
        blog.addActionListener(calc);
        bsquare.addActionListener(calc);
        bsqrt.addActionListener(calc);
        bcube.addActionListener(calc);
        bcuberoot.addActionListener(calc);
        bdec.addActionListener(calc);
        //bdel.addActionListener(calc);
        bclear.addActionListener(calc);
        bequal.addActionListener(calc);
        //bopen.addActionListener(calc);
        //bclose.addActionListener(calc);
        binv.addActionListener(calc);

        JPanel p=new JPanel();
        p.setBounds(25,60,250,150);

        p.add(tf);
        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(badd);
        p.add(bsub);
        p.add(bmul);
        p.add(bdiv);
        p.add(bsin);
        p.add(bcos);
        p.add(btan);
        p.add(barcsin);
        p.add(barccos);
        p.add(barctan);
        p.add(bpower);
        p.add(bexp);
        p.add(bln);
        p.add(blog);
        p.add(bsquare);
        p.add(bsqrt);
        p.add(bcube);
        p.add(bcuberoot);
        p.add(bdec);
        //p.add(bdel);
        p.add(bclear);
        p.add(bequal);
        //p.add(bopen);
        //p.add(bclose);
        p.add(binv);

        p.setBackground(Color.LIGHT_GRAY);


        f.add(p);

        f.setSize(300,300);
        f.show();
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        //setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();

        //If the value is a number
        if((s.charAt(0)>='0'&&s.charAt(0)<='9')||s.charAt(0)=='.')
        {
            if(!s1.equals(""))
            {
                if(!(s1.equals("^2")||s1.equals("^0.5")||s1.equals("^3")||s1.equals("^0.33")||s1.equals("^-1")))
                {
                    s2=s2+s;
                }
                else
                {
                    s0=s0+s;
                }
            }
            else
            {
                s0=s0+s;
            }
            tf.setText(s0+s1+s2);
        }

        //If the option is clear screen
        else if(s.charAt(0)=='C')
        {
            s0=s1=s2="";
            tf.setText(s0+s1+s2);
        }

        //If option is =
        else if(s.charAt(0)=='=')
        {
            double te=0.0;

            if(s1.equals("+"))
            {
                te=(Double.parseDouble(s0)+Double.parseDouble(s2));
            }
            else if(s1.equals("-"))
            {
                te=(Double.parseDouble(s0)-Double.parseDouble(s2));
            }
            else if(s1.equals("*"))
            {
                te=(Double.parseDouble(s0)*Double.parseDouble(s2));
            }
            else if(s1.equals("/"))
            {
                te=(Double.parseDouble(s0)/Double.parseDouble(s2));
            }
            else if(s1.equals("sin"))
            {
                te=Math.sin(Double.parseDouble(s2));
            }
            else if(s1.equals("cos"))
            {
                te=Math.cos(Double.parseDouble(s2));
            }
            else if(s1.equals("tan"))
            {
                te=Math.tan(Double.parseDouble(s2));
            }
            else if(s1.equals("arcsin"))
            {
                te=Math.asin(Double.parseDouble(s2));
            }
            else if(s1.equals("arccos"))
            {
                te=Math.acos(Double.parseDouble(s2));
            }
            else if(s1.equals("arctan"))
            {
                te=Math.atan(Double.parseDouble(s2));
            }
            else if(s1.equals("^"))
            {
                te=Math.pow(Double.parseDouble(s0),Double.parseDouble(s2));
            }
            else if(s1.equals("exp"))
            {
                te=Math.exp(Double.parseDouble(s2));
            }
            else if(s1.equals("ln"))
            {
                te=Math.log(Double.parseDouble(s2));
            }
            else if(s1.equals("log"))
            {
                te=Math.log10(Double.parseDouble(s2));
            }
            else if(s1.equals("^2"))
            {
                te=Math.pow(Double.parseDouble(s0),2);
            }
            else if(s1.equals("^0.5"))
            {
                te=Math.sqrt(Double.parseDouble(s0));
            }
            else if(s1.equals("^3"))
            {
                te=Math.pow(Double.parseDouble(s0),3);
            }
            else if(s1.equals("^0.33"))
            {
                te=Math.cbrt(Double.parseDouble(s0));
            }
            else if(s1.equals("^-1"))
            {
                te=Math.pow(Double.parseDouble(s0),-1);
            }

            tf.setText(s0+s1+s2+"="+te);
            System.out.println(s0+" "+s1+" "+s2);
            s0=Double.toString(te);
            s1=s2="";

        }

        //If it is an operator
        else
        {
                if(s1.equals("")||s2.equals(""))
                {
                    s1=s;
                }
                else
                {
                    double te=0.0;

                    if(s1.equals("+"))
                    {
                        te=(Double.parseDouble(s0)+Double.parseDouble(s2));
                    }
                    else if(s1.equals("-"))
                    {
                        te=(Double.parseDouble(s0)-Double.parseDouble(s2));
                    }
                    else if(s1.equals("*"))
                    {
                        te=(Double.parseDouble(s0)*Double.parseDouble(s2));
                    }
                    else if(s1.equals("/"))
                    {
                        te=(Double.parseDouble(s0)/Double.parseDouble(s2));
                    }
                    else if(s1.equals("sin"))
                    {
                        te=Math.sin(Double.parseDouble(s2));
                    }
                    else if(s1.equals("cos"))
                    {
                        te=Math.cos(Double.parseDouble(s2));
                    }
                    else if(s1.equals("tan"))
                    {
                        te=Math.tan(Double.parseDouble(s2));
                    }
                    else if(s1.equals("arcsin"))
                    {
                        te=Math.asin(Double.parseDouble(s2));
                    }
                    else if(s1.equals("arccos"))
                    {
                        te=Math.acos(Double.parseDouble(s2));
                    }
                    else if(s1.equals("arctan"))
                    {
                        te=Math.atan(Double.parseDouble(s2));
                    }
                    else if(s1.equals("^"))
                    {
                        te=Math.pow(Double.parseDouble(s0),Double.parseDouble(s2));
                    }
                    else if(s1.equals("exp"))
                    {
                        te=Math.exp(Double.parseDouble(s2));
                    }
                    else if(s1.equals("ln"))
                    {
                        te=Math.log(Double.parseDouble(s2));
                    }
                    else if(s1.equals("log"))
                    {
                        te=Math.log10(Double.parseDouble(s2));
                    }
                    else if(s1.equals("^2"))
                    {
                        te=Math.pow(Double.parseDouble(s0),2);
                    }
                    else if(s1.equals("^0.5"))
                    {
                        te=Math.sqrt(Double.parseDouble(s0));
                    }
                    else if(s1.equals("^3"))
                    {
                        te=Math.pow(Double.parseDouble(s0),3);
                    }
                    else if(s1.equals("^0.33"))
                    {
                        te=Math.cbrt(Double.parseDouble(s0));
                    }
                    else if(s1.equals("^-1"))
                    {
                        te=Math.pow(Double.parseDouble(s0),-1);
                    }

                    s0=Double.toString(te);
                    s1=s;
                    s2="";
                }

                tf.setText(s0+s1+s2);

        }

    }

}

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Mycalculator implements ActionListener {
    Frame f = new Frame();

    Label l1 = new Label("FIRST NUMBER");
    Label l2 = new Label("SECOND NUMBER");
    Label l3 = new Label("RESULT");

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();

    Button b1=new Button("+");
	Button b2=new Button("-");
	Button b3=new Button("*");
	Button b4=new Button("/");
	Button b5=new Button("%");
	Button b6=new Button("exp");
	Button b7=new Button("C");
    Button clear = new Button("EXIT");

    Mycalculator() {
        l1.setBounds(50,100,100,20);
        l2.setBounds(50,140,115,20);
        l3.setBounds(50,180,100,20);

        t1.setBounds(200,100,80,20);
        t2.setBounds(200,140,80,20);
        t3.setBounds(200,180,80,20);
        
        b1.setBounds(50,220,50,20);
		b2.setBounds(110,220,50,20);
		b3.setBounds(170,220,50,20);
		b4.setBounds(230,220,50,20);
		b5.setBounds(50,260,50,20);
		b6.setBounds(110,260,50,20);
		b7.setBounds(170,260,50,20);
		clear.setBounds(230,260,50,20);
        
        f.add(l1);  f.add(l2);    f.add(l3);
        f.add(t1);  f.add(t2);    f.add(t3);
        f.add(b1);  f.add(b2);    f.add(b3);    f.add(b4);  f.add(b5);  f.add(b6);  f.add(b7);  f.add(clear);

        b1.addActionListener(this);
        b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
        clear.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
    }

    public void actionPerformed( ActionEvent e) {
        float n1 = Float.parseFloat(t1.getText());
        float n2 = Float.parseFloat(t2.getText());

        if(e.getSource()==b1)
            t3.setText(String.valueOf(n1+n2));
            
        if(e.getSource()==b2)
            t3.setText(String.valueOf(n1-n2));
        
        if(e.getSource()==b3)
            t3.setText(String.valueOf(n1*n2));
            
        if(e.getSource()==b4)
            t3.setText(String.valueOf(n1/n2));
        
        if(e.getSource()==b5)
            t3.setText(String.valueOf(n1%n2));

        if(e.getSource()==b6)
            t3.setText(String.valueOf(Math.pow(n1,n2)));

        if(e.getSource()==b7){
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }

        if(e.getSource()==clear){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new Mycalculator();
    }

}
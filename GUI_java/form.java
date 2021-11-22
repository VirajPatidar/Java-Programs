import java.awt.*;
import java.awt.event.*;
class form extends Frame implements ActionListener
{
	Label l1=new Label("Title : "); 
	Label l2=new Label("Body : ");
	Label l3=new Label(" "); 
	TextField t1=new TextField();
	TextField t2=new TextField(); 
	Button b=new Button("submit");
	form()
	{
        add(l1); add(t1);
		add(l2); add(t2);
		add(b);
		add(l3);
		l1.setBounds(20,45,70,20); 
		t1.setBounds(180,45,200,20);
		l2.setBounds(20,95,70,20);
		t2.setBounds(180,95,200,20);
		b.setBounds(150,150,100,50);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{ 
		l3.setText("SUBMITTED "+t2.getText());
	}
	public static void main(String s[])
    {
		form l=new form();
		l.setSize(new Dimension(400,400));
		l.setTitle("Notes");
		l.setVisible(true);
   }
}
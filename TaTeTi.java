import javax.swing.*;
import java.awt.event.*;
public class TaTeTi extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	String actual="X";
public TaTeTi()
{
	setLayout(null);
	b1 = new JButton();
	b1.setBounds(10,10,100,100);
	b1.addActionListener(this);
	add(b1);
	b2 = new JButton();
	b2.setBounds(120,10,100,100);
	b2.addActionListener(this);
	add(b2);
	b3 = new JButton();
	b3.setBounds(230,10,100,100);
	b3.addActionListener(this);
	add(b3);
	b4 = new JButton();
	b4.setBounds(10,120,100,100);
	b4.addActionListener(this);
	add(b4);
	b5 = new JButton();
	b5.setBounds(120,120,100,100);
	b5.addActionListener(this);
	add(b5);
	b6 = new JButton();
	b6.setBounds(230,120,100,100);
	b6.addActionListener(this);
	add(b6);
	b7 = new JButton();
	b7.setBounds(10,230,100,100);
	b7.addActionListener(this);
	add(b7);
	b8 = new JButton();
	b8.setBounds(120,230,100,100);
	b8.addActionListener(this);
	add(b8);
	b9 = new JButton();
	b9.setBounds(230,230,100,100);
	b9.addActionListener(this);
	add(b9);
	
}
public void actionPerformed(ActionEvent e)
{
	if (e.getSource()==b1)
	{
		b1.setText(actual);
	}
	if (e.getSource()==b2)
	{
		b2.setText(actual);
	}
	if (e.getSource()==b3)
	{
		b3.setText(actual);
	}
	if (e.getSource()==b4)
	{
		b4.setText(actual);
	}
	if (e.getSource()==b5)
	{
		b5.setText(actual);
	}
	if (e.getSource()==b6)
	{
		b6.setText(actual);
	}
	if (e.getSource()==b7)
	{
		b7.setText(actual);
	}
	if (e.getSource()==b8)
	{
		b8.setText(actual);
	}
	if (e.getSource()==b9)
	{
		b9.setText(actual);
	}
	if(actual.equals("X"))
	{
		actual="O";
	}
	else
	{
		actual="X";
	}

if (b1.getText()!= "" && b1.getText()==b2.getText() && b1.getText () == b3.getText())
{
	setTitle("GANÓ");
}
if (b1.getText()!= "" && b1.getText()==b4.getText() && b1.getText () == b7.getText())
{
	setTitle("GANÓ");
}
if (b1.getText()!= "" && b1.getText()==b5.getText() && b1.getText () == b9.getText())
{
	setTitle("GANÓ");
}
if (b2.getText()!= "" && b2.getText()==b5.getText() && b2.getText () == b8.getText())
{
	setTitle("GANÓ");
}
if (b3.getText()!= "" && b3.getText()==b6.getText() && b3.getText () == b9.getText())
{
	setTitle("GANÓ");
}
if (b3.getText()!= "" && b3.getText()==b5.getText() && b3.getText () == b7.getText())
{
	setTitle("GANÓ");
}
if (b7.getText()!= "" && b7.getText()==b8.getText() && b7.getText () == b9.getText())
{
	setTitle("GANÓ");
}
		
	
	
}

public static void main (String []ar)
{
	TaTeTi tateti1 = new TaTeTi();
	tateti1.setBounds(0,0,350,400);
	tateti1.setVisible(true);
}
}

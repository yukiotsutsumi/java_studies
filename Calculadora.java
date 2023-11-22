import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculadora extends JFrame implements ActionListener
{
	public static void main (String args[])
	{
		JFrame janela=new Calculadora();
		janela.setUndecorated(true);//borda simples
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);//borda decorada
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//botao sair
		janela.setVisible(true);//visivel
	}
	JLabel l1, l2, l3;
	JButton b1, b2, b3, b4, b5;
	JTextField t1, t2, t3;
	Calculadora()
	{
		setTitle("Calculadora batuta");
		setBounds(300, 50, 350, 90);
		setBackground(new Color(150,150,150));
		setLayout(new GridLayout(3,4));
		l1=new JLabel("Num.1");
		l1.setForeground(Color.black);
		l1.setFont(new Font("Broadway",Font.BOLD,15));
		l2=new JLabel("Num.2");
		l2.setForeground(Color.black);
		l2.setFont(new Font("Broadway",Font.BOLD,15));
		l3=new JLabel("Total");
		l3.setFont(new Font("Broadway",Font.BOLD,15));
		b1=new JButton ("+"); b1.addActionListener(this);
		b2=new JButton ("-"); b2.addActionListener(this);
		b3=new JButton ("x"); b3.addActionListener(this);
		b4=new JButton ("/"); b4.addActionListener(this);
		b5=new JButton ("Limpar");	b5.addActionListener(this);
		b5.setBackground(Color.black); b5.setForeground(Color.white);
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t3.setEditable(false);
		add(l1); add(t1); add(b1); add(b2); add(l2); add(t2); add(b3); add(b4); add(l3); add(t3); add(b5);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b5)
		{
			t1.setText(""); t2.setText(""); t3.setText("");
			return;
		}
	float n1=0,n2=0,result=0;
	try
	{
		n1= Float.parseFloat(t1.getText());
		n2= Float.parseFloat(t2.getText());
	}
	catch (NumberFormatException erro)
	{
		t3.setText("erro");
		return;
	}
	if (e.getSource()==b1) result = n1 + n2;
	if (e.getSource()==b2) result = n1 - n2;
	if (e.getSource()==b3) result = n1 * n2;
	if (e.getSource()==b4) result = n1 / n2;
	t3.setText(""+result); 
	}
}
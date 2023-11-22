import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class banco_do_brasil extends JFrame implements ActionListener
{
	JLabel vazio, l1, l2, l3, l4;
	JTextField t1, t2;
	JButton b1, b2;
	JPasswordField p1;
	public static void main (String args[])
	{
		JFrame janela=new banco_do_brasil();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	banco_do_brasil()
	{
		setTitle("Banco do Brasil");
		setBounds(200,50,250,125);
		setBackground(new Color(255, 255, 0));
		setLayout(new GridLayout(5,2));
		
		vazio=new JLabel("");
		vazio.setForeground(Color.yellow);
		l1=new JLabel("Bem Vindo!");
		l1.setForeground(Color.yellow);
		l1.setFont(new Font("", Font.BOLD, 14));
		l2=new JLabel("Banco");
		l2.setForeground(Color.yellow);
		l2.setFont(new Font("", Font.BOLD, 14));
		l3=new JLabel("Agência");
		l3.setForeground(Color.yellow);
		l3.setFont(new Font("", Font.BOLD, 14));
		l4=new JLabel("Conta");
		l4.setForeground(Color.yellow);
		l4.setFont(new Font("", Font.BOLD, 14));
		
		t1=new JTextField();
		t2=new JTextField();
		
		p1=new JPasswordField(); p1.setEchoChar('*'); p1.addActionListener(this);
		
		b1=new JButton("OK"); b1.addActionListener(this);
		b1.setBackground(Color.blue); b1.setForeground(Color.yellow);
		b2=new JButton("Limpar"); b2.addActionListener(this);
		b2.setBackground(Color.blue); b2.setForeground(Color.yellow);
		add(vazio); add(l1); add(l2); add(t1); add(l3); add(t2); add(l4); add(p1); add(b1); add(b2);
	}
}
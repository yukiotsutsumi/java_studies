import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class login2prova extends JFrame implements ActionListener
{
	JLabel l1, l2;
	JTextField t1;
	JButton b1, b2;
	JPasswordField p1;
	public static void main (String args[])
	{
		JFrame janela=new login2prova();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	login2prova()
	{
		setTitle("Login");
		setBounds(200,50,250,125);
		setBackground(new Color(150, 150, 150));
		setLayout(new GridLayout(3,2));
		
		l1=new JLabel("Login:");
		l1.setForeground(Color.black);
		l2=new JLabel("Senha:");
		l2.setForeground(Color.black);
		l1.setFont(new Font("", Font.BOLD, 14));
		l2.setFont(new Font("", Font.BOLD, 14));
		
		b1=new JButton("OK"); b1.addActionListener(this);
		b1.setBackground(Color.white); b1.setForeground(Color.black);
		b2=new JButton("Limpar"); b2.addActionListener(this);
		b2.setBackground(Color.white); b2.setForeground(Color.black);	
		
		t1=new JTextField();

		p1=new JPasswordField();	p1.setEchoChar('*');	p1.addActionListener(this);
		add(l1); add(t1);//Login: 2dt
		add(l2); add(p1);//Senha:java
		add(b1); add(b2);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b2)
		{
			t1.setText(""); p1.setText("");//se não limpar, p1.setPassword
			return;
		}
		if(new String(p1.getPassword()).equals("java")&& t1.getText().equals("2DT"))
		{
			JFrame janela=new celular2();
			janela.setUndecorated(true);
			janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setVisible(true);
		}
		else
		{
		JOptionPane.showMessageDialog(null, "Senha Inválida");
		}	
	}
}
class celular2 extends JFrame implements ActionListener
{
	JLabel l1, l2, l3, l4, l5, vazio, logo;
	JButton b1, b2;
	JTextField t1, t2, t3, t4, t5;
	ImageIcon icon=new ImageIcon("D:/saraivalogo.jpg");
	
	public static void main (String args[])
	{
		JFrame janela=new celular2();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);	
	}
	celular2()
	{
		setTitle("Celular");
		setBounds(200,100,500,400);
		setBackground(new Color(255,255,255));
		setLayout(new GridLayout(6,2));
		
		logo=new JLabel(icon);
		vazio=new JLabel("");
		l1=new JLabel("Cadastro de produtos");
		l1.setForeground(Color.black);
		l1.setFont(new Font("", Font.BOLD,14));
		l2=new JLabel("código:");
		l2.setForeground(Color.black);
		l3=new JLabel("Fabricante:");
		l3.setForeground(Color.black);
		l4=new JLabel("Modelo:");
		l4.setForeground(Color.black);
		b1=new JButton ("OK"); b1.addActionListener(this);
		b2=new JButton ("Limpar"); b2.addActionListener(this);
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField(); t4.setEditable(false);
		add(logo); add(l1); add(l2); add(t1); add(l3); add(t2); add(l4); add(t3); add(b1); add(vazio); add(b2); add(t4);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b2)
		{
			t1.setText(""); t2.setText(""); t3.setText(""); t4.setText(""); vazio.setIcon(null);
			return;
		}
		if(e.getSource()==b1)
		{
			if(t1.getText().equals("1"))
			{
				vazio.setIcon(new javax.swing.ImageIcon("D:/eaemen.jpg"));
				t4.setText("Cadastro efetuado com sucesso");
				return;
			}
			if(t1.getText().equals("2"))
			{
				vazio.setIcon(new javax.swing.ImageIcon("D:/motorola.jpg"));
				t4.setText("Cadastro efetuado com sucesso");
				return;
			}
			else
			{
				t4.setText("Produto Inváido");
				
			}
		}
	}
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class botao_pais extends JFrame implements ActionListener
{
	JLabel label1, label2;
	JTextField t1;
	JPasswordField p1;
	public static void main (String args[])
	{
		JFrame janela=new botao_pais();
		janela.setUndecorated(true);//borda simples
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);//borda decorada
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//botao sair
		janela.setVisible(true);//visivel
	}
	botao_pais()
	{
		setTitle("Verifica senha");
		setBounds(200,50,350,85);
		setBackground(new Color(150, 150 ,150));
		setLayout(new GridLayout(2,2));
		label1=new JLabel("Digite a senha:");
		label1.setForeground(Color.black);
		label2=new JLabel("Validação:");
		label2.setForeground(Color.black);
		label1.setFont(new Font("", Font.BOLD, 14));
		label2.setFont(new Font("", Font.BOLD, 14));
		t1=new JTextField();

		p1=new JPasswordField();
		p1.setEchoChar('*');
		p1.addActionListener(this);
		add(label1);
		add(p1);
		add(label2);
		add(t1);		
	}
		public void actionPerformed(ActionEvent e)
		{
			if(new String(p1.getPassword()).equals("java"))
			{
			t1.setForeground(Color.green);
			t1.setText("Senha Válida");
			JFrame janela=new caixaEletronico();
			janela.setUndecorated(true);
			janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setVisible(true);	
			}	
			else
			{
				t1.setForeground(Color.red);
				t1.setText("Senha Inválida");
			}
			class caixaEletronico extends JFrame implements ActionListener 
{
	JLabel label1,label2,label3,label4,label5,label0,label02;
	JButton b1,b2;
	JTextField t1,t2,t3;
	ImageIcon icone = new ImageIcon ("D:/Etec Informática/AS/banco.jpg");
	caixaEletronico()
	{
		setTitle("Caixa Eletronico BANK");
		setBounds(600,300,350,200);
		getContentPane().setBackground(new Color(135,206,255));
		getContentPane().setLayout(new GridLayout(6,2));
		
		label1=new JLabel("Depósito");
		label1.setForeground(Color.black);
		label1.setFont(new Font("",Font.BOLD,14));
		label2=new JLabel("Saque");	
		label2.setForeground(Color.black);
		label2.setFont(new Font("",Font.BOLD,14));
		label3=new JLabel("Transfêrencia");
		label3.setForeground(Color.black);
		label3.setFont(new Font("",Font.BOLD,14));
		label4=new JLabel("");
		label5=new JLabel("");
		label0=new JLabel("");
		label02= new JLabel (icone);
		
		b1 = new JButton ("Calcular");       b1.addActionListener(this);
	    b1.setBackground(Color.white);       b1.setForeground(Color.black);
	    b2 = new JButton ("Limpar");         b2.addActionListener(this);
	    b2.setBackground(Color.white);       b2.setForeground(Color.black);
	    
	    t1 = new JTextField();               t2 = new JTextField();
	    t3 = new JTextField();				 
	    
	    add(label02); add(label0);
	    add(label1); add(t1);
	    add(label2); add(t2);
	    add(label3); add(t3);
	    add(label4); add(label5);
	    add(b1); add(b2);
	    
	    t1.setText("0");  t2.setText("0");  t3.setText("0");
	}
	
		public void actionPerformed(ActionEvent e)
	{
		
			if (e.getSource()==b2)
			{
				t1.setText("0");  t2.setText("0");  t3.setText("0"); return;
			}
		float n1=0,n2=0,n3=0,result=0;
		try
		{
			n1 = Float.parseFloat(t1.getText());
			n2 = Float.parseFloat(t2.getText());
			n3 = Float.parseFloat(t3.getText());
		}
	    
	    catch (NumberFormatException erro)
		{
			JOptionPane.showMessageDialog(null ,"Erro"); return;
		}
		
		if (e.getSource()==b1) result=(n1-n2)+n3;
		JOptionPane.showMessageDialog(null, "Seu Saldo atual é de: "+result);
	}
}
		}
	}

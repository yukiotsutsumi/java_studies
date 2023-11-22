import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class caixaEletronico extends JFrame implements ActionListener 
{
	JLabel label1,label2,label3,label4,label5,label0,label02;
	JButton b1,b2;
	JTextField t1,t2,t3;
	ImageIcon icone = new ImageIcon ("D:/Etec Inform�tica/AS/banco.jpg");
	
	public static void main (String args [])
	{
		JFrame janela=new caixaEletronico();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);					
	}

	caixaEletronico()
	{
		setTitle("Caixa Eletronico BANK");
		setBounds(600,300,350,200);
		getContentPane().setBackground(new Color(135,206,255));
		getContentPane().setLayout(new GridLayout(6,2));
		
		label1=new JLabel("Dep�sito");
		label1.setForeground(Color.black);
		label1.setFont(new Font("",Font.BOLD,14));
		label2=new JLabel("Saque");	
		label2.setForeground(Color.black);
		label2.setFont(new Font("",Font.BOLD,14));
		label3=new JLabel("Transf�rencia");
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
		JOptionPane.showMessageDialog(null, "Seu Saldo atual � de: "+result);
	}
}
	    
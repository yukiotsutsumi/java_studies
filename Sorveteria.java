import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Sorveteria extends JFrame implements ActionListener
{
	public static void main (String args[])
	{
		JFrame janela=new Sorveteria();
		janela.setUndecorated(true);//borda simples
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);//borda decorada
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//botao sair
		janela.setVisible(true);//visivel
	}
	JLabel l1, l2, l3, l4, l5, l6, l7, l8;
	JButton b1, b2;
	JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
	Sorveteria()
	{
		setTitle("Sorveteria batuta");
		setBounds(700, 700, 200, 200);	
		setLayout(new GridLayout(7,3));
		l1=new JLabel("Tipo");
		l1.setForeground(Color.gray);
		l1.setFont(new Font("Broadway",Font.BOLD,15));
		l2=new JLabel("Quantidade");
		l2.setForeground(Color.gray);
		l2.setFont(new Font("Broadway",Font.BOLD,15));
		l3=new JLabel("Preço unidade");
		l3.setForeground(Color.gray);
		l3.setFont(new Font("Broadway",Font.BOLD,15));
		l4=new JLabel("Fruta");
		l4.setForeground(Color.gray);
		l4.setFont(new Font("Broadway",Font.BOLD,15));
		t1=new JTextField();
		t2=new JTextField();
		l5=new JLabel("Chocolate");
		l5.setForeground(Color.gray);
		l5.setFont(new Font("Broadway",Font.BOLD,15));
		t3=new JTextField();
		t4=new JTextField();
		l6=new JLabel("Bola");
		l6.setForeground(Color.gray);
		l6.setFont(new Font("Broadway",Font.BOLD,15));
		t5=new JTextField();
		t6=new JTextField();
		l7=new JLabel("Pote 2L");
		l7.setForeground(Color.gray);
		l7.setFont(new Font("Broadway",Font.BOLD,15));
		t7=new JTextField();
		t8=new JTextField();
		t9=new JTextField();
		t9.setEditable(false);
		l8=new JLabel("TOTAL");
		l8.setForeground(Color.gray);
		l8.setFont(new Font("Broadway",Font.BOLD,15));
		t10=new JTextField();
		b1=new JButton ("Calcular"); b1.addActionListener(this);
		b2=new JButton ("Limpar"); b2.addActionListener(this);
		add(l1); add(l2); add(l3); add(l4); add(t1); add(t2); add(l5); add(t3); add(t4); add(l6); add(t5); add(t6); add(l7); add(t7); add(t8); add(l8); add(t9); add(b1); add(b2);
	}
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==b2)
			{
			t1.setText(""); t2.setText(""); t3.setText(""); t4.setText(""); t5.setText(""); t6.setText(""); t7.setText(""); t8.setText(""); t9.setText("");
			return;
			}
			float n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,result=0;
			try
				{
					n1= Float.parseFloat(t1.getText()); n2= Float.parseFloat(t2.getText()); n3= Float.parseFloat(t3.getText()); n4= Float.parseFloat(t4.getText()); n5= Float.parseFloat(t5.getText()); n6= Float.parseFloat(t6.getText()); n7= Float.parseFloat(t7.getText()); n8= Float.parseFloat(t8.getText()); 	
				}
			catch (NumberFormatException erro)
				{
					t9.setText("erro");
					return;
				}
			if (e.getSource()==b1)
			{
			result = (n1*n2)+(n3*n4)+(n5*n6)+(n7*n8);
			t9.setText(""+result); 			
			}					
		}
}
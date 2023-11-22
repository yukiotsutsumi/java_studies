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
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// implemente o botao sair com o componente de fechar o programa.
		janela.setVisible(true);// torna a janela visivel
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
			}
			else
			{
				t1.setForeground(Color.red);
				t1.setText("Senha Inválida");
			}
			}
	}
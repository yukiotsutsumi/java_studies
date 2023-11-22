import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Interface_grafica extends JFrame
{
	JLabel label1, label2, label3, label4;
	ImageIcon icone=new ImageIcon("D:/pombo.gif");
	Interface_grafica()
	{
		setTitle("Inserindo Labels e imagens na Janela");
		setSize(600,200);
		setLocation(150,150);
		setBackground(new Color(220,220,220));
		label1=new JLabel("Aprendendo", JLabel.LEFT);
		label1.setForeground(Color.blue);
		label2=new JLabel(icone);
		label3=new JLabel("Inserir", JLabel.RIGHT);
		label3.setForeground(Color.orange);
		label4= new JLabel("Label e imagens",icone,JLabel.CENTER);
		label4.setFont(new Font("Times new Roman",Font.BOLD,24));
		label4.setForeground(Color.black);
		setLayout(new GridLayout(4,1));
		add(label1);
		add(label2);
		add(label3);
		add(label4);
	}
	public static void main (String args[])
	{
		JFrame janela=new Interface_grafica();
		janela.setUndecorated(true);//borda simples
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);//borda decorada
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//botao sair
		janela.setVisible(true);//visivel
	}
}
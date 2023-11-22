import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class exemploradio extends JFrame implements ItemListener
{
	float n1=0,result=0;
	JLabel l1,l2;
	JTextField t1,t2;
	JPanel p1,p2;
	JRadioButton r1,r2,r3;
	ButtonGroup radiogroup;
	public static void main (String args[])
	{
		JFrame janela=new exemploradio();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	exemploradio()
	{
		setTitle("Uso de botoes de radio");
		setBounds(230,50,340,120);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		//
		l1= new JLabel ("Digite o valor: ");
		l1.setForeground(Color.blue);
		l2= new JLabel ("% do valor: ");
		l2.setForeground(Color.blue);
		//
		t1=new JTextField(5);
		t2= new JTextField(5);
		t2.setEditable(false);
		//
		p1=new JPanel();
		p2=new JPanel();
		//
		r1=new JRadioButton("10% do valor");
		r2=new JRadioButton("20% do valor");
		r3=new JRadioButton("30% do valor");
		//
		r1.setMnemonic(KeyEvent.VK_1);
		r2.setMnemonic(KeyEvent.VK_2);
		r3.setMnemonic(KeyEvent.VK_3);
		//
		radiogroup= new ButtonGroup();
		radiogroup.add(r1);	r1.addItemListener(this);
		radiogroup.add(r2);	r2.addItemListener(this);
		radiogroup.add(r3);	r3.addItemListener(this);
		//
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		p1.setBackground(new Color(200,200,200));
		p2.setLayout(new GridLayout(2,3));
		p2.setBackground(new Color(200,200,200));
		p1.add(l1); p1.add(t1); p2.add(r1);
		p2.add(r2); p2.add(r3); p2.add(l2); p2.add(t2);
		getContentPane().add(p1); getContentPane().add(p2);
	}
	
		public void itemStateChanged(ItemEvent e)
		{
			if (t1.getText().length()==0)return ;
				try 
				{
					n1 = Float.parseFloat(t1.getText());
					if (e.getSource()==r1) result = (n1 * 10)/100;
					if (e.getSource()==r2) result = (n1 * 20)/100;
					if (e.getSource()==r3) result = (n1 * 30)/100;
					
				}
		catch(NumberFormatException erro)
		{
			t2.setText("erro"); return ;
		}
		t2.setText("" + result);
		}
		
	}

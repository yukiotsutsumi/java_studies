import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class playlisttt extends JFrame implements ListSelectionListener, ItemListener, ActionListener
{
	public static void main (String args[])
	{
		JFrame janela = new playlisttt();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextArea t1;
	JButton b1,b2;
	JCheckBox jch1, jch2, jch3, jch4, jch5;
	JComboBox jcb1;
	JRadioButton jrb1, jrb2, jrb3;
	ButtonGroup rg;
	ImageIcon icone1=new ImageIcon("F:/Lana.jpg");
	ImageIcon icone2=new ImageIcon("F:/Legiao.jpg");
	ImageIcon icone3=new ImageIcon("F:/suckit.jpeg");
	JPanel painel1 = new JPanel();
	JPanel painel2 = new JPanel();
	JPanel painel3 = new JPanel();
	JPanel painel4 = new JPanel();
	JPanel painel5 = new JPanel();
	JPanel painel6 = new JPanel();
	JPanel painel7 = new JPanel();

	playlisttt()
	{
		setTitle("Playlist");
		getContentPane().setLayout(new GridLayout(7,1));
		setBounds(270,100,600,600);
		painel6.setLayout(new FlowLayout(FlowLayout.CENTER));
		l1=new JLabel("PLAYLIST", JLabel.CENTER);
		painel1.setLayout(new GridLayout(1,3));	
		l2=new JLabel("Lana del Rey", JLabel.CENTER);
		l3=new JLabel("Legião Urbana", JLabel.CENTER);
		l4=new JLabel("Arctic Monkeys", JLabel.CENTER);
		painel5.setLayout(new GridLayout(1,3));
		l5=new JLabel(icone1);
		l6=new JLabel(icone2);
		l7=new JLabel(icone3);
		painel7.setLayout(new GridLayout(1,3));
		jrb1=new JRadioButton("Lana Del Rey");
		jrb2=new JRadioButton("Legiao Urbana");
		jrb3=new JRadioButton("Arctic Monkeys");
		jrb1.setMnemonic(KeyEvent.VK_1);
		jrb2.setMnemonic(KeyEvent.VK_1);
		jrb3.setMnemonic(KeyEvent.VK_1);
		rg=new ButtonGroup();
		rg.add(jrb1); jrb1.addItemListener(this);
		rg.add(jrb2); jrb2.addItemListener(this);
		rg.add(jrb3); jrb3.addItemListener(this);
		painel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		l8=new JLabel("Qual o gênero musical?");
		jch1=new JCheckBox("Indie"); jch1.addItemListener(this);
		jch2=new JCheckBox("Rock");	jch2.addItemListener(this);
		jch3=new JCheckBox("Funk");	jch3.addItemListener(this);
		jch4=new JCheckBox("Jazz");	jch4.addItemListener(this);
		jch5=new JCheckBox("Rap");	jch5.addItemListener(this);
		painel3.setLayout(new FlowLayout(FlowLayout.CENTER));	
		l9=new JLabel("Lançamento (album)", JLabel.RIGHT);
		String[] ano = {"Selecione ano", "2012","2007", "1999"};
		jcb1 = new JComboBox(ano);
		jcb1.addItemListener(this);
		b1=new JButton("Criar playlist"); b1.addActionListener(this);
		b2=new JButton("Limpar"); b2.addActionListener(this);
		painel4.setLayout(new FlowLayout(FlowLayout.CENTER));
		t1 = new JTextArea(100,100);
		t1.setEditable(false);
		
							painel6.add(l1);
							
		painel1.add(l2);	painel1.add(l3);	painel1.add(l4);
		painel5.add(l5);	painel5.add(l6);	painel5.add(l7);
		painel7.add(jrb1);	painel7.add(jrb2);	painel7.add(jrb3);	
		
												painel2.add(l8);
		painel2.add(jch1);	painel2.add(jch2);	painel2.add(jch3);	painel2.add(jch4);	painel2.add(jch5);

		painel3.add(l9);	painel3.add(jcb1);
		painel3.add(b1);	painel3.add(b2);
						
		painel4.add(t1);
		
		getContentPane().add(painel6);
		getContentPane().add(painel1);
		getContentPane().add(painel5);
		getContentPane().add(painel7);
		getContentPane().add(painel2);
		getContentPane().add(painel3);
		getContentPane().add(painel4);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b2)
			{
				t1.setText("");
			}	
		if(e.getSource()==b1)
		{
			t1.setText("Seu Artista:"+jrb1.getText());
		}
	}
	public void itemStateChanged(ItemEvent e)
	{
		
	}
	public void valueChanged(ListSelectionEvent e)
	{
		
	}
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class interclasses extends JFrame implements ListSelectionListener, ActionListener, ItemListener
{
	JLabel l1,l2,l3,l4,l5;
	JTextArea t1;
	JButton b1,b2;
	JComboBox c1,c2,c3,c4,c5;
	JPanel painel1 = new JPanel();
	JPanel painel2 = new JPanel();
	JPanel painel3 = new JPanel();
	JPanel painel4 = new JPanel();
	
	public static void main (String args[])
	{
		JFrame janela = new interclasses();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	interclasses()
	{
		setTitle("Cadastro: Campeonato Interclasses");
		painel1.setLayout(new FlowLayout(FlowLayout.LEFT));	
		setBounds(400,200,700,300);
		setResizable(false);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		
		l1 = new JLabel("Curso:");	    	    l1.setForeground(Color.black);
		l2 = new JLabel("Série:");   			l2.setForeground(Color.black);
		l3 = new JLabel("Período:");       		l3.setForeground(Color.black);
		
		String[] curso = {"Selecione o curso","Técnico em Informatica","Técnica em Mecatrônica","Técnico em Administração"};
		c1 = new JComboBox(curso);
		c1.addItemListener(this);
		
		String[] serie = {"Selecione a série","1º","2º","3º"};
		c2 = new JComboBox(serie);
		c2.addItemListener(this);
		
		String[] periodo = {"Selecione o periodo","Manhã","Tarde","Noite"};
		c3 = new JComboBox(periodo);
		c3.addItemListener(this);
		
		
		painel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		painel2.setBounds(400,200,700,300);
		setResizable(false);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		
		l4 = new JLabel("Tipo de Esporte:");	l4.setForeground(Color.black);
		l5 = new JLabel("Geração:");	l5.setForeground(Color.black);
		
		String[] esporte = {"Selecione a modalidade","Futebol Masculino","Futebol Feminino","Volei Masculino","Volei Feminino"};
		c4 = new JComboBox(esporte);
		c4.addItemListener(this);
		
		String[] geracao = {"Selecione sua geração","Infantil","Juvenil"};
		c5 = new JComboBox(geracao);
		c5.addItemListener(this);
		
		
		painel3.setLayout(new FlowLayout(FlowLayout.CENTER));
		setBounds(400,200,700,300);
		setResizable(false);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		
		t1 = new JTextArea(7,60);
		t1.setEditable(false);
		
		
		painel4.setLayout(new FlowLayout(FlowLayout.CENTER));
		setBounds(400,200,700,300);
		setResizable(false);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		
		b1 = new JButton ("Mostrar");		 b1.addActionListener(this);
		b2 = new JButton ("Limpar"); 		 b2.addActionListener(this);
		
		
		painel1.add(l1);		painel1.add(c1);
		painel1.add(l2);		painel1.add(c2);
		painel1.add(l3);		painel1.add(c3);
		
		painel2.add(l4);		painel2.add(c4);
		painel2.add(l5);		painel2.add(c5);
		
		painel3.add(t1);
		
		painel4.add(b1);		painel4.add(b2);
		
		getContentPane().add(painel1);
		getContentPane().add(painel2);
		getContentPane().add(painel3);
		getContentPane().add(painel4);		
	}
	
	public void valueChanged(ListSelectionEvent e)
	{
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b2)
			{
				t1.setText("");
			}	
		if(e.getSource()==b1)
		{
			t1.setText("Suas informações são: " + "\n  °Sua Modalidade: "+(c4.getSelectedItem()) +
				 "\n  °Sua geração: "+(c5.getSelectedItem()) + "\n  °Seu Curso: "+(c1.getSelectedItem()) + 
				 	"\n  °Sua Série: "+(c2.getSelectedItem()) + "\n  °Seu Período: "+(c3.getSelectedItem())); 
		}
	}
	public void itemStateChanged(ItemEvent e)
	{

	}
}
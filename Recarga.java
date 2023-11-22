import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Recarga extends JFrame implements ActionListener, ItemListener, ListSelectionListener{

	JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6;
	JTextArea ta1;
	ImageIcon  vivo = new ImageIcon("");
	JButton b1, b2;
	JTextField txt1, txt2;
	JComboBox cbo1 ;
    JPanel painel, painel2 = new JPanel(), painel3 = new JPanel(), paineltudo = new JPanel();
   	JPanel painel4, paineltes, painel5;
   	JList lstLista1;
	DefaultListModel listOperadora;

    public static void main(String[] args) 
    {
    	JFrame janela = new Recarga();
    	janela.setUndecorated(true);
    	janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	janela.setVisible(true);
    }
      	Recarga()
      	{
    	paineltudo.setLayout(new GridLayout(5,2));
    	lbl1 = new JLabel(vivo);
    	lbl2 = new JLabel("Carga pré-pago", JLabel.CENTER);
      	lbl3 = new JLabel("DDD", JLabel.CENTER);
    	lbl4 = new JLabel("Numero de celular", JLabel.CENTER);
    	lbl5= new JLabel("Valor");
    	lbl6= new JLabel("Operadora");
		txt1 = new JTextField();
  		txt2 = new JTextField();
    	String[] valor = {"R$15,00","R$30,00","R$45,00"};
    	cbo1 = new JComboBox(valor);	
    	cbo1.addItemListener(this);
    	listOperadora = new DefaultListModel();
  		listOperadora.addElement("Tim");
  		listOperadora.addElement("Vivo");
  		listOperadora.addElement("Oi");
  		listOperadora.addElement("Nextel");
  		lstLista1 = new JList (listOperadora);
  		lstLista1.addListSelectionListener(this);
  		JScrollPane lista = new JScrollPane(lstLista1);
    	ta1 = new JTextArea(5,30);
    	JScrollPane apainel1 = new JScrollPane(ta1);
    	b1 = new JButton("Mostrar");	b1.addActionListener(this);
    	b2 = new JButton("Limpar");		    b2.addActionListener(this);

		painel= new JPanel();
		painel.setLayout(new GridLayout(1,1));
    	painel4 = new JPanel();
    	painel4.setLayout(new GridLayout(1,1));
    	painel5 = new JPanel();
    	painel5.setLayout(new GridLayout(1,1));
    	paineltes = new JPanel();
    	painel2.setLayout(new GridLayout(1,1));

    	//painel titulo
      	painel.add(lbl1); painel.add(lbl2);
      	painel4.add(lbl3);
      	painel4.add(txt1);
      	painel4.add(lbl4);
      	painel4.add(txt2);

    	//painel imagens
    	paineltes.add(lbl5);
		paineltes.add(cbo1);
		paineltes.add(lbl6);
		paineltes.add(lista);
		
    	//painel botão
    	painel2.add(b1);
    	painel2.add(b2);

    	//painel TeXt Area
    	painel3.add(apainel1);



    	paineltudo.add(painel);
    	paineltudo.add(painel4);
    	paineltudo.add(paineltes);
    	paineltudo.add(painel2);
    	paineltudo.add(painel3);
    	
    	add(paineltudo);
    	setTitle("Recarregar");
    	setBounds(200,200,450,600);
    	setLocation (150,150);
    	setResizable(false);


    }
    public void actionPerformed(ActionEvent e){
    	if(e.getSource()== b1)
    	{
    	ta1.setText("DDD:"+txt1.getText()+"\n Numero do Celular: " +txt2.getText()+"\n Valor da recarga: "+cbo1.getSelectedItem()+ "\n Operadora: "+ lstLista1.getSelectedValue());
    	}
    	if(e.getSource()== b2)
    	{
    	ta1.setText("");
    	txt1.setText("");
    	txt2.setText("");
    	lstLista1.setSelectedIndex(-1);
    	cbo1.setSelectedIndex(-1);
    	}
    }
    	
   
    public void itemStateChanged(ItemEvent e)
    {


    }


     public void valueChanged(ListSelectionEvent e)
    {


    }
}

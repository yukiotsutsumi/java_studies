import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ibizabalada extends JFrame implements ListSelectionListener, ActionListener
{
  JLabel label1,label2,label3,label4,label5,label6,label7;
  JTextField t1,t2,t3,t4,t5, tsexo;
  JList lista;
  JButton b1,b2,b3,b4,b5,b6;
  DefaultListModel listModel;

  public static void main(String args[])
  {
    JFrame janela = new ibizabalada();
    janela.setUndecorated(true);
    janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);
  }
  ibizabalada()
  {
    setTitle("Space Ibiza");
    setBounds(600,100,350,650);
        
    getContentPane().setBackground(Color.black);
    getContentPane().setLayout(new GridLayout(20,1));
    
    label1 = new JLabel("Nome do Aniversariante", JLabel.CENTER);
    label1.setForeground(Color.white);
    label1.setOpaque(true); label1.setBackground(Color.black);
    
    label2 = new JLabel("Nome do Convidado", JLabel.CENTER);
    label2.setForeground(Color.white);
    label2.setOpaque(true); label2.setBackground(Color.black);
    
    label3 = new JLabel("Horário de Entrada", JLabel.CENTER);
    label3.setForeground(Color.white);
    label3.setOpaque(true); label3.setBackground(Color.black);
    
    label4 = new JLabel("Aniversariante", JLabel.CENTER);
    label4.setForeground(Color.white);
    label4.setOpaque(true); label4.setBackground(Color.black);
    
    label5 = new JLabel("Lista VIP", JLabel.CENTER);
    label5.setForeground(Color.white);
    label5.setOpaque(true); label5.setBackground(Color.black);
    
    label6 = new JLabel("Bem-vindo a Space Ibiza", JLabel.CENTER);
    label6.setForeground(Color.white);
    label6.setOpaque(true); label6.setBackground(Color.black);
    
    label7 = new JLabel("Sexo (M/F)", JLabel.CENTER);
    label7.setForeground(Color.white);
    label7.setOpaque(true); label7.setBackground(Color.black);
    
    t1 = new JTextField();            /// t1 = nome aniversariante
    t1.addActionListener(this);  
        
    t2 = new JTextField();          // t2 = nome convidado
    t2.addActionListener(this);
    
    t3 = new JTextField();          // t3 = horario entrada
    t3.addActionListener(this);
    
    t4 = new JTextField();          // t4 = quantidade
    t4.addActionListener(this);
    t4.setEditable(false);
    
    t5 = new JTextField();          // t5 = aniversariante
    t5.addActionListener(this);
    t5.setEditable(false);
    
    tsexo = new JTextField();
    tsexo.addActionListener(this);
    
      
    listModel = new DefaultListModel();
    lista = new JList(listModel);
    lista.addListSelectionListener(this); // registra a lista
    JScrollPane painel = new JScrollPane(lista);
    lista.setVisible(false);
    
    b1 = new JButton("Adicionar Convidado");
    b1.addActionListener(this);
    b1.setForeground(Color.white);
    b1.setOpaque(true); b1.setBackground(Color.red);
    
    b2 = new JButton("Remover Convidado");
    b2.addActionListener(this);
    b2.setForeground(Color.white);
    b2.setOpaque(true); b2.setBackground(Color.red);
    
    b3 = new JButton("Remover todos os Convidados");
    b3.addActionListener(this);
    b3.setForeground(Color.white);
    b3.setOpaque(true); b3.setBackground(Color.red);
    
    b4 = new JButton("Mostrar quantidade de Convidados");
    b4.addActionListener(this);
    b4.setForeground(Color.white);
    b4.setOpaque(true); b4.setBackground(Color.red);
    
    b5 = new JButton("Limpar");
    b5.addActionListener(this);
    b5.setForeground(Color.white);
    b5.setOpaque(true); b5.setBackground(Color.red);
    
    b6 = new JButton("Mostrar resumo da lista VIP");
    b6.addActionListener(this);
    b6.setForeground(Color.white);
    b6.setOpaque(true); b6.setBackground(Color.red);
    
    
    
    
    add(label1); // nome aniversariante
    add(t1);  // aniversariante txt
    add(label2); // nome do convidado
    add(t2); // convidado txt
    add(label3); // horario da entrada
    add(t3); // entrada txt
    add(label7); //sexo
    add(tsexo);//sexo txt
    add(b1); // adc convidado
    add(b2); // remov convidado
    add(b3); // remov all convidados
    add(b4); // show all convidados
    add(t4); // qtd txt
    add(b5); // limpar
    add(b6); // resumo lista vip
    add(label4); // aniversariante
    add(t5); // aniversariante txt2
    add(label5); // lista vip
    add(painel);
    add(label6);
    
    
    
    
    
  }

  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource()==b1) // adicionar convidado
    {
    	float horario;
    	horario = Float.parseFloat(t3.getText());
    	if(horario <= 24 && horario >= 18)
    	{
    		if(tsexo.getText().equals("F"))
    		{
    		listModel.addElement(t2.getText());
    		}
    		else if(tsexo.getText().equals(""))
    		{
    			JOptionPane.showMessageDialog(null, "Digite o sexo");
    		}
    		else 
    		JOptionPane.showMessageDialog(null, "Não poderá incluir homens na lista VIP");
    	}
    	else
    	{
    		t4.setText("");
    		t2.setText("Excedeu o horario da lista VIP");
    	}
    	if(t1.getText().equals(""))
    	{
    		JOptionPane.showMessageDialog(null, "Digite o nome do aniversariante");
    		return;
    	}
    	if(t2.getText().equals(""))
    	{
    		JOptionPane.showMessageDialog(null, "Digite o nome do convidado");
    		return;
    	}
    	if(t3.getText().equals(""))
    	{
    		JOptionPane.showMessageDialog(null, "Digite o horário de entrada");
    		return;
    	}
        t5.setText(t1.getText()); 
        tsexo.setText(""); t2.setText(""); t3.setText("");        
    }
    if(e.getSource()==b2) // remover convidado
    {
      int index = lista.getSelectedIndex();
      listModel.remove(index);
    }
    if(e.getSource()==b3)
    {
    	t4.setText("");
    	listModel.clear();
    }
    if(e.getSource()==b4) // mostrar qtd
    {
    	t4.setText("Quantidade: " + listModel.getSize());// contar itens da lista
    }
    
    if(e.getSource()==b5) // limpar
    {
    	t1.setText(""); t2.setText(""); t3.setText(""); t4.setText(""); t5.setText(""); tsexo.setText("");
    	
    }
    if(e.getSource()==b6) // mostrar lista
    {
    	lista.setVisible(true);
    }

  }

  public void valueChanged(ListSelectionEvent e)
  {

  }
}

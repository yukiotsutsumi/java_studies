import javax.swing.JOptionPane;
class aula1_programa2
{
	public static void main (String args[])
	{
		int numero;
		int resp=1;
		while(resp==1)
		{
		numero=Integer.parseInt(JOptionPane.showInputDialog("Escolha o curso: \n 1-Engenharia \n 2-Medicina \n 3-Direito \n 4-Administra��o"));
		switch (numero)
		{
			case 1:Engenharia();break;
			case 2:Medicina();break;
			case 3:Direito();break;
			case 4:Administracao();break;
			default:JOptionPane.showMessageDialog(null, "Fim do programa.");
		}
		resp=Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? \n 1-Sim 2-N�o"));
		}
	}
	static void Engenharia()
	{
		int numero;
		float mens, desc;
		numero=Integer.parseInt(JOptionPane.showInputDialog("Escolha o op��o: \n 1-Civil \n 2-Computa��o \n 3-Mecatr�nica"));
		switch (numero)
		{
			case 1:
				{
					mens=Float.parseFloat(JOptionPane.showInputDialog("Curso Engenharia Civil \n Valor da mensalidade:"));
					desc=mens*0.90f;
					JOptionPane.showMessageDialog(null, "Curso Engenharia Civil\n O valor da mensalidade � de: "+desc);break;
				}
			case 2:		
				{
					mens=Float.parseFloat(JOptionPane.showInputDialog("Curso Engenharia da Computa��o \n Valor da mensalidade:"));
					desc=mens*0.90f;
					JOptionPane.showMessageDialog(null, "Curso Engenharia da Computa��o\n O valor da mensalidade � de: "+desc);break;
				}
			case 3:		
				{
					mens=Float.parseFloat(JOptionPane.showInputDialog("Curso Engenharia Mecatr�nica \n Valor da mensalidade:"));
					desc=mens*0.90f;
					JOptionPane.showMessageDialog(null, "Curso Engenharia da Mecatr�nica \n O valor da mensalidade � de: "+desc);break;
				}
			default:JOptionPane.showMessageDialog(null, "Fim do programa.");	
		}		
	}
	static void Medicina()
	{
		JOptionPane.showMessageDialog(null, "Em desenvolvimento.");
	}
	static void Direito()
	{
		int numero;
		float mens, desc;
		numero=Integer.parseInt(JOptionPane.showInputDialog("Escolha o op��o: \n 1-Civil \n 2-Penal \n 3-Familiar"));
		switch(numero)
		{
			case 1:
			{
				mens=Float.parseFloat(JOptionPane.showInputDialog("Curso Direito Civil \n Valor da mensalidade:"));
				desc=mens*0.85f;
				JOptionPane.showMessageDialog(null, "Curso Direito Civil\n O valor da mensalidade � de: "+desc);break;
			}
			case 2:
			{
				mens=Float.parseFloat(JOptionPane.showInputDialog("Curso Direito Penal \n Valor da mensalidade:"));
				desc=mens*0.85f;
				JOptionPane.showMessageDialog(null, "Curso Direito Penal\n O valor da mensalidade � de: "+desc);break;
			}
			case 3:
			{
				mens=Float.parseFloat(JOptionPane.showInputDialog("Curso Direito Familiar \n Valor da mensalidade:"));
				desc=mens*0.85f;
				JOptionPane.showMessageDialog(null, "Curso Direito Familiar \n O valor da mensalidade � de: "+desc);break;
			}
			default:
			{
				JOptionPane.showMessageDialog(null, "Fim de Programa");
			}
		}
	}
	static void Administracao()
	{
		JOptionPane.showMessageDialog(null, "Em desenvolvimento.");
	}
}
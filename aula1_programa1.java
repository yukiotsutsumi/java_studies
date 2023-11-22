package menuxx;
import javax.swing.JOptionPane;
public class aula1_programa1{
	public static void main (String args []){
		int opcao;
		opcao=Integer.parseInt(JOptionPane.showInputDialog("Escolha a sua opção:\n 1-Adição\n 2-Subtração\n 3-Multiplicação \n 4-Divisão."));
		switch(opcao){
			case 1:modAdicao();break;
			case 2:modSubtr();break;
			case 3:modMultipl();break;
			case 4:modDiv();break;
			default:JOptionPane.showMessageDialog(null, "Fim do programa.");
		}
	}
	static void modAdicao(){
		double v1;
		double v2;
		double res;
		v1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor."));
		v2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor."));
		res=v1+v2;
		JOptionPane.showMessageDialog(null, "Soma="+res);
	}
	static void modSubtr(){
		double v1;
		double v2;
		double res;
		v1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor."));
		v2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor."));
		res=v1-v2;
		JOptionPane.showMessageDialog(null, "Subtração="+res);
	}
	static void modMultipl(){
		double v1;
		double v2;
		double res;
		v1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor."));
		v2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor."));
		res=v1*v2;
		JOptionPane.showMessageDialog(null, "Multiplicação="+res);
	}
	static void modDiv(){
		double v1;
		double v2;
		double res;
		v1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor."));
		v2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor."));
		res=v1/v2;
		JOptionPane.showMessageDialog(null, "Divisão="+res);
	}
}
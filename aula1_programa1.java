package menuxx;
import javax.swing.JOptionPane;
public class aula1_programa1{
	public static void main (String args []){
		int opcao;
		opcao=Integer.parseInt(JOptionPane.showInputDialog("Escolha a sua op��o:\n 1-Adi��o\n 2-Subtra��o\n 3-Multiplica��o \n 4-Divis�o."));
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
		JOptionPane.showMessageDialog(null, "Subtra��o="+res);
	}
	static void modMultipl(){
		double v1;
		double v2;
		double res;
		v1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor."));
		v2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor."));
		res=v1*v2;
		JOptionPane.showMessageDialog(null, "Multiplica��o="+res);
	}
	static void modDiv(){
		double v1;
		double v2;
		double res;
		v1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor."));
		v2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor."));
		res=v1/v2;
		JOptionPane.showMessageDialog(null, "Divis�o="+res);
	}
}
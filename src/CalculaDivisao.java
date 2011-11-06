import java.util.Scanner;


public class CalculaDivisao {

	public static void main(String[] args) throws CalculaDivisaoException{
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Senha: ");
		String senha = entrada.nextLine();
		validarSenha(senha);
		System.out.print("Confirme a senha: ");
		String confirmaSenha = entrada.nextLine();
		if(confirmaSenha.equalsIgnoreCase(senha)){
			System.out.print("Digite um n�mero (dividendo): ");
			double num1 = entrada.nextDouble();
			System.out.print("Digite outro n�mero (divisor): ");
			double num2 = entrada.nextDouble();	
			
			System.out.println("Resultado da divis�o: "+calcularDivisao(senha, num1, num2, confirmaSenha));
		}else{
			throw new  CalculaDivisaoException("Senha incorreta!");
		}
	
	}
	
	private static void validarSenha(String senha) throws CalculaDivisaoException {
		if(senha.length() > 6){
			System.out.println("A senha deve possuir, no m�ximo, 6 caracteres!");
			main(null);
		}		
	}

	public static double calcularDivisao(String senha, double num1, double num2, String confirmaSenha) throws CalculaDivisaoException {
		if(num2 == 0){
			throw new  CalculaDivisaoException("O divisor n�o pode ser zero!");
		}
		if(confirmaSenha.equalsIgnoreCase(senha)){
			return num1 / num2;
		}else{
			throw new  CalculaDivisaoException("Senha incorreta!");
		}
	}

}

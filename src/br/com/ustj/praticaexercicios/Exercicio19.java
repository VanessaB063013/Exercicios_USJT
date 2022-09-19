package br.com.ustj.praticaexercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Uma empresa decide presentear seus funcionários com um bônus de Natal. O valor é definido como segue:
• 20% do salário para os funcionários homens com mais de quinze anos de casa;
• 25% do salário para as funcionárias mulheres com mais de dez anos de casa;
• R$ 200,00 para os demais que não se encaixaram nas categorias anteriores.
Elabore um programa que recebe o sexo, o tempo de casa e o salário de um funcionário e exibe o valor total que o funcionário receberá no Natal (salário + bônus).
*/
public class Exercicio19 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat(".##");
		
		
		System.out.println("Digite F se for do sexo feminino e M se for do sexo masculino: ");
		String sexo = leia.next();
		System.out.println("Diga há quantos anos trabalha aqui (digite zero se possuir menos de um ano de casa): ");
		int anos = leia.nextInt();
		System.out.println("Diga há quantos meses trabalha aqui:");
		int meses = leia.nextInt();
		System.out.println("Digite o valor do seu salário:");
		double salario = leia.nextDouble();
		
		double bonusMulherMais15 = (25.00/100.00)*salario;
		double bonusHomemMais15 = (20.00/100.00)*salario;
		double outrosFunc = 200.00;
		
		if (sexo.equalsIgnoreCase("f") && anos>=15) {
			double novoSalarioM = salario + bonusMulherMais15;
			System.out.println("Seu salário no mês de dezembro (Salário + bonificação de natal) é de "  + formatador.format(novoSalarioM));
		} else if(sexo.equalsIgnoreCase("M") && anos>=15) {
			double novoSalarioH = salario + bonusHomemMais15;
			System.out.println("Seu salário no mês de dezembro (Salário + bonificação de natal) é de "  + formatador.format(novoSalarioH));
			
		} else if(anos<15 && meses<12) {
			double novoSalarioOutros = salario + outrosFunc;
			System.out.println("Seu salário no mês de dezembro (Salário + bonificação de natal) é de "  + formatador.format(novoSalarioOutros));
		} else {
			System.out.println("Opção inválida");
		}
		
		
		
	
		
		

	}

}

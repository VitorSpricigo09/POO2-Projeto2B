import java.util.Scanner;

		/**
		 *
		 * Essa classe apresenta formulas matematicas, sendo elas, o calculo do MMC, operações fundamentais em fracoes, IMC e conversoes de temperatura
		 * @author Vitor Spricigo
		 * 
		*/

public class Operacao {
	
	
	/**
	 * Metodo para calcular o Minimo Multiplo Comum (MMC)
	 * Formula: MMC = (den1 * den2) / mdc
	 * @param den1 é o valor do denominador da primeira fração
	 * @param den2 é o valor do denominador da segunda fração
	 * @return funcao retorna o resultado do MMC
	 */

	public int mmc(int den1, int den2)	{
		Scanner scan = new Scanner(System.in);
		int res=0, auxDen1=0, auxDen2=0;
	
		auxDen1 = den1;
		auxDen2 = den2;
		
		do {
			res = auxDen1 % auxDen2;
			auxDen1 = auxDen2;
			auxDen2 = res;
			
		} while (res != 0);
		
		return (den1 * den2) / auxDen1;
	}
	
	/**
	 * Metodo que efetua a soma de fracoes
	 * Calculo:
	 * caso denominadores diferentes 
	 * auxNum = ((mmc/den1)*num1) + ((mmc/den2)*num2)
	 * res = (auxNum/mmc)
	 * caso numeradores iguais
	 * res = (num1 - num2)/mmc
	 * @param num1 e o valor do numerador da primeira fracao
	 * @param num2 e o valor do numerador da segunda fracao
	 * @param den1 e o valor do denominador da primeira fracao
	 * @param den2 e o valor do denominador da segunda fracao
	 * @return res funcao retorna o valor resultado da soma de duas fracoes
	 */
	
	public String somaFracao(int num1, int den1, int num2, int den2) {
		int auxNum=0, mmc=0;
		String res=null;
		Scanner scan = new Scanner(System.in);
		Operacao op = new Operacao();
		
		System.out.println("Informe o valor do primeiro numerador");
		num1 = scan.nextInt();
		System.out.println("Informe o valor do primeiro denominador");
		den1 = scan.nextInt();
		System.out.println("Informe o valor do segundo numerador");
		num2 = scan.nextInt();
		System.out.println("Informe o valor do segundo denominador");
		den2 = scan.nextInt();
		
		if (den1!=den2) {
			
			mmc = mmc(den1,den2);
			auxNum = ((mmc/den1)*num1) + ((mmc/den2)*num2);
			res = (auxNum + "/" + mmc);
		}
		if (den1==den2) {
			res = (num1 + num2 + "/" + den1);
		}
		return res;
	}
	
	/**
	 * Metodo que efetua a subtracao de fraçoes
	 * Calculo:
	 * caso denominadores diferentes 
	 * auxNum = ((mmc/den1)*num1) - ((mmc/den2)*num2)
	 * res = (auxNum/mmc)
	 * caso numeradores iguais
	 * res = (num1 - num2)/mmc
	 * @param num1 é o valor do numerador da primeira fracao
	 * @param num2 é o valor do numerador da segunda fracao
	 * @param den1 é o valor do denominador da primeira fracao
	 * @param den2 é o valor do denominador da segunda fracao
	 * @return res função retorna o valor resultado da subtração de duas fracoes
	 */
	
	public String subtraiFracao(int num1, int den1, int num2, int den2) {
		int auxNum=0, mmc=0;
		String res=null;
		Scanner scan = new Scanner(System.in);
		Operacao op = new Operacao();
		
		System.out.println("Informe o valor do primeiro numerador");
		num1 = scan.nextInt();
		System.out.println("Informe o valor do primeiro denominador");
		den1 = scan.nextInt();
		System.out.println("Informe o valor do segundo numerador");
		num2 = scan.nextInt();
		System.out.println("Informe o valor do segundo denominador");
		den2 = scan.nextInt();
		
		if (den1!=den2) {
			
			mmc = mmc(den1,den2);
			auxNum = ((mmc/den1)*num1) - ((mmc/den2)*num2);
			res = (auxNum + "/" + mmc);
		}
		if (den1==den2) {
			res = (num1 - num2 + "/" + den1);
		}
		return res;
	}
	
	/**
	 * Metodo que efetua a multiplicao de fracoes
	 * Calculo:
	 * res = (num1*num2)/(den1*den2)
	 * @param num1 e o valor do numerador da primeira fracao
	 * @param num2 e o valor do numerador da segunda fracao
	 * @param den1 e o valor do denominador da primeira fracao
	 * @param den2 e o valor do denominador da segunda fracao
	 * @return res funcao retorna o valor resultado da multiplicacao de duas fracoes
	 */
	
	public String multiplicaFracao(int num1, int den1, int num2, int den2) {
		Scanner scan = new Scanner(System.in);
		Operacao op = new Operacao();
		
		System.out.println("Informe o valor do primeiro numerador");
		num1 = scan.nextInt();
		System.out.println("Informe o valor do primeiro denominador");
		den1 = scan.nextInt();
		System.out.println("Informe o valor do segundo numerador");
		num2 = scan.nextInt();
		System.out.println("Informe o valor do segundo denominador");
		den2 = scan.nextInt();
		
		return ((num1*num2) + "/" + (den1*den2));	
		}
	
	/**
	 * Metodo que efetua a divisao de fracoes
	 * Calculo:
	 * resultado = (num1*num2)/(den1*den2)
	 * @param num1 e o valor do numerador da primeira fracao
	 * @param num2 e o valor do numerador da segunda fracao
	 * @param den1 e o valor do denominador da primeira fracao
	 * @param den2 e o valor do denominador da segunda fracao
	 * @return res funcao retorna o valor resultado da divisão de duas fracoes
	 */
	
	public String divideFracao(int num1, int den1, int num2, int den2) {
		Scanner scan = new Scanner(System.in);
		Operacao op = new Operacao();
		
		System.out.println("Informe o valor do primeiro numerador");
		num1 = scan.nextInt();
		System.out.println("Informe o valor do primeiro denominador");
		den1 = scan.nextInt();
		System.out.println("Informe o valor do segundo numerador");
		num2 = scan.nextInt();
		System.out.println("Informe o valor do segundo denominador");
		den2 = scan.nextInt();
		
		return ((num1*den2) + "/" + (den1*num2));
	}
	
	/**
	 * Metodo que efetua o calculo do Indice de Massa Corporal (IMC)
	 * Calculo:
	 * imc = peso/(altura*altura)
	 * @param peso e o valor do peso em Quilogramas
	 * @param altura e o valor da altura em Centimetros
	 * @return imc função retorna o valor resultado do imc
	 */
	
	public double imc(double altura, double peso) {
		double imc=0.00;
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor da altura (em centímetros)");
		altura = scan.nextDouble();
		System.out.println("Informe o valor do peso (em quilogramas)");
		peso = scan.nextDouble();
		
		imc = peso/(altura*altura);
		
		return imc;
	}
	
	/**
	 * Metodo que efetua a conversao de Graus Celsius para Kelvin
	 * Calculo:
	 * k = c+273
	 * @param c = temperatura em graus Celcius
	 * @return função retorna o valor resultado da conversao Celsius-Kelvin
	 */
	
	public double celsiusToKelvin(double c) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em °C");
		c = scan.nextDouble();
		
		return (c+273.15);
	}
	
	/**
	 * Metodo que efetua a conversao de Graus Celsius para Farenheit
	 * Calculo:
	 * f = (1,8*c)+32
	 * @param c = temperatura em graus Celcius
	 * @return funcao retorna o valor resultado da conversao Celsius-Farenheit
	 */
	
	public double celsiusToFarenheit(double c) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em °C");
		c = scan.nextDouble();
		
		return ((c*1.8)+32);
	}
	
	/**
	 * Metodo que efetua a conversao de Graus Kelvin para Celsius
	 * Calculo:
	 * c = k-273.15
	 * @param k = temperatura em graus Kelvin
	 * @return funcao retorna o valor resultado da conversao Kelvin-Celcius
	 * 
	 */
	
	public double kelvinToCelsius(double k) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em K");
		k = scan.nextDouble();
		
		return (k-273.15);
	}	
	
	/**
	 * Metodo que efetua a conversao de Graus Kelvin para Farenheit
	 * Calculo:
	 * f = ((k-273.15)*1.8)+32
	 * @param k = temperatura em graus Kelvin
	 * @return funcao retorna o valor resultado da conversao Kelvin-Farenheit
	 */
	
	public double kelvinToFarenheit(double k) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em K");
		k = scan.nextDouble();
		
		return ((k-273.15)*1.8)+32;
	}	
	
	/**
	 * Metodo que efetua a conversao de Graus Farenheit para Celsius
	 * Calculo:
	 * c = (f-32)/1.8
	 * @param f = temperatura em graus Farenheit
	 * @return funcao retorna o valor resultado da conversao Farenheit-Celcius
	 */
	
	public double farenheitToCelsius(double f) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em °F");
		f = scan.nextDouble();
		
		return (f-32)/1.8;
	}	
	
	/**
	 * Metodo que efetua a conversao de Graus Farenheit para Kelvin
	 * Calculo:
	 * k = ((f-32)/1.8)+273.15
	 * @param f = temperatura em graus Farenheit
	 * @return funcao retorna o valor resultado da conversao Farenheit-Kelvin
	 */
	
	public double farenheitToKelvin(double f) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em °F");
		f = scan.nextDouble();
		
		return ((f-32)/1.8)+273.15;
	}	
	
	public static void main(String[] args) {
		Operacao op = new Operacao();
		Scanner scan = new Scanner(System.in);
		boolean saida=false;
		
	do {	
		int num1=0, num2=0, den1=0, den2=0;
		double k=0.00, f=0.00, c=0.00, altura=0.00, peso=0.00;
				
		System.out.println("Escolha uma opcao: \n");
		System.out.println("1 - Calcular MMC");
		System.out.println("2 - Calcular Soma de Fracoes");
		System.out.println("3 - Calcular Subtracao de Fracoes");
		System.out.println("4 - Calcular Multiplicacao de Fracoes");
		System.out.println("5 - Calcular Divisao de Fracoes");
		System.out.println("6 - Calcular o IMC");
		System.out.println("7 - Converter °C para K");
		System.out.println("8 - Converter °C para F");
		System.out.println("9 - Converter K para °C");
		System.out.println("10 - Converter K para °F");
		System.out.println("11 - Converter °F para °C");
		System.out.println("12 - Converter °F para K");
		System.out.println("0 - Sair");
		int opcao = scan.nextInt();
				
		switch(opcao) {
		case 1:
			System.out.println("Informe o valor do primeiro denominador"); den1 = scan.nextInt();
			System.out.println("Informe o valor do segundo denominador"); den2 = scan.nextInt();
			System.out.println("O valor do MMC e: " + op.mmc(den1, den2) + "\n"); break;
		case 2: System.out.println("O valor da Soma e: " + op.somaFracao(num1, den1, num2, den2) + "\n"); break;
		case 3: System.out.println("O valor da subtracao e: " + op.subtraiFracao(num1, den1, num2, den2) + "\n"); break;
		case 4: System.out.println("O valor da multiplicacao e: " + op.multiplicaFracao(num1, den1, num2, den2) + "\n"); break;
		case 5: System.out.println("O valor da divisao e: " + op.divideFracao(num1, den1, num2, den2) + "\n"); break;
		case 6: System.out.println("O valor do IMC e " + op.imc(altura, peso) + "\n");
		case 7: System.out.println("A temperatura e de: " + op.celsiusToKelvin(c) + " K\n"); break;
		case 8: System.out.println("A temperatura e de: " + op.celsiusToFarenheit(c) + " °F\n"); break;
		case 9: System.out.println("A temperatura e de: " + op.kelvinToCelsius(k) + " °C\n"); break;
		case 10: System.out.println("A temperatura e de: " + op.kelvinToFarenheit(k) + " °F\n"); break;
		case 11: System.out.println("A temperatura e de: " + op.farenheitToCelsius(f) + " °C\n"); break;
		case 12: System.out.println("A temperatura e de: " + op.farenheitToKelvin(f) + " K\n"); break;
		case 0: saida = true; System.out.println("Voce saiu! Ate breve!"); break;
		default: System.out.println("Opcao Invalida");
			
		}
	} while (saida==false);

	}

}

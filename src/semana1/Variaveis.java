package semana1;
/**
 *  Descreva 5 tipos de variaveis  e associe 10 variavel com algum dado compativel com ela.
 *  
 *  Armazene a descrição da variavel em uma variavel e imprima as variaveis no console do seguinte modo:
 *
 *
 *  nomeDaVariavel: + variavelExplicação + tipoDaVariavel 
 *
 *
 *  Dica: Procure ser simples, Variaveis de ambiente não se aplicam nessa semana.
 *  Dica2: Para mostrar algo no console procure entender o metodo "print"
 *
 */

//Fabrica de Testes

//César Monti
//ID: 725999

public class Variaveis {

	public static void main(String[] args) {
		

		//Criação de variáveis
    	
    	//int é uma variável que guarda valores inteiros sem utilizar casas decimais.
    	int notaSemestre1 ;
    	int notaSemestre2 ; 
    	
    	
    	//double é uma variável que guarda valores que possuem decimais, incluindo os inteiros.
    	double resultadoFinal ;
    	double resultadoEsperado ; 
    	
    	//float é uma váriavel que guarda os mesmos valores de double, porém com uma precisão menor.
    	float resultadoRecuperacao ;
    	float resultadoNegativo ;
    	
    	//boolean é uma variável que guarda apenas os valores true e false, não é numérico.
    	boolean foiAprovado ;
    	boolean foiReprovado ; 
    	
    	//char é uma variável que guarda apenas 1 único caractere.
    	char alunoGrade ;
    	char alunoGrade2 ;
    	
    	//Atribuindo valores para as variáveis
    	
    	notaSemestre1 = 5;
    	notaSemestre2 = 4;
    	resultadoFinal = 5.5;
    	resultadoEsperado = 7.0;
    	resultadoRecuperacao = (float) 9.5;
    	resultadoNegativo = (float) 4.7;
    	foiAprovado = true;
    	foiReprovado = false;
    	alunoGrade = 'b';
    	alunoGrade2 = 'a';
    	
    	//Imprimir os valores na tela
    	
    	System.out.println(notaSemestre1);
    	System.out.println(notaSemestre2);
    	System.out.println(resultadoFinal);
    	System.out.println(resultadoEsperado);
    	System.out.println(resultadoRecuperacao);
    	System.out.println(resultadoNegativo);
    	System.out.println(foiAprovado);
    	System.out.println(foiReprovado);
    	System.out.println(alunoGrade);
    	System.out.println(alunoGrade2);
    	
    	
    }
}
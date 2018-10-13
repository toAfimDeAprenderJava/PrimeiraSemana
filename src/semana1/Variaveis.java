package semana1;

/**
 * Bianca Lopes
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

public class Variaveis {


    public static void main(String[] args) {
    	
    	//Variaveis escolhidas: int, double, string, float, char
		
    			//Declara��o das descri��es
    			String descInt, descDouble, descFloat, descChar, descString;
    			
    			//Declaracao das variaveis
    			int varInt;
    			
    			double varDouble;
    			
    			float varFloat;
    			
    			String varString;
    			
    			char varChar;
    			
    			
    			//Inicializando as variaveis das descricoes
    			descInt = "Tipo de vari�vel que armazena n�meros inteiros";
    			descDouble = "Tipo de vari�vel que armazena n�meros inteiros e decimais (8 bytes)";
    			descFloat = "Tipo de vari�vel que armazena n�meros inteiros e decimais com menor tamanho (4 bytes)";
    			descChar = "Tipo de vari�vel que armazena caracter com menor tamanho (1 byte)";
    			descString = "Tipo de vari�vel que armazena uma sequ�ncia caracteres ";
    			
    			
    			//Declaracao das variaveis
    			varInt = 37;
    			varDouble = 55.79;
    			varFloat = 3.14f;
    			varString = "Ordem e Progresso";
    			varChar = 'A';
    			
    			System.out.println("Vari�vel INT: " + descInt + "- " + varInt);
    			System.out.println("Vari�vel DOUBLE: " + descDouble + "- " + varDouble);
    			System.out.println("Vari�vel FLOAT: " + descFloat + "- " + varFloat);
    			System.out.println("Vari�vel CHAR: " + descChar + "- " + varChar);
    			System.out.println("Vari�vel STRING: " + descString + "- " + varString);

    }
}

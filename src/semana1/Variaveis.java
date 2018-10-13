package semana1;

/**
 * Bianca Lopes
 *  Descreva 5 tipos de variaveis  e associe 10 variavel com algum dado compativel com ela.
 *  
 *  Armazene a descriÃ§Ã£o da variavel em uma variavel e imprima as variaveis no console do seguinte modo:
 *
 *
 *  nomeDaVariavel: + variavelExplicaÃ§Ã£o + tipoDaVariavel 
 *
 *
 *  Dica: Procure ser simples, Variaveis de ambiente nÃ£o se aplicam nessa semana.
 *  Dica2: Para mostrar algo no console procure entender o metodo "print"
 *
 */

public class Variaveis {


    public static void main(String[] args) {
    	
    	//Variaveis escolhidas: int, double, string, float, char
		
    			//Declaração das descrições
    			String descInt, descDouble, descFloat, descChar, descString;
    			
    			//Declaracao das variaveis
    			int varInt;
    			
    			double varDouble;
    			
    			float varFloat;
    			
    			String varString;
    			
    			char varChar;
    			
    			
    			//Inicializando as variaveis das descricoes
    			descInt = "Tipo de variável que armazena números inteiros";
    			descDouble = "Tipo de variável que armazena números inteiros e decimais (8 bytes)";
    			descFloat = "Tipo de variável que armazena números inteiros e decimais com menor tamanho (4 bytes)";
    			descChar = "Tipo de variável que armazena caracter com menor tamanho (1 byte)";
    			descString = "Tipo de variável que armazena uma sequência caracteres ";
    			
    			
    			//Declaracao das variaveis
    			varInt = 37;
    			varDouble = 55.79;
    			varFloat = 3.14f;
    			varString = "Ordem e Progresso";
    			varChar = 'A';
    			
    			System.out.println("Variável INT: " + descInt + "- " + varInt);
    			System.out.println("Variável DOUBLE: " + descDouble + "- " + varDouble);
    			System.out.println("Variável FLOAT: " + descFloat + "- " + varFloat);
    			System.out.println("Variável CHAR: " + descChar + "- " + varChar);
    			System.out.println("Variável STRING: " + descString + "- " + varString);

    }
}

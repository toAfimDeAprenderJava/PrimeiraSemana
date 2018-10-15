package semana1;

/**
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
    	
    	int inteiro1 = 0;
    	int inteiro2 = 523423475;
    	String descinteiro ="É o tipo de dado capaz de armazenar 32 bits, ou seja,"
    			+ " de representar um número inteiro "
    			+ "qualquer entre -2.147.483.648 e 2.147.483.647." ;
    	double double1 = 2.4;
    	double double2 = 6.24e-24;
    	String descdouble = "O tipo de dados double é usado quando precisamos armazenar"
    			+ " números de ponto-flutuante (com parte fracionária) na faixa "
    			+ "4.94065645841246544e-324 até 1.79769313486231570e+308, possui precisão "
    			+ "de 14 ou 15 dígitos significativos.";
    	
    	char char1 = 'a';
    	char char2 = 'z';
    	String descchar = "O tipo char guarda um, e apenas um, caractere. Esse caractere deve estar entre aspas simples.";
    	
    	boolean bool1 = true;
    	boolean bool2 = false;
    	boolean bool3 = 2<4;
    	String descbool = " O Booleano é um tipo de dado que permite apenas dois "
    			+ "valores, true (verdadeiro) ou false (false)";
    	
    	String string1 = "pouco";
    	String string2 = "Uma grande quantidade gigantescamente gigante de caractere, número 123434234, símbolos @#$&¨%%$*"
    			+ "¬¬' :) XD o que for preciso armazenar dentro desta variável";
    	String descstring = "A variável string é utilizada para armazenar dados de qualquer tipo, desde um simples"
    			+ "caractere até símbolos mais complexos";
    	
    	System.out.println("Tipo da variável: Inteiro (int)" + "\n" + "Exemplos: " + inteiro1 + ", "
    			+ inteiro2 + "\n" +"Descrição da variável Inteiro: " + descinteiro + "\n");
    	
    	System.out.println("Tipo da variável: Double" + "\n" + "Exemplos: " + double1 + ", " + double2 + "\n"
    			+ "Descrição da variável Double: " + descdouble + "\n");
    	
    	System.out.println("Tipo da variável: Char" + "\n" + "Exemplos: " + char1 + ", " + char2 
    			+ "\n" + "Descrição da variável Char: " + descchar + "\n");
    	
    	System.out.println("Tipo de variável: Boolean" + "\n" + "Exemplos: " + bool1 + ", " + bool2 + ", 2<4? " + bool3
    			+ "\n" + "Descrição da variável Boolean: " + descbool + "\n");
    	
    	System.out.println("Tipoe de variável: String" + "\n" + "Exemplos: " + string1 + ", \n" + string2 + "\n"
    			+ "Descrição da variável String: " + descstring);
    	
    }
}

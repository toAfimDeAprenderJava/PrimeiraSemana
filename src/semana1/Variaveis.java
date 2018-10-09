package semana1;

/**
 *  Descreva 5 tipos de variaveis  e associe 10 variavel com algum dado compativel com ela.
 *  
 *  Armazene a descriÃ§Ã£o da variavel em uma variavel e imprima as variaveis no console do seguinte modo:
 *
 *
 *  nomeDaVariavel: + variavelExplicaÃ£o + tipoDaVariavel 
 *
 *
 *  Dica: Procure ser simples, Variaveis de ambiente nÃ£o se aplicam nessa semana.
 *  Dica2: Para mostrar algo no console procure entender o metodo "print"
 *
 */

public class Variaveis {


    public static void main(String[] args) {
String stringDesc="String: Armazena uma cadeia de caracteres. Sua definição é String nomeDaString=\"Aqui tem string\";.";
String intDesc="Int: Armazena um valor inteiro. Não são usadas aspas em sua definição, assim: \n int dedosDaMinhaMao=5;";
String floatDesc="Float: Armazena números decimais. Quando float recebe um valor não flutuante, irá adequar o tipo. Por isso a melhor forma de se definir um float é acrescentar um f após o número, assim: \n float rotacoesPorMinuto=33.5f; ou float horasTrabalhadas=8f;";
String doubleDesc="Double: Um float aprimorado. Além de receber tanto valores inteiros como decimais, possui dupla precisão. Útil para evitar exceptions quando o valor esperado é um int mas um decimal é retornado. \n double minhasCasasDeAluguel=20; double minhaRendaMensal=30803.21;";
String charDesc="Char: Recebe um único caractere. Sua definição é feita com aspas simples, assim: \n char opicao=\'s';";

System.out.println(stringDesc);
System.out.println(intDesc);
System.out.println(floatDesc);
System.out.println(doubleDesc);
System.out.println(charDesc);

System.out.println("--------");
String nome="João Lucio";
String empresa="Cognizant";
String mensagem="O rato roeu a roupa do rei de roma";
String poema="Escrevo essa estrofe \n Numa noite estrelada \n Pois isso é um exercício \n Do curso de java";
String conselho="\t indente seu código";
String falatorio="Ouvi dizer que \"Sintaxe Java é mais fácil que sintaxe de Python\"";
String apresentacao="Muito prazer! Meu nome é " + nome;
String minhasTarefas="Escrever um System.out.println pra cada uma dessas strings";
String oQueVouFazer="Juntar tudo numa string só e mandar printar";
String aiesta=nome + empresa + mensagem; 
    }
}
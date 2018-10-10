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
String intDesc="Int: Variável do tipo primitivo, armazena um valor inteiro. Não são usadas aspas em sua definição, assim: \n int dedosDaMinhaMao=5;";
String floatDesc="Float: Variável do tipo primitivo, armazena números decimais, possui precisão simples. Quando float recebe um valor não flutuante, irá adequar o tipo. Por isso a melhor forma de se definir um float é acrescentar um f após o número.";
String doubleDesc="Double: Também uma variável de tipo primitivo, é um float aprimorado. Além de receber tanto valores inteiros como decimais, possui dupla precisão. Útil para evitar exceptions quando o valor esperado é um int mas um decimal é retornado.";
String charDesc="Char: Recebe um único caractere. Quando não recebe um número, sua definição é feita com aspas simples";

System.out.println(stringDesc);
System.out.println(intDesc);
System.out.println(floatDesc);
System.out.println(doubleDesc);
System.out.println(charDesc);

System.out.println("-------- Strings --------");
String nome="João Lucio";
String empresa="Cognizant";
String mensagem="O rato roeu a roupa do rei de roma";
String poema="Escrevo essa estrofe \n Numa noite estrelada \n Pois isso é um exercício \n Do curso de java";
String conselho="\t indente seu código";
String falatorio="Ouvi dizer que \"Sintaxe Java é mais fácil que sintaxe de Python\"";
String apresentacao="Muito prazer! Meu nome é " + nome;
String minhasTarefas="Escrever um System.out.println pra cada uma dessas strings";
String oQueVouFazer="Juntar tudo numa string só e mandar printar";
String aiesta=nome + "\n" + empresa + "\n" + mensagem + "\n" + poema + "\n" + conselho + "\n" + falatorio + "\n" + apresentacao + "\n" + minhasTarefas + "\n" + oQueVouFazer;
System.out.println(aiesta);
System.out.println("--------Int--------");
int ladosDeUmaBola=2;
int quantosCarasExistem=1;
int vezesSalarioCaiMinhaConta=150;
int quantasSeraoQuandoAprenderJava=vezesSalarioCaiMinhaConta*2;
int meuVoto=0;
int quantosIntsFaltamPraEuDefinir=4;
int iPhoneAtual=10;
int proximoIPhone=iPhoneAtual+1;
int eAgora=quantosIntsFaltamPraEuDefinir-1;
int intNaoProcessaNumerosMaioresQue=2147483647;

System.out.println("Por que a bola tem " + ladosDeUmaBola + " lados?");
System.out.println("Deve ser porque só existe " + quantosCarasExistem + " cara.");
System.out.println("Que não sou eu, mas por mês, o salário cai " + vezesSalarioCaiMinhaConta + " vezes na minha conta.");
System.out.println("Não é pouco, mas quando aprender Java, cairá " + quantasSeraoQuandoAprenderJava + " vezes.");
System.out.println("No segundo turno entre 0 e 00, permanecerei com o " + meuVoto + ".");
System.out.println("Espero que essa quantidade toda de ints pra declarar realmente sirvam pra adquirir fluência, ainda faltam " + quantosIntsFaltamPraEuDefinir + ".");
System.out.println("Tenho um Iphone " + iPhoneAtual + ", mas já não me serve mais. Espero que o " + proximoIPhone + " não demore.");
System.out.println("E agora? Ainda faltam " + eAgora + "ints...");
System.out.println("Claro que não falta tudo isso. Vamos acabar logo, até o int no Java tem limite e é " + intNaoProcessaNumerosMaioresQue + ".");
System.out.println("--------Float--------");;
float horasTrabalhadas=8f;
float rotacoesPorMinuto=33.5f;
float rotacaoAntiga=78;
float tamanhoDoDisquete=3.5f;
float horasDoProjeto=32.5f;
float media=horasDoProjeto/horasTrabalhadas;
float limite=340282347f;
String floatPrint=horasTrabalhadas + "\n" + rotacoesPorMinuto + "\n" + rotacaoAntiga + "\n" + tamanhoDoDisquete + "\n" + horasDoProjeto + "\n" + media + "\n" + "\n" + limite;
System.out.println(floatPrint);
    }
}
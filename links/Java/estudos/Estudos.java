/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
/**
 * @author Lucas
 */
/**
* @param args the command line arguments
*/
package estudos; //Pacote (Diretorio)

import java.util.Arrays;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;         /*Importações de outros pacotes existentes*/
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Estudos /*Classe*/ extends Application /*Herança*/ {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLEstudos.fxml"));
        
        Scene scene = new Scene(root);        
        
        stage.setScene(scene);
        stage.show();
    }
    
        //___________________________________________Aula 15____________________________________________________________
        static void soma(int a, int b) {
            int s = a + b;
            System.out.println("A soma é " + s);
        }
        
        static int soma1(int a1, int b1) {
            int s = a1 + b1;
            return s;
        }

    public static void main(String[] args) /*Metodo principal*/ /*psvm + |tab| = escrever o comando*/{
        launch(args);
        System.out.print("Olá, Mundo!"); /*sout + |tab| = para escrever o comando*/
        System.out.println("Olá, Mundo!"); //ln no final faz com que ele quebre a linha
        
        //___________________________________________Aula 15____________________________________________________________
        soma(5,2);
        
        int sm = soma1(6,3);
        System.out.println("A soma vale " + sm);
        
        System.out.println("Vai começar a contagem");
        System.out.println(Operacoes.contador(1,5));
        
        //___________________________________________Aula ?____________________________________________________________
        String nome = "Gustavo";
        float nota = 8.5f;
        System.out.print("Sua nota é " + nota);
        System.out.println("Sua nota é " + nota); //ln quebra linha
        System.out.printf("A nota de %s é %.2f \n", nome, nota);// printf ou format = formatado, %s String, %f float (real), .2 duas casas decimais, \n quebra de linha
        System.out.format("A nota de %s é %.2f \n", nome, nota);
        
        //___________________________________________Aula ?____________________________________________________________
        Scanner teclado = new Scanner(System.in);
        String nome2 = teclado.nextLine(); //Agora é para escrever o nome e a nota
        float nota2 = teclado.nextFloat();
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        
        //___________________________________________Aula ?____________________________________________________________
        int idade = 30;
        String valor = Integer.toString(idade); //Para transformar int em string
        System.out.println(valor);
        
        String idade2 = "30";
        int valor2 = Integer.parseInt(idade2);//Para transformar String em int
        
        String valor3 = "30.5";
        float idade3 = Float.parseFloat(valor3);//Para transformar String em Float
        System.out.printf("%.3f", idade3);         
        
        //___________________________________________Aula 7____________________________________________________________
        int n1 = 3;
        int n2 = 5; 
        float n = (n1 + n2)/2; // primero soma os dois numeros entre parenteses e logo realiza a divisão por 2
        System.out.println("A média é igual a " + n);
        
        int numero = 5;
        numero++; // numero++ soma +1 após o nomero 
        ++numero; // ++numero presoma +1 ao numero
        numero--; // diminuir após o numero
        --numero; // prediminui o numero
        System.out.println(numero);
        
        int x = 4;
        x += 2; // x = 4| x += 2 == 4 + 2 == 6
        System.out.println(x);
        
        double number = 81;
        double raiz = Math.sqrt(number); // Classe Math, Raiz quandrada .sqrt
        System.out.println(raiz);
        
        double ale = Math.random(); // Gera numero aleatorio (de 0 a 1)
        int arre = (int) (15 + ale * (50-15)); // Faz com que seja um numero de 15 à 50 o numero gerado, porque ele multiplica por 35 para chegar ate 50 o maximo, e soma com 15 pra chegar no valor minimo 15
        System.out.println(arre);
        
        //___________________________________________Aula 8____________________________________________________________
        int n3, n4, r1;
        n3 = 4;
        n4 = 8;
        r1 = (n3>n4)?0:1; // ? r1 recebe o valor 0 se n3 for verdadeiramente maior que n4 senão (:) o r1 recebera o valor 1 | poderia colocar de vez 0 ou 1, qualquer outro valor ou ate mesmo pra mostrar o valor de n1 ou n2.| podemos fazer com que seja uma operação no resultado Ex: ?n1-n2:n1+n2; 
        System.out.println(r1);// no caso o r1 vai receber 1 pelo fato de o valor de n3 ser menor que o valor de n4;
        
        String nome4 = "Gutavo";
        String nome5 = "Gutavo";
        String nome6 = new String ("Gutavo");
        String res2;
        String res3;
        res2 = (nome4==nome6)?"igual":"diferente"; //nome4 e nome5 sao estruturas iguais, mas nome 6 não tem a mesma estrutura dos outros dois
        res3 = (nome4.equals(nome6))?"igual":"diferente"; // nome4 e nome5 agora vai ser igual a nome6 pois esta comparando o conteudo dentro da variavel
        System.out.println(res2 + res3);
        
        int x1, y1, z1;
        x1 = 4;
        y1 = 7;
        z1 = 12;
        boolean r2, r3 , r4;
        r2 = (x1<y1 && y1<z1)?true:false;
        r3 = (x1<y1 || y1==z1)?true:false;
        r4 = (x1<y1 ^ y1<z1)?true:false;
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        
        //___________________________________________Aula 9____________________________________________________________
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Primeira nota:");
        float n5 = teclado1.nextFloat();
        System.out.println("Segunda nota:");
        float n6 = teclado1.nextFloat();
        float m = (n5+n6)/2;
        System.out.println("Sua media foi " + m);
        if (m>9) {
            System.out.println("Parabéns!");
        }
        
        Scanner t = new Scanner(System.in);
        System.out.println("Qual o ano do seu nascimento? ");
        int nasc = t.nextInt();
        int i = 2015-nasc;
        System.out.println("Sua idade é " + i);
        if (i>= 18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
        
        //___________________________________________Aula 10____________________________________________________________
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
        
        //___________________________________________Aula 11____________________________________________________________
        int cc = 0;
        while (cc<4) { //while == enquanto
            System.out.println("Cambalhota " + (cc+1)); //Enquanto cc for menor do que 4 o comando entre chaves vai ser executado e cc vai recebendo +1, o (cc+1) é so para deixa mais bonito 
            cc++; // ou cc = cc+1;
        }
        
        //Continue
        int cc1 = 0;
        while (cc1<10) { 
            cc++;
            if (cc1 == 5 || cc1 == 7) { // o continue ele pula o comando, e continua executando o comando
                continue;
            }
            System.out.println("Combalhota " + cc1);
        }
        
        //Break
        int cc2 = 0;
        while (cc2<10) { 
            cc++;
            if (cc2 == 7) { // o break pula para o final
                break;
            }
            System.out.println("Combalhota " + cc2);
        }
        
        //___________________________________________Aula 12____________________________________________________________
       int cc3 = 0;
       do {
           System.out.println(cc3);
           cc3++;
       } while (cc3 < 4);
        
        int n7, s = 0;
        String resp;
        Scanner teclado2 = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: ");
            n7 = teclado2.nextInt();
            s += n;
            System.out.println("Quer continuar? [s/n]");
            resp = teclado2.next();
        } while (resp.equals("s"));
        System.out.println("A soma de todos os valores é " + s);
        
        //___________________________________________Aula 13____________________________________________________________
        for (int cc4=0; cc4<=3; cc4++) { //cc=c+1 ou cc+=1 ou cc++
            System.out.println("Cambalhota");
        }
        
        //___________________________________________Aula 14____________________________________________________________
        int n8[] = {3,2,8,7,5,4}; //int n8 [] = new int [4] | n8[0] = 3 | n8[1] = 2 ...
        System.out.println("Total de casas de N8 " + n8.length);
        for(int c4=0; c4<= 5; c4++){
            System.out.println(n8[c4] + " "); //("Na posição " + c + " temos o valor " + n8[c4])
        }
        
        String mes[] = {
            "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez" 
        };
        int tot[] = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        for(int c=0; c<mes.length; c++){
            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias ao todo."); // Mostra enquanto o mes[c] representa os meses, o tot[c] é o total de dias do mes, ent o nome e a quantidade de dias que tem esse mes é exibido
        }
        
        double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v);//organiza os vetores em ordem
        for (double valor1: v) {
            System.out.println(valor1 + " "); // v como variavel com vetores é exibido com um "para cada/for it" mostrando cada vetor dentro da variavel.
        }
        
        int vet[] = {
            3, 7, 6, 1, 9, 4, 2
        };
        for (int v1:vet){
            System.out.println(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 1); // Encontra a posição do vetor dentro da variavel
        System.out.println("Encontrei o valor na posição " + p);
        
        int v2[] = new int[20];
        Arrays.fill(v2, 0); // preenche todos os 20 vetores de v com o valor 0
        for(int valor4: v2){
            System.out.println(valor4 + " ");
        }
        
        
        
    }
    
}

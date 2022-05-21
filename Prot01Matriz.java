package TrabUjeverson;

import java.util.Scanner;

public class Prot01Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont, cont2, total;
        int[] matc = new int [4];
        int[] [] matp = new int[4][4];
        cont = 1;
        cont2 = 1;


        System.out.println("Digite o valor da porção de arroz");
        matc[1] = entrada.nextInt();
        System.out.println("Digite o valor da porção de salada");
        matc[2] = entrada.nextInt();
        System.out.println("Digite o valor da porção de carne");
        matc[3] = entrada.nextInt();


        while(cont <= 3){
        System.out.println("Digite a quantidade de porções de arroz do prato " +cont);
        matp[1][cont] = entrada.nextInt();
        System.out.println("Digite a quantidade de porções de salada do prato "+cont);
        matp[2][cont] = entrada.nextInt();
        System.out.println("Digite a quantidade de porções de carne do prato " +cont);
        matp[3][cont] = entrada.nextInt(); 
        cont++;
        }

        /*while(cont2 <= 3){
            while(cont <= 3){
                matp[cont][cont2] = matp[cont][cont2] * matc[1];
                cont = cont + 1;
            }
            cont2 = cont2 + 1;
        }*/

        matp[1][1] = matp[1][1] * matc[1];
        matp[2][1] = matp[2][1] * matc[2];
        matp[3][1] = matp[3][1] * matc[3];

        matp[1][2] = matp[1][2] * matc[1];
        matp[2][2] = matp[2][2] * matc[2];
        matp[3][2] = matp[3][2] * matc[3];

        matp[1][3] = matp[1][3] * matc[1];
        matp[2][3] = matp[2][3] * matc[2];
        matp[3][3] = matp[3][3] * matc[3];

        
            while(cont2 <= 3){
                total = matp[cont][cont2] + matp[cont+1][cont2] +matp[cont+2][cont2];
                System.out.println("O valor total do prato "+cont+" é de: "+total);
                cont2 = cont2 + 1;
            }

        }

        /*
        System.out.println(matp[1][1]+" "+ matp[2][1]+" "+ matp[3][1]);
        System.out.println(matp[1][2]+" "+ matp[2][2]+" "+ matp[3][2]);
        System.out.println(matp[1][3]+" "+ matp[2][3]+" "+ matp[3][3]);
        */
        



        




    }
    


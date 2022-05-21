package TrabUjeverson;

import java.util.Scanner;

public class Prot02Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont, cont2, total, nprato, npor, check,fin;
        int [] id = new int [10];
        int [] conf = new int [10];
        int[] matc = new int [5];
        int[] [] matp = new int[5][5];
        int[] [] mattot = new int [5][5];
        cont = 1;
        cont2 = 1;
        nprato = 0;
        npor = 0;
        fin = 0;

        do{


            System.out.println("Digite a opção desejada");
            System.out.println("1 para configuração de valores");
            System.out.println("2 para configuração dos pratos");
            System.out.println("3 para valor total dos pratos");
            id[1] = entrada.nextInt();

        
        
        
        
            if(id[1] == 1){  
            while(id[1] == 1){
            //opção de alteração de valor  
            System.out.println("Digite a opção que deseja alterar");
            System.out.println("(01) Porção 1 (Arroz)");
            System.out.println("(02) Porção 2 (Salada)");
            System.out.println("(03) Porção 3 (Carne)");
            System.out.println("(04) Porção 4 (Tropeiro)");
            System.out.println("(05) Alterar todos os itens");
            System.out.println("(06) Voltar ao menu principal");
            npor = entrada.nextInt();

        if(npor == 1){System.out.println("Digite o novo valor da porção de arroz");
        matc[1] = entrada.nextInt();}

        if(npor == 2){System.out.println("Digite o novo valor da porção de salada");
        matc[2] = entrada.nextInt();}

        if(npor == 3){System.out.println("Digite o novo valor da porção de carne");
        matc[3] = entrada.nextInt();}

        if(npor == 4){System.out.println("Digite o novo valor da porção de tropeiro");
        matc[4] = entrada.nextInt();}

        if(npor == 5){
        System.out.println("Digite o novo valor da porção de arroz");
        matc[1] = entrada.nextInt();
        System.out.println("Digite o novo valor da porção de salada");
        matc[2] = entrada.nextInt();
        System.out.println("Digite o novo valor da porção de carne");
        matc[3] = entrada.nextInt();
        System.out.println("Digite o novo valor da porção de tropeiro");
        matc[4] = entrada.nextInt();}

        if(npor == 6){
            id[1] = 0;
        }

        if(npor != 6){
        System.out.println("Deseja fazer mais alguma alteração?");
        System.out.println("Digite 1 para executar outra alteração");
        System.out.println("Digite 2 para voltar ao menu iniciar");
        check = entrada.nextInt();

            do{
            if(check == 1){
                id[1] = 1;
            }else if(check == 2){
                id[1] = 0;
            }else {
                System.out.println("Digite uma opção valida");
                System.out.println("Deseja fazer mais alguma alteração dentro da aba de valores?");
                System.out.println("Digite 1 para sim");
                System.out.println("Digite 2 para não");
                check = entrada.nextInt();
            }}while(check != 1 && check != 2);}
        
        }}

        
        
        
        if(id[1] == 2){
            //opção de alteração de prato
            System.out.println("Digite 0 para alterar todos os pratos, (1) (2) (3) para ajustar o prato especifico correspondente ou 4 para abortar.");
            nprato = entrada.nextInt();

        if(nprato == 0){
        while(cont <= 3){
            System.out.println("Digite a quantidade de porções de arroz do prato "+cont);
            matp[cont][1] = entrada.nextInt();
            System.out.println("Digite a quantidade de porções de salada do prato "+cont);
            matp[cont][2] = entrada.nextInt();
            System.out.println("Digite a quantidade de porções de carne do prato "+cont);
            matp[cont][3] = entrada.nextInt();
            System.out.println("Digite a quantidade de porções de tropeiro do prato "+cont);
            matp[cont][4] = entrada.nextInt();  
            System.out.println("O prato "+cont+" leva "+matp[cont][1]+" porções de arroz; "+matp[cont][2]+" porções de salada; "+matp[cont][3]+ "porções de carne e "+matp[cont][4]+ "porções de tropeiro");
            System.out.println("");
            System.out.println("Para confirmar a informação acima digite 1, para recomeçar digite 2");
            id[2] = entrada.nextInt();
            do{
            if(id[2] == 1){
                cont++;
            }else if(id[2] != 2){
                System.out.println("Opção incorreta, por favor digite uma opção");
            }}while(id[2] != 1 && id[2] != 2);
            
        
        }}
        
        if(nprato != 0 && nprato > 0 && nprato <= 3){
            id[3] = 2;
            while(id[3] == 2){
            System.out.println("Digite a quantidade de porções de arroz do prato " +nprato);
            matp[nprato][1] = entrada.nextInt();
            System.out.println("Digite a quantidade de porções de salada do prato "+nprato);
            matp[nprato][2] = entrada.nextInt();
            System.out.println("Digite a quantidade de porções de carne do prato " +nprato);
            matp[nprato][3] = entrada.nextInt(); 
            System.out.println("Digite a quantidade de porções de tropeiro do prato " +nprato);
            matp[nprato][4] = entrada.nextInt(); 
            System.out.println("O prato "+nprato+" leva "+matp[nprato][1]+" porções de arroz; "+matp[nprato][2]+" porções de salada; "+matp[nprato][3]+ " porções de carne e "+matp[nprato][4]+" porções de tropeiro");
            System.out.println("Para confirmar a informação acima digite 1, para recomeçar digite 2");
            id[2] = entrada.nextInt();
            do{
            if(id[2] == 2){
                id[3] = 2;
            }else if(id[2] != 2 && id[2]!= 1){
                System.out.println("Opção invalida, por favor digite uma opção");
            }else if (id[2] == 1){
                System.out.println("Deseja alterar outro prato? Digite o numero do prato que deseja alterar ou 0 para voltar para o menu inicial");
                nprato = entrada.nextInt();
                if(nprato == 1 || nprato ==2 || nprato ==3){ id[3] = 2; }
                else if(nprato == 0){ id[3] = 0;}
                else do{{System.out.println("Opção invalida, por favor digite uma opção");}
                        System.out.println("Deseja alterar outro prato? Digite o numero do prato que deseja alterar ou 0 para voltar para o menu inicial");
                    nprato = entrada.nextInt();
                } while(nprato != 0 || nprato != 1|| nprato != 2|| nprato != 3);
            }

        }while(id[2] != 1 && id[2] != 2);}
        }
    
        System.out.println(matc[1]+matc[2]+matc[3]+ matc[4]);
    
    
    }

        /*while(cont2 <= 3){
            while(cont <= 3){
                matp[cont][cont2] = matp[cont][cont2] * matc[1];
                cont = cont + 1;
            }
            cont2 = cont2 + 1;
        }*/

        mattot[1][1] = matc [1] * matp [1][1];
        mattot[1][2] = matc [2] * matp [1][2];
        mattot[1][3] = matc [3] * matp [1][3];
        mattot[1][4] = matc [4] * matp [1][4];
         
        mattot[2][1] = matc [1] * matp [2][1];
        mattot[2][2] = matc [2] * matp [2][2];
        mattot[2][3] = matc [3] * matp [2][3];
        mattot[2][4] = matc [4] * matp [2][4];

        mattot[3][1] = matc [1] * matp [3][1];
        mattot[3][2] = matc [2] * matp [3][2];
        mattot[3][3] = matc [3] * matp [3][3];
        mattot[3][4] = matc [4] * matp [3][4];


        
        if(id[1] == 3){
            while(cont2 <= 3){
                total = mattot[cont2][1] + mattot[cont2][2] + mattot[cont2][3] + mattot[cont2][4];
                System.out.println("O valor total do prato "+cont2+" é de: "+total);
                cont2 = cont2 + 1;

            }}

        }while(fin == 0);

        /*
        System.out.println(matp[1][1]+" "+ matp[2][1]+" "+ matp[3][1]);
        System.out.println(matp[1][2]+" "+ matp[2][2]+" "+ matp[3][2]);
        System.out.println(matp[1][3]+" "+ matp[2][3]+" "+ matp[3][3]);
        */
        



        




    }}
    


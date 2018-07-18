package grupoig;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 6
 */
public class GrupoIG {

    public static void main(String[] args) {
        Jovem[] jovens = new Jovem[37];
        Jovem[] jovensAtivos = new Jovem[25];
        Jovem[] jovensNaoAtivos = new Jovem[13];
        Scanner in = new Scanner(System.in);
        ArrayList<Jovem> listaDeJovens = new ArrayList<>();
        int matricula, a = 1, jovemAprox, j = 0, par, b = 0, band = 0, band2 = 1;
        String jovemNome;

        while (a != 0) {
            System.out.println("DIGITE UMA OPCAO\n1 - CADASTRAR JOVEM\n2 - GERAR LISTA\n0 - SAIR");
            a = in.nextInt();
            switch (a) {
                case 1:
                    while (b < 6) {
                        System.out.println("DIGITE O NOME DO JOVEM: ");
                        jovemNome = in.next();
                        System.out.println("DIGITE A APROXIMACAO DO JOVEM COM A IGREJA: ");
                        jovemAprox = in.nextInt();
                        jovens[j] = new Jovem(jovemNome, jovemAprox);
                        listaDeJovens.add(jovens[j]);
                        j++;
                        b++;
                    }
                    break;

                case 2:

                    Collections.sort(listaDeJovens);

                    System.out.println("======");
                    System.out.println("JOVENS MENOS PROXIMOS: ");
                    for (int i = 0; i < 2; i++) {
                        jovensNaoAtivos[i] = listaDeJovens.get(i);
                        System.out.println(jovensNaoAtivos[i].getNome());

                    }

                    System.out.println("=======================");

                    System.out.println("JOVENS MAIS PROXIMOS: ");
                    for (int i = 2; i < 6; i++) {
                        jovensAtivos[i] = listaDeJovens.get(i);
                        System.out.println(jovensAtivos[i].getNome());

                    }
                    //Numero de grupos
                    int o=2, l=0;
                    for (int i = 0; i < 2; i++) {
                        System.out.println("JOVENS ATIVOS:");
                        while(o<6){
                            System.out.println(jovensAtivos[o].getNome()+" ");
                            if(l==1){
                                System.out.println("VAO ORAR POR: ");
                                System.out.println(jovensNaoAtivos[i].getNome());
                                l=0;
                                break;
                            }
                            o++;
                            l++;
                        }
                       o++;
                    }
                    break;

                case 0:
                    System.out.println("VOCE SAIU!");
                    a = 0;
                    break;
                default:
                    System.out.println("OPCAO NAO ENCONTRADA");
            }

        }

    }

}

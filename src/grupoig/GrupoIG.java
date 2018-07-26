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
        Jovem[] jovensAtivos = new Jovem[40];
        Jovem[] jovensNaoAtivos = new Jovem[40];
        Scanner in = new Scanner(System.in);
        ArrayList<Jovem> listaDeJovens = new ArrayList<>();
        int matricula, a = 1, jovemAprox, j = 0, par, b = 0, band = 0, band2 = 1, ab=1;
        String jovemNome;

        while (a != 0) {
            System.out.println("DIGITE UMA OPCAO\n1 - CADASTRAR JOVEM\n2 - GERAR LISTA\n0 - SAIR");
            a = in.nextInt();
            switch (a) {
                case 1:
                    while (b < 36) {
                        System.out.println("DIGITE O NOME DO JOVEM "+ab+" :");
                        jovemNome = in.next();
                        System.out.println("DIGITE A APROXIMACAO DO(A) " + jovemNome + " COM A IGREJA: ");
                        jovemAprox = in.nextInt();
                        jovens[j] = new Jovem(jovemNome, jovemAprox);
                        listaDeJovens.add(jovens[j]);
                        ab++;
                        j++;
                        b++;
                    }
                    break;

                case 2:

                    Collections.sort(listaDeJovens);

                    System.out.println("======");
                    System.out.println("JOVENS MENOS PROXIMOS: ");
                    for (int i = 0; i < 12; i++) {
                        jovensNaoAtivos[i] = listaDeJovens.get(i);
                        System.out.println(jovensNaoAtivos[i].getNome());

                    }

                    System.out.println("=======================");

                    System.out.println("JOVENS MAIS PROXIMOS: ");
                    for (int i = 12; i < 36; i++) {
                        jovensAtivos[i] = listaDeJovens.get(i);
                        System.out.println(jovensAtivos[i].getNome());

                    }
                    //Numero de grupos
                    int o = 12, h=24, g=12, naoativo=0, l = 0;
                    for (int i = 12; i < 24; i++) {
                        System.out.println("==>"+jovensAtivos[i].getNome()+"<+==" + " Vai orar por: ");
                        System.out.println(jovensAtivos[h].getNome());
                        h++;
                            System.out.println("E por: " + jovensNaoAtivos[naoativo].getNome());
                            System.out.println("");
                        naoativo++;
                    }
                    naoativo=11;
                    for (int i = 35; i >= 24; i--) {
                        System.out.println("==>"+jovensAtivos[i].getNome()+"<==" + " Vai orar por: ");
                        System.out.println(jovensAtivos[g].getNome());
                        g++;
                            System.out.println("E por: " + jovensNaoAtivos[naoativo].getNome());
                            System.out.println("");
                            naoativo--;
                    }
                    break;
                case 0:
                    System.out.println("VOCE SAIU!");
                    a = 0;
                    break;

                default:
                    System.out.println("OPCAO NAO ENCONTRADA");
                    break;

            }

        }
    }
}

import java.util.Scanner;

public class ExplorandoMarte {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int m1;
        int m2;
        int sonda1x;
        int sonda1y;
        int sonda2x;
        int sonda2y;
        String sonda1direcao;
        String sonda1movimento;
        String sonda2direcao;
        String sonda2movimento;

        System.out.println("----- Identificando a Matriz ----");
        System.out.println("Digite o primeiro fator da Matriz");
        m1 = ler.nextInt();
        System.out.println("Digite o segundo fator da Matriz");
        m2 = ler.nextInt();

        System.out.println("---------------------------------");
        System.out.println("----- Identificando sonda 1 -----");

        System.out.println("Digite a posição x da sonda 1");
        sonda1x = ler.nextInt();
        System.out.println("Digite a posição y da sonda 1");
        sonda1y = ler.nextInt();
        System.out.println("Digite a direçao da sonda 1");
        sonda1direcao = ler.next();

        System.out.println("---------------------------------");
        System.out.println("----- Andando com a sonda 1 -----");

        System.out.println("Digite os movimentos da sonda");
        sonda1movimento = ler.next();
        String separa1[] = sonda1movimento.split("(?!^)");
        int i;
        int qtd = sonda1movimento.length();
        for (i = 0; i < qtd; i++) {
            if (separa1[i].contains("l")) {
                if (sonda1direcao.contains("n")) {
                    sonda1direcao = "w";
                } else if (sonda1direcao.contains("w")) {
                    sonda1direcao = "s";
                } else if (sonda1direcao.contains("s")) {
                    sonda1direcao = "e";
                } else if (sonda1direcao.contains("e")) {
                    sonda1direcao = "n";
                }
            } else if (separa1[i].contains("m")) {
                if (sonda1direcao.contains("n")) {
                    if (sonda1y < m2) {
                        sonda1y++;
                    } else if (sonda1y == 0) {
                        sonda1y = 0;
                    }
                } else if (sonda1direcao.contains("w")) {
                    if (sonda1x <= m1) {
                        sonda1x--;
                    } else if (sonda1x == 0) {
                        sonda1x = 0;
                    }
                } else if (sonda1direcao.contains("s")) {
                    if (sonda1y <= m2) {
                        sonda1y--;
                    } else if (sonda1y == 0) {
                        sonda1y = 0;
                    }
                } else if (sonda1direcao.contains("e")) {
                    if (sonda1x <= m1) {
                        sonda1x++;
                    } else if (sonda1x == 0) {
                        sonda1x = 0;
                    }
                }

            }
        }

        System.out.println("---------------------------------");
        System.out.println("----- Identificando sonda 2 -----");

        System.out.println("Digite a posição x da sonda 2");
        sonda2x = ler.nextInt();
        System.out.println("Digite a posição y da sonda 2");
        sonda2y = ler.nextInt();
        System.out.println("Digite a direção da sonda 2");
        sonda2direcao = ler.next();

        System.out.println("---------------------------------");
        System.out.println("----- Andando com a 2 sonda -----");

        System.out.println("Digite os movimentos da sonda");
        sonda2movimento = ler.next();
        String separa2[] = sonda2movimento.split("(?!^)");
        int i2;
        int qtd2 = sonda2movimento.length();
        for (i2 = 0; i2 < qtd2; i2++) {
            if (separa2[i2].contains("R")) {
                if (sonda2direcao.contains("N")) {
                    sonda2direcao = "E";
                } else if (sonda2direcao.contains("E")) {
                    sonda2direcao = "S";
                } else if (sonda2direcao.contains("S")) {
                    sonda2direcao = "W";
                } else if (sonda2direcao.contains("W")) {
                    sonda2direcao = "N";
                }
            } else {
                if (separa2[i2].contains("M")) {
                    if (sonda2direcao.contains("N")) {
                        if (sonda2y < m2) {
                            sonda2y++;
                        } else if (sonda2y == 0) {
                            sonda2y = 0;
                        }
                    } else if (sonda2direcao.contains("W")) {
                        if (sonda2x <= m1) {
                            sonda2x--;
                        } else if (sonda2x == 0) {
                            sonda2x = 0;
                        }
                    } else if (sonda2direcao.contains("S")) {
                        if (sonda2y <= m2) {
                            sonda2y--;
                        } else if (sonda2y == 0) {
                            sonda2y = 0;
                        }
                    } else if (sonda2direcao.contains("E")) {
                        if (sonda2x <= m1) {
                            sonda2x++;
                        } else if (sonda2x == 0) {
                            sonda2x = 0;
                        }
                    }

                }
            }
        }

        System.out.println("A matriz escolhida foi de " + m1 + "x" + m2);
        System.out.println("------------------------------------");
        System.out.println("a posição final da sonda 1 é " + sonda1x + "x," + sonda1y + "y," + sonda1direcao);
        System.out.println("------------------------------------");
        System.out.println("a posição final da sonda 2 é " + sonda2x + "x," + sonda2y + "y," + sonda2direcao);
    }
}

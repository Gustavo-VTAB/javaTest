import java.util.Scanner;

public class Main {
        static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcaoMenu;

        do{
            System.out.println("***********Menu Principal***********");
            System.out.println("1 escolher o boneco");
            System.out.println("2 Atacar com o boneco");
            System.out.println("3 sair");
            System.out.println("************************************");
            System.out.print("Escolha uma opção: ");

            opcaoMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoMenu){
                case 1:
                    menuBonecos();
                    break;
                case 2:

            }

        }while (opcaoMenu != 3);



        Suporte Senna = new Suporte();

        Senna.setNome("Senna");
        Senna.setPell(true);

        System.out.println(Senna.getNome());

        Senna.ataqueBasico();
        Senna.ataqueBasico(true);
        Senna.acoes(true, false);



    }
    public void menuBonecos(){
        int opcao;

        do {
            System.out.println("************ Escolher o Boneco ************");
            System.out.println("1. Suporte");
            System.out.println("2. Adc");
            System.out.println("3. Jungle");
            System.out.println("4. voltar");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    newSuporte();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println();
        } while (opcao != 4);
    }


    public static void newSuporte(){

        System.out.print("Digite o seu nome:");
        String nome = scanner.nextLine();

        Suporte Suport = new Suporte(nome,);

    }
}


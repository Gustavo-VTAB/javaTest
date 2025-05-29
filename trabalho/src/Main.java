import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcaoMenu;

        do {
            System.out.println("***********Menu Principal***********");
            System.out.println("1 escolher o boneco");
            System.out.println("2 sair");
            System.out.println("************************************");
            System.out.print("Escolha uma opção: ");

            opcaoMenu = scanner.nextInt();
            scanner.nextLine();

            if (opcaoMenu == 1){
                menuBonecos();
            }



        } while (opcaoMenu != 2);

        System.out.println("acabou dog");


    }

    public static void menuBonecos() {
        int opcao;

        do {
            System.out.println("************ Escolher o Boneco ************");
            System.out.println("1. Suporte");
            System.out.println("2. Adc");
            System.out.println("3. Jungle");
            System.out.println("4. voltar");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    newSuporte();
                    break;
                case 2:
                    newAdcarry();
                    break;
                case 3:
                    newJungle();
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


    public static void newSuporte() {
        BonecoData dados = CriarBoneco();
        boolean pell;
        boolean stun;
        int escolha;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Voce é pell ou stun?");
            System.out.println("1. pell ");
            System.out.println("2. stun ");
            escolha = scanner.nextInt();
        } while (escolha != 1 && escolha != 2);

        if (escolha == 1) {
            pell = true;
            stun = false;
        } else {
            pell = false;
            stun = true;
        }

        Suporte suporte = new Suporte(
                dados.nome, dados.raca, dados.roule, dados.arma, dados.nivel,
                pell,
                stun,
                3,
                500,
                0
        );
        suporte.ataqueBasico();

        suporte.farmarGold();

        suporte.acoes();

        suporte.visao();

        suporte.mostrarStatus();
    }

    public static void newAdcarry() {
        BonecoData dados = CriarBoneco();

        int escolha;
        boolean hab;
        Scanner scanner = new Scanner(System.in);

        Adcarry adcarry = new Adcarry(
                dados.nome,dados.raca,dados.arma,dados.roule,dados.nivel,
                20,
                400,
                0,
                0,
                90,
                0
        );

        adcarry.farmarGold();

        do {
            System.out.println("Tem um Udir correndo atras de voce, c tem essa habilidade ?");
            System.out.println("1. Sim eu sou pik ");
            System.out.println("2. Não udir é broken meno ");
            escolha = scanner.nextInt();

            adcarry.ataqueBasico();

        } while (escolha != 1 && escolha != 2);

        hab = escolha == 1;

        adcarry.caitin(hab);

        adcarry.retornarBase();

        adcarry.mostrarStatus();
    }

    public static void newJungle() {
        BonecoData dados = CriarBoneco();

        Jungle jungle = new Jungle(
                dados.nome,
                dados.raca,
                dados.roule,
                dados.arma,
                dados.nivel,
                1,
                0,
                true,
                0,
                false
        );

        jungle.ataqueBasico();

        jungle.farmarGold();

        jungle.dominarTerreno(false);

        System.out.println("Os caras tao fazendo objetivo oq vamos fazer ?");
        jungle.rouboDeObjetivo(true);

        jungle.objetivoFeito();

        jungle.mostrarStatus();
    }


    public static BonecoData CriarBoneco() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite a raca do seu boneco");
        String raca = scanner.nextLine();

        System.out.println("Digite sua roule: ");
        String roule = scanner.nextLine();

        System.out.println("Digite sua arma: ");
        String arma = scanner.nextLine();

        System.out.println("Digite seu nivel");
        int nivel = scanner.nextInt();

        return new BonecoData(nome, raca, roule, arma, nivel);
    }
}


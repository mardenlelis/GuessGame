public class GuessGame {
    
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int) (Math.random() * 100);

        System.out.println("Estou pensando em um número de 0 a 100...");

        while (true) {
            
            System.out.println("O número a ser adivinhado é: " + targetNumber);

            System.out.println("Jogador 1...");
            p1.guess();
            System.out.println("Jogador 2...");
            p2.guess();
            System.out.println("Jogador 3...");
            p3.guess();

            guessP1 = p1.number;
            System.out.println("O jogador 1 forneceu o palpite: " + guessP1);
            guessP2 = p2.number;
            System.out.println("O jogador 2 forneceu o palpite: " + guessP2);
            guessP3 = p3.number;
            System.out.println("O jogador 3 forneceu o palpite:" + guessP3);

            if(guessP1 == targetNumber){
                p1IsRight = true;
            }

            if(guessP2 == targetNumber){
                p2IsRight = true;
            }

            if(guessP3 == targetNumber){
                p3IsRight = true;
            }

            if(p1IsRight || p2IsRight || p3IsRight){
                System.out.println("Temos um vencedor!");
                System.out.println("Vamos ver se o jogador 1 acertou: " + (p1IsRight? "Sim" : "Não"));
                System.out.println("Vamos ver se o jogador 2 acertou: " + (p2IsRight? "Sim" : "Não"));
                System.out.println("Vamos ver se o jogador 3 acertou: " + (p3IsRight? "Sim" : "Não"));
                break;
            }else{
                System.out.println("Os jogadores terão que tentar novamente.");
            }
        }
    }
}

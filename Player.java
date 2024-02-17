public class Player {

    int number = 0; //O número por onde entra o palpite

    void guess(){
        number = (int) (Math.random() * 100);
        System.out.println("Estou pensando em " + this.number);
    }    
}

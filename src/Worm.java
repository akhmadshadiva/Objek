public class Worm {

    //attribute
    String userName;
    int score;
    double length;


    //behavior
    void eatSnack(){
        System.out.println("Nom... nom... nom...");
    }

    void eatOthers(Worm worm){
        score += 500;
    }
}

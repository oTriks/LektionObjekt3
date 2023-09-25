public class Pikachu extends Pokemon { //pikachu ärver pokemon klassen

public Pikachu(String name){
    super(name, "electric");
}

@Override  // måste inte skrivas, men tydliggör
public void attack(){
    System.out.println("Piika!!" + this.name + " Attack!!!");

}

}

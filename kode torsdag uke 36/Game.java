public class Game {
    
    public static void main(String[] args){
        Player one = new Player("Knight");
        System.out.println(one.name + " just entered the game!");

        Weapon stick = new Weapon("stick", 1);
        System.out.println(one.name + " has picked up a weapon of type " + stick.getType() + " that deals " + stick.getDamage() + " damage.");
    }
}
public class Weapon {
    private int damage;
    private String type;

    public Weapon(String type, int damage){
        this.damage = damage;
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public int getDamage(){
        return this.damage;
    }
}

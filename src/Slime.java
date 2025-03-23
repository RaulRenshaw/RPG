public class Slime extends Inimigo{
    int damage;
    String nameOfAttack;

    public void aplicarAtaque(Heroi heroi){
        heroi.receberDano(damage);
        System.out.println("O inimigo " + name + " Atacou com o ataque " + nameOfAttack + " o inimigo " + heroi.getName() + " e causou " + damage + " de dana");
        if (heroi.life <= 0){
            System.out.println("O heroi " + heroi.getName() + " Morreu");
        }
    }


    @Override
    public void info(){
        System.out.println("O nome do seu inimigo é: " + name);
        System.out.println("A vida atual do inimigo é: " + life);
        System.out.println("O nome do ataque principal é: " + nameOfAttack);
        System.out.println("O dano é: " + damage);
    }

    public Slime(int life, String name, int damage, String nameOfAttack) {
        super(life, name);
        this.damage = damage;
        this.nameOfAttack = nameOfAttack;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getNameOfAttack() {
        return nameOfAttack;
    }

    public void setNameOfAttack(String nameOfAttack) {
        this.nameOfAttack = nameOfAttack;
    }
}

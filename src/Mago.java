public class Mago extends Personagem {
    int damage;
    String nameOfAttack;

    public void aplicarAtaque(Personagem inimigo){
        inimigo.receberDano(damage);
        System.out.println("O heroi " + name + " Atacou com o ataque " + nameOfAttack + " o inimigo " + inimigo.getName() + " e causou " + damage + " de dano");

        if (inimigo.life <= 0){
            System.out.println("O inimigo " + inimigo.getName() + " Morreu");
        }
    }

    @Override
    public void info(){
        System.out.println("O nome do seu heroi é: " + name);
        System.out.println("A vida atual do seu heroi é: " + life);
        System.out.println("O nome do ataque principal é: " + nameOfAttack);
        System.out.println("O dano é: " + damage);
    }

    public Mago(int life, String name, int damage, String nameOfAttack) {
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

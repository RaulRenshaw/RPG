public abstract class Personagem {
    public String name;
    public int life;

    public void trocarNome(String name){
        this.name = name;
    }
    public void receberDano(int damage){
        life -= damage;
    }

    public Personagem() {}
    public Personagem(int life, String name) {
        this.life = life;
        this.name = name;
    }

    public void info(){
        System.out.println("O nome do Personagem é: " + name);
        System.out.println("A vida atual é: " + life);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}

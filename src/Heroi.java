public abstract class Heroi {
    public String name;
    public int life;

    public void trocarNome(String name){
        this.name = name;
    }
    public void receberDano(int damage){
        life -= damage;
    }

    public Heroi() {}
    public Heroi(int life, String name) {
        this.life = life;
        this.name = name;
    }

    public void info(){
        System.out.println("O nome do seu heroi é: " + name);
        System.out.println("A vida atual do seu heroi é: " + life);
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

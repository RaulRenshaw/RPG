public class Main {
    public static void main(String[] args) {

        Mago Raul = new Mago(10,"Raul",10,"facada");
        Raul.info();
        Slime Jho = new Slime(10,"Jho",10,"Bola de gosma");
        Jho.info();

        Raul.aplicarAtaque(Jho);

        Jho.info();
    }
}
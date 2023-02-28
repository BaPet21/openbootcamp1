public class Main {
    public static void main(String[] args) {

            int a;
            int b;
            int c,
                    resultado= suma(3,4,8);

            System.out.println(resultado);

        Coche verde= new Coche(4);
        verde.anadePuerta();


        System.out.println("Coche tiene " + verde.numeroDePuertas + " de puertas.");
    }
    public static int suma(int a, int b, int i){
        return a + b + i;
    }

}
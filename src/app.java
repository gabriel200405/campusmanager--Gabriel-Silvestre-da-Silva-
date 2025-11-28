public class app {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int resultado = dividir(a, b);
        System.out.println("Resultado: " + resultado);
    }

    public static int dividir(int x, int y) {
        return x / y;  
    }
}


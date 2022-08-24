public class Main {
    public static void main(String[] args) {
        int n = 1;
        boolean jaollinen = false;
        int tulos = 0;

        while (jaollinen == false)
        {
            tulos = n*n*n+91;
            if (tulos % 47 == 0)
            {
                jaollinen = true;
            }
            else {
                n = n + 1;
            }
        }
        System.out.println(n);
    }
}
public class Kata {

    public static long divisibleCount(long x, long y, long k) {
        if (x > y) {
            long temp = x;
            x = y;
            y = temp;
        }

        // Manejar el caso especial cuando x=0 y k > 1
        if (x == 0 && k > 1) {
            // La fórmula directamente para contar múltiplos en este caso
            return (y / k) + 1;
        }

        // Fórmula general para contar múltiplos en el rango [x, y]
        long count = (y / k) - (x - 1) / k;

        return count;
    }
}

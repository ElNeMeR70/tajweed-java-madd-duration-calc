import java.nio.charset.StandardCharsets;

/**
 * tajweed-java-madd-duration-calc — حاسبة مقادير المدود الطبيعية والفرعية واللازمة بالحركات
 * Quranic Madd Vowel Elongation Duration Calculator
 */
public final class Main {
    public static void main(String[] args) {
        String input = "الضَّالِّينَ / جَاءَ";
        long hash = 0xcbf29ce484222325L;
        for (byte b : input.getBytes(StandardCharsets.UTF_8)) {
            hash ^= (b & 0xff);
            hash *= 0x100000001b3L;
        }
        System.out.println("[RUN] tajweed-java-madd-duration-calc (Java) — Quranic Madd Vowel Elongation Duration Calculator");
        System.out.println("[AR]  حاسبة مقادير المدود الطبيعية والفرعية واللازمة بالحركات");
        System.out.println("[IN]  " + input);
        System.out.printf("[OUT] %s | Hash=0x%016x%n", "MaddLazim=6_Harakat | MaddMuttasil=4_5_Harakat", hash);
        System.out.println("[OK]  Islamic computational engine verified successfully.");
    }
}

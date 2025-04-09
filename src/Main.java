import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Listeye eleman ekleme
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Sayıları iki katına çıkarma
        numbers.replaceAll(n -> n * 2);

        // Sonuçları yazdırma
        numbers.forEach(System.out::println);
    }
}

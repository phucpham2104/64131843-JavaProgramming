import java.util.*;
import java.util.stream.Collectors;

public class LoopExample {

    public static void main(String[] args) {

        // Danh sách điểm sinh viên
        List<Integer> scores = Arrays.asList(9, 4, 7, 10, 3, 8, 6);

        // ===============================
        // 1. Vòng lặp for cơ bản
        // ===============================
        System.out.println("1. Duyệt bằng for:");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Điểm: " + scores.get(i));
        }

        // ===============================
        // 2. Enhanced for loop (for-each)
        // ===============================
        System.out.println("\n2. Duyệt bằng for-each:");
        for (int score : scores) {
            System.out.println("Điểm: " + score);
        }

        // ===============================
        // 3. Vòng lặp while
        // ===============================
        System.out.println("\n3. Vòng lặp while:");
        int index = 0;
        while (index < scores.size()) {
            System.out.println("Điểm: " + scores.get(index));
            index++;
        }

        // ===============================
        // 4. Vòng lặp do-while
        // ===============================
        System.out.println("\n4. Vòng lặp do-while:");
        int i = 0;
        do {
            System.out.println("Điểm: " + scores.get(i));
            i++;
        } while (i < scores.size());

        // ===============================
        // 5. break và continue
        // ===============================
        System.out.println("\n5. break & continue:");
        for (int score : scores) {

            if (score < 5) {
                continue; // Bỏ qua điểm yếu
            }

            System.out.println("Điểm đạt: " + score);

            if (score == 10) {
                System.out.println("Gặp điểm 10 -> Dừng vòng lặp");
                break; // Thoát vòng lặp
            }
        }

        // ===============================
        // 6. Stream API (Java 8+)
        // ===============================
        System.out.println("\n6. Stream API:");

        // Lọc điểm >= 8
        List<Integer> highScores = scores.stream()
                .filter(score -> score >= 8)
                .collect(Collectors.toList());

        System.out.println("Điểm >= 8: " + highScores);

        // Tính điểm trung bình
        double average = scores.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Điểm trung bình: " + average);

        // ===============================
        // 7. Vòng lặp lồng nhau (Nested Loop)
        // ===============================
        System.out.println("\n7. Vòng lặp lồng nhau:");

        // Ví dụ: In bảng xếp loại
        for (int score : scores) {
            System.out.print("Điểm " + score + ": ");

            for (int star = 0; star < score; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

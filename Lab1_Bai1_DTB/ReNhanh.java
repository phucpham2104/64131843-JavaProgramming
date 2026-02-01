import java.util.*;
import java.util.stream.Collectors;

public class ConditionalExample {

    public static void main(String[] args) {

        int score = 8;

        // ===============================
        // 1. if đơn
        // ===============================
        if (score == 10) {
            System.out.println("Điểm tuyệt đối!");
        }

        // ===============================
        // 2. if - else
        // ===============================
        if (score >= 5) {
            System.out.println("Qua môn");
        } else {
            System.out.println("Rớt môn");
        }

        // ===============================
        // 3. if - else if - else
        // ===============================
        String rank;

        if (score >= 9) {
            rank = "Xuất sắc";
        } else if (score >= 8) {
            rank = "Giỏi";
        } else if (score >= 6.5) {
            rank = "Khá";
        } else if (score >= 5) {
            rank = "Trung bình";
        } else {
            rank = "Yếu";
        }

        System.out.println("Xếp loại học lực: " + rank);

        // ===============================
        // 4. switch - case (Java 8)
        // ===============================
        int day = 3;
        String dayName;

        switch (day) {
            case 2:
                dayName = "Thứ Hai";
                break;
            case 3:
                dayName = "Thứ Ba";
                break;
            case 4:
                dayName = "Thứ Tư";
                break;
            case 5:
                dayName = "Thứ Năm";
                break;
            case 6:
                dayName = "Thứ Sáu";
                break;
            case 7:
                dayName = "Thứ Bảy";
                break;
            default:
                dayName = "Chủ Nhật";
        }

        System.out.println("Hôm nay là: " + dayName);

        // ===============================
        // 5. switch với String (Java 8+)
        // ===============================
        String major = "IT";

        switch (major) {
            case "IT":
                System.out.println("Ngành Công nghệ thông tin");
                break;
            case "BA":
                System.out.println("Ngành Quản trị kinh doanh");
                break;
            case "Design":
                System.out.println("Ngành Thiết kế");
                break;
            default:
                System.out.println("Ngành khác");
        }

        // ===============================
        // 6. Toán tử điều kiện (Ternary)
        // ===============================
        String result = (score >= 5) ? "Đậu" : "Rớt";
        System.out.println("Kết quả: " + result);

        // ===============================
        // 7. Java 8+: Stream + if logic
        // ===============================
        List<Integer> scores = Arrays.asList(9, 4, 7, 10, 3, 8);

        List<Integer> passedScores = scores.stream()
                .filter(s -> s >= 5)   // giống if (s >= 5)
                .collect(Collectors.toList());

        System.out.println("Danh sách điểm qua môn: " + passedScores);

        // ===============================
        // 8. Optional (Java 8+) tránh null
        // ===============================
        Optional<Integer> maxScore = scores.stream()
                .max(Integer::compareTo);

        maxScore.ifPresent(s ->
                System.out.println("Điểm cao nhất: " + s)
        );
    }
}

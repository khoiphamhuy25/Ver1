import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;
import java.nio.file.Path;
import java.util.List;

public class Dictionary {
    public String viet;
    public String anh;

    public Dictionary() {
    }


    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Path path = Path.of("Data.txt");
            List<String> list = Files.readAllLines(path);
            while (true) {
                System.out.println("Từ tiếng Việt cần tra :");
                String search = sc.nextLine();
                for (String data : list) {
                    String[] inf = data.split(" : ");
                    Dictionary a = new Dictionary();
                    a.viet = inf[0];
                    a.anh = inf[1];
                    if (a.viet.contains(search)) {
                        System.out.println(a.viet + " : " + a.anh);
                    }
                }
            }
        } catch (IOException e) {
        }
    }
}

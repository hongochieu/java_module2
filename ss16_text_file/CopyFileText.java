package ss16_text_file;
import java.io.*;
import java.util.Scanner;
public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập đường dẫn tập tin nguồn: ");
        String sourcePath = scanner.nextLine();

        System.out.println("Nhập đường dẫn tập tin đích:");
        String targetPath = scanner.nextLine();;

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.out.println("Tập tin nguồn không tồn tại: ");
        }

        if (targetFile.exists()) {
            System.out.println("Tập tin đích đã tồn tại:");
        }

        try (
                FileReader fileReader = new FileReader(sourceFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(targetFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                ) {
            String line;
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("Sao chép file thành công:");
        } catch (IOException e) {
            System.out.println("đã xảy ra lỗi khi sao chép: " + e.getMessage());
        }
    }
}

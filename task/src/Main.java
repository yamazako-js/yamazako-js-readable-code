import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    private static final String TASK1_OUTPUT = "上手";

    public static void main(String args[]) {

        if (args.length != 1){
            System.out.println("データファイルのパスを入力して下さい");
            System.exit(1);
        }

        printDictionaryData(args[0]);
    }

    private static void printDictionaryData(String filePath) {
        String data = readFileData(filePath);
        System.out.print(data);
    }

    /**
     * 指定したファイルを読み込んでデータを返す
     *
     * @param filePath 読み込むデータファイルのパス
     * @return 読み込んだファイルのデータ
     */
    private static String readFileData(String filePath) {
        final File file = new File(filePath);

        StringBuilder sb = new StringBuilder();
        try {
            if (!file.exists()) {
                System.out.print("ファイルが存在しません");
                return null;
            }

            FileReader fileReader = new FileReader(file);
            int data;
            while ((data = fileReader.read()) != -1) {
                sb.append((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String args[]) {

        // TODO: 引数の存在確認だけではなく、形式が正しいかの validation を行う。
        if (args.length != 1) {
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

public class Main {

    private static final String TASK1_OUTPUT = "上手";

    public static void main(String args[]) {

        if (args.length != 1){
            System.out.println("データファイルのパスを入力して下さい");
            System.exit(1);
        }

        printDictionaryData(args[0]);
    }

    private static void printDictionaryData(String str) {
        System.out.print(str);
    }
}

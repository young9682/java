public class Unicode {
    public static void main(String[] args) {
        char ni = '\u4F60';
        char wo = '\u6211';
        char ta = '\u4ED6';

        printUnicode(ni);
        printUnicode(wo);
        printUnicode(ta);
    }

    public static void printUnicode(char ch) {
        int codePoint = (int) ch;
        System.out.printf("%c 的 Unicode 位置：U+%04X\n", ch, codePoint);
    }
}
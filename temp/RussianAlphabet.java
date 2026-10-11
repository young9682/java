public class RussianAlphabet {
    public static void main(String[] args) {
        String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        for (int i = 0; i < alphabet.length(); i++) {
            System.out.print(alphabet.charAt(i) + " ");
        }
    }
}
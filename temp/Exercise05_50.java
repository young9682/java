public class Exercise05_50 {
  //从键盘读取一行字符串，统计其中英文大写字母（A 到 Z）的个数，并输出结果。
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);//创建一个 Scanner 对象，用来读取用户输入

    System.out.print("Enter a string: ");
    String s = input.nextLine();//读取整行

    int total = 0;//大写字母数量
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
        total++;
    }

    System.out.println("The number of uppercase letters is " + total);//输出结果
  }
}
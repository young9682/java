import java.util.Scanner;

public class Exercise05_51 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);////创建一个 Scanner 对象，用来读取用户输入
    //提示用户输入两个字符串
    System.out.print("Enter the first string: ");
    String s1 = input.nextLine();////读取用户输入的第一个字符串
    System.out.print("Enter the second string: ");
    String s2 = input.nextLine();////读取用户输入的第二个字符串
    String result = "";

    for (int i = 0; i < s1.length(); i++)//遍历第一个字符串的每个字符
    {
      if (s1.charAt(i) == s2.charAt(i))//如果两个字符串的当前字符相同，则将其添加到结果中
        result += s1.charAt(i);
      else
        break;
    }

    if (result.length() > 0) {//如果有公共前缀，则输出结果
      System.out.println("The common prefix is " + result);
    }
    else {
      System.out.println(s1 + " and " + s2 + " have no common prefix");
    }
  }
}

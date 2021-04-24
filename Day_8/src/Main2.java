import java.util.Arrays;
import java.util.Scanner;
/*
     12.标题：n个数里最小的k个 
         【n个数里最小的k个】找出n个数里最小的k个
         输入描述：
         每个测试输入包含空格分割的n+1个整数，最后一个整数为k值,n不超过100。
         输出描述：
         输出n个整数里最小的k个数。升序输出 
         示例1：
         输入：3 9 6 8 -10 7 -11 19 30 12 23 5
         输出：-11 -10 3 6 7
     */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            int[] num = new int[s.length - 1];
            for (int i = 0; i < s.length - 1; i++) {
                num[i] = Integer.parseInt(s[i]);
            }
            int k = Integer.parseInt(s[s.length - 1]);
            Arrays.sort(num, 0, s.length - 1);
            for (int i = 0; i < k; i++) {
                System.out.print(num[i] + " ");
            }
        }
    }
}



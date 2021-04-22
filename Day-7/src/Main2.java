/*
* 标题：求最小公倍数 | 时间限制：1秒 | 内存限制：32768K | 语言限制：不限
正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。

输入描述:
输入两个正整数A和B。
输出描述:
输出A和B的最小公倍数。
示例1
输入
5 7
输出
35
*/

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(minmultiple(a,b));
        }
    }
    // 最小公倍数
    public static int minmultiple(int a, int b) {
        int n = a > b ? a : b;
        int m = a < b ? a : b;
        int k = n;
        int i = 1;
        while (k % m != 0) {
            k = n * i;
            i++;
        }
        return k;
    }
}

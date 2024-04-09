package Week06;

import java.util.Scanner;

public class OJ02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        String[] subStr = new String[str.length() / k];
        long result = 0L;
        int times = 0;
        int yu = str.length() - (str.length() % k);
        String endStr = str.substring(yu);
        for (int i = 0; i < subStr.length; i++) {
            int beginIndex = k * times;
            int endIndex = k * (times + 1);
            subStr[i] = str.substring(beginIndex, endIndex);
            times++;
        }
        for (int i = 0; i < subStr.length; i++) {
            String strTemp = "";
            char[] subStrArr = subStr[i].toCharArray();
            for (int j = k - 1; j >= 0; j--) {
                strTemp = strTemp.concat(String.valueOf(subStrArr[j]));
            }
            long num = Long.parseLong(strTemp);
            result = result + num;
        }
        if (str.length() % k != 0) {
            char[] endStrArr = endStr.toCharArray();
            String strTemp = "";
            for (int i = endStrArr.length - 1; i >= 0; i--) {
                strTemp = strTemp.concat(String.valueOf(endStrArr[i]));
            }
            long num = Long.parseLong(strTemp);
            result += num;
        }
        System.out.println(result);
    }
}

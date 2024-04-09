package Week06;

import java.util.Scanner;

public class OJ01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] information = new String[n];
        String[] mark = new String[n];
        String[] type = new String[n];
        int[] numb = new int[n];
        String markTemp;
        String typeTemp;
        int numbTemp;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            information[i] = sc.nextLine();
            mark[i] = information[i].split(",")[0];
            type[i] = information[i].split(",")[1];
            numb[i] = Integer.parseInt(information[i].split(",")[2]);
        }
        for (int i = 0; i < n; i++) {
            int temp = i;
            for (int j = temp; j < n; j++) {
                if (numb[i] < numb[j]) {
                    markTemp = mark[temp];
                    typeTemp = type[temp];
                    numbTemp = numb[temp];
                    mark[temp] = mark[j];
                    type[temp] = type[j];
                    numb[temp] = numb[j];
                    mark[j] = markTemp;
                    type[j] = typeTemp;
                    numb[j] = numbTemp;
                    temp = j;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (mark[i].equals("C")) {
                for (int j = 0; j < n; j++) {
                    if (mark[j].equals("R") && type[j].equals(type[i]) && numb[i] <= numb[j]) {
                        numb[j] = 0;
                        break;
                    } else if (j == n - 1) {
                        System.out.println("No");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}


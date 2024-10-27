import java.util.Scanner;

public class exercitiiCurs1Siruri {
    public static void main(String[] args) {
        /* //exercitiul 1 siruri
        int nums1[] = {12, 54, 2, 78, 36, 22, 92};
        int nums2[] = {33, 6, 19, 86, 54, 44, 20, 78};
        int cnt = 0;
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        */

        /* //exercitiul 2 siruri
        int nums[] = {23, 56, 79, 61, 34, 61, 79, 56, 23}; //e palindrom
        //int nums[] = {21, 44, 37, 90, 21, 44, 37}; //nu e palindrom
        Boolean palindrom = true;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[nums.length - i - 1]) {
                palindrom = false;
            }
        }

        if(palindrom) {
            System.out.println("Palindrom");
        }
        else {
            System.out.println("Nu Palindrom");
        }
        */


        int n = 0, m = 0, k = 0, element = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Scrieti numarul de linii: ");
        n = obj.nextInt();
        System.out.println("Scrieti numarul de coloane: ");
        m = obj.nextInt();

        int sir[] = new int[n];
        int mat[][] = new int[n][m];

        System.out.println("Introduceti matricea: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = obj.nextInt();
            }
        }


        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                element += mat[i][j];
            }
            sir[k] = element;
            k++;
            element = 0;
        }

        System.out.println();

        for (int i = 0; i < k; i++) {
            System.out.print(sir[i] + " ");
        }
    }
}

public class Patterns {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(5);
    }

    /*
    Output in Sequence
            *
            * *
            * * *
            * * * *
            * * * * *

            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5

                    1
                  1 2 1
                1 2 3 2 1
              1 2 3 4 3 2 1
            1 2 3 4 5 4 3 2 1

                    1
                  2 3 2
                3 4 5 4 3
              4 5 6 7 6 5 4
            5 6 7 8 9 8 7 6 5

            1
            1  1
            1  2  1
            1  3  3  1
            1  4  6  4  1
            1  5  10  10  5  1

                    *
                  * * *
                * * * * *
              * * * * * * *
            * * * * * * * * *
              * * * * * * *
                * * * * *
                  * * *
                    *

            *                 *
            * *             * *
            * * *         * * *
            * * * *     * * * *
            * * * * * * * * * *
            * * * *     * * * *
            * * *         * * *
            * *             * *
            *                 *

            * * * * * * * * *
            * * * *   * * * *
            * * *       * * *
            * *           * *
            *               *
            * *           * *
            * * *       * * *
            * * * *   * * * *
            * * * * * * * * *

            5 5 5 5 5 5 5 5 5
            5 4 4 4 4 4 4 4 5
            5 4 3 3 3 3 3 4 5
            5 4 3 2 2 2 3 4 5
            5 4 3 2 1 2 3 4 5
            5 4 3 2 2 2 3 4 5
            5 4 3 3 3 3 3 4 5
            5 4 4 4 4 4 4 4 5
            5 5 5 5 5 5 5 5 5
            
                    1
                  2 1 2 
                3 2 1 2 3
              4 3 2 1 2 3 4
            5 4 3 2 1 2 3 4 5 
              4 3 2 1 2 3 4
                3 2 1 2 3 
                  2 1 2 
                    1 

     */

    public static void pattern1 (int row) {
        int nst = 1, id = 1;
        while (id <= row) {
            int cst = 1;
            while (cst <= nst) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            nst++;
            id++;
        }
    }

    public static void pattern2 (int row){
        int nst = 1, id = 1;
        while (id <= row){
            int cst = 1;
            while (cst <= nst){
                System.out.print(cst + " ");
                cst++;
            }
            System.out.println();
            nst++;
            id++;
        }
    }

    public static void pattern3 (int row){
        int id = 1, nst = 1, nsp = row - 1;
        while (id <= row){
            int csp = 1;
            while (csp <= nsp){
                System.out.print("  "); //2 spaces
                csp++;
            }
            int cst = 1;
            while (cst <= nst){
                if (cst <= (nst + 1)/2){
                    System.out.print(cst + " ");
                }
                else{
                    System.out.print(nst - cst + 1 + " ");
                }
                cst++;
            }
            System.out.println();
            nst += 2;
            nsp--;
            id++;
        }
    }

    public static void pattern4 (int row){
        int id = 1, nst = 1, nsp = row - 1;
        while (id <= row){
            int csp = 1;
            while (csp <= nsp){
                System.out.print("  "); //2 spaces
                csp++;
            }
            int cst = id;
            while (cst <= nst){
                System.out.print(cst + " ");
                cst++;
            }
            while ((2*nst - cst) >= id){
                System.out.print(2*nst - cst + " ");
                cst++;
            }
            System.out.println();
            nst += 2;
            nsp--;
            id++;
        }
    }

    //function to return factorial
    public static int fact (int n){
        if (n == 0){
            return 1;
        }
        else{
            int next = fact (n - 1);
            return n * next;
        }
    }

    //function to return nCr combinations
    public static int nCr (int n, int r){
        int product = 1;
        if (r <= (n / 2)){
            for (int i = 1; i <= r; i++){
                product *= n;
                n--;
            }
        }
        else{
            r = n - r;
            for (int i = 1; i <= r; i++){
                product *= n;
                n--;
            }
        }
        return product/fact(r);
    }

    public static void pattern5 (int row){
        int id = 0;
        while (id <= row){
            for (int cst = 0; cst <= id; cst++){
                System.out.print(nCr(id, cst) + "  ");
            }
            System.out.println();
            id++;
        }
    }

    public static void pattern6 (int row){
        int id = 1, nst = 1, nsp = row - 1;
        while (id <= 2 * row - 1){
            int csp = 1;
            while (csp <= nsp){
                System.out.print("  "); //2 spaces
                csp++;
            }
            int cst = 1;
            while (cst <= nst){
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            if (id < row){
                nsp--;
                nst += 2;
            }
            else{
                nsp++;
                nst -= 2;
            }
            id++;
        }
    }

    public static void pattern7 (int row){
        int id = 1, nst = 1;
        while (id <= 2 * row - 1){
            int cst_1 = 1;
            while (cst_1 <= nst){
                System.out.print("* ");
                cst_1++;
            }
            int csp = 1;
            while (csp <= 2 * row - 2 * nst){
                System.out.print("  "); //2 spaces
                csp++;
            }
            int cst_2 = 1;
            while (cst_2 <= nst){
                System.out.print("* ");
                cst_2++;
            }
            System.out.println();
            if (id < row){
                nst++;
            }
            else{
                nst--;
            }
            id++;
        }
    }

    public static void pattern8 (int row){
        int id = 1, nst = row;
        while (id <= 2 * row - 1){
            int cst_1 = 1;
            while (cst_1 <= nst){
                System.out.print("* ");
                cst_1++;
            }
            int csp = 1;
            while (csp <= 2 * row - 1 - 2 * nst){
                System.out.print("  "); //2 spaces
                csp++;
            }
            int cst_2 = 1, nst_2 = nst;
            if (nst_2 == row){
                nst_2--;
            }
            while (cst_2 <= nst_2){
                System.out.print("* ");
                cst_2++;
            }
            System.out.println();
            if (id < row){
                nst--;
            }
            else{
                nst++;
            }
            id++;
        }
    }

    public static void pattern9 (int row){
        int id = 1, nst_1 = 1, nst_2 = 2 * row - 3;
        while (id <= 2 * row - 1){
            int cst_1 = 1;
            while (cst_1 <= nst_1){
                System.out.print(row - cst_1 + 1 + " ");
                cst_1++;
            }
            int cst_2 = 1;
            while (cst_2 <= nst_2){
                if (id < row){
                    System.out.print(row - id + 1 + " ");
                }
                else{
                    System.out.print(id - row + 1 + " ");
                }
                cst_2++;
            }
            int cst_3 = 1, firstNum;
            if (id <= row){
                firstNum = row - id + 1;
            }
            else{
                firstNum = id - row + 1;
            }
            while (cst_3 <= nst_1){
                while (firstNum <= row){
                    if (firstNum != 1){
                        System.out.print(firstNum + " ");
                    }
                    firstNum++;
                }
                cst_3++;
            }
            System.out.println();
            if (id < row){
                nst_1++;
                nst_2 -= 2;
            }
            else{
                nst_1--;
                nst_2 += 2;
            }
            id++;
        }
    }

    public static void pattern10 (int row) {
        for (int i = 1; i <= (row*2)-1; i++) {
            
            for(int sp=1;sp<=(i>row?i-row:row-i);sp++)
                System.out.print("  "); // printing the spaces

            for(int j=(i>row?(2*row)-i:i);j>=1;j--)
                System.out.print(j+" ");  // printing the numbers from n to 1 

            for(int j=2;j<=(i>row?(2*row)-i:i);j++)
                System.out.print(j+" ");  // printing the numbers from 2 to n

            System.out.println(); 

        }
    }
}

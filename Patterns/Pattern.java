public class Pattern{
    public static void pattern1(int n){
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        } 
    }

    public static void pattern2(int n){
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j <= i;j++) 
            {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }

    public static void pattern3(int n){
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n-i;j++) 
            {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
    }

    public static void pattern4(int n){
        for(int i = 0;i < n;i++)
        {
            //space
            for(int j = 0;j < n-i;j++) 
            {
                System.out.print(" "); 
            }

            // stars
            for(int j = 0;j <= i;j++) 
            {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
    }

    public static void pattern5(int n){
        for(int i = 0;i < n;i++)
        {
            //space
            for(int j = 0;j < n-i-1;j++) 
            {
                System.out.print(" "); 
            }

            // stars
            for(int j = 0;j < (2*i)+1;j++) 
            {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
    }

    public static void pattern9(int n){
        for(int i = 0;i < n;i++)
        {
            //space
            for(int j = 0;j < i;j++) 
            {
                System.out.print(" "); 
            }

            // stars
            for(int j = 0;j < 2 * n - (2 * i + 1);j++) 
            {
                System.out.print("*"); 
            }
            System.out.println(); 
        } 
    }


    public static void pattern6(int n){
        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j <= i;j++) 
            {
                System.out.print(j);
            }
            System.out.println(); 
        }
    }

    public static void pattern7(int n){
        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j <= i;j++) 
            {
                System.out.print(i); 
            }
            System.out.println(); 
        }
    }

    public static void pattern8(int n){
        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j <= n-i+1;j++) 
            {
                System.out.print(j); 
            }
            System.out.println(); 
        }
    }

    public static void pattern10(int n){
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j <= i;j++) 
            {
                System.out.print("*"); 
            }
            System.out.println(); 
        } 
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n-i-1;j++) 
            {
                System.out.print("*"); 
            }
            System.out.println(); 
        } 
    }

    public static void pattern11(int n){
        int stars = 1;
        for(int i = 0;i < n;i++)
        {
            if(i%2 == 0) stars = 1;
            else stars = 0;
            for(int j = 0;j <= i;j++) 
            {
                System.out.print(stars); 
                stars = 1 - stars;
            }
            System.out.println(); 
        } 
    }

    public static void pattern12(int n){
        int no = 1;
        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j <= i;j++) 
            {
                System.out.print(no++ +" ");                                                                        
            }
            System.out.println(); 
        } 
    }

    public static void pattern13(int n){
        for(int i = 1;i <= n;i++)
        {
            int j = 1;
            //number
            for(j = 1;j <= i;j++) 
            {
                System.out.print(j);                                                                        
            }

            //space
            for(int k = 1;k <= 2*(n-i);k++) 
            {
                System.out.print(" ");                                                                        
            }

            j--;
            //number
            for(int k = j;k >= 1;k--) 
            {
                System.out.print(k);                                                                        
            }

            System.out.println(); 
        } 

        
    }

    public static void pattern14(int n){
        for(int i = 1;i <= n;i++)
        {
            //number
            for(int j = 0;j < i;j++) 
            {
                int c = 65+j;
                char A = (char)c;
                System.out.print(A);                                                                        
            }
            System.out.println(); 
        } 
    }

    public static void pattern15(int n){
        for(int i = 1;i <= n;i++)
        {
            //number
            for(int j = 0;j <= n-i;j++) 
            {
                int c = 65+j;
                char A = (char)c;
                System.out.print(A);                                                                        
            }
            System.out.println(); 
        } 
    }

    public static void pattern16(int n){
        for(int i = 1;i <= n;i++)
        {
            int c = 65+i-1;
            char A = (char)c;
            //number
            for(int j = 0;j < i;j++) 
            {
                System.out.print(A);                                                                        
            }
            System.out.println(); 
        } 
    }

    public static void pattern17(int n){
        for(int i = 0;i < n;i++)
        {
            //space
            for(int j = 0;j < n-i-1;j++)
            {
                System.out.print(" "); 
            }

            //number 
            char A = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j = 0;j < 2*i+1;j++) 
            {
                if(j >= breakpoint) System.out.print(A--);  
                else System.out.print(A++); 
            }
            System.out.println(); 
        } 
    }    

    public static void pattern18(int n){
        for(int i = 0;i < n;i++)
        {
            for(int j = 'E' - i;j <= 'E';j++) 
            {
                System.out.print((char)j); 
            }
            System.out.println(); 
        }   
    }

    public static void pattern19(int n){
        int initS = 0;
        for(int i = 0;i < n;i++)
        {
            // stars
            for(int j = 0;j < n-i;j++) 
            {
                System.out.print("*"); 
            }

            // spaces
            for(int j = 0;j < initS;j++) 
            {
                System.out.print(" "); 
            }

            // stars
            for(int j = 0;j < n-i;j++) 
            {
                System.out.print("*"); 
            }
            initS += 2;
            System.out.println(); 
        }

        initS -= 2;
        for(int i = 0;i < n;i++)
        {
            
            //Second half
            // stars

            for(int j = 0;j <= i;j++) 
            {
                System.out.print("*"); 
            }

            // spaces
            for(int j = 0;j < initS;j++) 
            {
                System.out.print(" "); 
            }

            // stars
            for(int j = 0;j <= i;j++) 
            {
                System.out.print("*"); 
            }
            initS -= 2;
            System.out.println(); 
        }
    }

    public static void pattern20(int n){

        int initS = (n-1)*2; 
        for(int i = 0;i < n-1;i++)
        {
            // stars

            for(int j = 0;j <= i;j++) 
            {
                System.out.print("*"); 
            }

            // spaces
            for(int j = 0;j < initS;j++) 
            {
                System.out.print(" "); 
            }

            // stars
            for(int j = 0;j <= i;j++) 
            {
                System.out.print("*"); 
            }
            initS -= 2;
            System.out.println(); 
        }

        initS = 0;
        for(int i = 0;i < n;i++)
        {
            // stars
            for(int j = 0;j < n-i;j++) 
            {
                System.out.print("*"); 
            }

            // spaces
            for(int j = 0;j < initS;j++) 
            {
                System.out.print(" "); 
            }

            // stars
            for(int j = 0;j < n-i;j++) 
            {
                System.out.print("*"); 
            }
            initS += 2;
            System.out.println(); 
        }

        
    }

    public static void pattern21(int n){
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n;j++) 
            {
                if(i == 0 || i == n-1)
                    System.out.print("*"); 
                else
                {
                    if(j == 0 || j == n-1)
                        System.out.print("*"); 
                    else
                        System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }

    public static void pattern22(int n){
            for(int i = 0;i < (2*n - 1);i++)
            {
                for(int j = 0;j < (2*n - 1);j++) 
                {
                    int top = i;
                    int left = j;
                    int right = (2*n - 2) - j;
                    int bottom = (2*n - 2) - i;    
                    System.out.print(n - Math.min(Math.min(top, bottom), Math.min(right, left))); 
                }
                System.out.println(); 
            }
    }

    public static void main(String args[]){
        // *****
        // *****
        // *****
        // *****
        // *****
        pattern1(3); 
        System.out.println("\n"); 

        // *
        // **
        // ***
        // ****
        // *****
        pattern2(5);
        System.out.println("\n"); 

        // *****
        // ****
        // ***
        // **
        // *
        pattern3(5);
        System.out.println("\n"); 

        //      *
        //     **
        //    ***
        //   ****
        //  *****
        pattern4(5);
        System.out.println("\n"); 

        //      *
        //     ***
        //    *****
        //   *******
        //  *********
        pattern5(5);
        System.out.println("\n"); 

        // 1
        // 12
        // 123
        // 1234
        // 12345
        pattern6(5);
        System.out.println("\n"); 

        // 1
        // 22
        // 333
        // 4444
        // 55555
        pattern7(5);
        System.out.println("\n"); 

        // 12345
        // 1234
        // 123
        // 12
        // 1
        pattern8(5);
        System.out.println("\n"); 

        // *********
        //  *******
        //   *****
        //    ***
        //     *
        pattern9(5); 
        System.out.println("\n"); 

        //      *
        //     ***
        //    *****
        //   *******
        //  *********
        //  *********
        //   *******
        //    *****
        //     ***
        //      *
        pattern5(5);
        pattern9(5); 
        System.out.println("\n"); 

        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        pattern10(5);
        System.out.println("\n"); 

        // 1
        // 01
        // 101
        // 0101
        // 10101
        pattern11(5);
        System.out.println("\n"); 

        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15 
        pattern12(5);
        System.out.println("\n"); 

        // 1        1
        // 12      21
        // 123    321
        // 1234  4321
        // 1234554321
        pattern13(5); 
        System.out.println("\n");


        // A
        // AB
        // ABC
        // ABCD
        // ABCDE
        pattern14(5); 
        System.out.println("\n");

        // ABCDE
        // ABCD
        // ABC
        // AB
        // A
        pattern15(5); 
        System.out.println("\n"); 

        // A 
        // BB
        // CCC
        // DDDD
        // EEEEE
        pattern16(5); 
        System.out.println("\n");

        //      A
        //     ABA
        //    ABCBA
        //   ABCDCBA
        //  ABCDEDCBA
        pattern17(5); 
        System.out.println("\n");

        // E
        // DE
        // CDE
        // BCDE
        // ABCDE
        pattern18(5); 
        System.out.println("\n");


        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        pattern19(5); 
        System.out.println("\n");

        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        pattern20(5); 
        System.out.println("\n");

        // *****
        // *   *
        // *   *
        // *   *
        // *****
        pattern21(5); 
        System.out.println("\n");   

        // 4444444
        // 4333334
        // 4322234
        // 4321234
        // 4322234
        // 4333334
        // 4444444
        pattern22(4); 
        System.out.println("\n"); 

    }
}
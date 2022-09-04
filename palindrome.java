import com.tanu.sum;
    class Palindrome {

        public static void main(String args[]) {

            if (isPalindrome(126)) {
                System.out.println("palindrome number");
            }
            else
            {
                System.out.println("not palindrome");
            }
//        int number = 121; int temp = number; int rev; int sum=0;
//    while(number>0)
//
//        {
//
//            rev = number % 10;
//            number = number / 10;
//            sum = (sum * 10) + rev;
//        }
//    if(temp==sum)
//                System.out.println("palindrome number");
//    else
//
//            System.out.println("not palindrome");

        }

        public static boolean isPalindrome(int x) {

            int rev; int temp=x; int sum=0;
            while(x>0)

            {
                rev = x % 10;
                x = x / 10;
                sum = (sum * 10) + rev;
            }
            if(temp==sum){
                return true;
            }
            return false;


        }
}



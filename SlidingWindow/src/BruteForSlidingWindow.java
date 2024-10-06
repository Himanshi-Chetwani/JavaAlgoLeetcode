public class BruteForSlidingWindow {
        public static void main(String[] args) {
            int [] arr = {100,200,300,400,100};
            int k= 2;
            int max = 0, sum=0;
            for(int i=0;i<arr.length;i++){
                int m=i; sum=0;
                for(int j = 0; j<k && m<arr.length;j++){
                    sum+=arr[m];
                    max = Math.max(max, sum);
                    m++;
                }
                System.out.println("----"+sum);
            }
            System.out.println("Max"+max);
        }
    }



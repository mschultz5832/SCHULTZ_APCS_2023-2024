public class VariousCounter {
  

    public static void main (String[] args){
        int i = 0;

        while(i <= 100)
        {
            System.out.println(i);
            i++;
        }
        int i = 103436;
        while (i <= 2000007) {
         if (i % 76 == 0) {
       System.out.println(i);
       i++;
         }

        int i = 1000;
        int cycle = {7, -3, 11, -2};
        int index = 0;

        while (i <= 2000) {
         System.out.println(i);
        i += cycle[index];
        index = (index + 1) % cycle.length;

        }
    }


}
}


/*

0/4 incomplete

*/
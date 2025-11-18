class Average {

   public static double[] avg = new double[4];
   public static int[] responseTimes = {100, 200, 150, 300};
   
   public static void main(String[] args) {
      int count = 0;
      average();
      for (int x = 1; x < responseTimes.length; x++) {
         if (responseTimes[x] > avg[x - 1]) {
            count++;
         }
      }    
      System.out.print(count);
   }
   public static void average() {
      int sum = 0;
      int count = 0;
      for (int x = 0; x < responseTimes.length; x++) {
         sum += responseTimes[x];
         count++;
         avg[x] = sum / count;
      }
   }
}
class CompanyInfo {

   public static void main(String[] args) {
      System.out.println("Smart Electronics");
      displayHours();
   }
   public static void displayHours() {
      String output =   """
                        Monday - Friday   8 am to 6 pm
                        Saturday          8 am to noon
                        Sunday            closed     
                        """;
      System.out.println(output);
   }
}
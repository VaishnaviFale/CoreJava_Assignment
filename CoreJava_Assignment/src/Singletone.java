class Sample {
   private static Sample Object;

   private Sample() {       } //constructor

   public static Sample getInstance() {
      if(Object == null) {
         Object = new Sample();
      }
       return Object;
   }

   public static void getConnection() {
       System.out.println("You are now connected.");
   }
}

class Singletone {
   public static void main(String[] args) {
   Sample obj;
   obj= Sample.getInstance();
        Sample.getConnection();
   }
}

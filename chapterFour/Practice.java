public class Practice {
    public static void main(String[] args) {
       
      int input =5;

      for (int mainloop =1; mainloop<= input; mainloop++ ){
         for (int space = input; space> mainloop; space--){
                    System.out.print(" ");}
            for(int innerloop=1; innerloop<= mainloop; innerloop++){
                 System.out.print("*"); } 
        System.out.println();
        }
    }
}


//public class Practice {
//    public static void main(String[] args) {
//       
//      int input = 5;
//
//        for (int mainloop = 1; mainloop <= input; mainloop++ ) {
//            for (int space = input; space > mainloop; space--){
//                System.out.print(" "); }
//            for(int innerloop = 1; innerloop <= mainloop; innerloop++){
//                System.out.print("*"); }
// 
//            System.out.println();
//        }
//    }
//}

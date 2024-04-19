public class Extraif {
        public static void main(String[] args) {
            //se pueden intercambiar valores
            int x = 10;
            int y = 20;
            int z = 30;
    
            if (x < y) {
                System.out.println("x es menor que y");
                
                if (y < z) {
                    System.out.println("y es menor que z");
                } else {
                    System.out.println("y no es menor que z");
                }
            } else {
                System.out.println("x no es menor que y");
            }
        }
    
    
    
}

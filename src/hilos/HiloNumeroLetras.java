
package hilos;

public class HiloNumeroLetras implements Runnable {
 private int tipo;
  

    public HiloNumeroLetras(int tipo) {
        this.tipo = tipo;
    }
 
 
    @Override
    public void run() {
        
        while(true){
           
            switch (tipo){
                case 1:
                    for (int i = 1; i < 30; i++) {
                        System.out.println(i);
                    }
                    break;
                            
                            case 2:
                                for (char i = 'a'; i < 'z'; i++) {
                                    System.out.println(i);
                                }
                                break;
                                
                       
            }
           
        }
    }
    
}
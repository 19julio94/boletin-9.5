

package boletin.pkg95;

/**
 *
 * @author jpatriciodasilva
 */
public class Cadena {
   
    public String metodoA(int num){
    String respuesta="2";
        for(int x=1;x<=num;x++){
      if(x%2==0 && x>2){
       respuesta=respuesta+" + "+x;
    
    }
        }
    return respuesta;
}
    public String metodoB(int num){
        String respuesta="-1";
        for(int y=1; y<=num;y++){
        if (y%2==0){
            respuesta=respuesta+ " + "+y;
        }else {
            if(y>1){
            respuesta=respuesta+" - "+y;
            
            }
        }
        }
        return respuesta;
    }
}
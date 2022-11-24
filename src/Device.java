public class Device {

    private float mhkos;
    private float yphos;
    private float vathos;
    private String onoma_kataskeuasths;
    private String typos_kataskeuhs;
    private float katanalwsh_energias;
    boolean status;
    void powerOn(){
status=true;
    }
    void powerOff (){
status=false;
    }
    boolean status(){
   return status;
    }
}


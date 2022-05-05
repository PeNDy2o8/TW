public class Wristband {
    private boolean light_sw;
    private boolean lock;
    Emergency_button emergency_button =new Emergency_button();
    GPS gps=new GPS();
    Sensor sensor=new Sensor();

    public boolean Set_Light(boolean light){
        if (light == true){
            return true;
        }else{
            return false;
        }
    }
    public boolean Lock_Switch(){
        return true;
    }
}

public class Sensor{
    public int heartrhythm;
    Sensor(int rhythm){
        this.heartrhythm=rhythm;
    }
    public int Get_Heartrhythm(){
        return heartrhythm;
    }
}

public class Emergency_button{
    public boolean button;

    public boolean Needhelp(){
        return true;
    }
}

public class GPS{
    public double longgps;
    public double latitudegps;
    GPS(double x,double y){
        this.longgps=x;
        this.latitudegps=y;
    }
    public Get_LongGPS(){
        return longgps;
        
    }
    public Get_LatutudeGPS(){
        return latitudegps;
    }
}
package Ejercicio4;

public class SmartDevice {
    // Atributos
    String modelo;
    String fabricante;
    String SistemaOperativo;
    float memory;

    //Constructores
    public SmartDevice(){

    }
    public SmartDevice(String modelo, String fabricante, String SistemaOperativo ){
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.SistemaOperativo = SistemaOperativo;
    }

    //métodos(Comportamiento)

    public String turnOnOff(int number){
        if(number == 0){
            return "Apagado";
        }else {
            return "Encendido";
        }
    }

    public static class SmartWatch extends SmartDevice{
        double hora;
        boolean waterResist;
        boolean screens;
        boolean alamrs;

        public SmartWatch(){

        }

        public SmartWatch(String modelo, String fabricante, String SistemaOperativo ,int hora, boolean waterResist, boolean screens, boolean alamrs){
            super(modelo, fabricante, SistemaOperativo);
            this.hora = hora;
            this.waterResist = waterResist;
            this.screens = screens;
            this.alamrs = alamrs;
        }

    }

    public static class SmarthPhone extends SmartDevice{
        boolean ringTone;
        boolean calling;
        boolean multiTask;

        public SmarthPhone(){

        }

        public SmarthPhone(String modelo, String fabricante, String SistemaOperativo, boolean ringTone, boolean calling, boolean multiTask) {
            super(modelo, fabricante, SistemaOperativo);
            this.ringTone = ringTone;
            this.calling = calling;
            this.multiTask = multiTask;
        }
    }

}

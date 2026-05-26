public class Objvehiculo {
    private String placa;
    private String horaEntrada;
    private String estado;
    public Objvehiculo() {
    }
    public Objvehiculo(String placa, String horaEntrada, String estado) {
        this.placa = placa;
        this.horaEntrada = horaEntrada;
        this.estado = estado;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public String isEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}

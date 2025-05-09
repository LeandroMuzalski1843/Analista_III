package ejercicio5;

import java.time.LocalDate;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Turno{
    private LocalDateTime fechaHora;
    private LocalDateTime fechaHoraInicioAtencion;
    private LocalDateTime fechaHoraFinAtencion;
    private Mascota mascota;
    private Veterinario venterinario;
    private Servicio servicio;

    public Turno(LocalDateTime fechaHora, LocalDateTime fechaHoraInicioAtencion, LocalDateTime fechaHoraFinAtencion, Mascota mascota, Veterinario venterinario, Servicio servicio) {
        this.fechaHora = fechaHora;
        this.fechaHoraInicioAtencion = fechaHoraInicioAtencion;
        this.fechaHoraFinAtencion = fechaHoraFinAtencion;
        this.mascota = mascota;
        this.venterinario = venterinario;
        this.servicio = servicio;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public LocalDateTime getFechaHoraInicioAtencion() {
        return fechaHoraInicioAtencion;
    }

    public void setFechaHoraInicioAtencion(LocalDateTime fechaHoraInicioAtencion) {
        this.fechaHoraInicioAtencion = fechaHoraInicioAtencion;
    }

    public LocalDateTime getFechaHoraFinAtencion() {
        return fechaHoraFinAtencion;
    }

    public void setFechaHoraFinAtencion(LocalDateTime fechaHoraFinAtencion) {
        this.fechaHoraFinAtencion = fechaHoraFinAtencion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVenterinario() {
        return venterinario;
    }

    public void setVenterinario(Veterinario venterinario) {
        this.venterinario = venterinario;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public int calcularDiasRestantes() {
        if (this.fechaHoraInicioAtencion.isBefore(this.fechaHora)) {
            return 0;
        } else {
            return (int) ChronoUnit.DAYS.between(this.fechaHora.toLocalDate(), this.fechaHoraInicioAtencion.toLocalDate());
        }
    }



    public double calcularCostoTotal(){
        double duracion;
        duracion = Duration.between(this.fechaHoraInicioAtencion,this.fechaHoraFinAtencion).toMinutes();
        if(mascota.getPeso()<=5){
            return servicio.getPrecioBase() + (duracion - this.servicio.getDuracionMin())*this.servicio.getPrecioAdicionalPorMinuto();
        }
        else {
            return servicio.getPrecioBase() + (duracion - this.servicio.getDuracionMin())*this.servicio.getPrecioAdicionalPorMinuto() + (mascota.getPeso()-5)*500;
        }
    }
}

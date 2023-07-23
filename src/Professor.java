public class Professor extends Funcionario {

    private Double cargaHoraria;
    private Double valorHora;

    @Override
    public Double getSalario() {
        return cargaHoraria * valorHora;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}







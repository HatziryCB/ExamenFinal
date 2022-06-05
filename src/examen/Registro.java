package examen;

public class Registro {

    private String departamento;
    private int municipio;
    private String cabecera;

    public Registro(String departamento, int municipio, String cabecera) {
        this.departamento = departamento;
        this.municipio = municipio;
        this.cabecera = cabecera;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getMunicipio() {
        return municipio;
    }

    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }

    public String getCabecera() {
        return cabecera;
    }

    public void setCabecera(String cabecera) {
        this.cabecera = cabecera;
    }

    @Override
    public String toString() {
        return "\nRegistro{" +
                "\nDepartamento= '" + departamento + '\'' +
                ",\nMunicipio= " + municipio +
                ",\nCabecera= '" + cabecera + '\'' +
                '}';
    }
}

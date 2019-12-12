package ads.pucgo.vetpetapp.entidade;

import java.util.Date;
import java.util.List;

public class Pet {
    private String nomeDono;
    private String nomePet;
    private double peso;
    private int idade;
    private Date dataConsulta;
    private List<String> vacinas;
    private String telefone;
    private String obsevavao;

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public List<String> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<String> vacinas) {
        this.vacinas = vacinas;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getObsevavao() {
        return obsevavao;
    }

    public void setObsevavao(String obsevavao) {
        this.obsevavao = obsevavao;
    }
}

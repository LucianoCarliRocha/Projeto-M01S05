package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.LogManager;

public class Professor extends Pessoa {

    private String FormacaoAcademica;
    private String Estado;
    private String Experiencia;


    public Professor(String nome, Long cpf, Long telefone, int dataNascimento, String formacaoAcademica,
                     String estado, String experiencia) {
        super(nome, cpf, telefone, dataNascimento);
        FormacaoAcademica = formacaoAcademica;
        Estado = estado;
        Experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "FormacaoAcademica='" + FormacaoAcademica + '\'' +
                ", Estado='" + Estado + '\'' +
                ", Experiencia='" + Experiencia + '\'' +
                '}';
    }

    public String getFormacaoAcademica() {
        return FormacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        FormacaoAcademica = formacaoAcademica;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(String experiencia) {
        Experiencia = experiencia;
    }
}

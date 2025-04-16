package Aluno;

/**
 * @author Renatta
 */

public class Aluno {

    private String nome;
    private int registroAcademico;
    private String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que retornará o registro acadêmico de cada aluno
     * @return
     */
    public int getRegistroAcademico() {
        return registroAcademico;
    }

    /**
     * O parâmetro utilizado é o registro do aluno.
     * @param registroAcademico
     */
    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}


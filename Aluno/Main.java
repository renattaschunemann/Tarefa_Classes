 /**
 * @author Renatta
 */
package Aluno;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();



        aluno1.setNome("Renatta");
        aluno1.setCurso("Especialista back-end");
        aluno1.setRegistroAcademico(1234);
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getCurso());
        System.out.println(aluno1.getRegistroAcademico());
        System.out.println("-----------------------");

        aluno2.setNome("Maria");
        aluno2.setCurso("Especialista front-end");
        aluno2.setRegistroAcademico(4321);
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getCurso());
        System.out.println(aluno2.getRegistroAcademico());

    }
}

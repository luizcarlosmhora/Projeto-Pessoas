/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.pessoas;

/**
 *
 * @author Luiz Carlos
 */
public class Aluno extends Pessoa {
    private int mat;
    private String curso;
    
    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}



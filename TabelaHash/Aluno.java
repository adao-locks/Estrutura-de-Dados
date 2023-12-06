public class Aluno {
    private String nome;
    private int matricula;
    private double media;
    private Aluno proximo; // garante o encadeamento

    //Construtores
    public Aluno() {

    }
    public Aluno(String nome, int matricula, double media) {
        this(nome, matricula, media, null);
    }
    public Aluno(String nome, int matricula, double media, Aluno proximo) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
        this.proximo = proximo;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public Aluno getProximo() {
        return proximo;
    }
    public void setProximo(Aluno proximo) {
        this.proximo = proximo;
    }
    public String toString() {
        return nome + " " + matricula;
    }
}
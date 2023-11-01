public class ArvoreBinaria { //tudo que não é primitivo, herda de Object
    private NoArvoreBinaria raiz;
    public ArvoreBinaria(){
        raiz = null;
    }

    public NoArvoreBinaria insere(int v, NoArvoreBinaria esq, NoArvoreBinaria dir) {
        NoArvoreBinaria no = new NoArvoreBinaria(v, esq, dir);
        raiz = no;
        return no;
    }

    public boolean vazia() {
        return (raiz == null);
    }

    public boolean pertence(NoArvoreBinaria raiz, int info) {
        return pertence(this.raiz, info);
    }

    private boolean pertence(NoArvoreBinaria no, Integer valor) { //Métodos recursivos não tem como pular objetos sem passar por eles para verificar primeiro.
        if (no == null) {
            return false;
        }
        boolean expressao;
        expressao = no.getInfo().equals(valor) || pertence(no.getEsq(), valor) || pertence(no.getDir(), valor);
        return expressao;
    }

    private String toStringPre(NoArvoreBinaria no) {
        String s = new String(" ");
        s = s + "<";
        if (no != null) {
            s += no.getInfo();
            s += toStringPos(no.getEsq());
            s += toStringPos(no.getDir());
        }
        return s;
    }

    @Override
    public String toString() {
        return toStringPos(raiz);
    }

    private String toStringPos(NoArvoreBinaria no) {
        String s = "";
        if (no != null) {
            s += toStringPos(no.getEsq());
            s += toStringPos(no.getDir());
            s += no.getInfo() + " ";
        }
        return s;
    }

    private String toStringInOrdem(NoArvoreBinaria no) {
        String s = "";
        if (no != null) {
            s += toStringPos(no.getEsq());
            s += no.getInfo() + " ";
            s += toStringPos(no.getDir());
        }
        return s;
    }
}

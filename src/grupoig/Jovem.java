package grupoig;
public class Jovem implements Comparable<Jovem>{
    private String nome;
    private int aprox;

    public Jovem(String nome, int aprox) {
        this.nome = nome;
        this.aprox = aprox;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAprox() {
        return aprox;
    }

    public void setAprox(int aprox) {
        this.aprox = aprox;
    }

    @Override
    public int compareTo(Jovem outroJovem) {
    if(this.aprox < outroJovem.getAprox()){
            return -1;
        }
        else if(this.aprox > outroJovem.getAprox()){
            return 1;
        }
        return 0;
    }
}

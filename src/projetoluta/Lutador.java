package projetoluta;
public class Lutador  {
    //Atributos
   private String nome, nacionalidade, categoria;
   private float peso, altura;
   private int vitorias, derrotas, empates, idade;
   //Metodos acessores e modificadores

    public Lutador(String n, String na, float p, float alt, int vit, int de, int emp, int id) {
        this.nome = n;
        this.nacionalidade = na;
        this.setPeso(p);
        this.altura = alt;
        this.vitorias = vit;
        this.derrotas = de;
        this.empates = emp;
        this.idade = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "invalido";
        }else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        }else if (this.peso <= 120.3) {
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
        
    }
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
        
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
  
   //Metodos da Classe Luta

    public void apresentar() {
        System.out.println("----------------------------------------------");
        System.out.println("Vamos apresentar o Lutador: " + this.getNome());
        System.out.println("país: " + this.getNacionalidade());
        System.out.println("idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Nº de Vitórias: " + this.getVitorias());
        System.out.println("Nº de Empates: " + this.getEmpates());
        System.out.println("Nº de Derrotas: " + this.getDerrotas());
        
    }

   
    public void status() {
        System.out.println("---------------------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Peso: " + this.getCategoria());
        System.out.println("Ganhou : " + this.getVitorias());
        System.out.println("Empatou : " + this.getEmpates());
        System.out.println("Perdeu: " + this.getDerrotas());
    }


    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

  
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() +1);
    }

   
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() +1);
    }
   
   
}

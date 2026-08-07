import enums.Genero;

import java.time.LocalDate;

public class Usuario {

    public int id;
    public String nome;
    public String cpf;
    public Genero genero;
    public String nomeSocial;
    public LocalDate dtNasc;
    public String email;
    public String telefone;
    public String cep;
    public String senha;

    public Usuario(int id, String nome, String cpf, Genero genero, String nomeSocial, LocalDate dtNasc, String email, String telefone, String cep, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.nomeSocial = nomeSocial;
        this.dtNasc = dtNasc;
        this.email = email;
        this.telefone = telefone;
        this.cep = cep;
        this.senha = senha;
    }
}
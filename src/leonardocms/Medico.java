package leonardocms;

public class Medico {

    private String nome;
    private String CPF;
    private int id;
    private int especialidade;
    private int CRM;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the cpf to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param idthe idMedico to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the especialidade
     */
    public int getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(int especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return the crm
     */
    public int getCRM() {
        return CRM;
    }

    /**
     * @param CRM the crm to set
     */
    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

}

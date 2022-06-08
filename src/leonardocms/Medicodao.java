package leonardocms;

import java.util.ArrayList;
import java.sql.*;

public class Medicodao extends Conexao {

    public String cadastrarMedico(Medico medico) {
        try {
            return this.atualizarBanco("insert into medico(nome, especialidade, crm, cpf) values ('"
                    + medico.getNome() + "', "
                    + Integer.toString(medico.getEspecialidade()) + ", "
                    + Integer.toString(medico.getCRM()) + ", '"
                    + medico.getCPF() + "')");
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String atualizarMedico(Medico medico) {
        try {
            return this.atualizarBanco("update medico set nome = '" + medico.getNome()
                    + "' , especialidade = " + Integer.toString(medico.getEspecialidade())
                    + " , crm = " + Integer.toString(medico.getCRM())
                    + " , cpf = '" + medico.getCPF()
                    + "' where id = " + Integer.toString(medico.getId()));
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String excluirMedico(int id) {
        try {
            return this.atualizarBanco("delete from medico where id = " + Integer.toString(id));
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public ArrayList listarMedico() {
        try {
            ResultSet result = this.getResultSet("select * from medico order by nome");
            ArrayList list = new ArrayList();
            while (result.next()) {
                Medico med = new Medico();
                med.setId(result.getInt("id"));
                med.setNome(result.getString("nome"));
                med.setEspecialidade(result.getInt("especialidade"));
                med.setCRM(result.getInt("crm"));
                med.setCPF(result.getString("cpf"));
                list.add(med);
            }
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}

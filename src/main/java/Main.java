import ORM.Database;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Database db = new Database("produto");
        ArrayList<String> nomeColunas = new ArrayList<>();
        nomeColunas.add("Nome");
        nomeColunas.add("valor");

        ResultSet resultado;


        try {
            resultado = db.select(nomeColunas).executar();
            while (resultado && next()){
                System.out.println("ID: " + resultado.getInt("id") + " - Nome: " + resultado.getString("nome"));
            }
            conexao.close();
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
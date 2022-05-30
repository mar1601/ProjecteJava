package com.institutmvm.controller.utils;
import java.sql.*;
import com.institutmvm.aplication.entities.Tauro;
import com.institutmvm.aplication.entities.Crustasi;
import com.institutmvm.aplication.entities.Alga;
//FALTA CADA UNO
public class SqlConect {
    private String server = "jdbc:mysql://mysql-bbddmar.alwaysdata.net/bbddmar_projectejava";
    private String user = "bbddmar";
    private String pasword = "Mar1234567890.";

    public static void sql(Alga a){

        try{

        Connection bbdd = DriverManager.getConnection(server,user,pasword);
        Statement instruc = bbdd.createStatement();
        String select= "select id,habitat from alga";
        String insert= "insert into alga (especie, habitat, mida, tempsArribada, temperaturaSuperficial, color)" +
                " values(?,?,?,?,?,?)";
        PreparedStatement alga1 = bbdd.prepareStatement(insert);
        try {
            ResultSet rs = instruc.executeQuery(select);
            while (rs.next()){
                System.out.println(rs.getInt(1)+" " +rs.getString(2));
            }
            alga1.setString(1,alga get especie);
            alga1.setString(2,alga get habitat);
            alga1.setFloat(3,alga get mida);
            alga1.setDate(4,alga get tempsArribada);
            alga1.setInt(5,alga get temperaturaSuperficial);
            alga1.setString(6,alga get color);

            alga1.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
        catch  (SQLException e) {
        throw new RuntimeException(e);
    }
}
}

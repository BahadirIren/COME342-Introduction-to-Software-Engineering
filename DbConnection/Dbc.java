import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Dbc {

	public static void main(String[] args) throws SQLException {
		Connection c = DriverManager.getConnection("idbc:mariadb://localhost:3306/deneme?user-root&password-12341");
		Statement st = c.createStatement();

		String query = "INSERT INTO GUITAR (SerialNumber, Price) VALUES ('V96', 3500)";
		int result = st.executeUpdate(query);
		System.out.println(result);

		Scanner input = new Scanner(System.in);

		System.out.print("Enter serial number: ");
		String serialNumber = input.nextLine();
		System.out.print("Enter Price: ");
		double price = input.nextDouble();
		input.close();

		String query2 = "INSERT INTO GUITAR (SerialNumber, Price) VALUES ('" + serialNumber + "', " + price + ")";
		int result2 = st.executeUpdate(query2);
		System.out.println(result2);
		st.close();

		String query3 = "INSERT INTO GUITAR (SerialNumber, Price) VALUES (?,?)";
		PreparedStatement pt = c.prepareStatement(query3);
		pt.setString(1, "V97");
		pt.setDouble(2, 3700);
		int result3 = pt.executeUpdate();
		System.out.println(result3);
		pt.close();

		/// Print whole table
		ResultSet rs = st.executeQuery("SELECT * FROM GUITAR WHERE PRICE > 1500");
		while (rs.next()) {
			System.out.println(rs.getString("SerialNumber") + " " + rs.getDouble("Price"));
		}

		/// Create Table
		String createTable = "CREATE TABLE Mandolin (SerialNumber VARCHAR(50) PRIMARY KEY. Price DOUBLE);";
		st.executeUpdate(createTable);

	}

}

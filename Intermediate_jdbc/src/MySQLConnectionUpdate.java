import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLConnectionUpdate {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		Pass pass = new Pass();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/user";
			String user = "root";
			String password = pass.getPass();
			con = DriverManager.getConnection(url,user,password);
			
			String sql = "UPDATE user_list SET name = 'ルーク' WHERE id = ?";
			ps = con.prepareStatement(sql);
			
			// ステートメントオブジェクトの「？」は人氏の文字や数値に置き換えることが可能
			ps.setInt(1, 2);
			
			int count = ps.executeUpdate();
			System.out.println(count + "件処理しました");
						
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) {
					con.close();
				}
				if(ps != null) {
					ps.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		

	}

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLConnectInsert {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		Pass pass = new Pass();
		
		try {
			// ①JDBCドライバの登録（インスタンス化）
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// ②データベースへの接続
			String url = "jdbc:mysql://localhost/user";
			String user = "root";
			String password = pass.getPass();
			con = DriverManager.getConnection(url, user,password);
			
			// ③ステートメントオブジェクトの取得
			String sql = "INSERT INTO user_list(name, age) VALUE('ルーク', 8)";
			ps = con.prepareStatement(sql);
			
			// ④SQL操作
			int count = ps.executeUpdate();
			System.out.println(count + "件処理しました");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ⑤DBとの接続を終了
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

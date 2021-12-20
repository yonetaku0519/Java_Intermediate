package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HumanManager {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	public void setHuman(String name, int age) {
		try {
			getConnection();
			
			String sql = "INSERT INTO user_list(name, age) VALUES(?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2,  age);
			
			ps.executeUpdate();
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeSQL();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	public ArrayList<Human> getHumanList() {
		ArrayList<Human> list = new ArrayList<Human>();
		try {
				getConnection();
			
				// ③ステートメントオブジェクトの取得
				String sql = "SELECT * FROM user_list";
				ps = con.prepareStatement(sql);
				
				// ④SQL操作
				rs = ps.executeQuery();
				
				// ⑤結果の取得
				while (rs.next()) {
					
					String name = rs.getString("name");
					int age = rs.getInt("age");
					Human human = new Human(name, age);
					list.add(human);
					
				}
			}  catch (ClassNotFoundException e) {
				e.printStackTrace();
			}  catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					closeSQL();
				}catch(SQLException e) {
					e.printStackTrace();;
				}
				
			}
	
		return list;
	}
	
	private void getConnection() throws ClassNotFoundException, SQLException {
		Pass pass = new Pass();
		
		if(con == null) {
			// ①JDBCドライバの登録（インスタンス化）
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// ②データベースへ接続
			String url = "jdbc:mysql://localhost/user";
			String user = "root";
			String password = pass.getPass();
			con = DriverManager.getConnection(url, user, password);
		}
		
	}
	
	
	private void closeSQL()  throws SQLException{
		// ⑤DBとの接続を終了
	
		if(con != null) {
			con.close();
		}
		if(ps != null) {
			ps.close();
		}
		if(rs != null) {
			rs.close();
		}
		
	}
	
	public void insertUserList() {
		
	}

}


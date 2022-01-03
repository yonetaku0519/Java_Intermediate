
public class JDBC_Memo {

	public static void main(String[] args) {
		
		System.out.println("JDBCドライバに関してのメモ");
		
		/*
		 * JDBCを使用してローカルのMySQLと接続する方法に関して、簡単なメモを残す。
		 * 参考URL（https://qiita.com/y0kk0/items/827e0ca99a0c4f4a91d6）
		 * 
		 * 前提条件： MysqlのJDBCをダウンロードしておく
		 * 
		 * プロジェクトを右クリックして、「インポート」を選択する。
		 * 
		 * インポート・ウィザードの選択では、
		 * 　一般　＝＞　ファイルシステム　を選択して次へ
		 * 
		 * JDBCドライバーが保存されているディレクトリを選択して、jarファイルをクリックして完了
		 * 
		 * これでjarファイルが使えるようになるので、MySQLのコネクションが使用できる。
		 * Class.forName("com.mysql.cj.jdbc.Driver");
		 * */
		
		

	}

}

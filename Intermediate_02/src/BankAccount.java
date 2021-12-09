
public class BankAccount {
	private String bankNumber;
	private String passWord;
	private String bankCode;
	
	public BankAccount(String bankNumber, String passWord, String bankCode) {
		this.bankNumber = bankNumber;
		this.passWord = passWord;
		this.bankCode = bankCode;
	}
	
	public void changePassWord(String oldPass, String newPass) {
		if(passWord == oldPass) {
			passWord = newPass;
			System.out.println("パスワードを変更しました");
		} else {
			System.out.println("パスワードが違います");
		}
		
	}
		

}

package model;

import java.util.ArrayList;

public class HumanManager {
	public ArrayList<Human> getHumanList(ArrayList<Human> humanList, String name , String age) {

		// セッションからユーザ一覧が取得できない場合は、初回リクエストとして処理
		// リストを新規作成
		if(humanList == null) {
			humanList = new ArrayList<Human>();
		}
		// リストに追加をして返却
		humanList.add(new Human(name, Integer.parseInt(age)));
		return humanList;
	}
}

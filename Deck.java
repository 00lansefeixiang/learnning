import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Deck {

	//カードリストを生成する
	List crdList = new ArrayList<>();

	//カードマップを生成する
	static Map crdMap = new HashMap();

	public void makeCrd(){
		//インスタンス
		Card crd = new Card();

		for(int i= 0; i < crd.colors.length; i++ ){
			for(int j = 0; j < crd.points.length; j++){
				//基本カード
				String khnCrd = crd.colors[i] + crd.points[j];

				//基本カードをカードリストにセットする
				crdList.add(khnCrd);
			}
		}
		//大王、副王をカードリストにセットする
		crdList.add(crd.boss[0]);
		crdList.add(crd.boss[1]);
		System.out.println(crdList);

		//全カードをカードマップにセットする
		setCrdInf(crdList);
		//いずれの一枚を抽出し、出力する
		System.out.println(crdMap.get("大王"));

	}

	public static Map setCrdInf(List crd){
		for(int i = 0; i < crd.size(); i++){
			crdMap.put(crd.get(i),crd.get(i));
		}
		return crdMap;
	}
}

package blackJack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GameLogic {
	
	static int pointsAll = 0;
	static ArrayList<Integer> deck = new ArrayList<Integer>();
	
	public static void shuffle(){
		for (int i = 5; i <= 48; i++) {
			deck.add(i);
		}Collections.shuffle(deck);
		for (int i = 0; i < deck.size(); i++) {
			System.out.println(deck.get(i));
		}
		
	}
	
	
	
	public static void random(){
		Random rand = new Random();
		int cardDrawn=rand.nextInt(44)+5;
		if(cardCheck(cardDrawn)){
			random();
		}
		cardDefine(cardDrawn);
		
	}
	private static boolean cardCheck(int CardDrown){
		boolean isExist=false;
		if(deck.contains(CardDrown)){
			isExist=true;
			return isExist;
		} else{
			isExist=false;
			return isExist;	
		}
	}
	
	public static void cardDefine(int cardDrown) {
		int points, collor;
		
		String cardSuit = new String();
		if(cardDrown%4==0){
			points=cardDrown/4+1;
		}else{
			points=cardDrown/4+2;
		}if(points<=10){
			cardSuit= ""+points;
		}switch (points) {
		case 11:
			cardSuit="J";
			points =10;
			break;
		case 12:
			cardSuit="Q";
			points =10;
			break;
		case 13:
			cardSuit="K";
			points =10;
			break;
		case 14:
			cardSuit="A";
			points =11;
			break;
		}
		
		collor= cardDrown%4;
		switch (collor) {
		case 0:
			cardSuit+="♣";
			break;
		case 1:
			cardSuit+="♠";
			break;
		case 2:
			cardSuit+="♥";
			break;
		case 3:
			cardSuit+="♦";
			break;
		}
		pointsAll+=points;
		//System.out.println(cardSuit+" "+points);
		//pointsChecker();
		System.out.println("padna ti se: "+cardSuit+" ima6 to4ki "+pointsAll);
	}

}

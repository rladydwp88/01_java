package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {
	public static void main(String[] args) {
		/*
		Friend friends = new Friend();
		friends.pickLeader();
		*/
		
		// Friend 객체만 넣을 수 있는 ArrayList 객체 생성 후
		List<Friend> friends = new ArrayList<>();
		
		// 짱구, 철수, 유리, 훈이, 맹구 객체 생성하여 ArrayList에 추가하기
		friends.add(new Friend("짱구"));
		friends.add(new Friend("철수"));
		friends.add(new Friend("유리"));
		friends.add(new Friend("훈이"));
		friends.add(new Friend("맹구"));
		
		// List에서 다섯개체 중 랜덤으로 하나를 뽑아
		// 골목대장이 누군지 출력하기
		int random = (int) (Math.random()*friends.size());
		friends.get(random).pickLeader();
		
	}
}

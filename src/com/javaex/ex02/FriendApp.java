package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	ArrayList<Friend> fArr = new ArrayList<Friend>();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	
    	
    	System.out.println("친구 3명을 등록해주세요");
    	for ( int i =0; i < 3 ; i++ ) {
    		String r = sc.nextLine();
    		
    		Friend f = new Friend();    		
    		
    		String[] re = new String[3];
    		
    		re = r.split(" ");
    		
    		f.setName(re[0]);
    		f.setHp(re[1]);
    		f.setSchool(re[2]);
    		
    		fArr.add(f);
    		
    	}
    	
    	for ( int i =0; i < fArr.size() ; i++ ) {
    		System.out.println(fArr.get(i).showInfo());
    	}

    	
    	sc.close();
    }

}

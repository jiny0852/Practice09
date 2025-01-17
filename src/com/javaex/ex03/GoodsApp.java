package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	List<Goods> gList = new ArrayList<Goods>();
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	
    	for (int i = 0 ; i < 100 ; i++) {/////////////////error100
    		
    		String re = sc.nextLine();
    		
    		if ( re.equals("q")) { 
    			System.out.println("[입력완료]");
    			break; 
    		}
    		
    		String[] n = re.split(",");
    		
    		Goods g = new Goods();
    		
    		g.setName(n[0]);
    		g.setPrice(Integer.parseInt(n[1]));
    		g.setCount(Integer.parseInt(n[2]));
    		
    		gList.add(g);
    		
    		/*
    		new Goods().setName(n[0]);
    		new Goods().setPrice(n[1]);
    		new Goods().setCount(n[2]);
    		
    		gList.add(new Goods().setName(n[0]));
    		gList.add(new Goods().setPrice(Integer.parseInt(n[1])));
    		gList.add(new Goods().setCount(Integer.parseInt(n[2])));
    		*/
    		
    	}
    	
    	int total=0;
    	for (int i = 0; i < gList.size(); i++) {
    		System.out.println(gList.get(i).showInfo());
    		total += gList.get(i).getCount();
    	}
    	
    	System.out.println("모든 상품의 갯수는 "+ total + "개입니다.");
    	
    	sc.close();
       
    }

}

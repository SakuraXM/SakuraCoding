package com.java.product;

import com.java.creator.Animal;

/**
 * 
 *@Description:创建具体产品角色 
 *
 *@author XiaoMing
 *
 *@date:2018年11月12日 上午10:36:58
 */
public class Cat implements Animal{
	public void get(){
		System.out.println("获得猫");
	}
}

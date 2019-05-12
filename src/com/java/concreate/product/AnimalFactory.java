package com.java.concreate.product;

import com.java.creator.Animal;
import com.java.product.Cat;
import com.java.product.Dog;

/**
 * 
 *@Description: 简单工厂模式(静态工厂方法模式)
 *
 *@author XiaoMing
 *
 *@date:2018年11月12日 上午10:28:30
 */
public class AnimalFactory {
	//注意要抛出三个异常,或者抛一个大的Exception
	public static Animal getAnimal(String type) throws ClassNotFoundException,
										IllegalAccessException,InstantiationException{
		/*if(type.equalsIgnoreCase("dog")){
			return Dog.class.newInstance();
		}else if(type.equalsIgnoreCase("cat")){
			return Cat.class.newInstance();
		}else{
			System.out.println("没有该实例化类");
			return null;
		}*/
		
		/*------------------->>优化------------------*/
		//ͨ通过类名获取class类
		Class animal = Class.forName(type);
		return (Animal)animal.newInstance();
		
	}
}

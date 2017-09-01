package com.test.modeldesign.singleton;

/**
 * 单例模式，在程序只需要生成一个实例的时候使用。这种单例模式的写法是饿汉模式，利用classloader机制避免了多线程的同步问题.
 * 类加载一次，不会再重复加载，所以singleton只有一个，构造函数也只会只行一次
 * instance在类装载时就实例化
 * @author Thinkpad
 *
 */
public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("生成了一个实例");
	}
	public static Singleton getInstance(){
		return singleton;
	}
}

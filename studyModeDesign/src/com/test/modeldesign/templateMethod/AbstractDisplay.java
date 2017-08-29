package com.test.modeldesign.templateMethod;
/**
 * 这是一个抽象类，定义了open,print,close三个抽象方法，这三个抽象方法是要子类去具体实现的。
 * 在display方法中，调用了这三个抽象方法。子类不管如何实现那三个抽象方法，display方法都要按该抽象类中定义的逻辑执行。
 * display方法就是一个模板方法.display方法被定义成final的，表示不能被子类实现，也就是不能被子类修改。
 * @author Thinkpad
 *
 */
public abstract class AbstractDisplay {
	public abstract void open();
	public abstract void print();
	public abstract void close();
	public final void display(){
		open();
		for(int i =0;i<5;i++){
			print();
		}
		close();
	}
}

package com.imooc.animal;
/**
 * ����è��
 * @author admin
 *
 */

public class Cat {

	//���ԣ��ǳơ����䡢���ء�Ʒ��
	String name;//�ǳ� Ĭ��ֵΪnull
	int month;//����  Ĭ��ֵΪ 0
	double weight;//���� Ĭ��ֵΪ0.0
	String speices;//Ʒ�� Ĭ��ֵΪnull
	
	public Cat(String name, int month, double weight, String speices){
		this.name = name;
		this.month = month;
		this.weight = weight;
		this.speices = speices;
	}
	
	public Cat(){
		System.out.println("���������Ĺ��췽��");
	}
	//�������ܶ����Զ���
	//�ܶ��ķ���
	public void run() {
		this.eat();
		System.out.println("Сè����");
	}
	
	public void run(String name) {
		System.out.println(name + "Сè����");
	}
	//�Զ����ķ���
	public void eat() {
		System.out.println("Сè����");
	}

}

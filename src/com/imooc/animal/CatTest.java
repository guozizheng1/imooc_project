package com.imooc.animal;
//��һְ��ԭ��
public class CatTest {

	public static void main(String[] args) {
		//����ʵ����
		Cat one = new Cat("����", 4, 1000, "Ӣ����ëè");
	
//		one.name = "����";
//		one.month = 4;
//		one.weight = 1000;
//		one.speices = "Ӣ����ëè";
//		
		System.out.println("����:" + one.month);
		System.out.println("����:" + one.name);
		System.out.println("Ʒ��:" + one.speices);
		System.out.println("����:" + one.weight);
		
		one.run();
	}

}

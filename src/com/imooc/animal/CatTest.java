package com.imooc.animal;
//��һְ��ԭ��
public class CatTest {

	public static void main(String[] args) {
		//����ʵ����
		Cat one = new Cat(3);
	
		//one.setName("����");
		//one.setMonth(-3);
//		one.weight = 1000;
//		one.speices = "Ӣ����ëè";
//		
		if( one.getMonth()==0){
			return;
		}
		System.out.println("����:" + one.getMonth());
		//System.out.println("����:" + one.getName());
//		System.out.println("Ʒ��:" + one.speices);
//		System.out.println("����:" + one.weight);
		
		//one.run();
	}

}

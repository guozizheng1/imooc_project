package com.imooc.animal;
/**
 * ����è��
 * @author admin
 *
 */

public class Cat {

	//���ԣ��ǳơ����䡢���ء�Ʒ��
	//�޸����ԵĿɼ���--private �޶�ֻ�ڵ�ǰ���ڷ���
	private String name;//�ǳ� Ĭ��ֵΪnull
	private int month;//����  Ĭ��ֵΪ 0
	private double weight;//���� Ĭ��ֵΪ0.0
	private String speices;//Ʒ�� Ĭ��ֵΪnull
	
	public Cat(){
		//System.out.println("���������Ĺ��췽��");
	}
	
	public Cat(int month){
		//this.month = month;
		this.setMonth(month);
	}
	
	public Cat(String name, int month, double weight, String speices){
		this.name = name;
		this.month = month;
		this.weight = weight;
		this.speices = speices;
	}
	//����get/set����
	//get/set��������Ӷ����Ե��޶�
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return "����һֻ�У�" + this.name + "��";
	}
	
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<=0){
			System.out.println("������Ϣ���󣬳���è������������0");
		}else{
			this.month = month;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpeices() {
		return speices;
	}

	public void setSpeices(String speices) {
		this.speices = speices;
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

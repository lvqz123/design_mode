package com.allifinance.deepClone;

/**
 * @author: lvqz
 * @date: 2019/7/22
 * @time: 16:14
 *
 * ���¡��ʵ�����
 */
public class Client {

    public static void main(String [] args) throws CloneNotSupportedException {
        Resume rs = new Resume();

        //������������  class��interfance��Array


        rs.setName("����");
        rs.setAge(18);
        rs.setHobby(new String[]{"�Է�","˯��","�򶹶�"});

        Resume clone = (Resume) rs.clone();

        //��Ա�����ǻ����������͵ģ������¡�ı���ֵ���� ��ʲô����
        /*clone.setAge(20);

        System.out.println("rs = " + rs);
        System.out.println("clone = " + clone);*/

        //��Ա�����������������͵ģ������¡�ı���ֵ���� ��ʲô����

        String[] hobby = clone.getHobby();
        hobby[0]="����Ϸ";
        clone.setHobby(hobby);

        System.out.println("rs = " + rs);
        System.out.println("clone = " + clone);


    }

}

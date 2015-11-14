/**
 * Created by tina on 2015/10/17.
 */

package edu.buaa.sse.lesson.unittest;

public class Triangle {

    private int sidea;
    private int sideb;
    private int sidec;

    // ���캯��
    public Triangle(int sideA, int sideB, int sideC) {
        this.sidea = sideA;
        this.sideb = sideB;
        this.sidec = sideC;
    }

    public boolean isTriangle() {
        if (!compareSide(sidea, sideb, sidec))
            return false;
        if (!compareSide(sideb, sidec, sidea))
            return false;
        if (!compareSide(sidec, sidea, sideb))
            return false;
        return true;

    }

    //�������֮�ʹ��ڵ������ڷ����棬���򷵻ؼ�
    private boolean compareSide(int firstSide, int secondSide, int thirdSide) {
        if ((firstSide + secondSide) > thirdSide)
            return true;
        else
            return false;
    }

    public static void main(String [] args)
    {
        Triangle t1 = new Triangle(1,2,3);
        System.out.println(t1.isTriangle()); //false
        Triangle t2 = new Triangle(2,2,3);
        System.out.println(t2.isTriangle()); //����true
    }
}

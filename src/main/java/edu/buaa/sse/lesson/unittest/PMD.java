package edu.buaa.sse.lesson.unittest;

/**
 * Created by tina on 2015/10/30.
 */
public class PMD {

    public void addEmptyString() {
        //���ַ���+�������͵ı�������ת�����ַ��������������½���������������͵�toString������
        String s = "" + 123;
        String t = Integer.toString(456);
    }


    public String ReturnFromFinallyBlock() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K."; // ��������fianlly����return
        }
    }

    void MisplacedNullCheck() {
        String a=null;
        if (a.equals("b") && a != null) { // a��=null����·�ˡ�
            //Do Sthing
        }
    }

    public void AvoidUsingHardCodedIP() {
        String ip = "127.0.0.1"; 	// ��������������
    }


    public void UnconditionalIfStatement() {
        if (true) {		// if�����Ч
            // ...
        }
    }

    public void IfStmtsMustUseBraces(){
        boolean foo = true;
        int x =0;
        if (foo)	// ���Ƽ�
            x++;
        if (foo) {	// �Ƽ�
            x++;
        }
    }
}

package edu.buaa.sse.lesson.unittest;

/**
 * Created by tina on 2015/10/30.
 */
public class PMD {

    public void addEmptyString() {
        //空字符串+其它类型的变量将其转化成字符串。引发性能下降，最好用其它类型的toString方法。
        String s = "" + 123;
        String t = Integer.toString(456);
    }


    public String ReturnFromFinallyBlock() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K."; // 不建议在fianlly部分return
        }
    }

    void MisplacedNullCheck() {
        String a=null;
        if (a.equals("b") && a != null) { // a！=null被短路了。
            //Do Sthing
        }
    }

    public void AvoidUsingHardCodedIP() {
        String ip = "127.0.0.1"; 	// 会给部署带来问题
    }


    public void UnconditionalIfStatement() {
        if (true) {		// if语句无效
            // ...
        }
    }

    public void IfStmtsMustUseBraces(){
        boolean foo = true;
        int x =0;
        if (foo)	// 不推荐
            x++;
        if (foo) {	// 推荐
            x++;
        }
    }
}

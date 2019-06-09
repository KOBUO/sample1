package jp.co.xxx.sample.guice;

import jp.co.xxx.sample.anno.Exe;
import jp.co.xxx.sample.anno.LogTarget;

public abstract class AbstractTester implements ITester {

    protected AbstractTester(){
        System.out.println(this.getClass().getSuperclass().getAnnotation(Exe.class).label());
    }

    @LogTarget
    public ResultInfo test(boolean is){
        ResultInfo result = new ResultInfo(Status.bolOf(this.isSuccess(is)));
        return result.addMsg("a").addMsg("b");
    }

    protected abstract boolean isSuccess(boolean is);
}
package common.response;

import java.util.Map;

public class MapResponse implements Response {

    private Map result;

    private String succ;

    private String msg;

    @Override
    public Map getResult() {
        return result;
    }
    @Override
    public void setResult(Object result) {
        this.result = (Map)result;
    }
    @Override
    public String getSucc() {
        return succ;
    }
    @Override
    public void setSucc(String succ) {
        this.succ = succ;
    }
    @Override
    public String getMsg() {
        return msg;
    }
    @Override
    public void setMsg(String msg) {
        this.msg = msg;
    }

}

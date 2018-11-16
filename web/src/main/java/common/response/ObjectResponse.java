package common.response;

public class ObjectResponse implements Response {


    private Object result;


    private String succ;


    private String msg;


    public ObjectResponse(){

    }
    public ObjectResponse(String succ){
        this.succ =succ;
    }

    public Object getResult() {
        return result;
    }


    public String getSucc() {
        return succ;
    }

    public void setSucc(String succ) {
        this.succ = succ;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void setResult(Object result) {
        this.result = result;
    }



}

package response;

public class MsgResponse implements Response {

    private String result;

    private String succ;

    private String msg;


    public MsgResponse(){
        this.succ ="";
    }
    public MsgResponse(String succ){
        this.succ =succ;
    }
    @Override
    public String getResult() {
        return result;
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

    @Override
    public void setResult(Object result) {
        this.result = result.toString();
    }



}
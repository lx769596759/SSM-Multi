package response;

import java.util.List;

public class PageResponse<T> implements Response {


    private Long totalSize;


    private List<T> result;


    private String succ;


    private String msg;

    public PageResponse() {
    }


    @Override
    public String toString() {
        return "PageResp{" + "totalSize=" + totalSize + ", objects=" + result
                + '}';
    }

    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public List<T> getResult() {
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

    @SuppressWarnings("unchecked")
    @Override
    public void setResult(Object result) {
        this.result = (List<T>) result;
    }

}

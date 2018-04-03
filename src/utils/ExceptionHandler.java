package utils;

public class ExceptionHandler extends Exception {
    String msg;

    public ExceptionHandler(String m){
        msg = m;
    }

    public void setMsg(String m){
        msg = m;
    }

    public String getMsg() {
        return msg;
    }
}

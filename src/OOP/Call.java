package OOP;

public class Call {
    protected static double priceForAMinute = 0.13;


    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Call getCALL() {
        return CALL;
    }

    public void setCALL(Call CALL) {
        this.CALL = CALL;
    }

    public double getPriceForAMinute() {
        return priceForAMinute;
    }



    String caller;
    String receiver;
    int duration;

    Call CALL = new Call(){

    };

}

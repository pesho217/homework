package OOP;

public class GSM {
    String model;
    boolean hasSimcard = false;
    int outgoingCallsDuration;
    String SimMobileNumber;
    String lastincomingCall;
    String lastOutgoingCall;

    GSM(boolean hasSimcard,int outgoingCallsDuration,String SimMobileNumber,String lastincomingCall,String lastOutgoingCall){
        this.hasSimcard = hasSimcard;
        this.outgoingCallsDuration = outgoingCallsDuration;
        this.SimMobileNumber = SimMobileNumber;
        this.lastincomingCall = lastincomingCall;
        this.lastOutgoingCall = lastOutgoingCall;
    }

    public String getSimMobileNumber() {
        return SimMobileNumber;
    }

    public void setSimMobileNumber(String simMobileNumber) {
        SimMobileNumber = simMobileNumber;
    }

    public String getLastincomingCall() {
        return lastincomingCall;
    }

    public void setLastincomingCall(String lastincomingCall) {
        this.lastincomingCall = lastincomingCall;
    }

    public String getLastOutgoingCall() {
        return lastOutgoingCall;
    }

    public void setLastOutgoingCall(String lastOutgoingCall) {
        this.lastOutgoingCall = lastOutgoingCall;
    }

    public int getOutgoingCallsDuration() {
        return outgoingCallsDuration;
    }

    public void setOutgoingCallsDuration(int outgoingCallsDuration) {
        this.outgoingCallsDuration = outgoingCallsDuration;
    }

    public boolean isHasSimcard() {
        return hasSimcard;
    }

    public void setHasSimcard(boolean hasSimcard) {
        this.hasSimcard = hasSimcard;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    void insertSimCard(String SimMobileNumber) {
        if(SimMobileNumber.charAt(0) == 0 && SimMobileNumber.charAt(1) == 8){
            if(SimMobileNumber.length() == 10){
                hasSimcard = true;
            }else{
                hasSimcard = false;
            }
        }else{
            hasSimcard = false;
        }
    }

    void removeSimCard(){
        this.hasSimcard = false;
    }

    void call(GSM Receiver, int duration){
        boolean isvalid = true;
        if(duration < 0 || duration > 120){
            isvalid = false;
        } if(this.SimMobileNumber.equals(Receiver.getSimMobileNumber())){
            isvalid = false;
        }if(this.hasSimcard == false || Receiver.hasSimcard == false){
            isvalid = false;
        }
        if(isvalid == true){
            this.lastOutgoingCall = this.SimMobileNumber + " to " + Receiver.SimMobileNumber;
            Receiver.lastincomingCall = this.SimMobileNumber + " to " + Receiver.SimMobileNumber;
            this.outgoingCallsDuration =  this.outgoingCallsDuration + duration;

        }
    }
    double getSumForCall(){
        return this.outgoingCallsDuration* Call.priceForAMinute;

    }

    void printInfoForTheLastOutgoingCall(){
        System.out.println("Last outgoing call is: " + this.lastOutgoingCall);
    }

    void printInfoForTheLastIncomingCall(){
        System.out.println("Last incoming call is: " + this.lastincomingCall);
    }


}

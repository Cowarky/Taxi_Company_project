public class Call {
    private String callerNumber;
    private String receiverNumber;
    private boolean isAnswered;
    private int callTimeout = 60;  // Assuming callTimeout is represented in seconds


    public Call(String callerNumber, String receiverNumber) {
        this.callerNumber = callerNumber;
        this.receiverNumber = receiverNumber;
        this.isAnswered = false;
    }

    // Getters and setters for callerNumber, receiverNumber, isAnswered, and callTimeout
    public String getCallerNumber() {
        return callerNumber;
    }

    public void setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
    }

    public String getReceiverNumber() {
        return receiverNumber;
    }

    public void setReceiverNumber(String receiverNumber) {
        this.receiverNumber = receiverNumber;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean answered) {
        isAnswered = answered;
    }

    public int getCallTimeout() {
        return callTimeout;
    }

    public void setCallTimeout(int callTimeout) {
        this.callTimeout = callTimeout;
    }
}

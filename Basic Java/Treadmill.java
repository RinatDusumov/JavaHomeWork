public class Treadmill implements Participants {
    private boolean firstMember;
    private boolean secondParticipant;
    private boolean thirdParty;
    
    public Treadmill(boolean firstMember, boolean secondParticipant,
                     boolean thirdParty) {
        this.firstMember = firstMember;
        this.secondParticipant = secondParticipant;
        this.thirdParty = thirdParty;
    }
    public String firstMember() {
        if (firstMember) {
            return "successfully ran";
        } else {
            return "couldn't run";
        }
    }
    public String secondParticipant() {
        if (secondParticipant) {
            return "successfully ran";
        } else {
            return "couldn't run";
        }
    }
    public String thirdParty() {
        if (thirdParty) {
            return "successfully ran";
        } else {
            return "couldn't run";
        }
    }
}
public class Wall implements Participants {
    private boolean firstMember;
    private boolean secondParticipant;
    private boolean thirdParty;

    public Wall(boolean firstMember, boolean secondParticipant,
                     boolean thirdParty) {
        this.firstMember = firstMember;
        this.secondParticipant = secondParticipant;
        this.thirdParty = thirdParty;
    }
    public String firstMember() {
        if (firstMember) {
            return "successfully jumped";
        } else {
            return "failed to complete all jumps";
        }
    }
    public String secondParticipant() {
        if (secondParticipant) {
            return "successfully jumped";
        } else {
            return "failed to complete all jumps";
        }
    }
    public String thirdParty() {
        if (thirdParty) {
            return "successfully jumped";
        } else {
            return "failed to complete all jumps";
        }
    }
}
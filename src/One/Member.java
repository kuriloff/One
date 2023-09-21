package One;

public class Member {
    private char memberType; private int memberID; private String name; private double fees;

    public Member(char pMemberType, int pMemberID, String pName, double pFees) {
        memberType = memberType;
        memberID = memberID;
        name = name;
        fees = fees;
    }

    public char getMemberType() {
        return memberType;
    }

    public void setMemberType(char memberType) {
        this.memberType = memberType;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberType=" + memberType +
                ", memberID=" + memberID +
                ", name='" + name + '\'' +
                ", fees=" + fees +
                '}';
    }
}

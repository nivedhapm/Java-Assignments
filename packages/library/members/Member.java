package packages.library.members;

public class Member {
    private String name;
    private String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() { return name; }

    public String getMemberId() { return memberId; }

    public void displayInfo() {
        System.out.println("Member: " + name + " | ID: " + memberId);
    }
}

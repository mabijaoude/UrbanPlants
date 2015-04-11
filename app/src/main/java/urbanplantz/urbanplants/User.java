package urbanplantz.urbanplants;

/**
 * Created by Marc-James on 11/04/2015.
 */
public class User {
    public String email;
    public String displayName;
    public String password;
    public byte rank; //perhaps use an integer and table that defines ranks 1. ForgingKing 2. ForgingDuke etc
    public int discoveries;
    public int confirmations;

    public User(String email, String displayName, String password, byte rank, int discoveries, int confirmations) {  //cheapo test constructor
        this.email = email;
        this.displayName = displayName;
        this.password = password;
        this.rank = rank;
        this.discoveries = discoveries;
        this.confirmations = confirmations;
    }

}

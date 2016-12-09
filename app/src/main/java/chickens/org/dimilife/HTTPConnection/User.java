package chickens.org.dimilife.HTTPConnection;

/**
 * Created by JunHyeok on 2016. 12. 9..
 */

public class User {

    private String createdAt;
    private String email;
    private String gender;
    private int id;
    private String name;
    private String nick;
    private Object passwordHash;
    private String photofile1;
    private Object photofile2;
    private String ssoToken;
    private int status;
    private String updatedAt;
    private String user_Type;
    private String username;


    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public void setPasswordHash(Object passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Object getPasswordHash() {
        return this.passwordHash;
    }

    public void setPhotofile1(String photofile1) {
        this.photofile1 = photofile1;
    }

    public String getPhotofile1() {
        return this.photofile1;
    }

    public void setPhotofile2(Object photofile2) {
        this.photofile2 = photofile2;
    }

    public Object getPhotofile2() {
        return this.photofile2;
    }

    public void setSsoToken(String ssoToken) {
        this.ssoToken = ssoToken;
    }

    public String getSsoToken() {
        return this.ssoToken;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUserType(String user_Type) {
        this.user_Type = user_Type;
    }

    public String getUserType() {
        return this.user_Type;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }
}

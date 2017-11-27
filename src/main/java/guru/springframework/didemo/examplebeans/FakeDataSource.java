package guru.springframework.didemo.examplebeans;

public class FakeDataSource {
    private String user;
    private String password;
    private String url;
    private String javaHome;

    public String getJavaHome() {
        return javaHome;
    }

    public void setJavaHome(String javaHome) {
        this.javaHome = javaHome;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public FakeDataSource() {
        System.out.println("## I'm in the FakeDataSource Constructor");
    }
}

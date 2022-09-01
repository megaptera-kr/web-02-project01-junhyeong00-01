package models;

public class Seller {
    private long userId;
    private String userNickname;

    public Seller(long userId, String userNickname) {

        this.userId = userId;
        this.userNickname = userNickname;
    }

    public long userId() {
        return userId;
    }

    public String userName() {
        return userNickname;
    }

    public void login(long id, String userNickname) {
        this.userId = id;
        this.userNickname = userNickname;
    }

    public void logout() {
        this.userId = -1;
        this.userNickname = "";
    }

    public void edit(Post post, String postTitle, String postContent, String category, long secondHandItemPrice) {
        post.change(postTitle, postContent, category, secondHandItemPrice);
    }
}

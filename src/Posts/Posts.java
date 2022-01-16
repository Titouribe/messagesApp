package Posts;

public class Posts {

    int post_id;
    String post;
    String post_author;
    String post_date;

    public Posts(){

    }

    public Posts(String post, String post_author, String post_date) {
        this.post = post;
        this.post_author = post_author;
        this.post_date = post_date;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPost_author() {
        return post_author;
    }

    public void setPost_author(String post_author) {
        this.post_author = post_author;
    }

    public String getPost_date() {
        return post_date;
    }

    public void setPost_date(String post_date) {
        this.post_date = post_date;
    }
}

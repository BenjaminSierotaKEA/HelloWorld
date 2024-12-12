package MiniSoMe;

public class Post {
    private String content;
    private User author;
    private int likes;

    public Post(String content, User author){
        this.content = content;
        this.author = author;
        this.likes = 0;
    }

    public void like(){
        likes++;
    }

    @Override
    public String toString(){
        return "--------------------\n" + author.getUserName() + " says: \n" + content + "\n ------------------ \n Likes:" + likes;
    }

}

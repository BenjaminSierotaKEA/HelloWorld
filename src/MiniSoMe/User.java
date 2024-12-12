package MiniSoMe;

import java.util.ArrayList;

public class User {
    private String userName;
    private ArrayList<User> friends;
    private ArrayList<Post> posts;

    public User(String userName){
        this.userName = userName;
        this.friends = new ArrayList<User>();
        this.posts = new ArrayList<Post>();
    }


    public void addFriend(User friendToAdd){
        boolean add = true;
        for(User u: friends){
            if(u.equals(friendToAdd)){
                add= false;
            }
        }
        if (add){
            friends.add(friendToAdd);
        }
    }

    public void createPost(String content){
        posts.add(new Post(content, this));
    }

    public String getUserName(){
        return userName;
    }

    public void printFriendsPosts(){
        for(User friend: friends){
            friend.printPosts();
        }
    }

    public void printPosts(){
        for(Post p: posts){
            System.out.println(p);
        }
    }

    public ArrayList<Post> getPosts(){
        return posts;
    }

}

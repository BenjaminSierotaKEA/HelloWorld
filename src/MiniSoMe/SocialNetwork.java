package MiniSoMe;

import java.util.ArrayList;
import java.util.Random;

public class SocialNetwork {
    private ArrayList<User> users;

    public SocialNetwork(){
        users = new ArrayList<User>();
    }
    public void addUser(User user){
        users.add(user);
    }

    public void showFriendsPosts(User user){
        user.printFriendsPosts();
    }

    public ArrayList<User> getUsers(){
        return users;
    }

    public static void main(String[] args) {

        //Oprette flere brugere
        SocialNetwork socialNetwork = new SocialNetwork();
        User mrSwag = new User("MrSwag");
        socialNetwork.addUser(mrSwag);
        User dangerousBacon = new User("Dangerous Bacon");
        socialNetwork.addUser(dangerousBacon);
        User teaSpiller = new User("Tea Spiller");
        socialNetwork.addUser(teaSpiller);

        //adding them as friends
        mrSwag.addFriend(dangerousBacon);
        mrSwag.addFriend(teaSpiller);
        dangerousBacon.addFriend(mrSwag);
        teaSpiller.addFriend(mrSwag);

        //Making posts:
        mrSwag.createPost("I have loads of swag");
        dangerousBacon.createPost("mr Swag doesnt have that much swag, \n He's a liar!! :(");
        teaSpiller.createPost("I actually think mr Swag does have that much swag\n" +
                "Dangerous Bacon is the liar here.");

        //Liking posts:
        for(User u: socialNetwork.getUsers()){
            for(Post p : u.getPosts()){
                Random random = new Random();
                int max = random.nextInt(0, 100);
                for(int i = 0; i < max; i ++){
                    p.like();
                }
            }
        }

        //printing a friends posts:
        mrSwag.printFriendsPosts();

    }

}

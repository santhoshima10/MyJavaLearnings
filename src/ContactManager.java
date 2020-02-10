public class ContactManager {

    Contact[] myFriends;
    int friendsCount;

    public ContactManager(){
        this.friendsCount =0;
        this.myFriends = new Contact[500];
    }

    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;

    }

    Contact searchContact(String searchName){

        for(int i = 0; i< myFriends.length;i++){
           if( myFriends[i].name.equals(searchName)){
               return myFriends[i];
            }
        }
        return null;
    }
}

package String;


/*
Here look at the bellow code it will be doing as a ab abc abcd .....
now at the end the only string that will have in series is abcdefgh....z and others have no any reference pointing
to it , i.e. the wasteage of memory
 */

// THIS IS SOLVED BY THE STRING BUILDER

public class Performance {
    public static void main(String[] args) {
        String series="";
        for(int i=0; i<26; i++){
            char ch=(char)('a'+i);
            series +=ch;
        }
        System.out.println(series);
    }
}

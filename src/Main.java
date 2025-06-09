public class Main {
    public static void main (String[] args){
        String message = "Hello Java!";

        System.out.println(message.length());

        //대문자 변환
        System.out.println(message.toUpperCase());

        //소문자 변환
        System.out.println(message.toLowerCase());

        System.out.println(message.indexOf("a"));

        for(int i = 0; i< message.length(); i++){

            if(message.charAt(i) == 'a'){
                System.out.println(message.charAt(i));
                break;
            }

        }

    }
}
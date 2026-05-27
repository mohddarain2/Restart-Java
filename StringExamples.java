public class StringExamples {
    public static void main(String[] args){
        String str = "Hello How Are You Darain";
        System.out.println(str.length());
        System.out.println(str.substring(10));
        System.out.println(str.replace("Hello", "Hi"));
        System.out.println(str.isEmpty());

        char[] charArray = {'D','A','R','A','I','N'};
        String str2 = new String(charArray);
        System.out.println(str2);
    }
}

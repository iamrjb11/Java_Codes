
class StringDigitsFrequency {
    public static void main(String args[])
    {
        String str="112134";
        //int num=123727;
        //str=String.valueOf(num);
        String ans=frequency(str); 
        System.out.println(str);
        for(int i=0;i<ans.length();i=i+2)
            System.out.println(ans.charAt(i)+" -> "+ans.charAt(i+1));
        
    }
    //this frequency method is static cz main method is a static
    public static String frequency(String s){
        String ans = "";
        int i = 0;
        while(i < s.length()){
            int c=0,j=i;
            while(j < s.length() ){
                if(s.charAt(i) !='0' && s.charAt(i) == s.charAt(j)){
                    c++;  
                }
                j++;
            }
            //String.valueOf() method convert any type to string
            if(s.charAt(i) !='0') ans +=  String.valueOf(s.charAt(i)) + String.valueOf(c);// value frequency 
            
            s=s.replace(s.charAt(i),'0');
            i++;
            System.out.println("i:"+i+" "+ans);
        }
        System.out.println("--");
        return ans;
    }
}

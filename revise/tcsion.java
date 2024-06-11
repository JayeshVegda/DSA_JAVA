public class tcsion {
    public static void main(String[] args) {
        String sc = "JayeshVegda";
        StringBuilder sco = new StringBuilder(); 
        int n = sc.length();
        for(int i =0; i<n; i++)
        {
          char curr = sc.charAt(i);
          for(int j = i; j<n; j++){
            if(curr != sc.charAt(j)){
                sco.append(j);
            }
          }
        }

        System.out.println(sco.toString());
    }
}

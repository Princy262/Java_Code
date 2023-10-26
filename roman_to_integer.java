class Solution 

{

    

    private static final Map<Character,Integer> map = new HashMap<Character,Integer>();Integer>()

{{

    put('I', 1);

    put('V', 5);

    put('X', 10);

    put('L', 50);

    put('C', 100);

    put('D', 500);

    put('M', 1000);

}};

    // Finds decimal value of a given roman numeral

    public int romanToDecimal(String s) 

    {

        // code here

        

        int r=0;

        int n=s.length();

        

        for(int i=0;i<n;i++)

        {

            

          if (i != n - 1 &&

            map.get(s.charAt(i)) <

            map.get(s.charAt(i + 1)))

           {

              r=r+(map.get(s.charAt(i + 1)) -map.get(s.charAt(i)));          

              i++;

           }

          else

           {

             r+= map.get(s.charAt(i));

           }

        }

        

        return r;

        

    }

}

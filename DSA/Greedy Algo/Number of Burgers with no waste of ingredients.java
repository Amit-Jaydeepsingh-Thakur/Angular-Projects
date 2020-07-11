Link-https://leetcode.com/problems/number-of-burgers-with-no-waste-of-ingredients/submissions/

class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) 
    {
      int i=0,j=0,ret1=0,ret2=0,flag=0;
      List<Integer>list=new ArrayList<>();
      
      if(tomatoSlices%2!=0)
      {
        return(list);
      }
      if(cheeseSlices==0)
      {
        list.add(0);
        list.add(0);
        return(list);
      }
      //maxJumbo=tomatoSlices/4;
      //maxSmall=tomatoSlices/2;
      ret1=(tomatoSlices/2)-cheeseSlices;
      ret2=2*cheeseSlices-(tomatoSlices/2);
      if(ret1<0 || ret2<0)
      {
        return(list);
      }
      list.add(ret1);
      list.add(ret2);
      
      return(list);
    }
}

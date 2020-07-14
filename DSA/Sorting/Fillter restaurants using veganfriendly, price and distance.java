Link-https://leetcode.com/problems/filter-restaurants-by-vegan-friendly-price-and-distance/submissions/

class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) 
    {
      
      int i=0,j=0,id=0,rating=0,vegan=0,price=0,dist=0;
      List<Integer>list=new ArrayList<>();
      Map<Integer,int[]>map=new HashMap<>();
      if(restaurants==null || restaurants.length==0)
      {
        return(list);
      }
      for(int []r:restaurants)
      {
          if(r[2]>=veganFriendly && r[3]<=maxPrice && r[4]<=maxDistance)
          {
            list.add(r[0]);
            map.put(r[0],r);
          } 
      }
      Collections.sort(list,(a,b)->{
        if(map.get(a)[1]==map.get(b)[1])
        {
          return(b-a);
        }
        else
        {
          return(map.get(b)[1]-map.get(a)[1]);
        }
      });
      
      return(list);
        
    }
}

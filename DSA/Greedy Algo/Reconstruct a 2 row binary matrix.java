Link-https://leetcode.com/problems/reconstruct-a-2-row-binary-matrix/

class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) 
    {
      int i=0,j=0,num=0,top=0,bottom=0,flag=0,p1=0,p2=0,u1=0,u2=0;
      u1=upper;
      u2=lower;
      //top=upper;
      //bottom=lower;
      List<List<Integer>>list=new ArrayList<>();
      int arr[][];
      arr=new int[2][colsum.length];
      
      for(i=0;i<colsum.length;i++)
      {
        num=colsum[i];
        if(num==2)
        {
          upper--;
          lower--;
          flag=1;
        }
        else if(num==1)
        {
          if(upper>=lower)
          {
            upper--;
            flag=2;
          }
          else
          {
            lower--;
            flag=3;
          }
        }
        else if(num==0)
        {
          continue;
        }
        
        if(flag==1)
        {
          for(j=0;j<2;j++)
          {
            arr[j][i]=1;
          }
        }
        else if(flag==2)
        {
          arr[0][i]=1;
        }
        else if(flag==3)
        {
          arr[1][i]=1;
        }
      }
      if(upper<0 || lower<0)
      {
        return(list);
      }
      j=0;
      for(int []prr:arr)
      {
        List<Integer>p=new ArrayList<>(); 
        for(i=0;i<prr.length;i++)
        {
          if(j==0 && prr[i]==1)
          {
            p1++;
          }
          else if(j==1 && prr[i]==1)
          {
            p2++;
          }
          p.add(prr[i]);
        }
        j++;
        list.add(p);
      }
      
      if(p1==u1 && p2==u2)
      {
        return(list);
      }
      return(new ArrayList<>());
    }
}

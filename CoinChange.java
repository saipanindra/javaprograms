class CoinChange 
{
    int[] d;
    int n;
    int[][] table;
    CoinChange(int[] _d, int _n)
    {
        d = _d;
        n = _n;
        table = new int[n+1][d.length];
    }
    int numberOfWays()
    {
        for(int i = 0 ; i <= n; i++)
        {
            for(int j = 0 ; j < d.length ; j++)
            {
                if(i==0) table[i][j] = 1;
                else if(j==0)
                {
                	if(d[j] <= i) table[i][j] = table[i-d[j]][j];
                	else table[i][j] = 0;
                }
                else if(d[j] > i) table[i][j] = table[i][j-1];
                else table[i][j] = table[i][j-1] + table[i-d[j]][j];
                    }
        }
        return table[n][d.length-1];
    }
    public static void main(String[] args)
    {
        CoinChange c = new CoinChange(new int[]{23,5,2}, 380134);
        System.out.println(c.numberOfWays());
    }
}
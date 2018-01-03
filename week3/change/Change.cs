using System

namespace Change
{
    class Change
    {
        private static int GetChange(int m)
        {
            int[] coins = {10, 5, 1};
            int count = 0;

            for (int i = 0; m > 0; i++)
            {
                count += m / coins[i];
                m %= coins[i];
            }
            return count;
        }

        public static void Main(String[] args)
        {
            int n = int.Parse(Console.Readline());
            System.Console.WriteLine(GetChange(n));
        }
    }
}
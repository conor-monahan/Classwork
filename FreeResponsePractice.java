
public class FreeResponsePractice
{
// 2017 Free Response Problems
// Question 1a.
        public Digit(int num)
        {
            digitList = new ArrayList<Integer>();
            if (num == 0)
            {
                digitList.add(new Integer(0));
            }
            while (num > 0)
            {
                digitList.add(0, new Integer(num % 10));
                num /= 10;
            }
        }

// Question 1b.
        public boolean isStrictlyincreasing()
        {
            for (int i = 0; i < digitList.size()-1; i++)
            {
                if (digitList.get(i).intValue() >= digitList.get(i+1).intValue())
                {
                    return false;
                }
            }
            return true;
        }
        
// Question 2.
        public class Multpractice implements StuPrac
        {
            private int first;
            private int second;
            public Multpractice(int n1, int n2)
            {
                first = n1;
                second = n2;
            }
            public String getProblem()
            {
                return first + " times " + second;
            }
            public void nextProblem()
            {
                second++;
            }
        }
}

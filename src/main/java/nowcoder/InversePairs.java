package nowcoder;

public class InversePairs {
    public int inversePairs (int[] array){
        int count = 0;
        int num1, num2 = 0;
        for (int i=0;i<array.length;i++) {
            num1 = array[i];
            for (int j=i+1;j<array.length;j++) {
                num2 = array[j];
                if (num1 > num2){
                    count++;
                }
            }
        }
        return count % 1000000007;
    }
    public static void main(String[] args){
        InversePairs inversePairs = new InversePairs();
        long startime =System.currentTimeMillis();
        int[] array = {364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,
                355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,
                746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,
                983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,
                433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575};
        int result = inversePairs.inversePairs(array);
        System.out.println(result);
        long endtime = System.currentTimeMillis();
        System.out.println((endtime-startime));
    }
}

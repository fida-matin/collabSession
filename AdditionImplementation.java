import java.util.ArrayList;

public class AdditionImplementation implements Addition {
    // default constructor
    public AdditionImplementation() {
    }

    private ArrayList<Integer> nums = new ArrayList<Integer>();

    // adds two numbers named num1 and num2 and returns the result
    public int sum2nums(int num1, int num2) {
        // as can be seen in line 8, the implementation requires one line
        return num1 + num2;
    }

    // this is a new function :)
    public void appendToNums(int num) {
        nums.add(num);
    }

    public void printNums() {
        System.out.println(nums);
    }
}
class Solution {
    public int calPoints(String[] operations) {
        // Using ArrayList

        List<Integer> list = new ArrayList<>();

        for(String op : operations) {
            if(op.equals("C")){
                list.remove(list.size()-1);
            } else if(op.equals("D")) {
                list.add(2 * list.get(list.size() - 1));
            } else if(op.equals("+")) {
                list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
            } else {
                list.add(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for(int num : list) {
            sum += num;
        }

        return sum;

        // Using Stack

        // Stack<Integer> stack = new Stack<>();

        // for(String op : operations) {
        //     if(op.equals("C")) {
        //         stack.pop();
        //     } 
        //     else if(op.equals("D")) {
        //         stack.push(2 * stack.peek());
        //     } 
        //     else if(op.equals("+")) {
        //         // find find n-1 & n-2 for sum

        //         int top = stack.pop();                // n-1
        //         int second = stack.peek();            // n-2

        //         stack.push(top);                      // push n-1 bcz.. before pop this element.
        //         stack.push(top + second);
        //     } 
        //     else {
        //         stack.push(Integer.parseInt(op));
        //     }
        // }

        // int sum = 0;

        // for(int num : stack) {
        //     sum += num;
        // }

        // return sum;
    }
}
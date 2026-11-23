class ProductOfNumbers {
    ArrayList<Integer> list = new ArrayList<>();
    public ProductOfNumbers() {
        list.clear();
    }
    
    public void add(int num) {
        if(num == 0) {
            list.clear();
            return;
        }

        int previous;

        if(list.size() == 0) {
            previous = 1;
        }
        else {
            previous = list.get(list.size()-1);
        }

        list.add(previous * num);
    }
    
    public int getProduct(int k) {
        int s = list.size();
        if(s < k) return 0;
        else if(s == k) {
            return list.get(s-1);
        } 
        else {
            return (list.get(s-1) / list.get(s-1-k));
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
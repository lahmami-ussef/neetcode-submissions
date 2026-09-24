class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> tmp_stack= new Stack<>();
    public MinStack() 
    {
    }
    
    public void push(int val) {
        if(stack.isEmpty() && tmp_stack.isEmpty())
        {
            stack.push(val) ; tmp_stack.push(val);
        }
        else{
            stack.push(val);
            if(tmp_stack.peek()>val){
                tmp_stack.push(val);
            }
            else 
            tmp_stack.push(tmp_stack.peek());
        }
    }
    
    public void pop() {
        stack.pop();
        tmp_stack.pop();        
        
    }
    
    public int top() {
       return stack.peek(); 
    }
    
    public int getMin() {
        return tmp_stack.peek();
       
        
    }
}

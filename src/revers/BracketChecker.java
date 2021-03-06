package revers;

public class BracketChecker {
    private String input;

    public BracketChecker(String in) {
        this.input = in;
    }

    public void check(){
        int stackSize = input.length();
        StackX stack = new StackX(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            switch (ch){
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!stack.isEmpty()){
                        char chx = stack.pop();
                        if ((ch=='}' && chx!='{') ||
                            (ch==']' && chx!='[') ||
                            (ch==')' && chx!='(') ){
                            System.out.println("Error: "+ch+" at "+i);
                        }
                        else{
                            System.out.println("Error: "+ch+" at "+i);
                        }
                        break;
                    }
                    default:
                        break;
            }
        }
        if( !stack.isEmpty() )
            System.out.println("Error: missing right delimiter");
    }
}

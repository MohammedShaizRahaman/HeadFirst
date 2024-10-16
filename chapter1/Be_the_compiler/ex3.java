class ex3{
    public static void main(String args[]){
        int x = 5; // x is 5
        while(x > 1){ // when x is greater than 1
            x = x-1; // x is reduced by 1
            if(x < 3){ // when x less than 3
                System.out.println("small x"); // print x
            }
        }
    }
}

// 5 -> 5>1(t) -> x=4 -> 4<3(f)
// 4 -> 4>1(t) -> x=3 -> 3<3(f)
// 3 -> 3>1(t) -> x=2 -> 2<3(t) -> small x
// 2 -> 2>1(t) -> x=1 -> 2<3(t) -> small x
// 1 -> 1>1(f)
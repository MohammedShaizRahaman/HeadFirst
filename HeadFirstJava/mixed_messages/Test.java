class Test{
    public static void main(String [] args){
        int x = 0;
        int y = 0;
        while(x < 5){
            // y = x-y;
            y = y + x;
            System.out.print("( " + x + " " + y + " )" + " ");
            x = x + 1;
        }
    }
}
// x=0 y=0 -> 0<5(t) -> y = 0-> print(0 0) -> x = 1;
// x=1 y=0 -> 1<5(t) ->y = 1 ->print(1, 1) -> x = 2;
// x=2 y=1 -> 2<5(t) -> y= 1 -> print(2, 1)-> x= 3;
// x=3 y=1 ->3<5(t) -> y=2 -> print(3, 2) -> x= 4;
// x=4 y=2 -> 4<5(t) -> y=2 -> print(4, 2) -> x= 5;
// x=5 y=2 -> 5<5(f)
x=0 y=0 -> 0<5(t) -> y = 0-> print(0 0) -> x = 1;
x=1 y=0 -> 1<5(t) ->y = 1 ->print(1, 1) -> x = 2;
x=2 y=1 -> 2<5(t) -> y= 3 -> print(2, 3)-> x= 3;
x=3 y=3 ->3<5(t) -> y=6 -> print(3, 6) -> x= 4;
x=4 y=4 -> 4<5(t) -> y=8 -> print(4, 8) -> x= 5;
x=5 y=2 -> 5<5(f)
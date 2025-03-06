// public class classwork {
//     public static void main(String[] args){
//     int[] number={10,20,30,40,50};
//     for(int i=0;i<number.length;i++){
//         System.out.println("element at indexed "+i+":"+number[i]);
//     }
// }
// }

public class classwork{
    public static void main(String[] args){
        int[] number=new int[5];
        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;
        System.out.println("Static Array Element");
        for(int i=0;i<number.length;i++){
            System.out.println("Element at index "+i+":"+number[i]);
        }
    }
}

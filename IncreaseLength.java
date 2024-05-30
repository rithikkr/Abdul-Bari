public class IncreaseLength {
    
    public static void main(String[] args) {
        int ages[] = {4, 5, 7, 1};
        int dog[] = new int[ages.length + 4]; //how many size you have to increase define here

        for(int i = 0; i < ages.length; i ++){
            dog[i] = ages[i];
        }
        ages = dog;

        for(int i = 0; i < ages.length; i ++){ //you can print dogs and ages both, they can give same kind of result
            System.out.println(ages[i]);
        }
    }
    
}

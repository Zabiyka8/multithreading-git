public class MaxThread implements Runnable{
    private int[] array;
    private String name;

    public MaxThread(int[] array, String name) {
        this.array = array;
        this.name = name;
    }

    @Override
    public void run(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Максимальное значение массива " + name + ": " + max);
    }

}

public class MinThread implements Runnable{
    private int[] array;
    private String name;

    public MinThread(int[] array, String name) {
        this.array = array;
        this.name = name;
    }

    @Override
    public void run(){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Минимальное значение массива " + name + ": " + min);
    }

}

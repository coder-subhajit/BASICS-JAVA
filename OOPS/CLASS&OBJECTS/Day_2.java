class Computer {
    public void playMusic(){
        System.out.println("Music is Playing...");
    }
    public String name(){
        return "Subha...";
    }
}
    public class Day_2{
        public static void main(String[] args) {
            Computer obj=new Computer();
            obj.playMusic();
            System.out.println(obj.name());

        }
    }


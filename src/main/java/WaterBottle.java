public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int currentVolume(){
        return this.volume;
    }
    public void minusTen(){
       this.volume = this.volume -10;
    }

    public void empty(){
        this.volume = 0;
    }

    public void fillToFullVolume(){
        this.volume = 100;
    }

}



public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isCheck()) {
            if(isStart()) {
                System.out.println("Yarışmaya " + this.f1.name + " başlıyor.");
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("======== YENİ ROUND ===========");

                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }
                else
                {
                    System.out.println("Yarışmaya " +this.f2.name + " başlıyor.");
                    while (this.f1.health > 0 && this.f2.health > 0){

                        System.out.println("======== YENİ ROUND ===========");
                        this.f1.health = this.f2.hit(this.f1);
                        if (isWin()) {
                            break;
                    }
                        this.f2.health = this.f1.hit(this.f2);
                        if (isWin()) {
                            break;
                        }
                        printScore();
                    }
                }
            }
        else
        {
            System.out.println("Sporcuların sikletleri birbirine uymamaktadır.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı.");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name+ " kazandı");
            return true;
        }
        return false;
    }
    boolean isStart(){
        double randomNumber = Math.random() * 100;
        return  randomNumber<=50;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}



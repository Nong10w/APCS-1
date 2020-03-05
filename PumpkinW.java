public class PumpkinW {

    public int weight;

    public static void getTotalInformation() {
        System.out.println("Total number: " + PumpkinW.getTotalWeight()
                + "\nTotal weight: " + PumpkinW.getTotalNumber());
    }

    public static class totalWeight {
        int totalW = 0;
        public int getTotalWeight() {
            return totalW;
        }
        public void addWeight(int newWeight) {
            totalW = newWeight;
        }
    }

    public static class totalNumber {
        int totalN = 0;
        public int getTotalNumber() {
            return totalN;
        }
        public static void addNum() {
            ++totalN;
        }
    }

    public PumpkinW(int w) {
        this.weight = w;
        PumpkinW.totalWeight.addWeight(w);
        PumpkinW.totalNumber.addNum();
    }

    public int getWeight() {
        return this.weight;
    }

}

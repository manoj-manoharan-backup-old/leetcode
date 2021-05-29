package leetcode;

class ParkingSystem {

    int bigCartSlots = 0;
    int mediumCartSlots = 0;
    int smallCartSlots = 0;

    public ParkingSystem(int big, int medium, int small) {
        this.bigCartSlots = big;
        this.mediumCartSlots = medium;
        this.smallCartSlots = small;
    }

    public boolean addCar(int carType) {

        boolean isCartAllowed = false;

        switch (carType) {
            case 1:
                if (this.bigCartSlots > 0) {
                    isCartAllowed = true;
                    this.bigCartSlots--;
                }
                break;
            case 2:
                if (this.mediumCartSlots > 0) {
                    isCartAllowed = true;
                    this.mediumCartSlots--;
                }
                break;
            case 3:
                if (this.smallCartSlots > 0) {
                    isCartAllowed = true;
                    this.smallCartSlots--;
                }
                break;
            default:
                break;
        }

        return isCartAllowed;
    }
}


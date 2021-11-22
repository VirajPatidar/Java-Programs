class CarClass {
    public int speedLimit() {
        return 100;
    }
}
class Ford extends CarClass {
    public int speedLimit() {
        return 150;
    }
    public static void main(String args[]) {
    	CarClass obj = new Ford();
    	int num= obj.speedLimit();
    	System.out.println("Speed Limit is: "+num);
    }
}
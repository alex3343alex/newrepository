package Test;

public class Device {
    public long serialNumber;
    public String brand;
    public String info;
    public int price;

    public Device() {

    }

    public Device(long serialNumber, String brand, String info, int price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.info = info;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Device{" +
                "serialNumber  " + serialNumber +
                ", brand '" + brand + '\'' +
                ", info  '" + info + '\'' +
                ", price  " + price +
                '}';
    }
}

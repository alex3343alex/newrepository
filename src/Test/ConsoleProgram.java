package Test;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

public class ConsoleProgram {
    public static void main(String[] args) {
        DeviceManager deviceManager = new DeviceManager();

        do {
            System.out.println("Enter number to get : \n 1 = get ArrayList \n " +
                    "2 + device number (to get device) \n " +
                    "3 to get sorted list by brand name\n" +
                    "4 to get devices wih price > 400\n" +
                    "5 to get device with serial number with 0 and price < 800\n" +
                    "6 to get the most expensive device\n" +
                    "7 Exit");

            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    PrintArrayOfDevices(deviceManager.GetDevices());
                    break;
                case 2:
                    System.out.println("Enter the serial number of device:");
                    Device device = deviceManager.GetDeviceBySerialNumber(new Scanner(System.in).nextInt());
                    if(device == null) {
                        System.out.println("Not found");
                    } else {
                        System.out.println(device);
                    }
                    break;
                case 3:
                    PrintArrayOfDevices(deviceManager.GetSortedDevicesByBrandName());
                    break;
                case 4:
                    PrintArrayOfDevices(deviceManager.GetDevicesWithPriceGreaterThan(400));
                    break;
                case 5:
                    PrintArrayOfDevices(deviceManager.GetDevicesWithSerialNumberAndPriceLessThan('0', 800));
                    break;
                case 6:
                    System.out.println(deviceManager.GetTheMostExpensiveDevice());
                    break;
                case 7:
                    exit(0);
                    break;
                default:
                    System.out.println("Not recognized command");
            }
        } while (true);
    }

    private static void PrintArrayOfDevices(ArrayList<Device> devices) {
        for (Device device : devices) {
            System.out.println(device);
        }
    }
}

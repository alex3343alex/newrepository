package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class DeviceManager {
    private ArrayList<Device> _devices;

    public DeviceManager() {
       this.LoadDevices();
    }

    public ArrayList<Device> GetDevices() {
        return this._devices;
    }

    public Device GetDeviceBySerialNumber(int serialNumber) {
        for (Device device : _devices) {
           if(device.serialNumber == serialNumber) {
               return  device;
           }
        }

        return null;
    }

    public ArrayList<Device> GetDevicesWithPriceGreaterThan(int price) {
        ArrayList<Device> result = new ArrayList<>();
        for (Device device : _devices) {
            if(device.price > price) {
               result.add(device);
            }
        }

        return result;
    }

    public Device GetTheMostExpensiveDevice() {
        Device result = new Device();

        for (Device device : _devices) {
            if(device.price > result.price) {
                result = device;
            }
        }

        return result;
    }

    public ArrayList<Device> GetDevicesWithSerialNumberAndPriceLessThan(char sign, int price) {
        ArrayList<Device> result = new ArrayList<>();

        for (Device device : _devices) {
            String sNumber = Long.toString(device.serialNumber);

            if(device.price < price && sNumber.indexOf(sign) != -1) {
                result.add(device);
            }
        }

        return result;
    }

    public ArrayList<Device> GetSortedDevicesByBrandName() {
        ArrayList<Device> result = new ArrayList<>(_devices);

        result.sort((s1, s2) -> s1.brand.compareToIgnoreCase(s2.brand));

        return result;
    }

    private void LoadDevices() {
        _devices = new ArrayList<>();
        URL path = ConsoleProgram.class.getResource("devices.txt");
        File file = new File(path.getFile());
        Scanner input;
        try {
            input = new Scanner(file);
            input.useDelimiter(",|\r\n");

            while(input.hasNext()) {
                long serialNumber = input.nextLong();
                String brand = input.next();
                String info = input.next();
                int price = input.nextInt();
                Device newDevice = new Device(serialNumber, brand, info, price);

                _devices.add(newDevice);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        }
    }
}

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Computers {
    private Fabricators fabricator;
    private Cpu cpu;
    private int amountOfRAM;
    private LocalDate dateOfManufacture;
    private int price;

    public void setFabricator() {
        switch (ThreadLocalRandom.current().nextInt(1, 3)) {
            case 1:
                this.fabricator = Fabricators.Acer;
                break;
            case 2:
                this.fabricator = Fabricators.Dell;
                break;
            case 3:
                this.fabricator = Fabricators.Apple;
                break;
        }
    }

    public void setCpu() {
        switch ((int) (Math.random() * 3 + 1)) {
            case 1:
                this.cpu = Cpu.AMD_Ryzen;
                break;
            case 2:
                this.cpu = Cpu.AMD_EPYC;
                break;
            case 3:
                this.cpu = Cpu.Intel_Xeon;
                break;
        }
    }

    public void setAmountOfRAM() {
        this.amountOfRAM = ThreadLocalRandom.current().nextInt(2, 4) * 8;
    }

    public void setDateOfManufacture() {
        this.dateOfManufacture = LocalDate.now().minusDays(ThreadLocalRandom.current().nextInt(30, 60));
    }

    public void setPrice() {
        switch (this.cpu) {
            case AMD_Ryzen:
                this.price = 10000;
                break;
            case AMD_EPYC:
                this.price = 15000;
                break;
            case Intel_Xeon:
                this.price = 20000;
                break;
        }
    }

    public void computerDataOutput() {
        if (fabricator == Fabricators.Dell) {
            System.out.println("Производитель - " + fabricator);
            System.out.println("Процессор - " + cpu);
            System.out.println("Объем оперативной памяти - " + amountOfRAM);
            System.out.println("Дата изготовления - " + dateOfManufacture);
            System.out.println("Цена - " + price);
            System.out.println();
        }
    }
}

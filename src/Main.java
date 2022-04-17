
public class Main {

    public static void main(String[] args) {
        //task1();
        task2();
    }

    /**
     * Определить компьютер, изготовленный фирмой Dell с
     * минимальной ценой и вывести все сведения о нем.
     *
     * Производитель
     * Процессор
     * Объем оперативной памяти
     * Дата изготовления
     * Цена
     */
    private static void task1(){
        Computers computer1 = new Computers();
        Computers computer2 = new Computers();
        Computers computer3 = new Computers();

        fillComputerData(computer1);
        fillComputerData(computer2);
        fillComputerData(computer3);

        ifComputerDellDataOutput(computer1);
        ifComputerDellDataOutput(computer2);
        ifComputerDellDataOutput(computer3);
    }

    private static void fillComputerData(Computers computer){
        computer.setFabricator();
        computer.setCpu();
        computer.setAmountOfRAM();
        computer.setDateOfManufacture();
        computer.setPrice();
    }

    private static void ifComputerDellDataOutput(Computers computer){
        computer.computerDataOutput();
    }

    /**
     * Вывести данные о поездах, пребывающих в пути более
     * суток.
     *
     * No поезда
     * Направление
     * Время прибытия
     * Время отбытия
     * Расстояние
     */
    private static void task2(){
        Trains train1 = new Trains();
        Trains train2 = new Trains();
        Trains train3 = new Trains();

        fillTrainData(train1);
        fillTrainData(train2);
        fillTrainData(train3);

        ifDepartureMoreDayOutput(train1);
        ifDepartureMoreDayOutput(train2);
        ifDepartureMoreDayOutput(train3);
    }

    private static void fillTrainData(Trains train){
        train.setTrainNumber();
        train.setDirection();
        train.setArrivalTime();
        train.setDepartureTime();
        train.setDistance();
    }

    private static void ifDepartureMoreDayOutput(Trains train){
        train.trainDataOutput();
    }

}

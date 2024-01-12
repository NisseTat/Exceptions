public class LowQuantityData extends RuntimeException{
    
    public LowQuantityData(){
        super("Введено недостаточное количество данных");
    }

    public LowQuantityData(String fieldName) {
        super("Поле " + fieldName + " содержит недостаточное количество символов");
    }
}

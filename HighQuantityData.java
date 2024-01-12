public class HighQuantityData extends RuntimeException {
    
    public HighQuantityData() {
        super("Введено излишнее количество данных");
    }

    public HighQuantityData(String fieldName) {
        super("Поле " + fieldName + " содержит излишнее количество символов");
    }
}

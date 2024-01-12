public class InvalidCharactersException extends RuntimeException {
    
    public InvalidCharactersException(String str) {
        super("Недопустимый формат поля " + str);
    }
}

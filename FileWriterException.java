import java.io.IOException;

public class FileWriterException extends IOException {
    
    public FileWriterException(){
        super("Ошибка записи в файл");
    }
}

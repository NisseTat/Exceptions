public class Check {

    static int quantityData = 6;
    static int quantityDataBirthday = 10;
    static int quantityPhone = 11;

    /*Проверка данных */
    public static void checkData(String[] dataArray) {

        checkDataQuantity(dataArray.length, quantityData, null);
        checkString("Имя", dataArray[0]);
        checkString("Фамилия", dataArray[1]);
        checkString("Отчество", dataArray[2]);
        checkBirthday("Дата рождения", dataArray[3]);
        checkPhone("Номер телефона", dataArray[4]);
        checkGender("Пол", dataArray[5]);
        
    }

    /*Проверка количества введенных данных */
    public static void checkDataQuantity(int count, int quantity, String fieldName) {
        if (fieldName == null) {
            if (count < quantity) {
                throw new LowQuantityData();
            } if (count > quantity) {
                throw new HighQuantityData();
            }
        }

        if (count < quantity) {
            throw new LowQuantityData(fieldName);
        } if (count > quantity) {
            throw new HighQuantityData(fieldName);
        }
        
    }

    /*Проверка на цифры */
    /*На английские, русская кодировка не работает(( */
    public static boolean checkNumber(char ch) {
        String temp = Character.toString(ch);
        if (temp.matches("[0-9]")) {
            return true;
        }
        return false;
    }

    /*Проверка на буквы */
    public static boolean checkLetter(char ch){
        String temp = Character.toString(ch);
        if (temp.matches("[a-zA-Z]")) {
            return true;
        }
        return false;
    }

    /*Проверка Имени, Фамилии и Отчества на содержания только букв и "-"*/
    /*Не работает русская кодировка, поэтому на транслите */
    public static void checkString(String fieldName, String str) {

        for (int i = 0; i < str.length(); i++) {
            if (!(checkLetter(str.charAt(i)) ||
                (i == str.length() - 1 && str.charAt(i) == '-'))) {
                    throw new InvalidCharactersException(fieldName);
            }
        }
    }

    /*Проверка дня рождения */
    public static void checkBirthday(String fieldName, String date) {

        checkDataQuantity(date.length(), quantityDataBirthday, fieldName);
        
        for (int i = 0; i < date.length(); i++) {
            if (i == 2 || i == 5) {
                if (date.charAt(i) != '.') {
                    throw new InvalidCharactersException(fieldName);
                }
            } else {
                if (!checkNumber(date.charAt(i))) {
                    throw new InvalidCharactersException(fieldName);
                }
            }
        }
    }


    /*Проверка номера телефона */
    public static void checkPhone(String fieldName, String phone) {

        checkDataQuantity(phone.length(), quantityPhone, fieldName);

        if (phone.charAt(0) != '8') {
            throw new InvalidCharactersException(fieldName);
        }
        for (int i = 1; i < phone.length(); i++) {
            if (!checkNumber(phone.charAt(i))) {
                throw new InvalidCharactersException(fieldName);
            }
        }
    }

    /*Проверка поля Пол */
    public static void checkGender(String fieldName, String gender) {
        if (!(gender.equals("f") || gender.equals("m"))) {
            throw new InvalidCharactersException(fieldName);
        }
    }
}

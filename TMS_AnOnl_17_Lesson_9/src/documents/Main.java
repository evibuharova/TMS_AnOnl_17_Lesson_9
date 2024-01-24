package documents;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        Document docNumber = new Document ("555000C", new Date());
        register.saveDoc(docNumber);
    }
}

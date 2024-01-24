package documents;

import exceptions.ContainsAbcException;
import exceptions.EndsWith1a2bException;
import exceptions.StartsWith555Exception;

public class Register {
    private Document[] documents;

    void saveDoc(Document document) {
        try {
            document.validateDocumentNumber();
        } catch (ContainsAbcException | StartsWith555Exception | EndsWith1a2bException exception) {
            System.out.println("Неккоректное имя документа. Нельзя сохранить в регистр" + exception.getClass().getName());
            System.out.println("Ошибка: " + exception.getMessage());
        }
    }
}

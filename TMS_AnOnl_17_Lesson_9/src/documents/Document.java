package documents;

import exceptions.ContainsAbcException;
import exceptions.EndsWith1a2bException;
import exceptions.StartsWith555Exception;

import java.util.Date;

public class Document {
    protected String docNumber;
    protected Date docDate;

    public Document(String docNumber, Date docDate) {
        this.docNumber = docNumber;
        this.docDate = docDate;
    }

   public void displayInfo() {};

    public String getDocNumber() {
        return docNumber;
    }

    public void validateDocumentNumber() throws ContainsAbcException, StartsWith555Exception, EndsWith1a2bException {
        DocumentValidator.validateDocumentNumber(docNumber);
    }
}

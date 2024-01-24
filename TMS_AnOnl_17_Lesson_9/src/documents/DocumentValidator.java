package documents;

import exceptions.ContainsAbcException;
import exceptions.ContainsAbcException;
import exceptions.EndsWith1a2bException;
import exceptions.StartsWith555Exception;

public class DocumentValidator {
    public static void validateDocumentNumber(String docNumber) throws ContainsAbcException, StartsWith555Exception, EndsWith1a2bException {
        checkContainsAbc(docNumber);
        checkStartsWith555(docNumber);
        checkEndsWith1a2b(docNumber);
    }

    private static void checkContainsAbc(String docNumber) throws ContainsAbcException {
        if (docNumber.contains("abc")) {
            throw new ContainsAbcException("Document number contain 'abc'");
        }
    }

    private static void checkStartsWith555(String docNumber) throws StartsWith555Exception {
        if (docNumber.startsWith("555")) {
            throw new StartsWith555Exception("Document number start with '555'");
        }
    }

    private static void checkEndsWith1a2b(String docNumber) throws EndsWith1a2bException {
        if (docNumber.endsWith("1a2b")) {
            throw new EndsWith1a2bException("Document number end with '1a2b'");
        }
    }
}

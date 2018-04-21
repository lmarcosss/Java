package exceptions;

import java.beans.ExceptionListener;
import java.util.concurrent.Executor;

public class ValorInvalidoException extends Exception {
    public ValorInvalidoException(String message) {
        super(message);
    }
}

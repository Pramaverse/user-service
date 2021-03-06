package ai.prama.services.user.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ResponseStatus(BAD_REQUEST)
public class BadSearchRequestException extends RuntimeException {
    private static final long serialVersionUID = -723555637422598300L;

    public BadSearchRequestException(String message) {
        super(message);
    }

    public BadSearchRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}

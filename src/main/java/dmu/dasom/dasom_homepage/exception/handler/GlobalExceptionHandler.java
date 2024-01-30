package dmu.dasom.dasom_homepage.exception.handler;

import dmu.dasom.dasom_homepage.exception.*;
import dmu.dasom.dasom_homepage.restful.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(InsertConflictException.class)
    public ResponseEntity<ApiResponse<Void>> handleInsertConflictException(InsertConflictException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ApiResponse<>(false));
    }

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<ApiResponse<Void>> handleDataNotFoundException(DataNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse<>(false));
    }

    @ExceptionHandler(AccessTokenExpiredException.class)
    public ResponseEntity<ApiResponse<Void>> handleAccessTokenExpiredException(AccessTokenExpiredException ex) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ApiResponse<>(false));
    }

    @ExceptionHandler(UnAuthorizedAccessException.class)
    public ResponseEntity<ApiResponse<Void>> handleUnAuthorizedAccessException(UnAuthorizedAccessException ex) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new ApiResponse<>(false));
    }

    @ExceptionHandler(PwUpdateErrorException.class)
    public ResponseEntity<ApiResponse<Void>> handlePwUpdateErrorException(PwUpdateErrorException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse<>(false));
    }
}

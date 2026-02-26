package enumration.test1;

public enum HttpStatus {
    OK(200, "성공"), 
    NOT_FOUND(404, "찾을 수 없음"),
    INTERNAL_SERVER_ERROR(500, "내부 서버 오류");

    private final int code;
    private final String description;

    HttpStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public boolean isSuccess() {
        return this.code >= 200 && this.code < 300;
    }   
    public int getCode() {
        return code;
    }
}
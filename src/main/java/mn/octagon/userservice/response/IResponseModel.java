package mn.octagon.userservice.response;

public interface IResponseModel<T> {
    String getCode();
    Boolean getIsSuccess();
    String getMessage();
    T getData();
}

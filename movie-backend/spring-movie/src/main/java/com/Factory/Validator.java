public interface Validator  {
    default void requestValidation(User user) throws Exception;
    default void RequestValidation(Movie movie) throws Exception;
}
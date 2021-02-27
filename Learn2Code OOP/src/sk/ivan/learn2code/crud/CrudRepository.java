package sk.ivan.learn2code.crud;

public interface CrudRepository<T> {
    void create(T entita);
    T read(T entityClass, Object);
}

package service;

import java.util.List;

public interface IPhoneBook<E> {
        void add(E object);
        void update(String id,E n );
        void delete(String id);
        List<E> findName(String name);
        List<E> findAll();
    }

package no.fint.cache;

import no.fint.cache.model.CacheObject;

import java.io.Serializable;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface Cache<T extends Serializable> {
    void update(List<T> objects);

    void updateCache(List<CacheObject<T>> objects);

    void add(List<T> objects);

    void addCache(List<CacheObject<T>> objects);

    void flush();

    Stream<CacheObject<T>> stream();

    Stream<CacheObject<T>> streamSince(long timestamp);

    long getLastUpdated();

    int size();

    long volume();

    Stream<CacheObject<T>> filter(Predicate<T> predicate);

    Stream<CacheObject<T>> filter(int hashCode, Predicate<T> predicate);
}

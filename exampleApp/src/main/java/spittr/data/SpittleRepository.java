package spittr.data;

import spittr.Spittle;

import java.util.List;

/**
 * Created by xinglongwang on 9/7/16.
 * Data repository.
 */
public interface SpittleRepository {
    /**
     * Get the Spittle list.
     * @param max max attribute ID value
     * @param count count of Spittle object
     * @return list of Spittle
     */
    List<Spittle> findSpittles(long max, int count);

    List<Spittle> findRecentSpittles();

    Spittle findOne(long id);

    void save(Spittle spittle);
}

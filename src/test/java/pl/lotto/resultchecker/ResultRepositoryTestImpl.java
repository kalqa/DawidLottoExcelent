package pl.lotto.resultchecker;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ResultRepositoryTestImpl implements ResultRepository {

    Map<String, Result> database = new ConcurrentHashMap<>();

    @Override
    public Result save(Result result) {
        return database.put(result.getToken(), result);
    }

    @Override
    public Result findResultByToken(String token) {
        return database.get(token);
    }

}

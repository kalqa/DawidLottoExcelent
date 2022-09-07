package pl.lotto.resultchecker;


public interface ResultRepository {

    Result save(Result ticket);
    Result findResultByToken(String token);
}

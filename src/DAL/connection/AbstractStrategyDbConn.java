package DAL.connection;

public abstract class AbstractStrategyDbConn<C> {
    public abstract C getConectionDB();
}

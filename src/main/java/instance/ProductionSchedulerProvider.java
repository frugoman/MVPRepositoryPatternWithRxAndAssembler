package instance;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import paymentmethods.model.SchedulerProvider;

public class ProductionSchedulerProvider implements SchedulerProvider {
    @Override
    public Scheduler io() {
        return Schedulers.io();
    }

    @Override
    public Scheduler mainThread() {
        return Schedulers.computation();
    }
}

package paymentmethods.model;

import io.reactivex.Scheduler;

public interface SchedulerProvider {
    Scheduler io();
    Scheduler mainThread();
}

package instance;

import paymentmethods.model.SchedulerProvider;
import paymentmethods.model.repository.PaymentMethodsRepository;
import paymentmethods.model.repository.PaymentMethodsRepositoryImpl;
import paymentmethods.model.service.PaymentMethodsMocked;
import paymentmethods.model.service.PaymentMethodsService;
import paymentmethods.presenter.MainPresenter;

public class CoreDependenciesAssembler implements DependenciesAssembler {
    @Override
    public MainPresenter resolvemainPresenter() {
        return new MainPresenter(resolvePaymentMethodsRepository(), resolveSchedulerProvider());
    }

    public SchedulerProvider resolveSchedulerProvider() {
        return new ProductionSchedulerProvider();
    }

    public PaymentMethodsRepository resolvePaymentMethodsRepository() {
        return new PaymentMethodsRepositoryImpl(resolvePaymentMethodsService());
    }

    public PaymentMethodsService resolvePaymentMethodsService() {
        return new PaymentMethodsMocked();
    }
}



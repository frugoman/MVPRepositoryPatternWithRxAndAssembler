package instance;

import paymentmethods.model.SchedulerProvider;
import paymentmethods.model.repository.PaymentMethodsRepository;
import paymentmethods.model.service.PaymentMethodsService;
import paymentmethods.presenter.MainPresenter;

public interface DependenciesAssembler {

    MainPresenter resolvemainPresenter();

    SchedulerProvider resolveSchedulerProvider();

    PaymentMethodsRepository resolvePaymentMethodsRepository();

    PaymentMethodsService resolvePaymentMethodsService() ;
}

package paymentmethods.presenter;

import io.reactivex.Single;
import paymentmethods.model.SchedulerProvider;
import paymentmethods.model.domain.PaymentMethod;
import paymentmethods.model.repository.PaymentMethodsRepository;

import java.util.List;

public class MainPresenter {

    private final PaymentMethodsRepository paymentMethodsRepository;
    private PaymentMethodsView view;
    private final SchedulerProvider schedulerProvider;

    public void setView(PaymentMethodsView view) {
        this.view = view;
    }

    public MainPresenter(PaymentMethodsRepository paymentMethodsRepository, SchedulerProvider schedulerProvider) {
        this.paymentMethodsRepository = paymentMethodsRepository;
        this.schedulerProvider = schedulerProvider;
    }

    public void initialize() {
        fetchPaymentMethods();
    }

    private void fetchPaymentMethods() {
        Single.just(paymentMethodsRepository.getPaymentMethods())
                .observeOn(schedulerProvider.io())
                .subscribeOn(schedulerProvider.mainThread())
                .subscribe(this::onFetchPaymentMethodsSuccess, this::onErrorFetchingPaymentMethods);
    }

    private void onErrorFetchingPaymentMethods(Throwable throwable) {
        view.showErrorScreen();
    }

    private void onFetchPaymentMethodsSuccess(List<PaymentMethod> paymentMethods) {
        if (paymentMethods.isEmpty()) {
            view.showEmptyListScreen();
            return;
        }
        view.showPaymentMethods(paymentMethods);
    }

}

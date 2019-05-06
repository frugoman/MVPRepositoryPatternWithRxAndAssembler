package paymentmethods.presenter;

import paymentmethods.model.domain.PaymentMethod;

import java.util.List;

public interface PaymentMethodsView {
    void showEmptyListScreen();

    void showPaymentMethods(final List<PaymentMethod> paymentMethods);

    void showErrorScreen();
}

package paymentmethods.model.repository;

import paymentmethods.model.domain.PaymentMethod;
import paymentmethods.model.service.PaymentMethodsService;

import java.util.List;

public class PaymentMethodsRepositoryImpl implements PaymentMethodsRepository {
    private final PaymentMethodsService paymentMethodsService;

    public PaymentMethodsRepositoryImpl(PaymentMethodsService paymentMethodsService) {
        this.paymentMethodsService = paymentMethodsService;
    }

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethodsService.getAll();
    }
}

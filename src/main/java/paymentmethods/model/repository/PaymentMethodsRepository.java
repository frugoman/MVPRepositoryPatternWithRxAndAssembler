package paymentmethods.model.repository;


import paymentmethods.model.domain.PaymentMethod;
import paymentmethods.model.service.PaymentMethodsService;

import java.util.List;

public interface PaymentMethodsRepository {
    List<PaymentMethod> getPaymentMethods();
}


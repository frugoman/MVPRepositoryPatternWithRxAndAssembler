package paymentmethods.model.service;

import paymentmethods.model.domain.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public interface PaymentMethodsService {
    List<PaymentMethod> getAll();

}


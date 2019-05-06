package paymentmethods.model.service;

import paymentmethods.model.domain.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class PaymentMethodsMocked implements PaymentMethodsService {

    @Override
    public List<PaymentMethod> getAll() {
        return new ArrayList<>();
    }
}

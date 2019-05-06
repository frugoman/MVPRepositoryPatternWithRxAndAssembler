package paymentmethods.view;

import instance.CoreDependenciesAssembler;
import paymentmethods.model.domain.PaymentMethod;
import paymentmethods.presenter.MainPresenter;
import paymentmethods.presenter.PaymentMethodsView;

import java.util.List;

public class Main implements PaymentMethodsView {
    private static final MainPresenter presenter = new CoreDependenciesAssembler().resolvemainPresenter();

    public void main(String[] args) {
        presenter.setView(this);
        presenter.initialize();
    }

    @Override
    public void showEmptyListScreen() {

    }

    @Override
    public void showPaymentMethods(List<PaymentMethod> paymentMethods) {

    }

    @Override
    public void showErrorScreen() {

    }
}

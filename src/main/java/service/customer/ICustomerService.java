package service.customer;

import moduls.Customer;
import moduls.Province;
import service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}

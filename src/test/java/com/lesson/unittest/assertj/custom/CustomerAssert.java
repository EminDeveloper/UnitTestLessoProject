package com.lesson.unittest.assertj.custom;

import com.lesson.unittest.assertj.CustomAssertTest;
import com.lesson.unittest.assertj.Customer;
import com.lesson.unittest.assertj.CustomerRepository;
import com.lesson.unittest.assertj.NotificationService;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;


public class CustomerAssert extends AbstractAssert<CustomerAssert, Customer> {

    private CustomerRepository customerRepository;
    private NotificationService notificationService;

    public CustomerAssert(Customer actual, Class<?> selfType, CustomerRepository customerRepository, NotificationService notificationService) {
        super(actual, selfType);
        this.customerRepository = customerRepository;
        this.notificationService = notificationService;
        isNotNull();
    }


    public CustomerAssert hasGifts(int sizeOfGifts) {

        assertThat(actual.getGifts())
                .isNotEmpty()
                .hasSize(sizeOfGifts);

        return this;
    }

    public CustomerAssert hasGiftWithName(String giftName) {

        assertThat(actual.getGifts())
                .isNotEmpty()
                .extracting("name")
                .contains(giftName);

        return this;
    }

    public CustomerAssert isSaved() {

        Mockito.verify(customerRepository).save(Mockito.any(Customer.class));

        return this;
    }

    public CustomerAssert hasReceivedWelcomeNotification() {

        Mockito.verify(notificationService).sendWelcomeNotification(CustomAssertTest.USERNAME, CustomAssertTest.EMAIL);

        return this;
    }
}
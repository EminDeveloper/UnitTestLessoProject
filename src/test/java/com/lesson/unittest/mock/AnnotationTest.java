package com.lesson.unittest.mock;

import com.lesson.unittest.assertj.CustomerRepository;
import com.lesson.unittest.assertj.CustomerService;
import com.lesson.unittest.assertj.NotificationService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnnotationTest {

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;

    @Mock
    private NotificationService notificationService;

    @Test
    public void testAnnotation() throws Exception {

        customerService.handleNewCustomer("name", "email");

    }
}
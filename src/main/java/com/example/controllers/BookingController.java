package com.example.controllers;


import com.example.pojo.MyResponse;
import com.example.pojo.OrderBookedDetails;
import com.example.pojo.OrderDetails;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class BookingController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public MyResponse orderItems(@ModelAttribute("redemptionOrder") OrderDetails orderDetails,
                                 BindingResult bindingResult, Model model, HttpServletRequest request, HttpSession session) {
        MyResponse response = new MyResponse();
        try {
            OrderBookedDetails orderBookedDetails = orderService.bookTicket(orderDetails);
            response.setOkResponse(Boolean.TRUE);
            response.setStatus(200);
            response.setValue(orderBookedDetails);

        } catch (Exception e) {
            System.out.println("Exception " + e);
            response.setStatus(500);
            response.setStatusDesc(" Unable to book tickets");
        }
        return response;
    }

}

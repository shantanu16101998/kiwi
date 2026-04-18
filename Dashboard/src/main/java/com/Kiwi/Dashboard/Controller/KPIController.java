package com.Kiwi.Dashboard.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;    


@RestController
@RequestMapping("/kpi")
public class KPIController {
    @GetMapping("/data")
    public String getKPI(   @RequestHeader("Authorization") String token, 
                            @RequestParam(required=false) String merchantId, 
                            @RequestParam(required=false) String startDate, 
                            @RequestParam(required=false) String endDate,
                            @RequestParam(required=false) String orderId,
                            @RequestParam(required=false) String transactionId,
                            @RequestParam(required=false) String gateway
                        ) {
        return "KPI data"; 
    }
}

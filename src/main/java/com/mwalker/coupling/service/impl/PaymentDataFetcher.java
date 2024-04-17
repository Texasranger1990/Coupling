package com.mwalker.coupling.service.impl;

import com.mwalker.coupling.model.Payment;

public interface PaymentDataFetcher {
    Payment getById(long id);
}

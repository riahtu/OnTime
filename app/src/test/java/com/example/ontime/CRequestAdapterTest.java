package com.example.ontime;

import android.view.View;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CRequestAdapterTest {
    CRequestAdapter cRequestAdapter = new CRequestAdapter(null, Arrays.<CurrentRequests>asList(new CurrentRequests("name", "phone", "email", "srcLocationText", "destinationText", "amount")));

    @Test
    void testGetView() {
        View result = cRequestAdapter.getView(0, null, null);
        Assertions.assertEquals(null, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
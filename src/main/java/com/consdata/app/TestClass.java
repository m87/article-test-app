package com.consdata.app;

import com.consdata.doc.Doc;

@Doc("To jest testowa klasa")
public class TestClass {

    @Doc("To jest testowe pole")
    private String field;

    @Doc("To jest testowe pole " + Constants.ADDITIONAL_TEXT)
    private String fieldWithExtraInfo;

}

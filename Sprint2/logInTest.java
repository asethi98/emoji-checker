package com.example.michaelwheeler.emojichecker;

import static org.junit.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class logInTest {

    @Test
    public void userTest() {
        assertThat(createAccount.editUserName("bobbyboi"), is(true));
    }
    @Test
    public void passTest() {
        assertThat(createAccount.editPassword("abc123"), is(true));
    }
}
package com.example.michaelwheeler.emojichecker;
import static org.junit.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class createAccountTest {

    @Test
    public void nameTest() {
        assertThat(createAccount.editName("Bob"), is(true));
    }
    @Test
    public void emailTest() {
        assertThat(createAccount.editEmail("bob@gsu.com"), is(true));
    }
    @Test
    public void phoneTest() {
        assertThat(createAccount.editPhone("7707707700"), is(true));
    }
    @Test
    public void userTest() {
        assertThat(createAccount.editUserName("bobbyboi"), is(true));
    }
    @Test
    public void passTest() {
        assertThat(createAccount.editPassword("abc123"), is(true));
    }
}
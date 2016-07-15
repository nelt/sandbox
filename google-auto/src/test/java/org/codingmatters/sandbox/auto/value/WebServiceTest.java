package org.codingmatters.sandbox.auto.value;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by nelt on 7/15/16.
 */
public class WebServiceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void whenNoUrl_throwsIllegalStateException() throws Exception {
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Missing required properties: url");
        WebService.builder().build();
    }

    @Test
    public void to_string() throws Exception {
        WebService webService = WebService.builder().url("/a/b/c").build();
        assertThat(
                webService.toString(),
                is("WebService{url=/a/b/c}"));
    }
}
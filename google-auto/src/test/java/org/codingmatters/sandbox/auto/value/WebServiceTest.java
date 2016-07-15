package org.codingmatters.sandbox.auto.value;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.codingmatters.sandbox.auto.value.WebService.ws;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by nelt on 7/15/16.
 */
public class WebServiceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void getter() throws Exception {
        assertThat(ws().url("/a/b").build().url(), is("/a/b"));
    }

    @Test
    public void toString_() throws Exception {
        WebService webService = ws().url("/a/b/c").build();
        assertThat(
                webService.toString(),
                is("WebService{url=/a/b/c}"));
    }

    @Test
    public void equal_() throws Exception {
        assertThat(
                ws().url("/a" + "/b").build(),
                is(ws().url("/a/b").build()));

    }

    @Test
    public void whenNoUrl_throwsIllegalStateException() throws Exception {
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Missing required properties: url");
        ws().build();
    }

}
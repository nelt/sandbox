package org.codingmatters.sandbox.auto.value;

import com.google.auto.value.AutoValue;

/**
 * Created by nelt on 7/15/16.
 */
@AutoValue
public abstract class WebService {
    public abstract String url();

    static public Builder builder() {
        return new AutoValue_WebService.Builder();
    }

    @AutoValue.Builder
    static public abstract class Builder {
        public abstract Builder url(String value);
        public abstract WebService build();
    }
}

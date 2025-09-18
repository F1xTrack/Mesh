package com.vk.push.core.remote.config.omicron.retriever;

import com.vk.push.core.remote.config.omicron.OmicronEnvironment;
import com.vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class DataQuery {
    public final Integer a;
    public final String b;
    public final Map c;
    public final OmicronEnvironment d;
    public final String e;
    public final ArrayList f;

    public static class Builder {
        public final ArrayList a = new ArrayList();
        public Integer b;
        public String c;
        public Map d;
        public String e;
        public OmicronEnvironment f;

        public DataQuery build() {
            if (this.f != null) {
                return new DataQuery(this);
            }
            throw new IllegalArgumentException("environment is required");
        }

        public Builder condition(String str) {
            this.c = str;
            return this;
        }

        public Builder environment(OmicronEnvironment omicronEnvironment) {
            this.f = omicronEnvironment;
            return this;
        }

        public Builder fingerprints(List<OmicronFingerprint> list) {
            this.a.addAll(list);
            return this;
        }

        public Builder segments(Map<String, String> map) {
            this.d = map;
            return this;
        }

        public Builder userId(String str) {
            this.e = str;
            return this;
        }

        public Builder version(Integer num) {
            this.b = num;
            return this;
        }
    }

    public DataQuery(Builder builder) {
        this.a = builder.b;
        this.b = builder.c;
        this.c = builder.d;
        this.d = builder.f;
        this.e = builder.e;
        this.f = builder.a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCondition() {
        return this.b;
    }

    public Integer getVersion() {
        return this.a;
    }
}

package com.p019vk.push.core.remote.config.omicron.retriever;

import com.p019vk.push.core.remote.config.omicron.OmicronEnvironment;
import com.p019vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class DataQuery {

    /* renamed from: a */
    public final Integer f20548a;

    /* renamed from: b */
    public final String f20549b;

    /* renamed from: c */
    public final Map f20550c;

    /* renamed from: d */
    public final OmicronEnvironment f20551d;

    /* renamed from: e */
    public final String f20552e;

    /* renamed from: f */
    public final ArrayList f20553f;

    public static class Builder {

        /* renamed from: a */
        public final ArrayList f20554a = new ArrayList();

        /* renamed from: b */
        public Integer f20555b;

        /* renamed from: c */
        public String f20556c;

        /* renamed from: d */
        public Map f20557d;

        /* renamed from: e */
        public String f20558e;

        /* renamed from: f */
        public OmicronEnvironment f20559f;

        public DataQuery build() {
            if (this.f20559f != null) {
                return new DataQuery(this);
            }
            throw new IllegalArgumentException("environment is required");
        }

        public Builder condition(String str) {
            this.f20556c = str;
            return this;
        }

        public Builder environment(OmicronEnvironment omicronEnvironment) {
            this.f20559f = omicronEnvironment;
            return this;
        }

        public Builder fingerprints(List<OmicronFingerprint> list) {
            this.f20554a.addAll(list);
            return this;
        }

        public Builder segments(Map<String, String> map) {
            this.f20557d = map;
            return this;
        }

        public Builder userId(String str) {
            this.f20558e = str;
            return this;
        }

        public Builder version(Integer num) {
            this.f20555b = num;
            return this;
        }
    }

    public DataQuery(Builder builder) {
        this.f20548a = builder.f20555b;
        this.f20549b = builder.f20556c;
        this.f20550c = builder.f20557d;
        this.f20551d = builder.f20559f;
        this.f20552e = builder.f20558e;
        this.f20553f = builder.f20554a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCondition() {
        return this.f20549b;
    }

    public Integer getVersion() {
        return this.f20548a;
    }
}

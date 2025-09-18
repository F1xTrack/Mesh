package com.vk.push.core.remote.config.omicron;

import android.text.TextUtils;
import com.vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint;
import com.vk.push.core.remote.config.omicron.retriever.OkHttpRequestExecutor;
import com.vk.push.core.remote.config.omicron.retriever.RequestExecutor;
import com.vk.push.core.remote.config.omicron.timetable.SimpleTimeProvider;
import com.vk.push.core.remote.config.omicron.timetable.TimeProvider;
import defpackage.C6363ox0;
import defpackage.C8079xx0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class OmicronConfig {
    public static final int o = (int) TimeUnit.DAYS.toMinutes(1);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final AnalyticsHandler f;
    public final int g;
    public final OmicronEnvironment h;
    public final float i;
    public final UpdateBehaviour j;
    public final String k;
    public final boolean l;
    public final RequestExecutor m;
    public final TimeProvider n;

    public static final class Builder {
        public String a;
        public OmicronEnvironment h;
        public String k;
        public boolean l;
        public boolean m;
        public String b = "https";
        public String c = "e.mail.ru";
        public String d = "api/v1/omicron/get";
        public List e = new ArrayList(4);
        public AnalyticsHandler f = new C8079xx0();
        public int g = OmicronConfig.o;
        public float i = 0.0f;
        public UpdateBehaviour j = UpdateBehaviour.DEFAULT;
        public RequestExecutor n = null;
        public C6363ox0 o = null;
        public TimeProvider p = new SimpleTimeProvider();

        public Builder analyticsHandler(AnalyticsHandler analyticsHandler) {
            this.f = analyticsHandler;
            return this;
        }

        public Builder apiHost(String str) {
            this.c = str;
            return this;
        }

        public Builder apiPath(String str) {
            this.d = str;
            return this;
        }

        public Builder apiScheme(String str) {
            this.b = str;
            return this;
        }

        public Builder appId(String str) {
            this.a = str;
            return this;
        }

        public OmicronConfig build() {
            if (TextUtils.isEmpty(this.a)) {
                throw new IllegalArgumentException("appId is required");
            }
            if (this.h == null) {
                throw new IllegalArgumentException("environment is required");
            }
            RequestExecutor requestExecutor = this.n;
            if (requestExecutor != null && this.o != null) {
                throw new IllegalArgumentException("you must pass OkHttpClient or custom RequestExecutor before build");
            }
            if (requestExecutor == null) {
                this.n = new OkHttpRequestExecutor(this.o, this.l);
            }
            return new OmicronConfig(this);
        }

        public Builder clearDataOnInit(boolean z) {
            this.m = z;
            return this;
        }

        public Builder environment(OmicronEnvironment omicronEnvironment) {
            this.h = omicronEnvironment;
            return this;
        }

        public Builder fingerprints(List<OmicronFingerprint> list) {
            this.e = list;
            return this;
        }

        public Builder firstLoadTimeout(float f) {
            this.i = f;
            return this;
        }

        public Builder requestExecutor(RequestExecutor requestExecutor) {
            this.n = requestExecutor;
            return this;
        }

        public Builder timeProvider(TimeProvider timeProvider) {
            this.p = timeProvider;
            return this;
        }

        public Builder updateBehaviour(UpdateBehaviour updateBehaviour) {
            this.j = updateBehaviour;
            return this;
        }

        public Builder updateInterval(int i) {
            this.g = i;
            return this;
        }

        public Builder useDefaultRequestExecutor(C6363ox0 c6363ox0, boolean z) {
            this.o = c6363ox0;
            this.l = z;
            return this;
        }

        public Builder userId(String str) {
            this.k = str;
            return this;
        }
    }

    public OmicronConfig(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        this.j = builder.j;
        this.k = builder.k;
        this.l = builder.m;
        this.m = builder.n;
        this.n = builder.p;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}

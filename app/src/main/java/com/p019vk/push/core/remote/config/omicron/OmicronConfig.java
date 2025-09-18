package com.p019vk.push.core.remote.config.omicron;

import android.text.TextUtils;
import com.p019vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint;
import com.p019vk.push.core.remote.config.omicron.retriever.OkHttpRequestExecutor;
import com.p019vk.push.core.remote.config.omicron.retriever.RequestExecutor;
import com.p019vk.push.core.remote.config.omicron.timetable.SimpleTimeProvider;
import com.p019vk.push.core.remote.config.omicron.timetable.TimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000.C10585ox0;
import p000.C11735xx0;

/* loaded from: classes2.dex */
public class OmicronConfig {

    /* renamed from: o */
    public static final int f20504o = (int) TimeUnit.DAYS.toMinutes(1);

    /* renamed from: a */
    public final String f20505a;

    /* renamed from: b */
    public final String f20506b;

    /* renamed from: c */
    public final String f20507c;

    /* renamed from: d */
    public final String f20508d;

    /* renamed from: e */
    public final List f20509e;

    /* renamed from: f */
    public final AnalyticsHandler f20510f;

    /* renamed from: g */
    public final int f20511g;

    /* renamed from: h */
    public final OmicronEnvironment f20512h;

    /* renamed from: i */
    public final float f20513i;

    /* renamed from: j */
    public final UpdateBehaviour f20514j;

    /* renamed from: k */
    public final String f20515k;

    /* renamed from: l */
    public final boolean f20516l;

    /* renamed from: m */
    public final RequestExecutor f20517m;

    /* renamed from: n */
    public final TimeProvider f20518n;

    public static final class Builder {

        /* renamed from: a */
        public String f20519a;

        /* renamed from: h */
        public OmicronEnvironment f20526h;

        /* renamed from: k */
        public String f20529k;

        /* renamed from: l */
        public boolean f20530l;

        /* renamed from: m */
        public boolean f20531m;

        /* renamed from: b */
        public String f20520b = "https";

        /* renamed from: c */
        public String f20521c = "e.mail.ru";

        /* renamed from: d */
        public String f20522d = "api/v1/omicron/get";

        /* renamed from: e */
        public List f20523e = new ArrayList(4);

        /* renamed from: f */
        public AnalyticsHandler f20524f = new C11735xx0();

        /* renamed from: g */
        public int f20525g = OmicronConfig.f20504o;

        /* renamed from: i */
        public float f20527i = 0.0f;

        /* renamed from: j */
        public UpdateBehaviour f20528j = UpdateBehaviour.DEFAULT;

        /* renamed from: n */
        public RequestExecutor f20532n = null;

        /* renamed from: o */
        public C10585ox0 f20533o = null;

        /* renamed from: p */
        public TimeProvider f20534p = new SimpleTimeProvider();

        public Builder analyticsHandler(AnalyticsHandler analyticsHandler) {
            this.f20524f = analyticsHandler;
            return this;
        }

        public Builder apiHost(String str) {
            this.f20521c = str;
            return this;
        }

        public Builder apiPath(String str) {
            this.f20522d = str;
            return this;
        }

        public Builder apiScheme(String str) {
            this.f20520b = str;
            return this;
        }

        public Builder appId(String str) {
            this.f20519a = str;
            return this;
        }

        public OmicronConfig build() {
            if (TextUtils.isEmpty(this.f20519a)) {
                throw new IllegalArgumentException("appId is required");
            }
            if (this.f20526h == null) {
                throw new IllegalArgumentException("environment is required");
            }
            RequestExecutor requestExecutor = this.f20532n;
            if (requestExecutor != null && this.f20533o != null) {
                throw new IllegalArgumentException("you must pass OkHttpClient or custom RequestExecutor before build");
            }
            if (requestExecutor == null) {
                this.f20532n = new OkHttpRequestExecutor(this.f20533o, this.f20530l);
            }
            return new OmicronConfig(this);
        }

        public Builder clearDataOnInit(boolean z) {
            this.f20531m = z;
            return this;
        }

        public Builder environment(OmicronEnvironment omicronEnvironment) {
            this.f20526h = omicronEnvironment;
            return this;
        }

        public Builder fingerprints(List<OmicronFingerprint> list) {
            this.f20523e = list;
            return this;
        }

        public Builder firstLoadTimeout(float f) {
            this.f20527i = f;
            return this;
        }

        public Builder requestExecutor(RequestExecutor requestExecutor) {
            this.f20532n = requestExecutor;
            return this;
        }

        public Builder timeProvider(TimeProvider timeProvider) {
            this.f20534p = timeProvider;
            return this;
        }

        public Builder updateBehaviour(UpdateBehaviour updateBehaviour) {
            this.f20528j = updateBehaviour;
            return this;
        }

        public Builder updateInterval(int i) {
            this.f20525g = i;
            return this;
        }

        public Builder useDefaultRequestExecutor(C10585ox0 c10585ox0, boolean z) {
            this.f20533o = c10585ox0;
            this.f20530l = z;
            return this;
        }

        public Builder userId(String str) {
            this.f20529k = str;
            return this;
        }
    }

    public OmicronConfig(Builder builder) {
        this.f20505a = builder.f20519a;
        this.f20506b = builder.f20520b;
        this.f20507c = builder.f20521c;
        this.f20508d = builder.f20522d;
        this.f20509e = builder.f20523e;
        this.f20510f = builder.f20524f;
        this.f20511g = builder.f20525g;
        this.f20512h = builder.f20526h;
        this.f20513i = builder.f20527i;
        this.f20514j = builder.f20528j;
        this.f20515k = builder.f20529k;
        this.f20516l = builder.f20531m;
        this.f20517m = builder.f20532n;
        this.f20518n = builder.f20534p;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}

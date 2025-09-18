package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C4379Am;
import io.appmetrica.analytics.impl.C4959Z;
import io.appmetrica.analytics.impl.C5464t5;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ReporterConfig {
    public final Map<String, Object> additionalConfig;
    public final String apiKey;
    public final Map<String, String> appEnvironment;
    public final Boolean dataSendingEnabled;
    public final Integer dispatchPeriodSeconds;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Integer sessionTimeout;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: l */
        private static final C4379Am f29521l = new C4379Am(new C4959Z());

        /* renamed from: a */
        private final C5464t5 f29522a;

        /* renamed from: b */
        private final String f29523b;

        /* renamed from: c */
        private Integer f29524c;

        /* renamed from: d */
        private Boolean f29525d;

        /* renamed from: e */
        private Boolean f29526e;

        /* renamed from: f */
        private Integer f29527f;

        /* renamed from: g */
        private String f29528g;

        /* renamed from: h */
        private Integer f29529h;

        /* renamed from: i */
        private Integer f29530i;

        /* renamed from: j */
        private final HashMap f29531j;

        /* renamed from: k */
        private final HashMap f29532k;

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f29532k.put(str, obj);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f29531j.put(str, str2);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z) {
            this.f29526e = Boolean.valueOf(z);
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i) {
            this.f29529h = Integer.valueOf(i);
            return this;
        }

        public Builder withLogs() {
            this.f29525d = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i) {
            this.f29530i = Integer.valueOf(i);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f29527f = Integer.valueOf(this.f29522a.m21074a(i));
            return this;
        }

        public Builder withSessionTimeout(int i) {
            this.f29524c = Integer.valueOf(i);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f29528g = str;
            return this;
        }

        private Builder(String str) {
            this.f29531j = new HashMap();
            this.f29532k = new HashMap();
            f29521l.mo19211a(str);
            this.f29522a = new C5464t5(str);
            this.f29523b = str;
        }
    }

    public /* synthetic */ ReporterConfig(Builder builder, int i) {
        this(builder);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f29523b;
        this.sessionTimeout = builder.f29524c;
        this.logs = builder.f29525d;
        this.dataSendingEnabled = builder.f29526e;
        this.maxReportsInDatabaseCount = builder.f29527f;
        this.userProfileID = builder.f29528g;
        this.dispatchPeriodSeconds = builder.f29529h;
        this.maxReportsCount = builder.f29530i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f29531j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f29532k);
    }
}

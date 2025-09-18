package com.yandex.metrica;

import com.yandex.metrica.impl.p022ob.C2968U2;
import com.yandex.metrica.impl.p022ob.C3582ro;
import com.yandex.metrica.impl.p022ob.C3686vo;

/* loaded from: classes2.dex */
public class ReporterConfig {
    public final String apiKey;
    public final Boolean logs;
    public final Integer maxReportsInDatabaseCount;
    public final Integer sessionTimeout;
    public final Boolean statisticsSending;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: g */
        public static final C3582ro f20741g = new C3582ro(new C3686vo());

        /* renamed from: a */
        public final String f20742a;

        /* renamed from: b */
        public Integer f20743b;

        /* renamed from: c */
        public Boolean f20744c;

        /* renamed from: d */
        public Boolean f20745d;

        /* renamed from: e */
        public Integer f20746e;

        /* renamed from: f */
        public String f20747f;

        public Builder(String str) {
            f20741g.mo14391a(str);
            this.f20742a = str;
        }

        public ReporterConfig build() {
            return new ReporterConfig(this);
        }

        public Builder withLogs() {
            this.f20744c = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f20746e = Integer.valueOf(i);
            return this;
        }

        public Builder withSessionTimeout(int i) {
            this.f20743b = Integer.valueOf(i);
            return this;
        }

        public Builder withStatisticsSending(boolean z) {
            this.f20745d = Boolean.valueOf(z);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f20747f = str;
            return this;
        }
    }

    public ReporterConfig(Builder builder) {
        this.apiKey = builder.f20742a;
        this.sessionTimeout = builder.f20743b;
        this.logs = builder.f20744c;
        this.statisticsSending = builder.f20745d;
        this.maxReportsInDatabaseCount = builder.f20746e;
        this.userProfileID = builder.f20747f;
    }

    public static Builder createBuilderFromConfig(ReporterConfig reporterConfig) {
        Builder builderNewConfigBuilder = newConfigBuilder(reporterConfig.apiKey);
        if (C2968U2.m15244a(reporterConfig.sessionTimeout)) {
            builderNewConfigBuilder.withSessionTimeout(reporterConfig.sessionTimeout.intValue());
        }
        if (C2968U2.m15244a(reporterConfig.logs) && reporterConfig.logs.booleanValue()) {
            builderNewConfigBuilder.withLogs();
        }
        if (C2968U2.m15244a(reporterConfig.statisticsSending)) {
            builderNewConfigBuilder.withStatisticsSending(reporterConfig.statisticsSending.booleanValue());
        }
        if (C2968U2.m15244a(reporterConfig.maxReportsInDatabaseCount)) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(reporterConfig.maxReportsInDatabaseCount.intValue());
        }
        if (C2968U2.m15244a((Object) reporterConfig.userProfileID)) {
            builderNewConfigBuilder.withUserProfileID(reporterConfig.userProfileID);
        }
        return builderNewConfigBuilder;
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str);
    }

    public ReporterConfig(ReporterConfig reporterConfig) {
        this.apiKey = reporterConfig.apiKey;
        this.sessionTimeout = reporterConfig.sessionTimeout;
        this.logs = reporterConfig.logs;
        this.statisticsSending = reporterConfig.statisticsSending;
        this.maxReportsInDatabaseCount = reporterConfig.maxReportsInDatabaseCount;
        this.userProfileID = reporterConfig.userProfileID;
    }
}

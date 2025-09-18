package com.yandex.varioqub.config;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC11077sn0;
import ru.p031ok.tracer.base.ucum.UcumUtils;

@Metadata(m22266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001'J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, m22267d2 = {"Lcom/yandex/varioqub/config/VarioqubSettings;", "", "", "key", "value", "LTf1;", "putClientFeature$config_release", "(Ljava/lang/String;Ljava/lang/String;)V", "putClientFeature", "clearClientFeatures$config_release", "()V", "clearClientFeatures", "a", "Ljava/lang/String;", "getClientId$config_release", "()Ljava/lang/String;", "clientId", "b", "getUrl$config_release", "url", "", "c", "J", "getFetchThrottleIntervalSec$config_release", "()J", "fetchThrottleIntervalSec", "", UcumUtils.UCUM_DAYS, "Z", "getLogs$config_release", "()Z", "logs", "e", "getActivateEvent$config_release", "activateEvent", "", "getClientFeatures$config_release", "()Ljava/util/Map;", "clientFeatures", "Builder", "config_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class VarioqubSettings {

    /* renamed from: a, reason: from kotlin metadata */
    private final String clientId;

    /* renamed from: b, reason: from kotlin metadata */
    private final String url;

    /* renamed from: c, reason: from kotlin metadata */
    private final long fetchThrottleIntervalSec;

    /* renamed from: d */
    private final boolean logs;

    /* renamed from: e, reason: from kotlin metadata */
    private final boolean activateEvent;

    /* renamed from: f */
    private final Map f25574f;

    /* renamed from: g */
    private final String f25575g;

    @Metadata(m22266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u000f¨\u0006\u0014"}, m22267d2 = {"Lcom/yandex/varioqub/config/VarioqubSettings$Builder;", "", "", "url", "withUrl", "key", "value", "withClientFeature", "", "fetchThrottleIntervalSec", "withThrottleInterval", "withLogs", "", "enabled", "withActivateEvent", "Lcom/yandex/varioqub/config/VarioqubSettings;", "build", "clientId", "<init>", "(Ljava/lang/String;)V", "config_release"}, m22268k = 1, m22269mv = {1, 6, 0})
    public static final class Builder {

        /* renamed from: a */
        private final String f25576a;

        /* renamed from: b */
        private String f25577b;

        /* renamed from: e */
        private boolean f25580e;

        /* renamed from: c */
        private final HashMap f25578c = new HashMap();

        /* renamed from: d */
        private long f25579d = 43200;

        /* renamed from: f */
        private boolean f25581f = true;

        public Builder(String str) {
            this.f25576a = str;
            if (str.length() <= 0) {
                throw new IllegalArgumentException("ClientId must not be empty");
            }
        }

        public final VarioqubSettings build() {
            return new VarioqubSettings(this.f25576a, this.f25577b, this.f25579d, this.f25580e, this.f25581f, AbstractC11077sn0.m24789q(this.f25578c), null);
        }

        public final Builder withActivateEvent(boolean enabled) {
            this.f25581f = enabled;
            return this;
        }

        public final Builder withClientFeature(String key, String value) {
            this.f25578c.put(key, value);
            return this;
        }

        public final Builder withLogs() {
            this.f25580e = true;
            return this;
        }

        public final Builder withThrottleInterval(long fetchThrottleIntervalSec) {
            if (fetchThrottleIntervalSec <= 0) {
                throw new IllegalArgumentException("Fetch timeout must be a positive number");
            }
            this.f25579d = fetchThrottleIntervalSec;
            return this;
        }

        public final Builder withUrl(String url) {
            this.f25577b = url;
            return this;
        }
    }

    public /* synthetic */ VarioqubSettings(String str, String str2, long j, boolean z, boolean z2, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, z, z2, map);
    }

    public final void clearClientFeatures$config_release() {
        this.f25574f.clear();
    }

    /* renamed from: getActivateEvent$config_release, reason: from getter */
    public final boolean getActivateEvent() {
        return this.activateEvent;
    }

    public final Map<String, String> getClientFeatures$config_release() {
        return AbstractC11077sn0.m24787o(this.f25574f);
    }

    /* renamed from: getClientId$config_release, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: getFetchThrottleIntervalSec$config_release, reason: from getter */
    public final long getFetchThrottleIntervalSec() {
        return this.fetchThrottleIntervalSec;
    }

    /* renamed from: getLogs$config_release, reason: from getter */
    public final boolean getLogs() {
        return this.logs;
    }

    /* renamed from: getUrl$config_release, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final void putClientFeature$config_release(String key, String value) {
    }

    private VarioqubSettings(String str, String str2, long j, boolean z, boolean z2, Map map) {
        this.clientId = str;
        this.url = str2;
        this.fetchThrottleIntervalSec = j;
        this.logs = z;
        this.activateEvent = z2;
        this.f25574f = map;
        this.f25575g = "VarioqubSettings";
    }
}

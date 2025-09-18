package ru.p031ok.tracer.base.commands;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p000.AbstractC11374v51;
import p000.O90;
import ru.p031ok.tracer.base.limits.TracerFeatureLimits;

@Metadata(m22266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m22267d2 = {"Lru/ok/tracer/base/commands/CommandsHandler;", "", "Lru/ok/tracer/base/commands/CommandsHandler$Builder;", "builder", "<init>", "(Lru/ok/tracer/base/commands/CommandsHandler$Builder;)V", "", "responseContentType", "responseContent", "LTf1;", "handleResponse", "(Ljava/lang/String;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "responseObject", "(Lorg/json/JSONObject;)V", "featureName", "Ljava/lang/String;", "tag", "Lru/ok/tracer/base/limits/TracerFeatureLimits;", "limits", "Lru/ok/tracer/base/limits/TracerFeatureLimits;", "Builder", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CommandsHandler {
    private final String featureName;
    private final TracerFeatureLimits limits;
    private final String tag;

    @Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0017"}, m22267d2 = {"Lru/ok/tracer/base/commands/CommandsHandler$Builder;", "", "()V", "featureName", "", "getFeatureName$tracer_base_release", "()Ljava/lang/String;", "setFeatureName$tracer_base_release", "(Ljava/lang/String;)V", "limits", "Lru/ok/tracer/base/limits/TracerFeatureLimits;", "getLimits$tracer_base_release", "()Lru/ok/tracer/base/limits/TracerFeatureLimits;", "setLimits$tracer_base_release", "(Lru/ok/tracer/base/limits/TracerFeatureLimits;)V", "tag", "getTag$tracer_base_release", "setTag$tracer_base_release", "build", "Lru/ok/tracer/base/commands/CommandsHandler;", "setFeatureName", "setLimitsHandler", "setTag", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Builder {
        private String featureName;
        private TracerFeatureLimits limits;
        private String tag;

        public final CommandsHandler build() {
            return new CommandsHandler(this, null);
        }

        /* renamed from: getFeatureName$tracer_base_release, reason: from getter */
        public final String getFeatureName() {
            return this.featureName;
        }

        /* renamed from: getLimits$tracer_base_release, reason: from getter */
        public final TracerFeatureLimits getLimits() {
            return this.limits;
        }

        /* renamed from: getTag$tracer_base_release, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public final Builder setFeatureName(String featureName) {
            O90.m5968f(featureName, "featureName");
            this.featureName = featureName;
            return this;
        }

        public final void setFeatureName$tracer_base_release(String str) {
            this.featureName = str;
        }

        public final void setLimits$tracer_base_release(TracerFeatureLimits tracerFeatureLimits) {
            this.limits = tracerFeatureLimits;
        }

        public final Builder setLimitsHandler(TracerFeatureLimits limits) {
            O90.m5968f(limits, "limits");
            this.limits = limits;
            return this;
        }

        public final Builder setTag(String tag) {
            O90.m5968f(tag, "tag");
            this.tag = tag;
            return this;
        }

        public final void setTag$tracer_base_release(String str) {
            this.tag = str;
        }
    }

    public /* synthetic */ CommandsHandler(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public final void handleResponse(String responseContentType, String responseContent) {
        if (responseContent == null || AbstractC11374v51.m25328C(responseContent)) {
            return;
        }
        try {
            handleResponse(new JSONObject(responseContent));
        } catch (Exception unused) {
        }
    }

    private CommandsHandler(Builder builder) {
        this.featureName = builder.getFeatureName();
        this.tag = builder.getTag();
        this.limits = builder.getLimits();
    }

    public final void handleResponse(JSONObject responseObject) {
        O90.m5968f(responseObject, "responseObject");
        JSONObject jSONObjectOptJSONObject = responseObject.optJSONObject("commands");
        if (jSONObjectOptJSONObject == null || this.limits == null) {
            return;
        }
        this.limits.setShutdownMs(Long.valueOf(jSONObjectOptJSONObject.optLong("globalShutdownMs")), this.featureName, this.featureName != null ? Long.valueOf(jSONObjectOptJSONObject.optLong("featureShutdownMs")) : null, this.tag, (this.featureName == null || this.tag == null) ? null : Long.valueOf(jSONObjectOptJSONObject.optLong("tagShutdownMs")));
    }
}

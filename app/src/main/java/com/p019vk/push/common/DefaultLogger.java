package com.p019vk.push.common;

import com.p019vk.push.common.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ!\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ!\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m22267d2 = {"Lcom/vk/push/common/DefaultLogger;", "Lcom/vk/push/common/Logger;", "", "tag", "<init>", "(Ljava/lang/String;)V", "message", "", "throwable", "LTf1;", "verbose", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "debug", "info", "warn", "error", "createLogger", "(Ljava/lang/String;)Lcom/vk/push/common/Logger;", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class DefaultLogger implements Logger {

    /* renamed from: a */
    public final String f20269a;

    public DefaultLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.p019vk.push.common.Logger
    public Logger createLogger(Object obj) {
        return Logger.DefaultImpls.createLogger(this, obj);
    }

    @Override // com.p019vk.push.common.Logger
    public void debug(String message, Throwable throwable) {
        O90.m5968f(message, "message");
    }

    @Override // com.p019vk.push.common.Logger
    public void error(String message, Throwable throwable) {
        O90.m5968f(message, "message");
    }

    @Override // com.p019vk.push.common.Logger
    public void info(String message, Throwable throwable) {
        O90.m5968f(message, "message");
    }

    @Override // com.p019vk.push.common.Logger
    public void verbose(String message, Throwable throwable) {
        O90.m5968f(message, "message");
    }

    @Override // com.p019vk.push.common.Logger
    public void warn(String message, Throwable throwable) {
        O90.m5968f(message, "message");
    }

    public DefaultLogger(String str) {
        this.f20269a = str;
    }

    @Override // com.p019vk.push.common.Logger
    public Logger createLogger(String tag) {
        O90.m5968f(tag, "tag");
        String str = this.f20269a;
        if (str != null) {
            tag = str + ':' + tag;
        }
        return new DefaultLogger(tag);
    }

    public /* synthetic */ DefaultLogger(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}

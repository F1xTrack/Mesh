package com.p019vk.push.common;

import com.p019vk.push.common.Logger;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ!\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ!\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m22267d2 = {"Lcom/vk/push/common/EmptyLogger;", "Lcom/vk/push/common/Logger;", "<init>", "()V", "", "message", "", "throwable", "LTf1;", "verbose", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "debug", "info", "warn", "error", "tag", "createLogger", "(Ljava/lang/String;)Lcom/vk/push/common/Logger;", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class EmptyLogger implements Logger {
    @Override // com.p019vk.push.common.Logger
    public Logger createLogger(String tag) {
        O90.m5968f(tag, "tag");
        return this;
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

    @Override // com.p019vk.push.common.Logger
    public Logger createLogger(Object obj) {
        return Logger.DefaultImpls.createLogger(this, obj);
    }
}

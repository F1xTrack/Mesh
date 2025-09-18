package com.vk.push.core.retry;

import com.huawei.hms.rn.push.constants.Core;
import com.vk.push.common.Logger;
import com.vk.push.core.backoff.BackOff;
import com.vk.push.core.backoff.ExponentialBackOff;
import defpackage.O90;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JP\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0006*\u00020\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0086Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH$¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/vk/push/core/retry/RequestRetryComponent;", "", "Lcom/vk/push/core/backoff/BackOff;", "backOff", "<init>", "(Lcom/vk/push/core/backoff/BackOff;)V", "T", "Lkotlin/Function1;", "LVy;", "LPS0;", "request", "invoke-gIAlu-s", "(LnZ;LVy;)Ljava/lang/Object;", "invoke", "", Core.Event.Result.EXCEPTION, "", "isRetryableError", "(Ljava/lang/Throwable;)Z", "Lcom/vk/push/common/Logger;", "getLogger", "()Lcom/vk/push/common/Logger;", "logger", "Companion", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class RequestRetryComponent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long b;
    public static final long c;
    public final BackOff a;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vk/push/core/retry/RequestRetryComponent$Companion;", "", "Lcom/vk/push/core/backoff/BackOff;", "createDefaultBackOffForRequest", "()Lcom/vk/push/core/backoff/BackOff;", "", "INITIAL_BACKOFF_IN_MILLISECONDS", "J", "", "MAX_ATTEMPTS", "I", "MAX_BACKOFF_IN_MILLISECONDS", "", "SCALE_FACTOR", "D", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final BackOff createDefaultBackOffForRequest() {
            return new ExponentialBackOff.Builder().initialBackOff(RequestRetryComponent.b).maxBackOff(RequestRetryComponent.c).scaleFactor(2.0d).build();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b = timeUnit.toMillis(1L);
        c = timeUnit.toMillis(32L);
    }

    public RequestRetryComponent(BackOff backOff) {
        O90.f(backOff, "backOff");
        this.a = backOff;
    }

    public abstract Logger getLogger();

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0109 -> B:41:0x010c). Please report as a decompilation issue!!! */
    /* renamed from: invoke-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object m85invokegIAlus(defpackage.InterfaceC6099nZ r18, defpackage.InterfaceC1729Vy r19) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.retry.RequestRetryComponent.m85invokegIAlus(nZ, Vy):java.lang.Object");
    }

    public abstract boolean isRetryableError(Throwable exception);
}

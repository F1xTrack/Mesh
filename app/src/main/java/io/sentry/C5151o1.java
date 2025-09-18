package io.sentry;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5151o1 implements InterfaceC5141l0 {
    public int a;
    public String b;
    public String c;
    public String d;
    public Long e;
    public ConcurrentHashMap f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5151o1.class != obj.getClass()) {
            return false;
        }
        return io.sentry.config.a.f(this.b, ((C5151o1) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("type").b(this.a);
        if (this.b != null) {
            a0.u("address").d(this.b);
        }
        if (this.c != null) {
            a0.u(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME).d(this.c);
        }
        if (this.d != null) {
            a0.u("class_name").d(this.d);
        }
        if (this.e != null) {
            a0.u(CrashHianalyticsData.THREAD_ID).m(this.e);
        }
        ConcurrentHashMap concurrentHashMap = this.f;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC5116d.c(this.f, str, a0, str, iLogger);
            }
        }
        a0.j();
    }
}

package io.sentry;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.sentry.config.AbstractC6003a;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.o1 */
/* loaded from: classes2.dex */
public final class C6072o1 implements InterfaceC6058l0 {

    /* renamed from: a */
    public int f34261a;

    /* renamed from: b */
    public String f34262b;

    /* renamed from: c */
    public String f34263c;

    /* renamed from: d */
    public String f34264d;

    /* renamed from: e */
    public Long f34265e;

    /* renamed from: f */
    public ConcurrentHashMap f34266f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6072o1.class != obj.getClass()) {
            return false;
        }
        return AbstractC6003a.m21747f(this.f34262b, ((C6072o1) obj).f34262b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34262b});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("type").mo13809b(this.f34261a);
        if (this.f34262b != null) {
            interfaceC5749A0.mo13828u("address").mo13811d(this.f34262b);
        }
        if (this.f34263c != null) {
            interfaceC5749A0.mo13828u(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME).mo13811d(this.f34263c);
        }
        if (this.f34264d != null) {
            interfaceC5749A0.mo13828u("class_name").mo13811d(this.f34264d);
        }
        if (this.f34265e != null) {
            interfaceC5749A0.mo13828u(CrashHianalyticsData.THREAD_ID).mo13820m(this.f34265e);
        }
        ConcurrentHashMap concurrentHashMap = this.f34266f;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34266f, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}

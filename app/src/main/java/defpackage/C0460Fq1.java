package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* renamed from: Fq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0460Fq1 extends BaseAnalyticsEvent {
    public final Object b;
    public final long c;

    public C0460Fq1(long j, Object obj) {
        super("vkcm_sdk_client_exchange_intermediate_token");
        this.b = obj;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0460Fq1)) {
            return false;
        }
        C0460Fq1 c0460Fq1 = (C0460Fq1) obj;
        return O90.a(this.b, c0460Fq1.b) && this.c == c0460Fq1.c;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C2391bn0 c2391bn0 = new C2391bn0();
        ExtensionsKt.setResult$default(c2391bn0, this.b, C8087y.t, null, 4, null);
        ExtensionsKt.setIntervalMs(c2391bn0, this.c);
        return c2391bn0.b();
    }

    public final int hashCode() {
        Object obj = this.b;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        long j = this.c;
        return ((int) (j ^ (j >>> 32))) + (iHashCode * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExchangePushTokenAnalyticsEvent(result=");
        sb.append((Object) PS0.b(this.b));
        sb.append(", intervalMs=");
        return AbstractC7209tN0.y(sb, this.c, ')');
    }
}

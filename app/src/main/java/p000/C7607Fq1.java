package p000;

import com.p019vk.push.common.analytics.BaseAnalyticsEvent;
import com.p019vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* renamed from: Fq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7607Fq1 extends BaseAnalyticsEvent {

    /* renamed from: b */
    public final Object f3442b;

    /* renamed from: c */
    public final long f3443c;

    public C7607Fq1(long j, Object obj) {
        super("vkcm_sdk_client_exchange_intermediate_token");
        this.f3442b = obj;
        this.f3443c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7607Fq1)) {
            return false;
        }
        C7607Fq1 c7607Fq1 = (C7607Fq1) obj;
        return O90.m5963a(this.f3442b, c7607Fq1.f3442b) && this.f3443c == c7607Fq1.f3443c;
    }

    @Override // com.p019vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C8896bn0 c8896bn0 = new C8896bn0();
        ExtensionsKt.setResult$default(c8896bn0, this.f3442b, C7173y.f45990t, null, 4, null);
        ExtensionsKt.setIntervalMs(c8896bn0, this.f3443c);
        return c8896bn0.m10510b();
    }

    public final int hashCode() {
        Object obj = this.f3442b;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        long j = this.f3443c;
        return ((int) (j ^ (j >>> 32))) + (iHashCode * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExchangePushTokenAnalyticsEvent(result=");
        sb.append((Object) PS0.m6366b(this.f3442b));
        sb.append(", intervalMs=");
        return AbstractC11153tN0.m24913y(sb, this.f3443c, ')');
    }
}

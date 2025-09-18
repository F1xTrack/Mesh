package p000;

import com.p019vk.push.common.analytics.BaseAnalyticsEvent;
import com.p019vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* renamed from: nt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10450nt1 extends BaseAnalyticsEvent {

    /* renamed from: b */
    public final String f38593b;

    /* renamed from: c */
    public final long f38594c;

    /* renamed from: d */
    public final Object f38595d;

    /* renamed from: e */
    public final String f38596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10450nt1(long j, Object obj, String str, String str2) {
        super("vkcm_sdk_client_subscribe_for_pushes");
        O90.m5968f(str, "pushToken");
        O90.m5968f(str2, "masterPackageName");
        this.f38593b = str;
        this.f38594c = j;
        this.f38595d = obj;
        this.f38596e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10450nt1)) {
            return false;
        }
        C10450nt1 c10450nt1 = (C10450nt1) obj;
        return O90.m5963a(this.f38593b, c10450nt1.f38593b) && this.f38594c == c10450nt1.f38594c && O90.m5963a(this.f38595d, c10450nt1.f38595d) && O90.m5963a(this.f38596e, c10450nt1.f38596e);
    }

    @Override // com.p019vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C8896bn0 c8896bn0 = new C8896bn0();
        ExtensionsKt.setPushToken(c8896bn0, this.f38593b);
        ExtensionsKt.setIntervalMs(c8896bn0, this.f38594c);
        ExtensionsKt.setResult(c8896bn0, this.f38595d, C7173y.f45971D, new C6920tz(3, this));
        return c8896bn0.m10510b();
    }

    public final int hashCode() {
        int iHashCode = this.f38593b.hashCode() * 31;
        long j = this.f38594c;
        int i = (((int) (j ^ (j >>> 32))) + iHashCode) * 31;
        Object obj = this.f38595d;
        return this.f38596e.hashCode() + (((obj == null ? 0 : obj.hashCode()) + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegisterForPushesAnalyticsEvent(pushToken=");
        sb.append(this.f38593b);
        sb.append(", intervalMs=");
        sb.append(this.f38594c);
        sb.append(", result=");
        sb.append((Object) PS0.m6366b(this.f38595d));
        sb.append(", masterPackageName=");
        return F91.m2539v(sb, this.f38596e, ')');
    }
}

package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* renamed from: nt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6161nt1 extends BaseAnalyticsEvent {
    public final String b;
    public final long c;
    public final Object d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6161nt1(long j, Object obj, String str, String str2) {
        super("vkcm_sdk_client_subscribe_for_pushes");
        O90.f(str, "pushToken");
        O90.f(str2, "masterPackageName");
        this.b = str;
        this.c = j;
        this.d = obj;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6161nt1)) {
            return false;
        }
        C6161nt1 c6161nt1 = (C6161nt1) obj;
        return O90.a(this.b, c6161nt1.b) && this.c == c6161nt1.c && O90.a(this.d, c6161nt1.d) && O90.a(this.e, c6161nt1.e);
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C2391bn0 c2391bn0 = new C2391bn0();
        ExtensionsKt.setPushToken(c2391bn0, this.b);
        ExtensionsKt.setIntervalMs(c2391bn0, this.c);
        ExtensionsKt.setResult(c2391bn0, this.d, C8087y.D, new C7322tz(3, this));
        return c2391bn0.b();
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        long j = this.c;
        int i = (((int) (j ^ (j >>> 32))) + iHashCode) * 31;
        Object obj = this.d;
        return this.e.hashCode() + (((obj == null ? 0 : obj.hashCode()) + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegisterForPushesAnalyticsEvent(pushToken=");
        sb.append(this.b);
        sb.append(", intervalMs=");
        sb.append(this.c);
        sb.append(", result=");
        sb.append((Object) PS0.b(this.d));
        sb.append(", masterPackageName=");
        return F91.v(sb, this.e, ')');
    }
}

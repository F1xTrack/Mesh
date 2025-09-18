package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* renamed from: Mr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1008Mr1 extends BaseAnalyticsEvent {
    public final String b;
    public final Object c;
    public final long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1008Mr1(String str, Object obj, long j) {
        super("vkcm_sdk_client_get_intermediate_token_finish");
        O90.f(str, "masterPackageName");
        this.b = str;
        this.c = obj;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1008Mr1)) {
            return false;
        }
        C1008Mr1 c1008Mr1 = (C1008Mr1) obj;
        return O90.a(this.b, c1008Mr1.b) && O90.a(this.c, c1008Mr1.c) && this.d == c1008Mr1.d;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C2391bn0 c2391bn0 = new C2391bn0();
        c2391bn0.put("master_package_name", this.b);
        ExtensionsKt.setIntervalMs(c2391bn0, this.d);
        ExtensionsKt.setResult$default(c2391bn0, this.c, null, null, 6, null);
        return c2391bn0.b();
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Object obj = this.c;
        int iHashCode2 = ((obj == null ? 0 : obj.hashCode()) + iHashCode) * 31;
        long j = this.d;
        return ((int) (j ^ (j >>> 32))) + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetIntermediateTokenFinishAnalyticsEvent(masterPackageName=");
        sb.append(this.b);
        sb.append(", result=");
        sb.append((Object) PS0.b(this.c));
        sb.append(", intervalMs=");
        return AbstractC7209tN0.y(sb, this.d, ')');
    }
}

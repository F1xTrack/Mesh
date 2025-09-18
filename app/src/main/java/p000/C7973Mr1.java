package p000;

import com.p019vk.push.common.analytics.BaseAnalyticsEvent;
import com.p019vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* renamed from: Mr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7973Mr1 extends BaseAnalyticsEvent {

    /* renamed from: b */
    public final String f7374b;

    /* renamed from: c */
    public final Object f7375c;

    /* renamed from: d */
    public final long f7376d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7973Mr1(String str, Object obj, long j) {
        super("vkcm_sdk_client_get_intermediate_token_finish");
        O90.m5968f(str, "masterPackageName");
        this.f7374b = str;
        this.f7375c = obj;
        this.f7376d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7973Mr1)) {
            return false;
        }
        C7973Mr1 c7973Mr1 = (C7973Mr1) obj;
        return O90.m5963a(this.f7374b, c7973Mr1.f7374b) && O90.m5963a(this.f7375c, c7973Mr1.f7375c) && this.f7376d == c7973Mr1.f7376d;
    }

    @Override // com.p019vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C8896bn0 c8896bn0 = new C8896bn0();
        c8896bn0.put("master_package_name", this.f7374b);
        ExtensionsKt.setIntervalMs(c8896bn0, this.f7376d);
        ExtensionsKt.setResult$default(c8896bn0, this.f7375c, null, null, 6, null);
        return c8896bn0.m10510b();
    }

    public final int hashCode() {
        int iHashCode = this.f7374b.hashCode() * 31;
        Object obj = this.f7375c;
        int iHashCode2 = ((obj == null ? 0 : obj.hashCode()) + iHashCode) * 31;
        long j = this.f7376d;
        return ((int) (j ^ (j >>> 32))) + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetIntermediateTokenFinishAnalyticsEvent(masterPackageName=");
        sb.append(this.f7374b);
        sb.append(", result=");
        sb.append((Object) PS0.m6366b(this.f7375c));
        sb.append(", intervalMs=");
        return AbstractC11153tN0.m24913y(sb, this.f7376d, ')');
    }
}

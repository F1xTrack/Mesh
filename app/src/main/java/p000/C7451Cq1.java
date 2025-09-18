package p000;

import com.p019vk.push.common.analytics.BaseAnalyticsEvent;
import com.p019vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* renamed from: Cq1 */
/* loaded from: classes2.dex */
public final class C7451Cq1 extends BaseAnalyticsEvent {

    /* renamed from: b */
    public final String f1726b;

    /* renamed from: c */
    public final boolean f1727c;

    public C7451Cq1(String str, boolean z) {
        super("vkcm_sdk_client_init");
        this.f1726b = str;
        this.f1727c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7451Cq1)) {
            return false;
        }
        C7451Cq1 c7451Cq1 = (C7451Cq1) obj;
        return O90.m5963a(this.f1726b, c7451Cq1.f1726b) && this.f1727c == c7451Cq1.f1727c;
    }

    @Override // com.p019vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C8896bn0 c8896bn0 = new C8896bn0();
        ExtensionsKt.setPushToken(c8896bn0, this.f1726b);
        ExtensionsKt.set(c8896bn0, "are_pushes_enabled", this.f1727c);
        return c8896bn0.m10510b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.f1726b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.f1727c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientSdkInitAnalyticsEvent(pushToken=");
        sb.append(this.f1726b);
        sb.append(", arePushesEnabled=");
        return F91.m2540w(sb, this.f1727c, ')');
    }
}

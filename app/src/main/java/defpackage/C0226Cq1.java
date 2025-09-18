package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* renamed from: Cq1 */
/* loaded from: classes2.dex */
public final class C0226Cq1 extends BaseAnalyticsEvent {
    public final String b;
    public final boolean c;

    public C0226Cq1(String str, boolean z) {
        super("vkcm_sdk_client_init");
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0226Cq1)) {
            return false;
        }
        C0226Cq1 c0226Cq1 = (C0226Cq1) obj;
        return O90.a(this.b, c0226Cq1.b) && this.c == c0226Cq1.c;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C2391bn0 c2391bn0 = new C2391bn0();
        ExtensionsKt.setPushToken(c2391bn0, this.b);
        ExtensionsKt.set(c2391bn0, "are_pushes_enabled", this.c);
        return c2391bn0.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientSdkInitAnalyticsEvent(pushToken=");
        sb.append(this.b);
        sb.append(", arePushesEnabled=");
        return F91.w(sb, this.c, ')');
    }
}

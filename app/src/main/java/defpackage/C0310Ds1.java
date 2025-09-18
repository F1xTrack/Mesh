package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import java.util.Map;

/* renamed from: Ds1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0310Ds1 extends BaseAnalyticsEvent {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0310Ds1(String str) {
        super("vkcm_sdk_client_get_intermediate_token_start");
        O90.f(str, "masterPackageName");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0310Ds1) && O90.a(this.b, ((C0310Ds1) obj).b);
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C2391bn0 c2391bn0 = new C2391bn0();
        c2391bn0.put("master_package_name", this.b);
        return c2391bn0.b();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return F91.v(new StringBuilder("GetIntermediateTokenStartAnalyticsEvent(masterPackageName="), this.b, ')');
    }
}

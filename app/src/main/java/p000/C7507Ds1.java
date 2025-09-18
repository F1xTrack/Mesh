package p000;

import com.p019vk.push.common.analytics.BaseAnalyticsEvent;
import java.util.Map;

/* renamed from: Ds1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7507Ds1 extends BaseAnalyticsEvent {

    /* renamed from: b */
    public final String f2287b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7507Ds1(String str) {
        super("vkcm_sdk_client_get_intermediate_token_start");
        O90.m5968f(str, "masterPackageName");
        this.f2287b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7507Ds1) && O90.m5963a(this.f2287b, ((C7507Ds1) obj).f2287b);
    }

    @Override // com.p019vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C8896bn0 c8896bn0 = new C8896bn0();
        c8896bn0.put("master_package_name", this.f2287b);
        return c8896bn0.m10510b();
    }

    public final int hashCode() {
        return this.f2287b.hashCode();
    }

    public final String toString() {
        return F91.m2539v(new StringBuilder("GetIntermediateTokenStartAnalyticsEvent(masterPackageName="), this.f2287b, ')');
    }
}

package p000;

import com.p019vk.push.common.analytics.BaseAnalyticsEvent;
import com.p019vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* renamed from: Kr1 */
/* loaded from: classes2.dex */
public final class C7869Kr1 extends BaseAnalyticsEvent {

    /* renamed from: b */
    public final Object f6363b;

    public C7869Kr1(Object obj) {
        super("vkcm_sdk_client_requested_master_host");
        this.f6363b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7869Kr1) {
            return O90.m5963a(this.f6363b, ((C7869Kr1) obj).f6363b);
        }
        return false;
    }

    @Override // com.p019vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C8896bn0 c8896bn0 = new C8896bn0();
        ExtensionsKt.setResult(c8896bn0, this.f6363b, C7173y.f45993w, C7173y.f45994x);
        return c8896bn0.m10510b();
    }

    public final int hashCode() {
        Object obj = this.f6363b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "MasterHostRequestResultEvent(result=" + ((Object) PS0.m6366b(this.f6363b)) + ')';
    }
}

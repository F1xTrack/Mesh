package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* renamed from: Kr1 */
/* loaded from: classes2.dex */
public final class C0853Kr1 extends BaseAnalyticsEvent {
    public final Object b;

    public C0853Kr1(Object obj) {
        super("vkcm_sdk_client_requested_master_host");
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0853Kr1) {
            return O90.a(this.b, ((C0853Kr1) obj).b);
        }
        return false;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C2391bn0 c2391bn0 = new C2391bn0();
        ExtensionsKt.setResult(c2391bn0, this.b, C8087y.w, C8087y.x);
        return c2391bn0.b();
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "MasterHostRequestResultEvent(result=" + ((Object) PS0.b(this.b)) + ')';
    }
}

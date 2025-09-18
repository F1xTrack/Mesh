package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: lt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5779lt1 extends BaseAnalyticsEvent {
    public final ArrayList b;

    public C5779lt1(ArrayList arrayList) {
        super("vkcm_sdk_client_no_master_host_found");
        this.b = arrayList;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C2391bn0 c2391bn0 = new C2391bn0();
        ExtensionsKt.set(c2391bn0, "installed_apps", this.b);
        return c2391bn0.b();
    }
}

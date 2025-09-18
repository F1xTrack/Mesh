package p000;

import com.p019vk.push.common.analytics.BaseAnalyticsEvent;
import com.p019vk.push.core.analytics.ExtensionsKt;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: lt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10194lt1 extends BaseAnalyticsEvent {

    /* renamed from: b */
    public final ArrayList f37341b;

    public C10194lt1(ArrayList arrayList) {
        super("vkcm_sdk_client_no_master_host_found");
        this.f37341b = arrayList;
    }

    @Override // com.p019vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C8896bn0 c8896bn0 = new C8896bn0();
        ExtensionsKt.set(c8896bn0, "installed_apps", this.f37341b);
        return c8896bn0.m10510b();
    }
}

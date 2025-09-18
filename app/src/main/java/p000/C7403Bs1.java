package p000;

import com.p019vk.push.common.analytics.BaseAnalyticsEvent;
import com.p019vk.push.core.analytics.ExtensionsKt;
import java.util.Locale;
import java.util.Map;

/* renamed from: Bs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7403Bs1 extends BaseAnalyticsEvent {

    /* renamed from: b */
    public final String f1067b;

    /* renamed from: c */
    public final int f1068c;

    public C7403Bs1(String str, int i) {
        super("vkcm_sdk_client_invalidate_token");
        this.f1067b = str;
        this.f1068c = i;
    }

    @Override // com.p019vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        String str;
        C8896bn0 c8896bn0 = new C8896bn0();
        ExtensionsKt.setPushToken(c8896bn0, this.f1067b);
        int i = this.f1068c;
        if (i == 1) {
            str = "SDK_USER";
        } else if (i == 2) {
            str = "HOST";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "NO_HOST_INSTALLED";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        O90.m5967e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c8896bn0.put("invalidate_initiator", lowerCase);
        return c8896bn0.m10510b();
    }
}

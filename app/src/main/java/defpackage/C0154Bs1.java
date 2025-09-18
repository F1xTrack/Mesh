package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Locale;
import java.util.Map;

/* renamed from: Bs1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0154Bs1 extends BaseAnalyticsEvent {
    public final String b;
    public final int c;

    public C0154Bs1(String str, int i) {
        super("vkcm_sdk_client_invalidate_token");
        this.b = str;
        this.c = i;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        String str;
        C2391bn0 c2391bn0 = new C2391bn0();
        ExtensionsKt.setPushToken(c2391bn0, this.b);
        int i = this.c;
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
        O90.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        c2391bn0.put("invalidate_initiator", lowerCase);
        return c2391bn0.b();
    }
}

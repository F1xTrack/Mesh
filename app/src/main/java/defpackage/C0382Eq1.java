package defpackage;

import com.huawei.hms.rn.push.constants.NotificationConstants;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import com.vk.push.core.utils.MessageIdUtilsKt;
import java.util.Map;

/* renamed from: Eq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0382Eq1 extends BaseAnalyticsEvent {
    public final String b;
    public final String c;
    public final String d;

    public C0382Eq1(String str, String str2, String str3) {
        super("vkcm_sdk_client_click_push");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        String str;
        C2391bn0 c2391bn0 = new C2391bn0();
        String str2 = this.b;
        if (str2 != null && (str = this.c) != null) {
            ExtensionsKt.setPushId(c2391bn0, MessageIdUtilsKt.formPushId(str2, str));
        }
        c2391bn0.put(NotificationConstants.ACTION, this.d);
        return c2391bn0.b();
    }
}

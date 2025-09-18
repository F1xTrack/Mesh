package p000;

import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.p019vk.push.common.analytics.BaseAnalyticsEvent;
import com.p019vk.push.core.analytics.ExtensionsKt;
import com.p019vk.push.core.utils.MessageIdUtilsKt;
import java.util.Map;

/* renamed from: Eq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7555Eq1 extends BaseAnalyticsEvent {

    /* renamed from: b */
    public final String f2923b;

    /* renamed from: c */
    public final String f2924c;

    /* renamed from: d */
    public final String f2925d;

    public C7555Eq1(String str, String str2, String str3) {
        super("vkcm_sdk_client_click_push");
        this.f2923b = str;
        this.f2924c = str2;
        this.f2925d = str3;
    }

    @Override // com.p019vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        String str;
        C8896bn0 c8896bn0 = new C8896bn0();
        String str2 = this.f2923b;
        if (str2 != null && (str = this.f2924c) != null) {
            ExtensionsKt.setPushId(c8896bn0, MessageIdUtilsKt.formPushId(str2, str));
        }
        c8896bn0.put(NotificationConstants.ACTION, this.f2925d);
        return c8896bn0.m10510b();
    }
}

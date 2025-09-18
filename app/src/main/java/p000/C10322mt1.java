package p000;

import com.p019vk.push.common.analytics.BaseAnalyticsEvent;
import com.p019vk.push.common.messaging.RemoteMessage;
import com.p019vk.push.core.analytics.ExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: mt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10322mt1 extends BaseAnalyticsEvent {

    /* renamed from: b */
    public final String f37979b;

    /* renamed from: c */
    public final List f37980c;

    public C10322mt1(String str, List list) {
        super("vkcm_sdk_client_skip_push");
        this.f37979b = str;
        this.f37980c = list;
    }

    @Override // com.p019vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C8896bn0 c8896bn0 = new C8896bn0();
        String str = this.f37979b;
        ExtensionsKt.setPushToken(c8896bn0, str);
        List list = this.f37980c;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((RemoteMessage) it.next()).getMessageId());
        }
        ExtensionsKt.setPushIds(c8896bn0, str, arrayList);
        c8896bn0.put("reason", "token_diff");
        return c8896bn0.m10510b();
    }
}

package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: mt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5970mt1 extends BaseAnalyticsEvent {
    public final String b;
    public final List c;

    public C5970mt1(String str, List list) {
        super("vkcm_sdk_client_skip_push");
        this.b = str;
        this.c = list;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        C2391bn0 c2391bn0 = new C2391bn0();
        String str = this.b;
        ExtensionsKt.setPushToken(c2391bn0, str);
        List list = this.c;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((RemoteMessage) it.next()).getMessageId());
        }
        ExtensionsKt.setPushIds(c2391bn0, str, arrayList);
        c2391bn0.put("reason", "token_diff");
        return c2391bn0.b();
    }
}

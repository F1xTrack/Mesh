package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.EnumC2458c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.D2 */
/* loaded from: classes2.dex */
public class C2544D2 {

    /* renamed from: a */
    private final C2569E2 f20993a;

    /* renamed from: b */
    private final Context f20994b;

    /* renamed from: c */
    private final Map<String, C2519C2> f20995c = new HashMap();

    public C2544D2(Context context, C2569E2 c2569e2) {
        this.f20994b = context;
        this.f20993a = c2569e2;
    }

    /* renamed from: a */
    public synchronized C2519C2 m13978a(String str, EnumC2458c enumC2458c) {
        C2519C2 c2519c2;
        c2519c2 = this.f20995c.get(str);
        if (c2519c2 == null) {
            c2519c2 = new C2519C2(str, this.f20994b, enumC2458c, this.f20993a);
            this.f20995c.put(str, c2519c2);
        }
        return c2519c2;
    }
}

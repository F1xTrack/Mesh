package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3482o2;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.d7 */
/* loaded from: classes2.dex */
public class C3201d7 {

    /* renamed from: a */
    private final C3669v7 f23217a;

    public C3201d7() {
        this(new C3669v7());
    }

    /* renamed from: a */
    public C3482o2.f m15743a(C3513p7 c3513p7, C3378k2 c3378k2) {
        String strM16478b;
        C3461n7 c3461n7 = c3513p7.f24427a;
        String str = "";
        if (c3461n7 != null && (strM16478b = c3461n7.m16478b()) != null) {
            str = strM16478b;
        }
        byte[] bArrM16958a = this.f23217a.m16958a(c3513p7);
        C2689Im c2689ImM17346b = AbstractC3788zm.m17346b(c3378k2.m15168b().m13768a());
        List<Integer> list = C2692J0.f21482i;
        C2915S c2915s = new C2915S(bArrM16958a, str, EnumC3377k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.m16250b(), c2689ImM17346b);
        c2915s.m16232c(c3378k2.m16255d());
        return new C3482o2.f(c2915s, c3378k2).m16519a(c2915s.m15105s()).m16520a(true);
    }

    public C3201d7(C3669v7 c3669v7) {
        this.f23217a = c3669v7;
    }
}

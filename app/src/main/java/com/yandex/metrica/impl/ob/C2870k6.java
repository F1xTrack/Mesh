package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.k6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2870k6 {
    private final C2821i6 a;
    private final C2845j6 b;
    private final InterfaceC3226y8 c;

    public C2870k6(Context context, C2669c4 c2669c4) {
        this(new C2845j6(), new C2821i6(), Qa.a(context).a(c2669c4), "event_hashes");
    }

    public C2796h6 a() {
        try {
            byte[] bArrA = this.c.a("event_hashes");
            if (U2.a(bArrA)) {
                C2821i6 c2821i6 = this.a;
                this.b.getClass();
                return c2821i6.a(new C2731eg());
            }
            C2821i6 c2821i62 = this.a;
            this.b.getClass();
            return c2821i62.a((C2731eg) AbstractC2714e.a(new C2731eg(), bArrA));
        } catch (Throwable unused) {
            C2821i6 c2821i63 = this.a;
            this.b.getClass();
            return c2821i63.a(new C2731eg());
        }
    }

    public C2870k6(C2845j6 c2845j6, C2821i6 c2821i6, InterfaceC3226y8 interfaceC3226y8, String str) {
        this.b = c2845j6;
        this.a = c2821i6;
        this.c = interfaceC3226y8;
    }

    public void a(C2796h6 c2796h6) {
        InterfaceC3226y8 interfaceC3226y8 = this.c;
        C2845j6 c2845j6 = this.b;
        C2731eg c2731egB = this.a.b(c2796h6);
        c2845j6.getClass();
        interfaceC3226y8.a("event_hashes", AbstractC2714e.a(c2731egB));
    }
}

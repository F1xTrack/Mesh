package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Bundle;
import p000.InterfaceC9940ju1;

/* renamed from: com.yandex.metrica.impl.ob.g2 */
/* loaded from: classes2.dex */
class C3274g2 {

    /* renamed from: a */
    private final InterfaceC3741y1 f23465a;

    /* renamed from: b */
    private final InterfaceC9940ju1 f23466b;

    public C3274g2(InterfaceC3741y1 interfaceC3741y1, Context context) {
        this(interfaceC3741y1, new C3731xh().m17188b(context));
    }

    /* renamed from: a */
    public void m15956a(int i, Bundle bundle) {
        if (i == 1) {
            this.f23465a.reportData(bundle);
        } else {
            if (i != 2) {
                return;
            }
            this.f23466b.reportData(bundle);
        }
    }

    public C3274g2(InterfaceC3741y1 interfaceC3741y1, InterfaceC9940ju1 interfaceC9940ju1) {
        this.f23465a = interfaceC3741y1;
        this.f23466b = interfaceC9940ju1;
    }
}

package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import defpackage.InterfaceC5400ju1;

/* renamed from: com.yandex.metrica.impl.ob.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2767g2 {
    private final InterfaceC3219y1 a;
    private final InterfaceC5400ju1 b;

    public C2767g2(InterfaceC3219y1 interfaceC3219y1, Context context) {
        this(interfaceC3219y1, new C3210xh().b(context));
    }

    public void a(int i, Bundle bundle) {
        if (i == 1) {
            this.a.reportData(bundle);
        } else {
            if (i != 2) {
                return;
            }
            this.b.reportData(bundle);
        }
    }

    public C2767g2(InterfaceC3219y1 interfaceC3219y1, InterfaceC5400ju1 interfaceC5400ju1) {
        this.a = interfaceC3219y1;
        this.b = interfaceC5400ju1;
    }
}

package com.yandex.metrica.impl.ob;

import android.os.Process;

/* renamed from: com.yandex.metrica.impl.ob.k8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2872k8 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final X7 d;

    public C2872k8(String str, boolean z, X7 x7) {
        this(str, z, x7, U2.a(23) && Process.is64Bit());
    }

    public C2872k8(String str, boolean z, X7 x7, boolean z2) {
        this.a = str;
        this.c = z;
        this.d = x7;
        this.b = z2;
    }
}

package com.yandex.metrica.impl.p022ob;

import android.os.Process;

/* renamed from: com.yandex.metrica.impl.ob.k8 */
/* loaded from: classes2.dex */
class C3384k8 {

    /* renamed from: a */
    public final String f23912a;

    /* renamed from: b */
    public final boolean f23913b;

    /* renamed from: c */
    public final boolean f23914c;

    /* renamed from: d */
    public final C3048X7 f23915d;

    public C3384k8(String str, boolean z, C3048X7 c3048x7) {
        this(str, z, c3048x7, C2968U2.m15243a(23) && Process.is64Bit());
    }

    public C3384k8(String str, boolean z, C3048X7 c3048x7, boolean z2) {
        this.f23912a = str;
        this.f23914c = z;
        this.f23915d = c3048x7;
        this.f23913b = z2;
    }
}

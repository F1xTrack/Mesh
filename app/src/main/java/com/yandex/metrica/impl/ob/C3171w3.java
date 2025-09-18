package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.Ma;
import defpackage.C2404br1;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.w3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3171w3 implements InterfaceC3112u {
    private final Q9 a;
    private C3041r3 b;

    public C3171w3(Context context) {
        this(Ma.b.a(C3041r3.class).a(context));
    }

    public void a(List<C2404br1> list, boolean z) {
        for (C2404br1 c2404br1 : list) {
        }
        C3041r3 c3041r3 = new C3041r3(list, z);
        this.b = c3041r3;
        this.a.a(c3041r3);
    }

    public boolean b() {
        return this.b.b;
    }

    public C3171w3(Q9 q9) {
        this.a = q9;
        this.b = (C3041r3) q9.b();
    }

    public List<C2404br1> a() {
        return this.b.a;
    }
}

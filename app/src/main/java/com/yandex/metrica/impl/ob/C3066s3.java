package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2681cg;
import defpackage.C2404br1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.s3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3066s3 implements InterfaceC2725ea<C3041r3, C2681cg> {
    private final C3116u3 a;

    public C3066s3() {
        this(new C3116u3());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C3041r3 a(C2681cg c2681cg) {
        C2681cg c2681cg2 = c2681cg;
        ArrayList arrayList = new ArrayList(c2681cg2.b.length);
        for (C2681cg.a aVar : c2681cg2.b) {
            arrayList.add(this.a.a(aVar));
        }
        return new C3041r3(arrayList, c2681cg2.c);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2681cg b(C3041r3 c3041r3) {
        C3041r3 c3041r32 = c3041r3;
        C2681cg c2681cg = new C2681cg();
        c2681cg.b = new C2681cg.a[c3041r32.a.size()];
        Iterator<C2404br1> it = c3041r32.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            c2681cg.b[i] = this.a.b(it.next());
            i++;
        }
        c2681cg.c = c3041r32.b;
        return c2681cg;
    }

    public C3066s3(C3116u3 c3116u3) {
        this.a = c3116u3;
    }
}

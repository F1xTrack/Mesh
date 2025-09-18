package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ua, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3123ua implements InterfaceC2725ea {
    private final C3024qa a;

    public C3123ua() {
        this(new C3024qa());
    }

    public C3123ua(C3024qa c3024qa) {
        this.a = c3024qa;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.y b(Ed ed) {
        C2880kg.y yVar = new C2880kg.y();
        yVar.b = ed.a;
        yVar.c = ed.b;
        List<Nc> list = ed.c;
        yVar.d = list == null ? new C2880kg.y.a[0] : this.a.b(list);
        return yVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Ed a(C2880kg.y yVar) {
        return new Ed(yVar.b, yVar.c, U2.a((Object[]) yVar.d) ? null : this.a.a(yVar.d));
    }
}

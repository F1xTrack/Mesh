package com.yandex.metrica.impl.ob;

import java.util.LinkedList;

/* renamed from: com.yandex.metrica.impl.ob.e5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2720e5 extends AbstractC2745f5<AbstractC3068s5> {
    private final C5 a;
    private final C2721e6 b;
    private final C3223y5 c;

    public C2720e5(C2744f4 c2744f4) {
        this.a = new C5(c2744f4);
        this.b = new C2721e6(c2744f4);
        this.c = new C3223y5(c2744f4);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2745f5
    public C2670c5 a(int i) {
        LinkedList linkedList = new LinkedList();
        int iOrdinal = EnumC2865k1.a(i).ordinal();
        if (iOrdinal == 1) {
            linkedList.add(this.a);
        } else if (iOrdinal == 3) {
            linkedList.add(this.c);
        } else if (iOrdinal == 40) {
            linkedList.add(this.b);
            linkedList.add(this.a);
        }
        return new C2670c5(linkedList);
    }
}

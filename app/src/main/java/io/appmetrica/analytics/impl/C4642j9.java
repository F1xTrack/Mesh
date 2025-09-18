package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4642j9 extends Se {
    public final Gg a;
    public final Ig b;
    public final C4912ug c;

    public C4642j9(C4567g5 c4567g5) {
        this.a = new Gg(c4567g5);
        this.b = new Ig(c4567g5);
        this.c = new C4912ug(c4567g5);
    }

    @Override // io.appmetrica.analytics.impl.Se
    public final U8 a(int i) {
        LinkedList linkedList = new LinkedList();
        int iOrdinal = Wa.a(i).ordinal();
        if (iOrdinal == 1) {
            linkedList.add(this.a);
        } else if (iOrdinal == 3) {
            linkedList.add(this.c);
        } else if (iOrdinal == 27) {
            linkedList.add(this.b);
            linkedList.add(this.a);
        }
        return new T8(linkedList);
    }
}

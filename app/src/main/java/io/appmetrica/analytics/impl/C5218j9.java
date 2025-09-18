package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* renamed from: io.appmetrica.analytics.impl.j9 */
/* loaded from: classes2.dex */
public final class C5218j9 extends AbstractC4806Se {

    /* renamed from: a */
    public final C4521Gg f31970a;

    /* renamed from: b */
    public final C4569Ig f31971b;

    /* renamed from: c */
    public final C5500ug f31972c;

    public C5218j9(C5139g5 c5139g5) {
        this.f31970a = new C4521Gg(c5139g5);
        this.f31971b = new C4569Ig(c5139g5);
        this.f31972c = new C5500ug(c5139g5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4806Se
    /* renamed from: a */
    public final AbstractC4848U8 mo19740a(int i) {
        LinkedList linkedList = new LinkedList();
        int iOrdinal = EnumC4898Wa.m19946a(i).ordinal();
        if (iOrdinal == 1) {
            linkedList.add(this.f31970a);
        } else if (iOrdinal == 3) {
            linkedList.add(this.f31972c);
        } else if (iOrdinal == 27) {
            linkedList.add(this.f31971b);
            linkedList.add(this.f31970a);
        }
        return new C4824T8(linkedList);
    }
}

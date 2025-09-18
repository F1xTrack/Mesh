package p000;

import java.util.ArrayList;

/* renamed from: p10, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10594p10 extends AbstractC8695aC1 {

    /* renamed from: c */
    public final /* synthetic */ ArrayList f39725c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC10722q10 f39726d;

    public C10594p10(ArrayList arrayList, AbstractC10722q10 abstractC10722q10) {
        this.f39725c = arrayList;
        this.f39726d = abstractC10722q10;
    }

    @Override // p000.AbstractC8695aC1
    /* renamed from: a */
    public final void mo1622a(InterfaceC7158xl interfaceC7158xl) {
        O90.m5968f(interfaceC7158xl, "fakeOverride");
        C11229tz0.m25058r(interfaceC7158xl, null);
        this.f39725c.add(interfaceC7158xl);
    }

    @Override // p000.AbstractC8695aC1
    /* renamed from: b */
    public final void mo1623b(InterfaceC7158xl interfaceC7158xl, InterfaceC7158xl interfaceC7158xl2) {
        O90.m5968f(interfaceC7158xl2, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f39726d.f40498b + ": " + interfaceC7158xl + " vs " + interfaceC7158xl2).toString());
    }
}

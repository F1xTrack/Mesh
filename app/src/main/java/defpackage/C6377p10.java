package defpackage;

import java.util.ArrayList;

/* renamed from: p10, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6377p10 extends AbstractC2090aC1 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ AbstractC6568q10 d;

    public C6377p10(ArrayList arrayList, AbstractC6568q10 abstractC6568q10) {
        this.c = arrayList;
        this.d = abstractC6568q10;
    }

    @Override // defpackage.AbstractC2090aC1
    public final void a(InterfaceC8042xl interfaceC8042xl) {
        O90.f(interfaceC8042xl, "fakeOverride");
        C7323tz0.r(interfaceC8042xl, null);
        this.c.add(interfaceC8042xl);
    }

    @Override // defpackage.AbstractC2090aC1
    public final void b(InterfaceC8042xl interfaceC8042xl, InterfaceC8042xl interfaceC8042xl2) {
        O90.f(interfaceC8042xl2, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.d.b + ": " + interfaceC8042xl + " vs " + interfaceC8042xl2).toString());
    }
}

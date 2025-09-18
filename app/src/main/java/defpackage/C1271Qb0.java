package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Qb0 */
/* loaded from: classes2.dex */
public class C1271Qb0 extends C2548cc0 {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1271Qb0(InterfaceC1115Ob0 interfaceC1115Ob0) {
        super(true);
        boolean z = true;
        C(interfaceC1115Ob0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2548cc0.b;
        InterfaceC0461Fr interfaceC0461Fr = (InterfaceC0461Fr) atomicReferenceFieldUpdater.get(this);
        C0539Gr c0539Gr = interfaceC0461Fr instanceof C0539Gr ? (C0539Gr) interfaceC0461Fr : null;
        if (c0539Gr == null) {
            z = false;
            break;
        }
        C2548cc0 c2548cc0I = c0539Gr.i();
        while (!c2548cc0I.x()) {
            InterfaceC0461Fr interfaceC0461Fr2 = (InterfaceC0461Fr) atomicReferenceFieldUpdater.get(c2548cc0I);
            C0539Gr c0539Gr2 = interfaceC0461Fr2 instanceof C0539Gr ? (C0539Gr) interfaceC0461Fr2 : null;
            if (c0539Gr2 == null) {
                z = false;
                break;
            }
            c2548cc0I = c0539Gr2.i();
        }
        this.c = z;
    }

    @Override // defpackage.C2548cc0
    public final boolean x() {
        return this.c;
    }

    @Override // defpackage.C2548cc0
    public final boolean y() {
        return true;
    }
}

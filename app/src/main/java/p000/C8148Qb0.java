package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Qb0 */
/* loaded from: classes2.dex */
public class C8148Qb0 extends C9002cc0 {

    /* renamed from: c */
    public final boolean f9686c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8148Qb0(InterfaceC8044Ob0 interfaceC8044Ob0) {
        super(true);
        boolean z = true;
        m10797C(interfaceC8044Ob0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C9002cc0.f17648b;
        InterfaceC0369Fr interfaceC0369Fr = (InterfaceC0369Fr) atomicReferenceFieldUpdater.get(this);
        C0432Gr c0432Gr = interfaceC0369Fr instanceof C0432Gr ? (C0432Gr) interfaceC0369Fr : null;
        if (c0432Gr == null) {
            z = false;
            break;
        }
        C9002cc0 c9002cc0M8084i = c0432Gr.m8084i();
        while (!c9002cc0M8084i.mo6732x()) {
            InterfaceC0369Fr interfaceC0369Fr2 = (InterfaceC0369Fr) atomicReferenceFieldUpdater.get(c9002cc0M8084i);
            C0432Gr c0432Gr2 = interfaceC0369Fr2 instanceof C0432Gr ? (C0432Gr) interfaceC0369Fr2 : null;
            if (c0432Gr2 == null) {
                z = false;
                break;
            }
            c9002cc0M8084i = c0432Gr2.m8084i();
        }
        this.f9686c = z;
    }

    @Override // p000.C9002cc0
    /* renamed from: x */
    public final boolean mo6732x() {
        return this.f9686c;
    }

    @Override // p000.C9002cc0
    /* renamed from: y */
    public final boolean mo6733y() {
        return true;
    }
}

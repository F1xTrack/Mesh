package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: yj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C8226yj implements InterfaceC6481pZ {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C8226yj(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC6481pZ
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                QI1.a((InterfaceC6099nZ) this.b, this.c, (InterfaceC0173Bz) obj3);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1091Nt0.g;
                ((C1013Mt0) this.c).getClass();
                C1091Nt0 c1091Nt0 = (C1091Nt0) this.b;
                atomicReferenceFieldUpdater.set(c1091Nt0, null);
                c1091Nt0.e(null);
                break;
        }
        return C1518Tf1.a;
    }
}

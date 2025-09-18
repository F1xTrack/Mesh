package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: yj */
/* loaded from: classes2.dex */
public final /* synthetic */ class C7219yj implements InterfaceC6625pZ {

    /* renamed from: a */
    public final /* synthetic */ int f46423a;

    /* renamed from: b */
    public final /* synthetic */ Object f46424b;

    /* renamed from: c */
    public final /* synthetic */ Object f46425c;

    public /* synthetic */ C7219yj(Object obj, int i, Object obj2) {
        this.f46423a = i;
        this.f46424b = obj;
        this.f46425c = obj2;
    }

    @Override // p000.InterfaceC6625pZ
    /* renamed from: b */
    public final Object mo300b(Object obj, Object obj2, Object obj3) {
        switch (this.f46423a) {
            case 0:
                QI1.m6628a((InterfaceC6497nZ) this.f46424b, this.f46425c, (InterfaceC0125Bz) obj3);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C8028Nt0.f8115g;
                ((C7976Mt0) this.f46425c).getClass();
                C8028Nt0 c8028Nt0 = (C8028Nt0) this.f46424b;
                atomicReferenceFieldUpdater.set(c8028Nt0, null);
                c8028Nt0.m5900e(null);
                break;
        }
        return C8313Tf1.f11463a;
    }
}

package p000;

import java.util.Iterator;

/* renamed from: L8 */
/* loaded from: classes2.dex */
public final class C0702L8 implements Iterable, InterfaceC11315ue0 {

    /* renamed from: a */
    public final /* synthetic */ int f6510a;

    /* renamed from: b */
    public final Object f6511b;

    public /* synthetic */ C0702L8(int i, Object obj) {
        this.f6510a = i;
        this.f6511b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Vg0, mZ] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f6510a) {
            case 0:
                return HN1.m3386a((Object[]) this.f6511b);
            case 1:
                return new C1780bM((Iterator) ((AbstractC8418Vg0) this.f6511b).invoke());
            default:
                return ((InterfaceC9127dY0) this.f6511b).iterator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0702L8(InterfaceC6434mZ interfaceC6434mZ) {
        this.f6510a = 1;
        this.f6511b = (AbstractC8418Vg0) interfaceC6434mZ;
    }
}

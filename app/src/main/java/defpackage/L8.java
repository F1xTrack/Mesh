package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class L8 implements Iterable, InterfaceC7451ue0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ L8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Vg0, mZ] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return HN1.a((Object[]) this.b);
            case 1:
                return new C2309bM((Iterator) ((AbstractC1676Vg0) this.b).invoke());
            default:
                return ((InterfaceC3412dY0) this.b).iterator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public L8(InterfaceC5908mZ interfaceC5908mZ) {
        this.a = 1;
        this.b = (AbstractC1676Vg0) interfaceC5908mZ;
    }
}

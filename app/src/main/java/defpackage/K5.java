package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class K5 implements I5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ K5(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.I5
    public final InterfaceC7916x5 D(KX kx) {
        switch (this.a) {
            case 0:
                return AbstractC6447pN1.a(this, kx);
            case 1:
                O90.f(kx, "fqName");
                return (InterfaceC7916x5) AbstractC4175hY0.h(AbstractC4175hY0.m(AbstractC8069xu.t((List) this.b), new C1330Qv(kx, 0)));
            default:
                O90.f(kx, "fqName");
                if (kx.equals((KX) this.b)) {
                    return LO.a;
                }
                return null;
        }
    }

    @Override // defpackage.I5
    public final boolean g(KX kx) {
        switch (this.a) {
            case 1:
                O90.f(kx, "fqName");
                Iterator it = ((Iterable) AbstractC8069xu.t((List) this.b).b).iterator();
                while (it.hasNext()) {
                    if (((I5) it.next()).g(kx)) {
                        break;
                    }
                }
                break;
        }
        return AbstractC6447pN1.c(this, kx);
    }

    @Override // defpackage.I5
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((List) this.b).isEmpty();
            case 1:
                List list = (List) this.b;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((I5) it.next()).isEmpty()) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((List) this.b).iterator();
            case 1:
                return new C7801wU(new C2339bW(AbstractC8069xu.t((List) this.b), C4258i.A, C5333jY0.a));
            default:
                return LN.a;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((List) this.b).toString();
            default:
                return super.toString();
        }
    }

    public K5(I5[] i5Arr) {
        this.a = 1;
        this.b = J8.D(i5Arr);
    }

    public K5(KX kx) {
        this.a = 2;
        O90.f(kx, "fqNameToMatch");
        this.b = kx;
    }
}

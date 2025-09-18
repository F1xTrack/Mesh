package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: K5 */
/* loaded from: classes2.dex */
public final class C0636K5 implements InterfaceC0510I5 {

    /* renamed from: a */
    public final /* synthetic */ int f5901a;

    /* renamed from: b */
    public final Object f5902b;

    public /* synthetic */ C0636K5(List list, int i) {
        this.f5901a = i;
        this.f5902b = list;
    }

    @Override // p000.InterfaceC0510I5
    /* renamed from: D */
    public final InterfaceC7116x5 mo3260D(C0664KX c0664kx) {
        switch (this.f5901a) {
            case 0:
                return AbstractC10642pN1.m23768a(this, c0664kx);
            case 1:
                O90.m5968f(c0664kx, "fqName");
                return (InterfaceC7116x5) AbstractC9639hY0.m18829h(AbstractC9639hY0.m18834m(AbstractC7167xu.m25992t((List) this.f5902b), new C1065Qv(c0664kx, 0)));
            default:
                O90.m5968f(c0664kx, "fqName");
                if (c0664kx.equals((C0664KX) this.f5902b)) {
                    return C0718LO.f6619a;
                }
                return null;
        }
    }

    @Override // p000.InterfaceC0510I5
    /* renamed from: g */
    public final boolean mo3261g(C0664KX c0664kx) {
        switch (this.f5901a) {
            case 1:
                O90.m5968f(c0664kx, "fqName");
                Iterator it = ((Iterable) AbstractC7167xu.m25992t((List) this.f5902b).f6999b).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC0510I5) it.next()).mo3261g(c0664kx)) {
                        break;
                    }
                }
                break;
        }
        return AbstractC10642pN1.m23770c(this, c0664kx);
    }

    @Override // p000.InterfaceC0510I5
    public final boolean isEmpty() {
        switch (this.f5901a) {
            case 0:
                return ((List) this.f5902b).isEmpty();
            case 1:
                List list = (List) this.f5902b;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC0510I5) it.next()).isEmpty()) {
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
        switch (this.f5901a) {
            case 0:
                return ((List) this.f5902b).iterator();
            case 1:
                return new C7078wU(new C1790bW(AbstractC7167xu.m25992t((List) this.f5902b), C4214i.f28712A, C9895jY0.f35220a));
            default:
                return C0717LN.f6616a;
        }
    }

    public String toString() {
        switch (this.f5901a) {
            case 0:
                return ((List) this.f5902b).toString();
            default:
                return super.toString();
        }
    }

    public C0636K5(InterfaceC0510I5[] interfaceC0510I5Arr) {
        this.f5901a = 1;
        this.f5902b = AbstractC0576J8.m4173D(interfaceC0510I5Arr);
    }

    public C0636K5(C0664KX c0664kx) {
        this.f5901a = 2;
        O90.m5968f(c0664kx, "fqNameToMatch");
        this.f5902b = c0664kx;
    }
}

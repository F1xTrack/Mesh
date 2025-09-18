package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: vU */
/* loaded from: classes2.dex */
public final class C7015vU implements InterfaceC0510I5 {

    /* renamed from: a */
    public final InterfaceC0510I5 f44388a;

    /* renamed from: b */
    public final C0726LX f44389b;

    public C7015vU(InterfaceC0510I5 interfaceC0510I5, C0726LX c0726lx) {
        this.f44388a = interfaceC0510I5;
        this.f44389b = c0726lx;
    }

    @Override // p000.InterfaceC0510I5
    /* renamed from: D */
    public final InterfaceC7116x5 mo3260D(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        if (((Boolean) this.f44389b.invoke(c0664kx)).booleanValue()) {
            return this.f44388a.mo3260D(c0664kx);
        }
        return null;
    }

    @Override // p000.InterfaceC0510I5
    /* renamed from: g */
    public final boolean mo3261g(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        if (((Boolean) this.f44389b.invoke(c0664kx)).booleanValue()) {
            return this.f44388a.mo3261g(c0664kx);
        }
        return false;
    }

    @Override // p000.InterfaceC0510I5
    public final boolean isEmpty() {
        InterfaceC0510I5 interfaceC0510I5 = this.f44388a;
        if ((interfaceC0510I5 instanceof Collection) && ((Collection) interfaceC0510I5).isEmpty()) {
            return false;
        }
        Iterator it = interfaceC0510I5.iterator();
        while (it.hasNext()) {
            C0664KX c0664kxMo4960f = ((InterfaceC7116x5) it.next()).mo4960f();
            if (c0664kxMo4960f != null && ((Boolean) this.f44389b.invoke(c0664kxMo4960f)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f44388a) {
            C0664KX c0664kxMo4960f = ((InterfaceC7116x5) obj).mo4960f();
            if (c0664kxMo4960f != null && ((Boolean) this.f44389b.invoke(c0664kxMo4960f)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}

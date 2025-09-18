package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: vU, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7611vU implements I5 {
    public final I5 a;
    public final LX b;

    public C7611vU(I5 i5, LX lx) {
        this.a = i5;
        this.b = lx;
    }

    @Override // defpackage.I5
    public final InterfaceC7916x5 D(KX kx) {
        O90.f(kx, "fqName");
        if (((Boolean) this.b.invoke(kx)).booleanValue()) {
            return this.a.D(kx);
        }
        return null;
    }

    @Override // defpackage.I5
    public final boolean g(KX kx) {
        O90.f(kx, "fqName");
        if (((Boolean) this.b.invoke(kx)).booleanValue()) {
            return this.a.g(kx);
        }
        return false;
    }

    @Override // defpackage.I5
    public final boolean isEmpty() {
        I5 i5 = this.a;
        if ((i5 instanceof Collection) && ((Collection) i5).isEmpty()) {
            return false;
        }
        Iterator it = i5.iterator();
        while (it.hasNext()) {
            KX kxF = ((InterfaceC7916x5) it.next()).f();
            if (kxF != null && ((Boolean) this.b.invoke(kxF)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            KX kxF = ((InterfaceC7916x5) obj).f();
            if (kxF != null && ((Boolean) this.b.invoke(kxF)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}

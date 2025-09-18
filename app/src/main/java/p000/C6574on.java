package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: on */
/* loaded from: classes.dex */
public final class C6574on extends AbstractC6511nn {

    /* renamed from: a */
    public final ArrayList f39260a = new ArrayList();

    public C6574on(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC6511nn abstractC6511nn = (AbstractC6511nn) it.next();
            if (!(abstractC6511nn instanceof C6639pn)) {
                this.f39260a.add(abstractC6511nn);
            }
        }
    }

    @Override // p000.AbstractC6511nn
    /* renamed from: a */
    public final void mo6422a(int i) {
        Iterator it = this.f39260a.iterator();
        while (it.hasNext()) {
            ((AbstractC6511nn) it.next()).mo6422a(i);
        }
    }

    @Override // p000.AbstractC6511nn
    /* renamed from: b */
    public final void mo5817b(int i, InterfaceC7034vn interfaceC7034vn) {
        Iterator it = this.f39260a.iterator();
        while (it.hasNext()) {
            ((AbstractC6511nn) it.next()).mo5817b(i, interfaceC7034vn);
        }
    }

    @Override // p000.AbstractC6511nn
    /* renamed from: c */
    public final void mo6423c(int i, C6702qn c6702qn) {
        Iterator it = this.f39260a.iterator();
        while (it.hasNext()) {
            ((AbstractC6511nn) it.next()).mo6423c(i, c6702qn);
        }
    }

    @Override // p000.AbstractC6511nn
    /* renamed from: d */
    public final void mo9610d(int i, int i2) {
        Iterator it = this.f39260a.iterator();
        while (it.hasNext()) {
            ((AbstractC6511nn) it.next()).mo9610d(i, i2);
        }
    }

    @Override // p000.AbstractC6511nn
    /* renamed from: e */
    public final void mo9611e(int i) {
        Iterator it = this.f39260a.iterator();
        while (it.hasNext()) {
            ((AbstractC6511nn) it.next()).mo9611e(i);
        }
    }
}

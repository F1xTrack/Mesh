package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: on, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6332on extends AbstractC6141nn {
    public final ArrayList a = new ArrayList();

    public C6332on(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC6141nn abstractC6141nn = (AbstractC6141nn) it.next();
            if (!(abstractC6141nn instanceof C6523pn)) {
                this.a.add(abstractC6141nn);
            }
        }
    }

    @Override // defpackage.AbstractC6141nn
    public final void a(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((AbstractC6141nn) it.next()).a(i);
        }
    }

    @Override // defpackage.AbstractC6141nn
    public final void b(int i, InterfaceC7668vn interfaceC7668vn) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((AbstractC6141nn) it.next()).b(i, interfaceC7668vn);
        }
    }

    @Override // defpackage.AbstractC6141nn
    public final void c(int i, C6714qn c6714qn) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((AbstractC6141nn) it.next()).c(i, c6714qn);
        }
    }

    @Override // defpackage.AbstractC6141nn
    public final void d(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((AbstractC6141nn) it.next()).d(i, i2);
        }
    }

    @Override // defpackage.AbstractC6141nn
    public final void e(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((AbstractC6141nn) it.next()).e(i);
        }
    }
}

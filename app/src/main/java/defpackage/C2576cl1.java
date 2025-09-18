package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: cl1 */
/* loaded from: classes.dex */
public final class C2576cl1 extends AbstractC3833fl1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C2576cl1(C5564kl1 c5564kl1, int i) {
        this.a = i;
        this.b = c5564kl1;
    }

    @Override // defpackage.AbstractC3833fl1
    public void a(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    ((C5564kl1) this.b).d();
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((AbstractC3833fl1) it.next()).a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
        }
    }

    @Override // defpackage.AbstractC3833fl1
    public void b(int i, float f, int i2) {
        switch (this.a) {
            case 2:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((AbstractC3833fl1) it.next()).b(i, f, i2);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC3833fl1
    public final void c(int i) {
        switch (this.a) {
            case 0:
                C5564kl1 c5564kl1 = (C5564kl1) this.b;
                if (c5564kl1.d != i) {
                    c5564kl1.d = i;
                    c5564kl1.t.z();
                    return;
                }
                return;
            case 1:
                C5564kl1 c5564kl12 = (C5564kl1) this.b;
                c5564kl12.clearFocus();
                if (c5564kl12.hasFocus()) {
                    c5564kl12.j.requestFocus(2);
                    return;
                }
                return;
            default:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((AbstractC3833fl1) it.next()).c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
        }
    }

    public C2576cl1() {
        this.a = 2;
        this.b = new ArrayList(3);
    }
}

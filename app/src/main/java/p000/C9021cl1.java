package p000;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: cl1 */
/* loaded from: classes.dex */
public final class C9021cl1 extends AbstractC9410fl1 {

    /* renamed from: a */
    public final /* synthetic */ int f17732a;

    /* renamed from: b */
    public final Object f17733b;

    public /* synthetic */ C9021cl1(C10050kl1 c10050kl1, int i) {
        this.f17732a = i;
        this.f17733b = c10050kl1;
    }

    @Override // p000.AbstractC9410fl1
    /* renamed from: a */
    public void mo6839a(int i) {
        switch (this.f17732a) {
            case 0:
                if (i == 0) {
                    ((C10050kl1) this.f17733b).m22264d();
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                try {
                    Iterator it = ((ArrayList) this.f17733b).iterator();
                    while (it.hasNext()) {
                        ((AbstractC9410fl1) it.next()).mo6839a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
        }
    }

    @Override // p000.AbstractC9410fl1
    /* renamed from: b */
    public void mo6840b(int i, float f, int i2) {
        switch (this.f17732a) {
            case 2:
                try {
                    Iterator it = ((ArrayList) this.f17733b).iterator();
                    while (it.hasNext()) {
                        ((AbstractC9410fl1) it.next()).mo6840b(i, f, i2);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            default:
                return;
        }
    }

    @Override // p000.AbstractC9410fl1
    /* renamed from: c */
    public final void mo6841c(int i) {
        switch (this.f17732a) {
            case 0:
                C10050kl1 c10050kl1 = (C10050kl1) this.f17733b;
                if (c10050kl1.f36664d != i) {
                    c10050kl1.f36664d = i;
                    c10050kl1.f36680t.m6159z();
                    return;
                }
                return;
            case 1:
                C10050kl1 c10050kl12 = (C10050kl1) this.f17733b;
                c10050kl12.clearFocus();
                if (c10050kl12.hasFocus()) {
                    c10050kl12.f36670j.requestFocus(2);
                    return;
                }
                return;
            default:
                try {
                    Iterator it = ((ArrayList) this.f17733b).iterator();
                    while (it.hasNext()) {
                        ((AbstractC9410fl1) it.next()).mo6841c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
        }
    }

    public C9021cl1() {
        this.f17732a = 2;
        this.f17733b = new ArrayList(3);
    }
}

package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: Mh */
/* loaded from: classes.dex */
public final class C0976Mh extends AbstractC1813Xa {
    public final WeakReference a;

    public C0976Mh(C1210Ph c1210Ph) {
        this.a = new WeakReference(c1210Ph);
    }

    @Override // defpackage.AbstractC1813Xa
    public final void a(int i, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || ((C1210Ph) weakReference.get()).o || !((C1210Ph) weakReference.get()).n) {
            return;
        }
        ((C1210Ph) weakReference.get()).e(new C7840wh(i, charSequence));
    }

    @Override // defpackage.AbstractC1813Xa
    public final void b(C0665Ih c0665Ih) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((C1210Ph) weakReference.get()).n) {
            return;
        }
        int i = -1;
        if (c0665Ih.b == -1) {
            int iC = ((C1210Ph) weakReference.get()).c();
            if ((iC & 32767) != 0 && !AbstractC5686lO1.e(iC)) {
                i = 2;
            }
            c0665Ih = new C0665Ih(c0665Ih.a, i);
        }
        C1210Ph c1210Ph = (C1210Ph) weakReference.get();
        if (c1210Ph.r == null) {
            c1210Ph.r = new C0390Et0();
        }
        C1210Ph.i(c1210Ph.r, c0665Ih);
    }
}

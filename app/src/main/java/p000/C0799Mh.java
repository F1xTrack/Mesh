package p000;

import java.lang.ref.WeakReference;

/* renamed from: Mh */
/* loaded from: classes.dex */
public final class C0799Mh extends AbstractC1484Xa {

    /* renamed from: a */
    public final WeakReference f7297a;

    public C0799Mh(C0988Ph c0988Ph) {
        this.f7297a = new WeakReference(c0988Ph);
    }

    @Override // p000.AbstractC1484Xa
    /* renamed from: a */
    public final void mo5426a(int i, CharSequence charSequence) {
        WeakReference weakReference = this.f7297a;
        if (weakReference.get() == null || ((C0988Ph) weakReference.get()).f9238o || !((C0988Ph) weakReference.get()).f9237n) {
            return;
        }
        ((C0988Ph) weakReference.get()).m6414e(new C7091wh(i, charSequence));
    }

    @Override // p000.AbstractC1484Xa
    /* renamed from: b */
    public final void mo5427b(C0548Ih c0548Ih) {
        WeakReference weakReference = this.f7297a;
        if (weakReference.get() == null || !((C0988Ph) weakReference.get()).f9237n) {
            return;
        }
        int i = -1;
        if (c0548Ih.f5083b == -1) {
            int iM6412c = ((C0988Ph) weakReference.get()).m6412c();
            if ((iM6412c & 32767) != 0 && !AbstractC10132lO1.m22420e(iM6412c)) {
                i = 2;
            }
            c0548Ih = new C0548Ih(c0548Ih.f5082a, i);
        }
        C0988Ph c0988Ph = (C0988Ph) weakReference.get();
        if (c0988Ph.f9241r == null) {
            c0988Ph.f9241r = new C7560Et0();
        }
        C0988Ph.m6411i(c0988Ph.f9241r, c0548Ih);
    }
}

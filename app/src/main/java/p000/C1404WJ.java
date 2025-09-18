package p000;

import java.io.EOFException;

/* renamed from: WJ */
/* loaded from: classes.dex */
public final class C1404WJ implements InterfaceC8357Ub1 {

    /* renamed from: a */
    public final byte[] f13132a = new byte[4096];

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: b */
    public final void mo961b(C9591hA0 c9591hA0, int i, int i2) {
        c9591hA0.m18742H(i);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: c */
    public final int mo962c(InterfaceC1082RC interfaceC1082RC, int i, boolean z) throws EOFException {
        byte[] bArr = this.f13132a;
        int iMo2367r = interfaceC1082RC.mo2367r(bArr, 0, Math.min(bArr.length, i));
        if (iMo2367r != -1) {
            return iMo2367r;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: d */
    public final /* synthetic */ void mo963d(int i, C9591hA0 c9591hA0) {
        F91.m2531n(this, c9591hA0, i);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: e */
    public final int mo964e(InterfaceC1082RC interfaceC1082RC, int i, boolean z) {
        return mo962c(interfaceC1082RC, i, z);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: f */
    public final void mo965f(C6686qX c6686qX) {
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: a */
    public final void mo960a(long j, int i, int i2, int i3, C8305Tb1 c8305Tb1) {
    }
}

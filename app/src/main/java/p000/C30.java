package p000;

import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class C30 implements InterfaceC8357Ub1 {

    /* renamed from: f */
    public static final C6686qX f1154f;

    /* renamed from: g */
    public static final C6686qX f1155g;

    /* renamed from: a */
    public final InterfaceC8357Ub1 f1156a;

    /* renamed from: b */
    public final C6686qX f1157b;

    /* renamed from: c */
    public C6686qX f1158c;

    /* renamed from: d */
    public byte[] f1159d;

    /* renamed from: e */
    public int f1160e;

    static {
        C6623pX c6623pX = new C6623pX();
        c6623pX.f40161l = AbstractC8544Xr0.m9171n("application/id3");
        f1154f = new C6686qX(c6623pX);
        C6623pX c6623pX2 = new C6623pX();
        c6623pX2.f40161l = AbstractC8544Xr0.m9171n("application/x-emsg");
        f1155g = new C6686qX(c6623pX2);
    }

    public C30(InterfaceC8357Ub1 interfaceC8357Ub1, int i) {
        this.f1156a = interfaceC8357Ub1;
        if (i == 1) {
            this.f1157b = f1154f;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Unknown metadataType: "));
            }
            this.f1157b = f1155g;
        }
        this.f1159d = new byte[0];
        this.f1160e = 0;
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: a */
    public final void mo960a(long j, int i, int i2, int i3, C8305Tb1 c8305Tb1) {
        this.f1158c.getClass();
        int i4 = this.f1160e - i3;
        C9591hA0 c9591hA0 = new C9591hA0(Arrays.copyOfRange(this.f1159d, i4 - i2, i4));
        byte[] bArr = this.f1159d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f1160e = i3;
        String str = this.f1158c.f40974m;
        C6686qX c6686qX = this.f1157b;
        if (!AbstractC7485Dh1.m1812a(str, c6686qX.f40974m)) {
            if (!"application/x-emsg".equals(this.f1158c.f40974m)) {
                AbstractC10872rA1.m24175h("Ignoring sample for unsupported format: " + this.f1158c.f40974m);
                return;
            }
            C0719LP c0719lpM3311e = C0449H7.m3311e(c9591hA0);
            C6686qX c6686qXMo30A = c0719lpM3311e.mo30A();
            String str2 = c6686qX.f40974m;
            if (c6686qXMo30A == null || !AbstractC7485Dh1.m1812a(str2, c6686qXMo30A.f40974m)) {
                AbstractC10872rA1.m24175h("Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + c0719lpM3311e.mo30A());
                return;
            }
            byte[] bArrMo32e0 = c0719lpM3311e.mo32e0();
            bArrMo32e0.getClass();
            c9591hA0 = new C9591hA0(bArrMo32e0);
        }
        int iM18743a = c9591hA0.m18743a();
        InterfaceC8357Ub1 interfaceC8357Ub1 = this.f1156a;
        interfaceC8357Ub1.mo963d(iM18743a, c9591hA0);
        interfaceC8357Ub1.mo960a(j, i, iM18743a, 0, c8305Tb1);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: b */
    public final void mo961b(C9591hA0 c9591hA0, int i, int i2) {
        int i3 = this.f1160e + i;
        byte[] bArr = this.f1159d;
        if (bArr.length < i3) {
            this.f1159d = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        c9591hA0.m18747e(this.f1159d, this.f1160e, i);
        this.f1160e += i;
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: c */
    public final int mo962c(InterfaceC1082RC interfaceC1082RC, int i, boolean z) throws EOFException {
        int i2 = this.f1160e + i;
        byte[] bArr = this.f1159d;
        if (bArr.length < i2) {
            this.f1159d = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int iMo2367r = interfaceC1082RC.mo2367r(this.f1159d, this.f1160e, i);
        if (iMo2367r != -1) {
            this.f1160e += iMo2367r;
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
        this.f1158c = c6686qX;
        this.f1156a.mo965f(this.f1157b);
    }
}

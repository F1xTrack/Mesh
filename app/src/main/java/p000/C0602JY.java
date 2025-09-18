package p000;

import kotlin.KotlinVersion;

/* renamed from: JY */
/* loaded from: classes.dex */
public final class C0602JY {

    /* renamed from: a */
    public final InterfaceC8357Ub1 f5587a;

    /* renamed from: d */
    public C8409Vb1 f5590d;

    /* renamed from: e */
    public C7001vG f5591e;

    /* renamed from: f */
    public int f5592f;

    /* renamed from: g */
    public int f5593g;

    /* renamed from: h */
    public int f5594h;

    /* renamed from: i */
    public int f5595i;

    /* renamed from: l */
    public boolean f5598l;

    /* renamed from: b */
    public final C8097Pb1 f5588b = new C8097Pb1();

    /* renamed from: c */
    public final C9591hA0 f5589c = new C9591hA0();

    /* renamed from: j */
    public final C9591hA0 f5596j = new C9591hA0(1);

    /* renamed from: k */
    public final C9591hA0 f5597k = new C9591hA0();

    public C0602JY(InterfaceC8357Ub1 interfaceC8357Ub1, C8409Vb1 c8409Vb1, C7001vG c7001vG) {
        this.f5587a = interfaceC8357Ub1;
        this.f5590d = c8409Vb1;
        this.f5591e = c7001vG;
        this.f5590d = c8409Vb1;
        this.f5591e = c7001vG;
        interfaceC8357Ub1.mo965f(c8409Vb1.f12631a.f7902f);
        m4349d();
    }

    /* renamed from: a */
    public final C8045Ob1 m4346a() {
        if (!this.f5598l) {
            return null;
        }
        C8097Pb1 c8097Pb1 = this.f5588b;
        C7001vG c7001vG = c8097Pb1.f9162a;
        int i = AbstractC7485Dh1.f2166a;
        int i2 = c7001vG.f44306a;
        C8045Ob1 c8045Ob1 = c8097Pb1.f9174m;
        if (c8045Ob1 == null) {
            C8045Ob1[] c8045Ob1Arr = this.f5590d.f12631a.f7907k;
            c8045Ob1 = c8045Ob1Arr == null ? null : c8045Ob1Arr[i2];
        }
        if (c8045Ob1 == null || !c8045Ob1.f8512a) {
            return null;
        }
        return c8045Ob1;
    }

    /* renamed from: b */
    public final boolean m4347b() {
        this.f5592f++;
        if (!this.f5598l) {
            return false;
        }
        int i = this.f5593g + 1;
        this.f5593g = i;
        int[] iArr = this.f5588b.f9168g;
        int i2 = this.f5594h;
        if (i != iArr[i2]) {
            return true;
        }
        this.f5594h = i2 + 1;
        this.f5593g = 0;
        return false;
    }

    /* renamed from: c */
    public final int m4348c(int i, int i2) {
        C9591hA0 c9591hA0;
        C8045Ob1 c8045Ob1M4346a = m4346a();
        if (c8045Ob1M4346a == null) {
            return 0;
        }
        C8097Pb1 c8097Pb1 = this.f5588b;
        int length = c8045Ob1M4346a.f8515d;
        if (length != 0) {
            c9591hA0 = c8097Pb1.f9175n;
        } else {
            int i3 = AbstractC7485Dh1.f2166a;
            byte[] bArr = c8045Ob1M4346a.f8516e;
            int length2 = bArr.length;
            C9591hA0 c9591hA02 = this.f5597k;
            c9591hA02.m18739E(length2, bArr);
            length = bArr.length;
            c9591hA0 = c9591hA02;
        }
        boolean z = c8097Pb1.f9172k && c8097Pb1.f9173l[this.f5592f];
        boolean z2 = z || i2 != 0;
        C9591hA0 c9591hA03 = this.f5596j;
        c9591hA03.f28293a[0] = (byte) ((z2 ? 128 : 0) | length);
        c9591hA03.m18741G(0);
        InterfaceC8357Ub1 interfaceC8357Ub1 = this.f5587a;
        interfaceC8357Ub1.mo961b(c9591hA03, 1, 1);
        interfaceC8357Ub1.mo961b(c9591hA0, length, 1);
        if (!z2) {
            return length + 1;
        }
        C9591hA0 c9591hA04 = this.f5589c;
        if (!z) {
            c9591hA04.m18738D(8);
            byte[] bArr2 = c9591hA04.f28293a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[4] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[5] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[6] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[7] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            interfaceC8357Ub1.mo961b(c9591hA04, 8, 1);
            return length + 9;
        }
        C9591hA0 c9591hA05 = c8097Pb1.f9175n;
        int iM18735A = c9591hA05.m18735A();
        c9591hA05.m18742H(-2);
        int i4 = (iM18735A * 6) + 2;
        if (i2 != 0) {
            c9591hA04.m18738D(i4);
            byte[] bArr3 = c9591hA04.f28293a;
            c9591hA05.m18747e(bArr3, 0, i4);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr3[3] = (byte) (i5 & KotlinVersion.MAX_COMPONENT_VALUE);
        } else {
            c9591hA04 = c9591hA05;
        }
        interfaceC8357Ub1.mo961b(c9591hA04, i4, 1);
        return length + 1 + i4;
    }

    /* renamed from: d */
    public final void m4349d() {
        C8097Pb1 c8097Pb1 = this.f5588b;
        c8097Pb1.f9165d = 0;
        c8097Pb1.f9177p = 0L;
        c8097Pb1.f9178q = false;
        c8097Pb1.f9172k = false;
        c8097Pb1.f9176o = false;
        c8097Pb1.f9174m = null;
        this.f5592f = 0;
        this.f5594h = 0;
        this.f5593g = 0;
        this.f5595i = 0;
        this.f5598l = false;
    }
}

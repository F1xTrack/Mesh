package p000;

import java.util.ArrayList;

/* renamed from: df */
/* loaded from: classes.dex */
public final class C3942df {

    /* renamed from: a */
    public final ArrayList f26180a;

    /* renamed from: b */
    public final int f26181b;

    /* renamed from: c */
    public final int f26182c;

    /* renamed from: d */
    public final int f26183d;

    /* renamed from: e */
    public final int f26184e;

    /* renamed from: f */
    public final int f26185f;

    /* renamed from: g */
    public final int f26186g;

    /* renamed from: h */
    public final int f26187h;

    /* renamed from: i */
    public final int f26188i;

    /* renamed from: j */
    public final int f26189j;

    /* renamed from: k */
    public final float f26190k;

    /* renamed from: l */
    public final String f26191l;

    public C3942df(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.f26180a = arrayList;
        this.f26181b = i;
        this.f26182c = i2;
        this.f26183d = i3;
        this.f26184e = i4;
        this.f26185f = i5;
        this.f26186g = i6;
        this.f26187h = i7;
        this.f26188i = i8;
        this.f26189j = i9;
        this.f26190k = f;
        this.f26191l = str;
    }

    /* renamed from: a */
    public static C3942df m17725a(C9591hA0 c9591hA0) throws C10103lA0 {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        String str;
        int i8;
        try {
            c9591hA0.m18742H(4);
            int iM18763u = (c9591hA0.m18763u() & 3) + 1;
            if (iM18763u == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM18763u2 = c9591hA0.m18763u() & 31;
            int i9 = 0;
            while (true) {
                bArr = AbstractC11362v10.f44086a;
                if (i9 >= iM18763u2) {
                    break;
                }
                int iM18735A = c9591hA0.m18735A();
                int i10 = c9591hA0.f28294b;
                c9591hA0.m18742H(iM18735A);
                byte[] bArr2 = c9591hA0.f28293a;
                byte[] bArr3 = new byte[iM18735A + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i10, bArr3, 4, iM18735A);
                arrayList.add(bArr3);
                i9++;
            }
            int iM18763u3 = c9591hA0.m18763u();
            for (int i11 = 0; i11 < iM18763u3; i11++) {
                int iM18735A2 = c9591hA0.m18735A();
                int i12 = c9591hA0.f28294b;
                c9591hA0.m18742H(iM18735A2);
                byte[] bArr4 = c9591hA0.f28293a;
                byte[] bArr5 = new byte[iM18735A2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i12, bArr5, 4, iM18735A2);
                arrayList.add(bArr5);
            }
            if (iM18763u2 > 0) {
                C8288St0 c8288St0M7617g = TA1.m7617g((byte[]) arrayList.get(0), iM18763u, ((byte[]) arrayList.get(0)).length);
                int i13 = c8288St0M7617g.f11028e;
                int i14 = c8288St0M7617g.f11029f;
                int i15 = c8288St0M7617g.f11031h + 8;
                int i16 = c8288St0M7617g.f11032i + 8;
                int i17 = c8288St0M7617g.f11039p;
                int i18 = c8288St0M7617g.f11040q;
                int i19 = c8288St0M7617g.f11041r;
                int i20 = c8288St0M7617g.f11042s;
                float f2 = c8288St0M7617g.f11030g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(c8288St0M7617g.f11024a), Integer.valueOf(c8288St0M7617g.f11025b), Integer.valueOf(c8288St0M7617g.f11026c));
                i7 = i19;
                i8 = i20;
                f = f2;
                i4 = i16;
                i5 = i17;
                i6 = i18;
                i = i13;
                i2 = i14;
                i3 = i15;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                f = 1.0f;
                str = null;
                i8 = 16;
            }
            return new C3942df(arrayList, iM18763u, i, i2, i3, i4, i5, i6, i7, i8, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C10103lA0.m22366a(e, "Error parsing AVC config");
        }
    }
}

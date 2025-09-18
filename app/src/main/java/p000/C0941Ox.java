package p000;

import android.view.ViewGroup;

/* renamed from: Ox */
/* loaded from: classes.dex */
public final class C0941Ox extends ViewGroup.MarginLayoutParams {

    /* renamed from: A */
    public float f8696A;

    /* renamed from: B */
    public String f8697B;

    /* renamed from: C */
    public int f8698C;

    /* renamed from: D */
    public float f8699D;

    /* renamed from: E */
    public float f8700E;

    /* renamed from: F */
    public int f8701F;

    /* renamed from: G */
    public int f8702G;

    /* renamed from: H */
    public int f8703H;

    /* renamed from: I */
    public int f8704I;

    /* renamed from: J */
    public int f8705J;

    /* renamed from: K */
    public int f8706K;

    /* renamed from: L */
    public int f8707L;

    /* renamed from: M */
    public int f8708M;

    /* renamed from: N */
    public float f8709N;

    /* renamed from: O */
    public float f8710O;

    /* renamed from: P */
    public int f8711P;

    /* renamed from: Q */
    public int f8712Q;

    /* renamed from: R */
    public int f8713R;

    /* renamed from: S */
    public boolean f8714S;

    /* renamed from: T */
    public boolean f8715T;

    /* renamed from: U */
    public String f8716U;

    /* renamed from: V */
    public boolean f8717V;

    /* renamed from: W */
    public boolean f8718W;

    /* renamed from: X */
    public boolean f8719X;

    /* renamed from: Y */
    public boolean f8720Y;

    /* renamed from: Z */
    public boolean f8721Z;

    /* renamed from: a */
    public int f8722a;

    /* renamed from: a0 */
    public int f8723a0;

    /* renamed from: b */
    public int f8724b;

    /* renamed from: b0 */
    public int f8725b0;

    /* renamed from: c */
    public float f8726c;

    /* renamed from: c0 */
    public int f8727c0;

    /* renamed from: d */
    public int f8728d;

    /* renamed from: d0 */
    public int f8729d0;

    /* renamed from: e */
    public int f8730e;

    /* renamed from: e0 */
    public int f8731e0;

    /* renamed from: f */
    public int f8732f;

    /* renamed from: f0 */
    public int f8733f0;

    /* renamed from: g */
    public int f8734g;

    /* renamed from: g0 */
    public float f8735g0;

    /* renamed from: h */
    public int f8736h;

    /* renamed from: h0 */
    public int f8737h0;

    /* renamed from: i */
    public int f8738i;

    /* renamed from: i0 */
    public int f8739i0;

    /* renamed from: j */
    public int f8740j;

    /* renamed from: j0 */
    public float f8741j0;

    /* renamed from: k */
    public int f8742k;

    /* renamed from: k0 */
    public C3960dy f8743k0;

    /* renamed from: l */
    public int f8744l;

    /* renamed from: m */
    public int f8745m;

    /* renamed from: n */
    public int f8746n;

    /* renamed from: o */
    public float f8747o;

    /* renamed from: p */
    public int f8748p;

    /* renamed from: q */
    public int f8749q;

    /* renamed from: r */
    public int f8750r;

    /* renamed from: s */
    public int f8751s;

    /* renamed from: t */
    public int f8752t;

    /* renamed from: u */
    public int f8753u;

    /* renamed from: v */
    public int f8754v;

    /* renamed from: w */
    public int f8755w;

    /* renamed from: x */
    public int f8756x;

    /* renamed from: y */
    public int f8757y;

    /* renamed from: z */
    public float f8758z;

    /* renamed from: a */
    public final void m6188a() {
        this.f8720Y = false;
        this.f8717V = true;
        this.f8718W = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f8714S) {
            this.f8717V = false;
            if (this.f8703H == 0) {
                this.f8703H = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f8715T) {
            this.f8718W = false;
            if (this.f8704I == 0) {
                this.f8704I = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f8717V = false;
            if (i == 0 && this.f8703H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f8714S = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f8718W = false;
            if (i2 == 0 && this.f8704I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f8715T = true;
            }
        }
        if (this.f8726c == -1.0f && this.f8722a == -1 && this.f8724b == -1) {
            return;
        }
        this.f8720Y = true;
        this.f8717V = true;
        this.f8718W = true;
        if (!(this.f8743k0 instanceof C9573h20)) {
            this.f8743k0 = new C9573h20();
        }
        ((C9573h20) this.f8743k0).m18700B(this.f8713R);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0941Ox.resolveLayoutDirection(int):void");
    }
}

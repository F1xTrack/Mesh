package p000;

/* renamed from: Mn1 */
/* loaded from: classes.dex */
public abstract class AbstractC7965Mn1 {

    /* renamed from: a */
    public final C8433Vn1 f7348a;

    /* renamed from: b */
    public J80[] f7349b;

    public AbstractC7965Mn1() {
        this(new C8433Vn1());
    }

    /* renamed from: a */
    public final void m5436a() {
        J80[] j80Arr = this.f7349b;
        if (j80Arr != null) {
            J80 j80Mo5837f = j80Arr[0];
            J80 j80Mo5837f2 = j80Arr[1];
            C8433Vn1 c8433Vn1 = this.f7348a;
            if (j80Mo5837f2 == null) {
                j80Mo5837f2 = c8433Vn1.f12756a.mo5837f(2);
            }
            if (j80Mo5837f == null) {
                j80Mo5837f = c8433Vn1.f12756a.mo5837f(1);
            }
            mo4416g(J80.m4200a(j80Mo5837f, j80Mo5837f2));
            J80 j80 = this.f7349b[AbstractC9444g12.m18381a(16)];
            if (j80 != null) {
                mo4714f(j80);
            }
            J80 j802 = this.f7349b[AbstractC9444g12.m18381a(32)];
            if (j802 != null) {
                mo4713d(j802);
            }
            J80 j803 = this.f7349b[AbstractC9444g12.m18381a(64)];
            if (j803 != null) {
                mo4715h(j803);
            }
        }
    }

    /* renamed from: b */
    public abstract C8433Vn1 mo4414b();

    /* renamed from: c */
    public void mo5106c(int i, J80 j80) {
        if (this.f7349b == null) {
            this.f7349b = new J80[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f7349b[AbstractC9444g12.m18381a(i2)] = j80;
            }
        }
    }

    /* renamed from: e */
    public abstract void mo4415e(J80 j80);

    /* renamed from: g */
    public abstract void mo4416g(J80 j80);

    public AbstractC7965Mn1(C8433Vn1 c8433Vn1) {
        this.f7348a = c8433Vn1;
    }

    /* renamed from: d */
    public void mo4713d(J80 j80) {
    }

    /* renamed from: f */
    public void mo4714f(J80 j80) {
    }

    /* renamed from: h */
    public void mo4715h(J80 j80) {
    }
}

package p000;

/* renamed from: s00 */
/* loaded from: classes.dex */
public abstract class AbstractC10975s00 implements Cloneable {

    /* renamed from: a */
    public final B00 f42193a;

    /* renamed from: b */
    public B00 f42194b;

    /* renamed from: c */
    public boolean f42195c = false;

    public AbstractC10975s00(B00 b00) {
        this.f42193a = b00;
        this.f42194b = (B00) b00.mo432d(4);
    }

    /* renamed from: i */
    public static void m24566i(B00 b00, B00 b002) {
        ZF0 zf0 = ZF0.f14820c;
        zf0.getClass();
        zf0.m9517a(b00.getClass()).mo2323g(b00, b002);
    }

    /* renamed from: a */
    public final B00 m24567a() {
        B00 b00M24568e = m24568e();
        if (b00M24568e.m433g()) {
            return b00M24568e;
        }
        throw new C6838sg();
    }

    public final Object clone() {
        AbstractC10975s00 abstractC10975s00 = (AbstractC10975s00) this.f42193a.mo432d(5);
        B00 b00M24568e = m24568e();
        abstractC10975s00.m24569h();
        m24566i(abstractC10975s00.f42194b, b00M24568e);
        return abstractC10975s00;
    }

    /* renamed from: e */
    public final B00 m24568e() {
        if (this.f42195c) {
            return this.f42194b;
        }
        B00 b00 = this.f42194b;
        b00.getClass();
        ZF0 zf0 = ZF0.f14820c;
        zf0.getClass();
        zf0.m9517a(b00.getClass()).mo2318b(b00);
        this.f42195c = true;
        return this.f42194b;
    }

    /* renamed from: h */
    public final void m24569h() {
        if (this.f42195c) {
            B00 b00 = (B00) this.f42194b.mo432d(4);
            m24566i(b00, this.f42194b);
            this.f42194b = b00;
            this.f42195c = false;
        }
    }
}

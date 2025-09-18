package defpackage;

/* renamed from: s00 */
/* loaded from: classes.dex */
public abstract class AbstractC6945s00 implements Cloneable {
    public final B00 a;
    public B00 b;
    public boolean c = false;

    public AbstractC6945s00(B00 b00) {
        this.a = b00;
        this.b = (B00) b00.d(4);
    }

    public static void i(B00 b00, B00 b002) {
        ZF0 zf0 = ZF0.c;
        zf0.getClass();
        zf0.a(b00.getClass()).g(b00, b002);
    }

    public final B00 a() {
        B00 b00E = e();
        if (b00E.g()) {
            return b00E;
        }
        throw new C7074sg();
    }

    public final Object clone() {
        AbstractC6945s00 abstractC6945s00 = (AbstractC6945s00) this.a.d(5);
        B00 b00E = e();
        abstractC6945s00.h();
        i(abstractC6945s00.b, b00E);
        return abstractC6945s00;
    }

    public final B00 e() {
        if (this.c) {
            return this.b;
        }
        B00 b00 = this.b;
        b00.getClass();
        ZF0 zf0 = ZF0.c;
        zf0.getClass();
        zf0.a(b00.getClass()).b(b00);
        this.c = true;
        return this.b;
    }

    public final void h() {
        if (this.c) {
            B00 b00 = (B00) this.b.d(4);
            i(b00, this.b);
            this.b = b00;
            this.c = false;
        }
    }
}

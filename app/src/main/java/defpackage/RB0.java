package defpackage;

/* loaded from: classes.dex */
public final class RB0 extends GX {
    public final /* synthetic */ int c = 0;
    public final Object d;

    public RB0(AbstractC0178Ca1 abstractC0178Ca1, C6721qp0 c6721qp0) {
        super(abstractC0178Ca1);
        this.d = c6721qp0;
    }

    @Override // defpackage.GX, defpackage.AbstractC0178Ca1
    public C0022Aa1 f(int i, C0022Aa1 c0022Aa1, boolean z) {
        switch (this.c) {
            case 0:
                AbstractC0178Ca1 abstractC0178Ca1 = this.b;
                C0022Aa1 c0022Aa1F = abstractC0178Ca1.f(i, c0022Aa1, z);
                if (abstractC0178Ca1.m(c0022Aa1F.c, (C0100Ba1) this.d, 0L).a()) {
                    c0022Aa1F.h(c0022Aa1.a, c0022Aa1.b, c0022Aa1.c, c0022Aa1.d, c0022Aa1.e, C3507e3.c, true);
                } else {
                    c0022Aa1F.f = true;
                }
                return c0022Aa1F;
            default:
                return super.f(i, c0022Aa1, z);
        }
    }

    @Override // defpackage.GX, defpackage.AbstractC0178Ca1
    public C0100Ba1 m(int i, C0100Ba1 c0100Ba1, long j) {
        switch (this.c) {
            case 1:
                super.m(i, c0100Ba1, j);
                C6721qp0 c6721qp0 = (C6721qp0) this.d;
                c0100Ba1.c = c6721qp0;
                C5957mp0 c5957mp0 = c6721qp0.b;
                c0100Ba1.getClass();
                return c0100Ba1;
            default:
                return super.m(i, c0100Ba1, j);
        }
    }

    public RB0(AbstractC0178Ca1 abstractC0178Ca1) {
        super(abstractC0178Ca1);
        this.d = new C0100Ba1();
    }
}

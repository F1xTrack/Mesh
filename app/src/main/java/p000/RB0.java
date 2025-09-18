package p000;

/* loaded from: classes.dex */
public final class RB0 extends AbstractC0412GX {

    /* renamed from: c */
    public final /* synthetic */ int f10057c = 0;

    /* renamed from: d */
    public final Object f10058d;

    public RB0(AbstractC7419Ca1 abstractC7419Ca1, C10825qp0 c10825qp0) {
        super(abstractC7419Ca1);
        this.f10058d = c10825qp0;
    }

    @Override // p000.AbstractC0412GX, p000.AbstractC7419Ca1
    /* renamed from: f */
    public C7315Aa1 mo1249f(int i, C7315Aa1 c7315Aa1, boolean z) {
        switch (this.f10057c) {
            case 0:
                AbstractC7419Ca1 abstractC7419Ca1 = this.f3796b;
                C7315Aa1 c7315Aa1Mo1249f = abstractC7419Ca1.mo1249f(i, c7315Aa1, z);
                if (abstractC7419Ca1.mo1256m(c7315Aa1Mo1249f.f258c, (C7367Ba1) this.f10058d, 0L).m772a()) {
                    c7315Aa1Mo1249f.m243h(c7315Aa1.f256a, c7315Aa1.f257b, c7315Aa1.f258c, c7315Aa1.f259d, c7315Aa1.f260e, C3966e3.f26513c, true);
                } else {
                    c7315Aa1Mo1249f.f261f = true;
                }
                return c7315Aa1Mo1249f;
            default:
                return super.mo1249f(i, c7315Aa1, z);
        }
    }

    @Override // p000.AbstractC0412GX, p000.AbstractC7419Ca1
    /* renamed from: m */
    public C7367Ba1 mo1256m(int i, C7367Ba1 c7367Ba1, long j) {
        switch (this.f10057c) {
            case 1:
                super.mo1256m(i, c7367Ba1, j);
                C10825qp0 c10825qp0 = (C10825qp0) this.f10058d;
                c7367Ba1.f916c = c10825qp0;
                C10313mp0 c10313mp0 = c10825qp0.f41186b;
                c7367Ba1.getClass();
                return c7367Ba1;
            default:
                return super.mo1256m(i, c7367Ba1, j);
        }
    }

    public RB0(AbstractC7419Ca1 abstractC7419Ca1) {
        super(abstractC7419Ca1);
        this.f10058d = new C7367Ba1();
    }
}

package p000;

/* renamed from: vx0 */
/* loaded from: classes.dex */
public final class C11481vx0 implements InterfaceC11343us0 {

    /* renamed from: c */
    public static volatile C10585ox0 f44617c;

    /* renamed from: a */
    public final /* synthetic */ int f44618a;

    /* renamed from: b */
    public final Object f44619b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11481vx0(int i) {
        this(f44617c);
        this.f44618a = i;
        switch (i) {
            case 1:
                this.f44619b = new C10212m12(11);
                return;
            case 2:
                this.f44619b = new C9196e41(23);
                return;
            default:
                if (f44617c == null) {
                    synchronized (C11481vx0.class) {
                        try {
                            if (f44617c == null) {
                                f44617c = new C10585ox0();
                            }
                        } finally {
                        }
                    }
                }
                return;
        }
    }

    @Override // p000.InterfaceC11343us0
    /* renamed from: a */
    public final InterfaceC11215ts0 mo8114a(T71 t71) {
        switch (this.f44618a) {
            case 0:
                return new C6382lk(3, (C10585ox0) this.f44619b);
            case 1:
                return new C6382lk(1, (C10212m12) this.f44619b);
            default:
                return new C11371v40((C9196e41) this.f44619b);
        }
    }

    public C11481vx0(C10585ox0 c10585ox0) {
        this.f44618a = 0;
        this.f44619b = c10585ox0;
    }
}

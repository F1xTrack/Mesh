package defpackage;

/* renamed from: vx0 */
/* loaded from: classes.dex */
public final class C7699vx0 implements InterfaceC7493us0 {
    public static volatile C6363ox0 c;
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7699vx0(int i) {
        this(c);
        this.a = i;
        switch (i) {
            case 1:
                this.b = new C5806m12(11);
                return;
            case 2:
                this.b = new C3513e41(23);
                return;
            default:
                if (c == null) {
                    synchronized (C7699vx0.class) {
                        try {
                            if (c == null) {
                                c = new C6363ox0();
                            }
                        } finally {
                        }
                    }
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC7493us0
    public final InterfaceC7302ts0 a(T71 t71) {
        switch (this.a) {
            case 0:
                return new C5750lk(3, (C6363ox0) this.b);
            case 1:
                return new C5750lk(1, (C5806m12) this.b);
            default:
                return new C7534v40((C3513e41) this.b);
        }
    }

    public C7699vx0(C6363ox0 c6363ox0) {
        this.a = 0;
        this.b = c6363ox0;
    }
}

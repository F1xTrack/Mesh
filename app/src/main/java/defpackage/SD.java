package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class SD extends AbstractC7837wg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ SD(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.AbstractC7837wg
    public final void a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((AtomicBoolean) this.b).set(true);
                break;
            case 2:
                ((C8420zk0) this.b).a();
                break;
            case 3:
                ((C0129Bk0) this.b).a();
                break;
            case 4:
                ((C0285Dk0) this.b).a();
                break;
            case 5:
                ((C0129Bk0) this.b).a();
                break;
            default:
                C6794rC0 c6794rC0 = (C6794rC0) this.b;
                if (c6794rC0.o()) {
                    c6794rC0.b.c();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC7837wg
    public void b() {
        switch (this.a) {
            case 0:
                TD td = (TD) this.b;
                if (((C7647vg) td.c).g()) {
                    td.h.d();
                    break;
                }
                break;
        }
    }

    private final void e() {
    }
}

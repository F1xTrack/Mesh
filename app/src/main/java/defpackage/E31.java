package defpackage;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class E31 extends AbstractC7067sd1 {
    public static final E8 c = new E8(5);
    public final /* synthetic */ int a;
    public final AbstractC7067sd1 b;

    public /* synthetic */ E31(AbstractC7067sd1 abstractC7067sd1, int i) {
        this.a = i;
        this.b = abstractC7067sd1;
    }

    @Override // defpackage.AbstractC7067sd1
    public final void a(C0885Lc0 c0885Lc0, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                this.b.a(c0885Lc0, (Timestamp) obj);
                break;
            case 1:
                this.b.a(c0885Lc0, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 2:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c0885Lc0.n();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.b.a(c0885Lc0, Long.valueOf(atomicLongArray.get(i)));
                }
                c0885Lc0.w();
                break;
            default:
                if (obj == null) {
                    c0885Lc0.J();
                    break;
                } else {
                    this.b.a(c0885Lc0, obj);
                    break;
                }
        }
    }
}

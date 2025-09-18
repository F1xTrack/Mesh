package p000;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class E31 extends AbstractC11058sd1 {

    /* renamed from: c */
    public static final C0261E8 f2443c = new C0261E8(5);

    /* renamed from: a */
    public final /* synthetic */ int f2444a;

    /* renamed from: b */
    public final AbstractC11058sd1 f2445b;

    public /* synthetic */ E31(AbstractC11058sd1 abstractC11058sd1, int i) {
        this.f2444a = i;
        this.f2445b = abstractC11058sd1;
    }

    @Override // p000.AbstractC11058sd1
    /* renamed from: a */
    public final void mo246a(C7890Lc0 c7890Lc0, Object obj) throws IOException {
        switch (this.f2444a) {
            case 0:
                this.f2445b.mo246a(c7890Lc0, (Timestamp) obj);
                break;
            case 1:
                this.f2445b.mo246a(c7890Lc0, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 2:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c7890Lc0.m5044n();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.f2445b.mo246a(c7890Lc0, Long.valueOf(atomicLongArray.get(i)));
                }
                c7890Lc0.m5047w();
                break;
            default:
                if (obj == null) {
                    c7890Lc0.m5034J();
                    break;
                } else {
                    this.f2445b.mo246a(c7890Lc0, obj);
                    break;
                }
        }
    }
}

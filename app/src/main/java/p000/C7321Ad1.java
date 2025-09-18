package p000;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Ad1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7321Ad1 extends AbstractC11058sd1 {

    /* renamed from: a */
    public final /* synthetic */ int f297a;

    @Override // p000.AbstractC11058sd1
    /* renamed from: a */
    public final void mo246a(C7890Lc0 c7890Lc0, Object obj) throws IOException {
        switch (this.f297a) {
            case 0:
                c7890Lc0.m5041e0(((AtomicBoolean) obj).get());
                break;
            default:
                c7890Lc0.m5038X(((AtomicInteger) obj).get());
                break;
        }
    }
}

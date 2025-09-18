package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Ad1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031Ad1 extends AbstractC7067sd1 {
    public final /* synthetic */ int a;

    @Override // defpackage.AbstractC7067sd1
    public final void a(C0885Lc0 c0885Lc0, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                c0885Lc0.e0(((AtomicBoolean) obj).get());
                break;
            default:
                c0885Lc0.X(((AtomicInteger) obj).get());
                break;
        }
    }
}

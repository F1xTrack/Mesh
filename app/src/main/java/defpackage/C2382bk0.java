package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2382bk0 implements InterfaceC3677ex0 {
    public final AtomicBoolean a = new AtomicBoolean(true);
    public final InterfaceC3296cx0 b;
    public final Executor c;

    public C2382bk0(Executor executor, InterfaceC3296cx0 interfaceC3296cx0) {
        this.c = executor;
        this.b = interfaceC3296cx0;
    }

    @Override // defpackage.InterfaceC3677ex0
    public final void r0(Object obj) {
        this.c.execute(new RQ(this, 16, (C2572ck0) obj));
    }
}

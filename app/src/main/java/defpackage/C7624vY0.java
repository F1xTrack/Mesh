package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: vY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7624vY0 implements InterfaceC7814wY0 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final InterfaceC7814wY0 b;

    public C7624vY0(InterfaceC7814wY0 interfaceC7814wY0) {
        this.b = interfaceC7814wY0;
    }

    @Override // defpackage.InterfaceC7814wY0
    public final void a(C8194yY0 c8194yY0) {
        if (this.a.get()) {
            return;
        }
        this.b.a(c8194yY0);
    }

    public final void b() {
        this.a.set(true);
    }
}

package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: vY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11431vY0 implements InterfaceC11558wY0 {

    /* renamed from: a */
    public final AtomicBoolean f44409a = new AtomicBoolean(false);

    /* renamed from: b */
    public final InterfaceC11558wY0 f44410b;

    public C11431vY0(InterfaceC11558wY0 interfaceC11558wY0) {
        this.f44410b = interfaceC11558wY0;
    }

    @Override // p000.InterfaceC11558wY0
    /* renamed from: a */
    public final void mo10586a(C11812yY0 c11812yY0) {
        if (this.f44409a.get()) {
            return;
        }
        this.f44410b.mo10586a(c11812yY0);
    }

    /* renamed from: b */
    public final void m25443b() {
        this.f44409a.set(true);
    }
}

package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class ZX0 extends KX0 {

    /* renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f14960e;

    public ZX0(long j, ZX0 zx0, int i) {
        super(j, zx0, i);
        this.f14960e = new AtomicReferenceArray(YX0.f14336f);
    }

    @Override // p000.KX0
    /* renamed from: g */
    public final int mo4664g() {
        return YX0.f14336f;
    }

    @Override // p000.KX0
    /* renamed from: h */
    public final void mo4665h(int i, InterfaceC0125Bz interfaceC0125Bz) {
        this.f14960e.set(i, YX0.f14335e);
        m4666i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f6149c + ", hashCode=" + hashCode() + ']';
    }
}

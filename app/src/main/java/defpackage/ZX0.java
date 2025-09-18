package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class ZX0 extends KX0 {
    public final /* synthetic */ AtomicReferenceArray e;

    public ZX0(long j, ZX0 zx0, int i) {
        super(j, zx0, i);
        this.e = new AtomicReferenceArray(YX0.f);
    }

    @Override // defpackage.KX0
    public final int g() {
        return YX0.f;
    }

    @Override // defpackage.KX0
    public final void h(int i, InterfaceC0173Bz interfaceC0173Bz) {
        this.e.set(i, YX0.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}

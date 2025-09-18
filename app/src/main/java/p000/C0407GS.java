package p000;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: GS */
/* loaded from: classes2.dex */
public final class C0407GS extends AbstractC0286EX {

    /* renamed from: b */
    public final AbstractC8418Vg0 f3739b;

    /* renamed from: c */
    public boolean f3740c;

    /* JADX WARN: Multi-variable type inference failed */
    public C0407GS(C6868t9 c6868t9, InterfaceC6497nZ interfaceC6497nZ) {
        super(c6868t9);
        this.f3739b = (AbstractC8418Vg0) interfaceC6497nZ;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Vg0, nZ] */
    @Override // p000.AbstractC0286EX, p000.Z11
    /* renamed from: c0 */
    public final void mo2328c0(C6507nj c6507nj, long j) throws EOFException {
        O90.m5968f(c6507nj, "source");
        if (this.f3740c) {
            c6507nj.m23185i0(j);
            return;
        }
        try {
            super.mo2328c0(c6507nj, j);
        } catch (IOException e) {
            this.f3740c = true;
            this.f3739b.invoke(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Vg0, nZ] */
    @Override // p000.AbstractC0286EX, p000.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3740c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.f3740c = true;
            this.f3739b.invoke(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Vg0, nZ] */
    @Override // p000.AbstractC0286EX, p000.Z11, java.io.Flushable
    public final void flush() {
        if (this.f3740c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.f3740c = true;
            this.f3739b.invoke(e);
        }
    }
}

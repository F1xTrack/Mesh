package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class GS extends EX {
    public final AbstractC1676Vg0 b;
    public boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public GS(C7166t9 c7166t9, InterfaceC6099nZ interfaceC6099nZ) {
        super(c7166t9);
        this.b = (AbstractC1676Vg0) interfaceC6099nZ;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Vg0, nZ] */
    @Override // defpackage.EX, defpackage.Z11
    public final void c0(C6129nj c6129nj, long j) throws EOFException {
        O90.f(c6129nj, "source");
        if (this.c) {
            c6129nj.i0(j);
            return;
        }
        try {
            super.c0(c6129nj, j);
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Vg0, nZ] */
    @Override // defpackage.EX, defpackage.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Vg0, nZ] */
    @Override // defpackage.EX, defpackage.Z11, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }
}

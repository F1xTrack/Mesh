package defpackage;

import java.util.NoSuchElementException;

/* renamed from: qg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6693qg implements InterfaceC0375Eo0 {
    public final long a;
    public final long b;
    public long c;

    public AbstractC6693qg(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j - 1;
    }

    public final void a() {
        long j = this.c;
        if (j < this.a || j > this.b) {
            throw new NoSuchElementException();
        }
    }

    @Override // defpackage.InterfaceC0375Eo0
    public final boolean next() {
        long j = this.c + 1;
        this.c = j;
        return !(j > this.b);
    }
}

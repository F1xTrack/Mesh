package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class MX0 extends LX0 {
    public final List j;

    public MX0(C3939gJ0 c3939gJ0, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(c3939gJ0, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // defpackage.LX0
    public final long d(long j) {
        return this.j.size();
    }

    @Override // defpackage.LX0
    public final C3939gJ0 h(C6076nR0 c6076nR0, long j) {
        return (C3939gJ0) this.j.get((int) (j - this.d));
    }

    @Override // defpackage.LX0
    public final boolean i() {
        return true;
    }
}

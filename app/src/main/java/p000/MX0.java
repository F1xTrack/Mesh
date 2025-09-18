package p000;

import java.util.List;

/* loaded from: classes.dex */
public final class MX0 extends LX0 {

    /* renamed from: j */
    public final List f7216j;

    public MX0(C9481gJ0 c9481gJ0, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(c9481gJ0, j, j2, j3, j4, list, j5, j6, j7);
        this.f7216j = list2;
    }

    @Override // p000.LX0
    /* renamed from: d */
    public final long mo5017d(long j) {
        return this.f7216j.size();
    }

    @Override // p000.LX0
    /* renamed from: h */
    public final C9481gJ0 mo5021h(C10393nR0 c10393nR0, long j) {
        return (C9481gJ0) this.f7216j.get((int) (j - this.f6695d));
    }

    @Override // p000.LX0
    /* renamed from: i */
    public final boolean mo5022i() {
        return true;
    }
}

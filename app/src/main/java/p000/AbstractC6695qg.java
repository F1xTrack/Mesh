package p000;

import java.util.NoSuchElementException;

/* renamed from: qg */
/* loaded from: classes.dex */
public abstract class AbstractC6695qg implements InterfaceC7550Eo0 {

    /* renamed from: a */
    public final long f41097a;

    /* renamed from: b */
    public final long f41098b;

    /* renamed from: c */
    public long f41099c;

    public AbstractC6695qg(long j, long j2) {
        this.f41097a = j;
        this.f41098b = j2;
        this.f41099c = j - 1;
    }

    /* renamed from: a */
    public final void m24041a() {
        long j = this.f41099c;
        if (j < this.f41097a || j > this.f41098b) {
            throw new NoSuchElementException();
        }
    }

    @Override // p000.InterfaceC7550Eo0
    public final boolean next() {
        long j = this.f41099c + 1;
        this.f41099c = j;
        return !(j > this.f41098b);
    }
}

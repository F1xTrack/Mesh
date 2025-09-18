package defpackage;

import java.io.IOException;

/* renamed from: e40 */
/* loaded from: classes2.dex */
public final class C3512e40 extends P81 {
    public final /* synthetic */ C4085h40 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ C6129nj g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3512e40(String str, C4085h40 c4085h40, int i, C6129nj c6129nj, int i2, boolean z) {
        super(str, true);
        this.e = c4085h40;
        this.f = i;
        this.g = c6129nj;
        this.h = i2;
    }

    @Override // defpackage.P81
    public final long a() {
        try {
            TE te = this.e.k;
            C6129nj c6129nj = this.g;
            int i = this.h;
            te.getClass();
            c6129nj.i0(i);
            this.e.w.l(this.f, 9);
            synchronized (this.e) {
                this.e.y.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}

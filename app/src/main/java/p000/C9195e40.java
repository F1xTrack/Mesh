package p000;

import java.io.IOException;

/* renamed from: e40 */
/* loaded from: classes2.dex */
public final class C9195e40 extends P81 {

    /* renamed from: e */
    public final /* synthetic */ C9579h40 f26524e;

    /* renamed from: f */
    public final /* synthetic */ int f26525f;

    /* renamed from: g */
    public final /* synthetic */ C6507nj f26526g;

    /* renamed from: h */
    public final /* synthetic */ int f26527h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9195e40(String str, C9579h40 c9579h40, int i, C6507nj c6507nj, int i2, boolean z) {
        super(str, true);
        this.f26524e = c9579h40;
        this.f26525f = i;
        this.f26526g = c6507nj;
        this.f26527h = i2;
    }

    @Override // p000.P81
    /* renamed from: a */
    public final long mo4621a() {
        try {
            C1210TE c1210te = this.f26524e.f28224k;
            C6507nj c6507nj = this.f26526g;
            int i = this.f26527h;
            c1210te.getClass();
            c6507nj.m23185i0(i);
            this.f26524e.f28236w.m23603l(this.f26525f, 9);
            synchronized (this.f26524e) {
                this.f26524e.f28238y.remove(Integer.valueOf(this.f26525f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}

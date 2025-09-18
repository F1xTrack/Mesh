package defpackage;

import java.io.IOException;

/* renamed from: g40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3894g40 extends P81 {
    public final /* synthetic */ C4085h40 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3894g40(String str, C4085h40 c4085h40, int i, long j) {
        super(str, true);
        this.e = c4085h40;
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.P81
    public final long a() throws IOException {
        C4085h40 c4085h40 = this.e;
        try {
            c4085h40.w.n(this.f, this.g);
            return -1L;
        } catch (IOException e) {
            c4085h40.a(2, 2, e);
            return -1L;
        }
    }
}

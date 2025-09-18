package p000;

import java.io.IOException;

/* renamed from: g40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9451g40 extends P81 {

    /* renamed from: e */
    public final /* synthetic */ C9579h40 f27549e;

    /* renamed from: f */
    public final /* synthetic */ int f27550f;

    /* renamed from: g */
    public final /* synthetic */ long f27551g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9451g40(String str, C9579h40 c9579h40, int i, long j) {
        super(str, true);
        this.f27549e = c9579h40;
        this.f27550f = i;
        this.f27551g = j;
    }

    @Override // p000.P81
    /* renamed from: a */
    public final long mo4621a() throws IOException {
        C9579h40 c9579h40 = this.f27549e;
        try {
            c9579h40.f28236w.m23605n(this.f27550f, this.f27551g);
            return -1L;
        } catch (IOException e) {
            c9579h40.m18713a(2, 2, e);
            return -1L;
        }
    }
}

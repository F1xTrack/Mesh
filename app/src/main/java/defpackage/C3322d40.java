package defpackage;

import java.io.IOException;

/* renamed from: d40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3322d40 extends P81 {
    public final /* synthetic */ int e;
    public final /* synthetic */ C4085h40 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3322d40(String str, C4085h40 c4085h40, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.f = c4085h40;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.P81
    public final long a() throws IOException {
        switch (this.e) {
            case 0:
                int i = this.g;
                int i2 = this.h;
                C4085h40 c4085h40 = this.f;
                c4085h40.getClass();
                try {
                    c4085h40.w.j(i, i2, true);
                    return -1L;
                } catch (IOException e) {
                    c4085h40.a(2, 2, e);
                    return -1L;
                }
            case 1:
                TE te = this.f.k;
                int i3 = this.h;
                te.getClass();
                NX.m(i3, "errorCode");
                synchronized (this.f) {
                    this.f.y.remove(Integer.valueOf(this.g));
                }
                return -1L;
            default:
                C4085h40 c4085h402 = this.f;
                try {
                    int i4 = this.g;
                    int i5 = this.h;
                    c4085h402.getClass();
                    NX.m(i5, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
                    c4085h402.w.l(i4, i5);
                    return -1L;
                } catch (IOException e2) {
                    c4085h402.a(2, 2, e2);
                    return -1L;
                }
        }
    }
}

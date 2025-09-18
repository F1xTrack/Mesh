package p000;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;

/* renamed from: d40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9067d40 extends P81 {

    /* renamed from: e */
    public final /* synthetic */ int f25792e;

    /* renamed from: f */
    public final /* synthetic */ C9579h40 f25793f;

    /* renamed from: g */
    public final /* synthetic */ int f25794g;

    /* renamed from: h */
    public final /* synthetic */ int f25795h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9067d40(String str, C9579h40 c9579h40, int i, int i2, int i3) {
        super(str, true);
        this.f25792e = i3;
        this.f25793f = c9579h40;
        this.f25794g = i;
        this.f25795h = i2;
    }

    @Override // p000.P81
    /* renamed from: a */
    public final long mo4621a() throws IOException {
        switch (this.f25792e) {
            case 0:
                int i = this.f25794g;
                int i2 = this.f25795h;
                C9579h40 c9579h40 = this.f25793f;
                c9579h40.getClass();
                try {
                    c9579h40.f28236w.m23602j(i, i2, true);
                    return -1L;
                } catch (IOException e) {
                    c9579h40.m18713a(2, 2, e);
                    return -1L;
                }
            case 1:
                C1210TE c1210te = this.f25793f.f28224k;
                int i3 = this.f25795h;
                c1210te.getClass();
                AbstractC0852NX.m5764m(i3, "errorCode");
                synchronized (this.f25793f) {
                    this.f25793f.f28238y.remove(Integer.valueOf(this.f25794g));
                }
                return -1L;
            default:
                C9579h40 c9579h402 = this.f25793f;
                try {
                    int i4 = this.f25794g;
                    int i5 = this.f25795h;
                    c9579h402.getClass();
                    AbstractC0852NX.m5764m(i5, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
                    c9579h402.f28236w.m23603l(i4, i5);
                    return -1L;
                } catch (IOException e2) {
                    c9579h402.m18713a(2, 2, e2);
                    return -1L;
                }
        }
    }
}

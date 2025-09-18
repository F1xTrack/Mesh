package p000;

import com.p018my.tracker.obfuscated.C2313f0;
import java.io.IOException;
import java.util.Map;

/* renamed from: Wt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8497Wt1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f13442a;

    /* renamed from: b */
    public final /* synthetic */ C2313f0 f13443b;

    /* renamed from: c */
    public final /* synthetic */ Map f13444c;

    /* renamed from: d */
    public final /* synthetic */ long f13445d;

    public /* synthetic */ RunnableC8497Wt1(int i, long j, C2313f0 c2313f0, Map map) {
        this.f13442a = i;
        this.f13443b = c2313f0;
        this.f13444c = map;
        this.f13445d = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f13442a) {
            case 0:
                this.f13443b.m13005a(this.f13444c, this.f13445d);
                break;
            default:
                this.f13443b.m13020b(this.f13444c, this.f13445d);
                break;
        }
    }
}

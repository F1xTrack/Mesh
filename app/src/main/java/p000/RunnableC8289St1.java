package p000;

import com.p018my.tracker.obfuscated.C2313f0;
import java.io.IOException;
import java.util.Map;

/* renamed from: St1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8289St1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f11043a;

    /* renamed from: b */
    public final /* synthetic */ C2313f0 f11044b;

    /* renamed from: c */
    public final /* synthetic */ Map f11045c;

    /* renamed from: d */
    public final /* synthetic */ String f11046d;

    /* renamed from: e */
    public final /* synthetic */ String f11047e;

    /* renamed from: f */
    public final /* synthetic */ long f11048f;

    public /* synthetic */ RunnableC8289St1(C2313f0 c2313f0, Map map, String str, String str2, long j, int i) {
        this.f11043a = i;
        this.f11044b = c2313f0;
        this.f11045c = map;
        this.f11046d = str;
        this.f11047e = str2;
        this.f11048f = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f11043a) {
            case 0:
                this.f11044b.m13021b(this.f11045c, this.f11046d, this.f11047e, this.f11048f);
                break;
            default:
                this.f11044b.m13006a(this.f11045c, this.f11046d, this.f11047e, this.f11048f);
                break;
        }
    }
}

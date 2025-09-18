package p000;

import com.p018my.tracker.obfuscated.C2313f0;
import java.io.IOException;
import java.util.Map;

/* renamed from: Vt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8445Vt1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f12849a;

    /* renamed from: b */
    public final /* synthetic */ C2313f0 f12850b;

    /* renamed from: c */
    public final /* synthetic */ String f12851c;

    /* renamed from: d */
    public final /* synthetic */ long f12852d;

    /* renamed from: e */
    public final /* synthetic */ Object f12853e;

    public /* synthetic */ RunnableC8445Vt1(C2313f0 c2313f0, String str, Object obj, long j, int i) {
        this.f12849a = i;
        this.f12850b = c2313f0;
        this.f12851c = str;
        this.f12853e = obj;
        this.f12852d = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f12849a) {
            case 0:
                this.f12850b.m13002a(this.f12851c, (Map) this.f12853e, this.f12852d);
                break;
            default:
                this.f12850b.m12998a(this.f12851c, (String) this.f12853e, this.f12852d);
                break;
        }
    }
}

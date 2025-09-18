package p000;

import com.p018my.tracker.obfuscated.C2313f0;
import java.io.IOException;
import java.util.List;

/* renamed from: Yt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8601Yt1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f14580a;

    /* renamed from: b */
    public final /* synthetic */ C2313f0 f14581b;

    /* renamed from: c */
    public final /* synthetic */ List f14582c;

    public /* synthetic */ RunnableC8601Yt1(C2313f0 c2313f0, List list, int i) {
        this.f14580a = i;
        this.f14581b = c2313f0;
        this.f14582c = list;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f14580a) {
            case 0:
                this.f14581b.m13019b(this.f14582c);
                break;
            default:
                this.f14581b.m13003a(this.f14582c);
                break;
        }
    }
}

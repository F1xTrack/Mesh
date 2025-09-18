package p000;

import com.p018my.tracker.obfuscated.C2313f0;
import java.io.IOException;

/* renamed from: Ut1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8393Ut1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f12190a;

    /* renamed from: b */
    public final /* synthetic */ C2313f0 f12191b;

    /* renamed from: c */
    public final /* synthetic */ String f12192c;

    /* renamed from: d */
    public final /* synthetic */ String f12193d;

    /* renamed from: e */
    public final /* synthetic */ long f12194e;

    /* renamed from: f */
    public final /* synthetic */ long f12195f;

    /* renamed from: g */
    public final /* synthetic */ long f12196g;

    public /* synthetic */ RunnableC8393Ut1(C2313f0 c2313f0, String str, String str2, long j, long j2, long j3, int i) {
        this.f12190a = i;
        this.f12191b = c2313f0;
        this.f12192c = str;
        this.f12193d = str2;
        this.f12194e = j;
        this.f12195f = j2;
        this.f12196g = j3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f12190a) {
            case 0:
                this.f12191b.m13018b(this.f12192c, this.f12193d, this.f12194e, this.f12195f, this.f12196g);
                break;
            default:
                this.f12191b.m12999a(this.f12192c, this.f12193d, this.f12194e, this.f12195f, this.f12196g);
                break;
        }
    }
}

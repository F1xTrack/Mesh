package defpackage;

import ru.ok.tracer.profiler.sampling.SamplingProfiler;
import ru.ok.tracer.profiler.systrace.SystraceProfiler;

/* renamed from: eV0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3593eV0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public /* synthetic */ RunnableC3593eV0(int i, String str, long j) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SamplingProfiler.start$lambda$0(this.b, this.c);
                break;
            default:
                SystraceProfiler.start$lambda$0(this.b, this.c);
                break;
        }
    }
}

package p000;

import ru.p031ok.tracer.profiler.sampling.SamplingProfiler;
import ru.p031ok.tracer.profiler.systrace.SystraceProfiler;

/* renamed from: eV0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9249eV0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26725a;

    /* renamed from: b */
    public final /* synthetic */ String f26726b;

    /* renamed from: c */
    public final /* synthetic */ long f26727c;

    public /* synthetic */ RunnableC9249eV0(int i, String str, long j) {
        this.f26725a = i;
        this.f26726b = str;
        this.f26727c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26725a) {
            case 0:
                SamplingProfiler.start$lambda$0(this.f26726b, this.f26727c);
                break;
            default:
                SystraceProfiler.start$lambda$0(this.f26726b, this.f26727c);
                break;
        }
    }
}

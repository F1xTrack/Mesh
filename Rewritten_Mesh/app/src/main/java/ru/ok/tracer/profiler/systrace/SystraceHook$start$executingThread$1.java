package ru.ok.tracer.profiler.systrace;

import android.content.Context;
import defpackage.A3;
import defpackage.O90;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import ru.ok.tracer.profiler.systrace.SystraceHook;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ru/ok/tracer/profiler/systrace/SystraceHook$start$executingThread$1", "Ljava/lang/Thread;", "LTf1;", "run", "()V", "tracer-profiler-systrace_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SystraceHook$start$executingThread$1 extends Thread {
    final /* synthetic */ Context $context;
    final /* synthetic */ SystraceHook.TraceListener $traceListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystraceHook$start$executingThread$1(Context context, SystraceHook.TraceListener traceListener) {
        super("Tracer-systrace");
        this.$context = context;
        this.$traceListener = traceListener;
    }

    public static final void run$lambda$0() {
        Logger.d$default("Systrace: Send stop.", null, 2, null);
        SystraceHook.INSTANCE.stopProcess();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            File newSampleFile$default = TracerFiles.getNewSampleFile$default(TracerFiles.INSTANCE, this.$context, FEATURE_SYSTRACEKt.getFEATURE_SYSTRACE(), null, 4, null);
            Logger.d$default("Systrace: Processing...", null, 2, null);
            this.$traceListener.onStart(this, new A3(14));
            SystraceHook systraceHook = SystraceHook.INSTANCE;
            String string = newSampleFile$default.toString();
            O90.e(string, "file.toString()");
            systraceHook.process(string);
            Logger.d$default("Systrace: Processing stopped. Execute consumer", null, 2, null);
            this.$traceListener.onFinish(newSampleFile$default);
            Logger.d$default("Systrace: Write finished.", null, 2, null);
        } catch (IOException unused) {
        }
    }
}

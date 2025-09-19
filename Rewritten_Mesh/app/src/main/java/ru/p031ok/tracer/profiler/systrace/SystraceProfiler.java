package ru.p031ok.tracer.profiler.systrace;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import kotlin.Metadata;
import p000.C0842NN;
import p000.O90;
import p000.RunnableC0004A3;
import p000.RunnableC10783qU0;
import p000.RunnableC7273za;
import p000.RunnableC9249eV0;
import ru.p031ok.tracer.upload.SampleUploader;
import ru.p031ok.tracer.utils.Logger;
import ru.p031ok.tracer.utils.TracerThreads;
import ru.p031ok.tracer.utils.config.ConfigStorage;

@Metadata(m22266d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005+,-./B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u0019\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0003J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0012\u0010\rJ!\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0083\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020&8C@CX\u0082\u000e¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010\u0003¨\u00060"}, m22267d2 = {"Lru/ok/tracer/profiler/systrace/SystraceProfiler;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "tag", "", "duration", "LTf1;", "start", "(Landroid/content/Context;Ljava/lang/String;J)V", "(Ljava/lang/String;J)V", "tagSuffix", "commit", "(Ljava/lang/String;)V", "abort", "onStart", "", "send", "onStop", "(ZLjava/lang/String;)V", "Ljava/io/File;", "sampleFile", "onUpload", "(Ljava/io/File;Ljava/lang/String;J)V", "Ljava/lang/Runnable;", "runnable", "runOnMain", "(Ljava/lang/Runnable;)V", "init$tracer_profiler_systrace_release", "(Landroid/content/Context;)V", "init", "Landroid/content/Context;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Lru/ok/tracer/profiler/systrace/SystraceProfiler$State;", "<set-?>", "state", "Lru/ok/tracer/profiler/systrace/SystraceProfiler$State;", "getState$annotations", "Finished", "InProgress", "None", "Preparing", "State", "tracer-profiler-systrace_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes2.dex */
public final class SystraceProfiler {
    private static Context context;
    public static final SystraceProfiler INSTANCE = new SystraceProfiler();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static State state = None.INSTANCE;

    @Metadata(m22266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m22267d2 = {"Lru/ok/tracer/profiler/systrace/SystraceProfiler$Finished;", "Lru/ok/tracer/profiler/systrace/SystraceProfiler$State;", "sampleFile", "Ljava/io/File;", "tag", "", "duration", "", "(Ljava/io/File;Ljava/lang/String;J)V", "getDuration", "()J", "getSampleFile", "()Ljava/io/File;", "getTag", "()Ljava/lang/String;", "tracer-profiler-systrace_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Finished implements State {
        private final long duration;
        private final File sampleFile;
        private final String tag;

        public Finished(File file, String str, long j) {
            O90.m5968f(file, "sampleFile");
            O90.m5968f(str, "tag");
            this.sampleFile = file;
            this.tag = str;
            this.duration = j;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final File getSampleFile() {
            return this.sampleFile;
        }

        public final String getTag() {
            return this.tag;
        }
    }

    @Metadata(m22266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m22267d2 = {"Lru/ok/tracer/profiler/systrace/SystraceProfiler$InProgress;", "Lru/ok/tracer/profiler/systrace/SystraceProfiler$State;", "execThread", "Ljava/lang/Thread;", "stopRunnable", "Ljava/lang/Runnable;", "(Ljava/lang/Thread;Ljava/lang/Runnable;)V", "getExecThread", "()Ljava/lang/Thread;", "getStopRunnable", "()Ljava/lang/Runnable;", "tracer-profiler-systrace_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class InProgress implements State {
        private final Thread execThread;
        private final Runnable stopRunnable;

        public InProgress(Thread thread, Runnable runnable) {
            O90.m5968f(thread, "execThread");
            O90.m5968f(runnable, "stopRunnable");
            this.execThread = thread;
            this.stopRunnable = runnable;
        }

        public final Thread getExecThread() {
            return this.execThread;
        }

        public final Runnable getStopRunnable() {
            return this.stopRunnable;
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m22267d2 = {"Lru/ok/tracer/profiler/systrace/SystraceProfiler$None;", "Lru/ok/tracer/profiler/systrace/SystraceProfiler$State;", "()V", "tracer-profiler-systrace_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class None implements State {
        public static final None INSTANCE = new None();

        private None() {
        }
    }

    @Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m22267d2 = {"Lru/ok/tracer/profiler/systrace/SystraceProfiler$Preparing;", "Lru/ok/tracer/profiler/systrace/SystraceProfiler$State;", "()V", "tracer-profiler-systrace_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Preparing implements State {
        public static final Preparing INSTANCE = new Preparing();

        private Preparing() {
        }
    }

    @Metadata(m22266d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bb\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m22267d2 = {"Lru/ok/tracer/profiler/systrace/SystraceProfiler$State;", "", "tracer-profiler-systrace_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public interface State {
    }

    private SystraceProfiler() {
    }

    public static final void abort() {
        RunnableC0004A3 runnableC0004A3 = new RunnableC0004A3(15);
        if (O90.m5963a(Looper.myLooper(), Looper.getMainLooper())) {
            runnableC0004A3.run();
        } else {
            mainHandler.post(runnableC0004A3);
        }
    }

    public static final void abort$lambda$2() {
        onStop$default(INSTANCE, false, null, 2, null);
    }

    public static final void commit() {
        commit$default(null, 1, null);
    }

    public static /* synthetic */ void commit$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        commit(str);
    }

    public static final void commit$lambda$1(String str) {
        O90.m5968f(str, "$tagSuffix");
        INSTANCE.onStop(true, str);
    }

    private static /* synthetic */ void getState$annotations() {
    }

    private final void onStart(String tag, long duration) {
        if (!SystraceProfilerConfiguration.INSTANCE.get$tracer_profiler_systrace_release().getEnabled()) {
            Logger.d$default("SystraceProfiler: disabled", null, 2, null);
            return;
        }
        if (!O90.m5963a(state, None.INSTANCE)) {
            Logger.d$default("SystraceProfiler: Is in progress", null, 2, null);
            return;
        }
        if (ConfigStorage.INSTANCE.isLimited(FEATURE_SYSTRACEKt.getFEATURE_SYSTRACE(), tag)) {
            Logger.d$default("SystraceProfiler: Limited", null, 2, null);
            return;
        }
        SystraceHook systraceHook = SystraceHook.INSTANCE;
        if (!systraceHook.install(true)) {
            Logger.d$default("SystraceProfiler: Can't install hook", null, 2, null);
            return;
        }
        SystraceProfiler$onStart$traceListener$1 systraceProfiler$onStart$traceListener$1 = new SystraceProfiler$onStart$traceListener$1(duration, SystemClock.elapsedRealtime(), tag);
        Context context2 = context;
        if (context2 == null) {
            O90.m5977o("context");
            throw null;
        }
        systraceHook.start(context2, systraceProfiler$onStart$traceListener$1);
        state = Preparing.INSTANCE;
    }

    private final void onStop(final boolean send, final String tagSuffix) {
        final State state2 = state;
        None none = None.INSTANCE;
        if (O90.m5963a(state2, none) || O90.m5963a(state2, Preparing.INSTANCE)) {
            return;
        }
        if (state2 instanceof InProgress) {
            Logger.d$default("SystraceProfiler: Profiling in progress and will be stopped. Need commit result = " + send, null, 2, null);
            mainHandler.removeCallbacksAndMessages(null);
            ((InProgress) state2).getStopRunnable().run();
            TracerThreads.INSTANCE.runOnIo(new Runnable() { // from class: ru.ok.tracer.profiler.systrace.a
                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    SystraceProfiler.onStop$lambda$4(state2, send, tagSuffix);
                }
            });
            return;
        }
        if (state2 instanceof Finished) {
            Logger.d$default("SystraceProfiler: Profiling already ended and now computing result. Need send = " + send, null, 2, null);
            if (send) {
                TracerThreads.INSTANCE.runOnIo(new Runnable() { // from class: ru.ok.tracer.profiler.systrace.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        SystraceProfiler.onStop$lambda$5(state2, tagSuffix);
                    }
                });
            }
            state = none;
        }
    }

    public static /* synthetic */ void onStop$default(SystraceProfiler systraceProfiler, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        systraceProfiler.onStop(z, str);
    }

    public static final void onStop$lambda$4(State state2, boolean z, String str) throws InterruptedException {
        O90.m5968f(state2, "$state");
        O90.m5968f(str, "$tagSuffix");
        ((InProgress) state2).getExecThread().join();
        RunnableC7273za runnableC7273za = new RunnableC7273za(z, str, 9);
        if (O90.m5963a(Looper.myLooper(), Looper.getMainLooper())) {
            runnableC7273za.run();
        } else {
            mainHandler.post(runnableC7273za);
        }
    }

    public static final void onStop$lambda$4$lambda$3(boolean z, String str) {
        O90.m5968f(str, "$tagSuffix");
        INSTANCE.onStop(z, str);
    }

    public static final void onStop$lambda$5(State state2, String str) {
        String tag;
        O90.m5968f(state2, "$state");
        O90.m5968f(str, "$tagSuffix");
        Finished finished = (Finished) state2;
        File sampleFile = finished.getSampleFile();
        long duration = finished.getDuration();
        if (str.length() == 0) {
            tag = finished.getTag();
        } else {
            tag = finished.getTag() + '_' + str;
        }
        INSTANCE.onUpload(sampleFile, tag, duration);
    }

    private final void onUpload(File sampleFile, String tag, long duration) {
        SampleUploader sampleUploader = SampleUploader.INSTANCE;
        Context context2 = context;
        if (context2 != null) {
            sampleUploader.upload(context2, FEATURE_SYSTRACEKt.getFEATURE_SYSTRACE(), sampleFile, (72 & 8) != 0, (72 & 16) != 0 ? null : tag, (72 & 32) != 0 ? null : Long.valueOf(duration), (72 & 64) != 0 ? C0842NN.f7735a : null);
        } else {
            O90.m5977o("context");
            throw null;
        }
    }

    private final void runOnMain(Runnable runnable) {
        if (O90.m5963a(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            mainHandler.post(runnable);
        }
    }

    public static final void start(Context context2, String tag, long duration) {
        O90.m5968f(context2, "context");
        O90.m5968f(tag, "tag");
        start(tag, duration);
    }

    public static final void start$lambda$0(String str, long j) {
        O90.m5968f(str, "$tag");
        INSTANCE.onStart(str, j);
    }

    public final void init$tracer_profiler_systrace_release(Context context2) {
        O90.m5968f(context2, "context");
        context = context2;
    }

    public static final void commit(String tagSuffix) {
        O90.m5968f(tagSuffix, "tagSuffix");
        RunnableC10783qU0 runnableC10783qU0 = new RunnableC10783qU0(tagSuffix, 2);
        if (O90.m5963a(Looper.myLooper(), Looper.getMainLooper())) {
            runnableC10783qU0.run();
        } else {
            mainHandler.post(runnableC10783qU0);
        }
    }

    public static final void start(String tag, long duration) {
        O90.m5968f(tag, "tag");
        RunnableC9249eV0 runnableC9249eV0 = new RunnableC9249eV0(1, tag, duration);
        if (O90.m5963a(Looper.myLooper(), Looper.getMainLooper())) {
            runnableC9249eV0.run();
        } else {
            mainHandler.post(runnableC9249eV0);
        }
    }
}

package ru.p031ok.tracer.profiler.systrace;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import p000.O90;
import ru.p031ok.tracer.utils.Logger;

@Metadata(m22266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001%B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J \u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0010\u0010\u0003J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m22267d2 = {"Lru/ok/tracer/profiler/systrace/SystraceHook;", "", "<init>", "()V", "LTf1;", "stopProcess", "", "sdkVersion", "", "startRecord", "hook", "(IZ)Z", "", "path", "process", "(Ljava/lang/String;)V", "unhook", "install", "(Z)Z", "Landroid/content/Context;", "context", "Lru/ok/tracer/profiler/systrace/SystraceHook$TraceListener;", "traceListener", "start", "(Landroid/content/Context;Lru/ok/tracer/profiler/systrace/SystraceHook$TraceListener;)V", "STATE_IDLE", "I", "STATE_INSTALLING", "STATE_INSTALLED", "STATE_STARTED", "STATE_UNHOOKED", "STATE_INSTALL_FAILED", "Ljava/util/concurrent/atomic/AtomicInteger;", "state", "Ljava/util/concurrent/atomic/AtomicInteger;", "isInstalled", "()Z", "TraceListener", "tracer-profiler-systrace_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class SystraceHook {
    private static final int STATE_IDLE = 0;
    private static final int STATE_INSTALLED = 2;
    private static final int STATE_INSTALLING = 1;
    private static final int STATE_INSTALL_FAILED = 5;
    private static final int STATE_STARTED = 3;
    private static final int STATE_UNHOOKED = 4;
    public static final SystraceHook INSTANCE = new SystraceHook();
    private static final AtomicInteger state = new AtomicInteger(0);

    @Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m22267d2 = {"Lru/ok/tracer/profiler/systrace/SystraceHook$TraceListener;", "", "Ljava/lang/Thread;", "execThread", "Ljava/lang/Runnable;", "stopRunnable", "LTf1;", "onStart", "(Ljava/lang/Thread;Ljava/lang/Runnable;)V", "Ljava/io/File;", "file", "onFinish", "(Ljava/io/File;)V", "tracer-profiler-systrace_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public interface TraceListener {
        void onFinish(File file);

        void onStart(Thread execThread, Runnable stopRunnable);
    }

    private SystraceHook() {
    }

    private final native boolean hook(int sdkVersion, boolean startRecord);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void process(String path);

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopProcess() {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = state;
            i = atomicInteger.get();
            if (i != 2 && i != 3) {
                Logger.d$default("Systrace: Wrong state: " + atomicInteger.get(), null, 2, null);
                return;
            }
        } while (!atomicInteger.compareAndSet(i, 4));
        unhook();
        atomicInteger.compareAndSet(4, 0);
    }

    private final native void unhook();

    public final boolean install(boolean startRecord) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException {
        Method declaredMethod;
        Field declaredField;
        if (!state.compareAndSet(0, 1)) {
            Logger.d$default("Skip install tracer. Not first attempt.", null, 2, null);
            return false;
        }
        try {
            System.loadLibrary("trhook2");
            try {
                declaredMethod = Trace.class.getDeclaredMethod("nativeGetEnabledTags", null);
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                declaredMethod = null;
            }
            try {
                declaredField = Trace.class.getDeclaredField("sEnabledTags");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                declaredField = null;
            }
            if ((declaredMethod == null || declaredField == null) && Build.VERSION.SDK_INT < 35) {
                state.set(5);
                return false;
            }
            Logger.d$default("Hooking...", null, 2, null);
            if (!hook(Build.VERSION.SDK_INT, startRecord)) {
                state.set(5);
                return false;
            }
            if (declaredMethod != null && declaredField != null) {
                try {
                    declaredField.set(null, declaredMethod.invoke(null, null));
                } catch (Exception unused3) {
                    state.set(5);
                    return false;
                }
            }
            Logger.d$default("Installed", null, 2, null);
            state.set(2);
            return true;
        } catch (UnsatisfiedLinkError unused4) {
            state.set(5);
            return false;
        }
    }

    public final boolean isInstalled() {
        return state.get() == 2;
    }

    public final void start(Context context, TraceListener traceListener) {
        O90.m5968f(context, "context");
        O90.m5968f(traceListener, "traceListener");
        AtomicInteger atomicInteger = state;
        if (atomicInteger.compareAndSet(2, 3)) {
            new SystraceHook$start$executingThread$1(context, traceListener).start();
            return;
        }
        Logger.d$default("Wrong state: " + atomicInteger.get(), null, 2, null);
    }
}

package ru.p031ok.tracer.utils;

import java.util.Arrays;
import kotlin.Metadata;
import p000.O90;
import ru.p031ok.tracer.base.ucum.UcumUtils;
import ru.p031ok.tracer.utils.DefaultTracerLoggerDelegate;
import ru.p031ok.tracer.utils.TracerLoggerDelegate;

@Metadata(m22266d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\rJ1\u0010\u000e\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\nJ'\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\rJ'\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u001b\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0011\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\rJ-\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, m22267d2 = {"Lru/ok/tracer/utils/Logger;", "", "<init>", "()V", "", "msg", "", "args", "LTf1;", "v", "(Ljava/lang/String;[Ljava/lang/Object;)V", "", "tr", "(Ljava/lang/String;Ljava/lang/Throwable;)V", UcumUtils.UCUM_DAYS, "i", "w", "e", "(Ljava/lang/Throwable;)V", "", "priority", "log", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "Ljava/lang/ThreadLocal;", "", "recursionDetector", "Ljava/lang/ThreadLocal;", "Lru/ok/tracer/utils/TracerLoggerDelegate;", "delegate", "Lru/ok/tracer/utils/TracerLoggerDelegate;", "getDelegate$tracer_commons_release", "()Lru/ok/tracer/utils/TracerLoggerDelegate;", "setDelegate$tracer_commons_release", "(Lru/ok/tracer/utils/TracerLoggerDelegate;)V", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class Logger {
    public static final Logger INSTANCE = new Logger();
    private static final ThreadLocal<Boolean> recursionDetector = new ThreadLocal<>();
    private static TracerLoggerDelegate delegate = DefaultTracerLoggerDelegate.INSTANCE;

    private Logger() {
    }

    /* renamed from: d */
    public static final void m24519d(String str, Throwable th) {
    }

    public static /* synthetic */ void d$default(String str, Throwable th, int i, Object obj) {
    }

    /* renamed from: e */
    public static final void m24521e() {
        e$default(null, 1, null);
    }

    public static /* synthetic */ void e$default(String str, Throwable th, int i, Object obj) {
    }

    /* renamed from: i */
    public static final void m24525i() {
        i$default(null, null, 3, null);
    }

    public static /* synthetic */ void i$default(String str, Throwable th, int i, Object obj) {
    }

    public static final void log(int i, String str) {
        log$default(i, str, null, 4, null);
    }

    public static /* synthetic */ void log$default(int i, String str, Throwable th, int i2, Object obj) {
    }

    /* renamed from: v */
    public static final void m24528v() {
        v$default(null, null, 3, null);
    }

    public static /* synthetic */ void v$default(String str, Throwable th, int i, Object obj) {
    }

    /* renamed from: w */
    public static final void m24532w() {
        w$default(null, null, 3, null);
    }

    public static /* synthetic */ void w$default(String str, Throwable th, int i, Object obj) {
    }

    public final TracerLoggerDelegate getDelegate$tracer_commons_release() {
        return delegate;
    }

    public final void setDelegate$tracer_commons_release(TracerLoggerDelegate tracerLoggerDelegate) {
        O90.m5968f(tracerLoggerDelegate, "<set-?>");
        delegate = tracerLoggerDelegate;
    }

    /* renamed from: d */
    public static final void m24520d(String str, Object... objArr) {
        String str2;
        O90.m5968f(objArr, "args");
        if (str != null) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        } else {
            str2 = null;
        }
        log$default(3, str2, null, 4, null);
    }

    /* renamed from: e */
    public static final void m24522e(String str) {
        e$default(str, null, 2, null);
    }

    public static /* synthetic */ void e$default(Throwable th, int i, Object obj) {
    }

    /* renamed from: i */
    public static final void m24526i(String str) {
        i$default(str, null, 2, null);
    }

    public static final void log(int priority, String msg, Throwable tr) {
        try {
            if (priority < delegate.getMinLogPriority()) {
                return;
            }
            ThreadLocal<Boolean> threadLocal = recursionDetector;
            Boolean bool = threadLocal.get();
            if (bool == null ? false : bool.booleanValue()) {
                return;
            }
            try {
                threadLocal.set(Boolean.TRUE);
                delegate.println(priority, msg, tr);
                threadLocal.set(Boolean.FALSE);
            } catch (Throwable th) {
                recursionDetector.set(Boolean.FALSE);
                throw th;
            }
        } catch (Exception e) {
            DefaultTracerLoggerDelegate.Companion companion = DefaultTracerLoggerDelegate.INSTANCE;
            delegate = companion;
            companion.println(6, "Logger delegate threw an exception", e);
            TracerLoggerDelegate.DefaultImpls.println$default(delegate, 3, "Falling back to default logger delegate", null, 4, null);
        }
    }

    /* renamed from: v */
    public static final void m24529v(String str) {
        v$default(str, null, 2, null);
    }

    /* renamed from: w */
    public static final void m24533w(String str) {
        w$default(str, null, 2, null);
    }

    /* renamed from: e */
    public static final void m24523e(String msg, Throwable tr) {
    }

    /* renamed from: i */
    public static final void m24527i(String msg, Throwable tr) {
    }

    /* renamed from: v */
    public static final void m24530v(String msg, Throwable tr) {
    }

    /* renamed from: w */
    public static final void m24534w(String msg, Throwable tr) {
    }

    /* renamed from: e */
    public static final void m24524e(Throwable tr) {
    }

    /* renamed from: v */
    public static final void m24531v(String msg, Object... args) {
        String str;
        O90.m5968f(args, "args");
        if (msg != null) {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            str = String.format(msg, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        } else {
            str = null;
        }
        log$default(2, str, null, 4, null);
    }
}

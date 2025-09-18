package ru.p031ok.tracer.utils;

import java.lang.Thread;

/* loaded from: classes2.dex */
public final class UncaughtExceptionHandlers {
    private static final Object LOCK = new Object();

    private UncaughtExceptionHandlers() {
    }

    private static Thread.UncaughtExceptionHandler chain(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        return uncaughtExceptionHandler == null ? uncaughtExceptionHandler2 : uncaughtExceptionHandler2 == null ? uncaughtExceptionHandler : new ChainedUncaughtExceptionHandler(uncaughtExceptionHandler, uncaughtExceptionHandler2);
    }

    public static void prependDefault(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        synchronized (LOCK) {
            Thread.setDefaultUncaughtExceptionHandler(chain(uncaughtExceptionHandler, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }
}

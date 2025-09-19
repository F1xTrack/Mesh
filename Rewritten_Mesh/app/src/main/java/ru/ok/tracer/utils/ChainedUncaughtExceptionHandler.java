package ru.ok.tracer.utils;

import java.lang.Thread;

/* loaded from: classes2.dex */
public final class ChainedUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler handlerAfter;
    private final Thread.UncaughtExceptionHandler handlerBefore;

    public ChainedUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.handlerBefore = uncaughtExceptionHandler;
        this.handlerAfter = uncaughtExceptionHandler2;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            this.handlerBefore.uncaughtException(thread, th);
        } finally {
            this.handlerAfter.uncaughtException(thread, th);
        }
    }
}

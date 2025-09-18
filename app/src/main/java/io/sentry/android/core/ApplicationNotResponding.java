package io.sentry.android.core;

import io.sentry.config.AbstractC6003a;

/* loaded from: classes2.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* renamed from: a */
    public final Thread f33517a;

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        AbstractC6003a.m21735D(thread, "Thread must be provided.");
        this.f33517a = thread;
        setStackTrace(thread.getStackTrace());
    }
}

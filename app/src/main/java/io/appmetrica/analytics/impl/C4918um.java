package io.appmetrica.analytics.impl;

import java.lang.Thread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.um, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4918um implements Thread.UncaughtExceptionHandler {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Thread.UncaughtExceptionHandler) it.next()).uncaughtException(thread, th);
        }
    }
}

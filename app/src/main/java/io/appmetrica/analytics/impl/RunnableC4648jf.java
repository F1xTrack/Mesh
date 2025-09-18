package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.jf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4648jf implements Runnable {
    public final File a;
    public final Consumer b;
    public final W9 c;

    public RunnableC4648jf(File file, A1 a1, W9 w9) {
        this.a = file;
        this.b = a1;
        this.c = w9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] fileArrListFiles;
        if (this.a.exists() && this.a.isDirectory() && (fileArrListFiles = this.a.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                C4881t9 c4881t9A = this.c.a(file.getName());
                try {
                    c4881t9A.a.lock();
                    c4881t9A.b.a();
                    this.b.consume(file);
                    c4881t9A.c();
                } catch (Throwable unused) {
                    c4881t9A.c();
                }
            }
        }
    }
}

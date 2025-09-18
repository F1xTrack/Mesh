package io.sentry;

import java.io.File;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class Q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ File b;

    public /* synthetic */ Q0(File file, int i) {
        this.a = i;
        this.b = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                File[] fileArrListFiles = this.b.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (file.lastModified() < S0.e - TimeUnit.MINUTES.toMillis(5L)) {
                            io.sentry.config.a.c(file);
                        }
                    }
                    break;
                }
                break;
            default:
                io.sentry.config.a.c(this.b);
                break;
        }
    }
}

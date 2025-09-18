package io.sentry;

import io.sentry.config.AbstractC6003a;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.Q0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5797Q0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f33377a;

    /* renamed from: b */
    public final /* synthetic */ File f33378b;

    public /* synthetic */ RunnableC5797Q0(File file, int i) {
        this.f33377a = i;
        this.f33378b = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33377a) {
            case 0:
                File[] fileArrListFiles = this.f33378b.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (file.lastModified() < AbstractC5802S0.f33393e - TimeUnit.MINUTES.toMillis(5L)) {
                            AbstractC6003a.m21744c(file);
                        }
                    }
                    break;
                }
                break;
            default:
                AbstractC6003a.m21744c(this.f33378b);
                break;
        }
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.jf */
/* loaded from: classes2.dex */
public final class RunnableC5224jf implements Runnable {

    /* renamed from: a */
    public final File f31977a;

    /* renamed from: b */
    public final Consumer f31978b;

    /* renamed from: c */
    public final C4897W9 f31979c;

    public RunnableC5224jf(File file, C4358A1 c4358a1, C4897W9 c4897w9) {
        this.f31977a = file;
        this.f31978b = c4358a1;
        this.f31979c = c4897w9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] fileArrListFiles;
        if (this.f31977a.exists() && this.f31977a.isDirectory() && (fileArrListFiles = this.f31977a.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                C5468t9 c5468t9M19945a = this.f31979c.m19945a(file.getName());
                try {
                    c5468t9M19945a.f32625a.lock();
                    c5468t9M19945a.f32626b.m19915a();
                    this.f31978b.consume(file);
                    c5468t9M19945a.m21077c();
                } catch (Throwable unused) {
                    c5468t9M19945a.m21077c();
                }
            }
        }
    }
}

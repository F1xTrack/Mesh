package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.c7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC2672c7 implements Runnable {
    private final File a;
    private final Um<File> b;
    private final C2688cn c;

    public RunnableC2672c7(Context context, File file, Um<File> um) {
        this(file, um, C2688cn.a(context));
    }

    @Override // java.lang.Runnable
    public void run() {
        File[] fileArrListFiles;
        if (this.a.exists() && this.a.isDirectory() && (fileArrListFiles = this.a.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                C2638an c2638anA = this.c.a(file.getName());
                try {
                    c2638anA.a();
                    this.b.b(file);
                } catch (Throwable unused) {
                }
                c2638anA.c();
            }
        }
    }

    public RunnableC2672c7(File file, Um<File> um, C2688cn c2688cn) {
        this.a = file;
        this.b = um;
        this.c = c2688cn;
    }
}

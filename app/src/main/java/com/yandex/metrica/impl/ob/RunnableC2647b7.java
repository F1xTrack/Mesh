package com.yandex.metrica.impl.ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.b7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC2647b7<Output> implements Runnable {
    private final File a;
    private final Vm<File, Output> b;
    private final Um<File> c;
    private final Um<Output> d;

    public RunnableC2647b7(File file, Vm<File, Output> vm, Um<File> um, Um<Output> um2) {
        this.a = file;
        this.b = vm;
        this.c = um;
        this.d = um2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.exists()) {
            try {
                Output outputA = this.b.a(this.a);
                if (outputA != null) {
                    this.d.b(outputA);
                }
            } catch (Throwable unused) {
            }
            this.c.b(this.a);
        }
    }
}

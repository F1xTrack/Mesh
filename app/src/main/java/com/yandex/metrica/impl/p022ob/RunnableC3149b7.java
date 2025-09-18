package com.yandex.metrica.impl.p022ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.b7 */
/* loaded from: classes2.dex */
public class RunnableC3149b7<Output> implements Runnable {

    /* renamed from: a */
    private final File f23112a;

    /* renamed from: b */
    private final InterfaceC3013Vm<File, Output> f23113b;

    /* renamed from: c */
    private final InterfaceC2988Um<File> f23114c;

    /* renamed from: d */
    private final InterfaceC2988Um<Output> f23115d;

    public RunnableC3149b7(File file, InterfaceC3013Vm<File, Output> interfaceC3013Vm, InterfaceC2988Um<File> interfaceC2988Um, InterfaceC2988Um<Output> interfaceC2988Um2) {
        this.f23112a = file;
        this.f23113b = interfaceC3013Vm;
        this.f23114c = interfaceC2988Um;
        this.f23115d = interfaceC2988Um2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f23112a.exists()) {
            try {
                Output outputMo13948a = this.f23113b.mo13948a(this.f23112a);
                if (outputMo13948a != null) {
                    this.f23115d.mo13904b(outputMo13948a);
                }
            } catch (Throwable unused) {
            }
            this.f23114c.mo13904b(this.f23112a);
        }
    }
}

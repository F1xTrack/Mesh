package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.c7 */
/* loaded from: classes2.dex */
public class RunnableC3175c7 implements Runnable {

    /* renamed from: a */
    private final File f23175a;

    /* renamed from: b */
    private final InterfaceC2988Um<File> f23176b;

    /* renamed from: c */
    private final C3191cn f23177c;

    public RunnableC3175c7(Context context, File file, InterfaceC2988Um<File> interfaceC2988Um) {
        this(file, interfaceC2988Um, C3191cn.m15718a(context));
    }

    @Override // java.lang.Runnable
    public void run() {
        File[] fileArrListFiles;
        if (this.f23175a.exists() && this.f23175a.isDirectory() && (fileArrListFiles = this.f23175a.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                C3139an c3139anM15719a = this.f23177c.m15719a(file.getName());
                try {
                    c3139anM15719a.m15622a();
                    this.f23176b.mo13904b(file);
                } catch (Throwable unused) {
                }
                c3139anM15719a.m15624c();
            }
        }
    }

    public RunnableC3175c7(File file, InterfaceC2988Um<File> interfaceC2988Um, C3191cn c3191cn) {
        this.f23175a = file;
        this.f23176b = interfaceC2988Um;
        this.f23177c = c3191cn;
    }
}

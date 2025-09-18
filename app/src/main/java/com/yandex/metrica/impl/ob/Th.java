package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Qd;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes2.dex */
class Th implements Qd.a {
    final /* synthetic */ Ei a;
    final /* synthetic */ File b;
    final /* synthetic */ C2733ei c;
    final /* synthetic */ Uh d;

    public Th(Uh uh, Ei ei, File file, C2733ei c2733ei) {
        this.d = uh;
        this.a = ei;
        this.b = file;
        this.c = c2733ei;
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public void a(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        Uh.a(this.d, this.a.i);
        Uh.c(this.d);
        this.d.e.a(str);
        Uh uh = this.d;
        File file = this.b;
        uh.getClass();
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            fileOutputStream = null;
        }
        U2.a((Closeable) fileOutputStream);
        this.c.a(this.b);
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public String b() {
        return this.d.e.b();
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public void c() {
        Uh.a(this.d, this.a.h);
        Uh.c(this.d);
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public void a() {
        Uh.a(this.d, this.a.i);
        Uh.c(this.d);
        this.c.a(this.b);
    }
}

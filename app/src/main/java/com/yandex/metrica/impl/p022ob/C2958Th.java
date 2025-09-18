package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2880Qd;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.yandex.metrica.impl.ob.Th */
/* loaded from: classes2.dex */
class C2958Th implements C2880Qd.a {

    /* renamed from: a */
    final /* synthetic */ C2585Ei f22406a;

    /* renamed from: b */
    final /* synthetic */ File f22407b;

    /* renamed from: c */
    final /* synthetic */ C3238ei f22408c;

    /* renamed from: d */
    final /* synthetic */ C2983Uh f22409d;

    public C2958Th(C2983Uh c2983Uh, C2585Ei c2585Ei, File file, C3238ei c3238ei) {
        this.f22409d = c2983Uh;
        this.f22406a = c2585Ei;
        this.f22407b = file;
        this.f22408c = c3238ei;
    }

    @Override // com.yandex.metrica.impl.p022ob.C2880Qd.a
    /* renamed from: a */
    public void mo13864a(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        C2983Uh.m15283a(this.f22409d, this.f22406a.f21130i);
        C2983Uh.m15285c(this.f22409d);
        this.f22409d.f22489e.mo14311a(str);
        C2983Uh c2983Uh = this.f22409d;
        File file = this.f22407b;
        c2983Uh.getClass();
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
        C2968U2.m15241a((Closeable) fileOutputStream);
        this.f22408c.m15854a(this.f22407b);
    }

    @Override // com.yandex.metrica.impl.p022ob.C2880Qd.a
    /* renamed from: b */
    public String mo13865b() {
        return this.f22409d.f22489e.mo14318b();
    }

    @Override // com.yandex.metrica.impl.p022ob.C2880Qd.a
    /* renamed from: c */
    public void mo13866c() {
        C2983Uh.m15283a(this.f22409d, this.f22406a.f21129h);
        C2983Uh.m15285c(this.f22409d);
    }

    @Override // com.yandex.metrica.impl.p022ob.C2880Qd.a
    /* renamed from: a */
    public void mo13863a() {
        C2983Uh.m15283a(this.f22409d, this.f22406a.f21130i);
        C2983Uh.m15285c(this.f22409d);
        this.f22408c.m15854a(this.f22407b);
    }
}

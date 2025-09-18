package defpackage;

import defpackage.C0110Be;
import defpackage.C2466cB;
import defpackage.HT;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class RU implements InterfaceC6787rA {
    public final C2466cB a;
    public final boolean b;
    public String c;

    public RU(C2466cB c2466cB, boolean z) {
        this.a = c2466cB;
        this.b = z;
    }

    @Override // defpackage.InterfaceC6787rA
    public final InterfaceC7117su0 a(String str) {
        return new C6273oT0(this.a.b(str));
    }

    @Override // defpackage.InterfaceC6787rA
    public final boolean b() {
        String str = this.c;
        return str != null && c(str);
    }

    @Override // defpackage.InterfaceC6787rA
    public final boolean c(String str) {
        File file;
        CC0 cc0 = (CC0) this.a.b(str).a;
        return cc0 != null && (((file = (File) cc0.b) != null && file.exists()) || ((C0961Mc) cc0.c) != null);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.crashlytics.ndk.b] */
    @Override // defpackage.InterfaceC6787rA
    public final synchronized void d(final String str, final long j, final C0110Be c0110Be) {
        this.c = str;
        ?? r6 = new Object() { // from class: com.google.firebase.crashlytics.ndk.b
            public final void a() throws Throwable {
                long j2 = j;
                C0110Be c0110Be2 = c0110Be;
                C2466cB c2466cB = this.a.a;
                HT ht = c2466cB.c;
                String str2 = str;
                try {
                    String canonicalPath = ht.i(str2).getCanonicalPath();
                    if (((JniNativeApi) c2466cB.b).b(c2466cB.a.getAssets(), canonicalPath)) {
                        c2466cB.d(j2, str2);
                        c2466cB.e(str2, c0110Be2.a);
                        c2466cB.h(str2, c0110Be2.b);
                        c2466cB.f(str2, c0110Be2.c);
                    }
                } catch (IOException unused) {
                }
            }
        };
        if (this.b) {
            r6.a();
        }
    }
}

package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public final class BM implements InterfaceC7199tK {
    public final int a;
    public final C2112aK b;
    public final String c;
    public final C0084Av0 d;
    public volatile C0999Mo1 e = new C0999Mo1(null, null, false);

    public BM(int i, C2112aK c2112aK, String str, C0084Av0 c0084Av0) {
        this.a = i;
        this.d = c0084Av0;
        this.b = c2112aK;
        this.c = str;
    }

    public final void a() {
        File[] fileArrListFiles = ((C4117hF) c()).a.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                W02.a(file);
            }
        }
    }

    public final void b() throws C3971gU {
        File file = new File((File) this.b.get(), this.c);
        try {
            AbstractC2055a12.b(file);
            file.getAbsolutePath();
            AbstractC3393dS.a.getClass();
            this.e = new C0999Mo1(file, new C4117hF(file, this.a, this.d), false);
        } catch (C3971gU e) {
            this.d.getClass();
            throw e;
        }
    }

    public final synchronized InterfaceC7199tK c() {
        C4117hF c4117hF;
        File file;
        C0999Mo1 c0999Mo1 = this.e;
        if (((C4117hF) c0999Mo1.a) == null || (file = (File) c0999Mo1.b) == null || !file.exists()) {
            if (((C4117hF) this.e.a) != null && ((File) this.e.b) != null) {
                W02.a((File) this.e.b);
            }
            b();
        }
        c4117hF = (C4117hF) this.e.a;
        c4117hF.getClass();
        return c4117hF;
    }

    public final Collection d() {
        C4117hF c4117hF = (C4117hF) c();
        c4117hF.getClass();
        VH vh = new VH(c4117hF);
        W02.b(c4117hF.c, vh);
        return Collections.unmodifiableList((ArrayList) vh.b);
    }
}

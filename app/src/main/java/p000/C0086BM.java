package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: BM */
/* loaded from: classes.dex */
public final class C0086BM implements InterfaceC6879tK {

    /* renamed from: a */
    public final int f760a;

    /* renamed from: b */
    public final C1657aK f761b;

    /* renamed from: c */
    public final String f762c;

    /* renamed from: d */
    public final C7356Av0 f763d;

    /* renamed from: e */
    public volatile C7967Mo1 f764e = new C7967Mo1(null, null, false);

    public C0086BM(int i, C1657aK c1657aK, String str, C7356Av0 c7356Av0) {
        this.f760a = i;
        this.f763d = c7356Av0;
        this.f761b = c1657aK;
        this.f762c = str;
    }

    /* renamed from: a */
    public final void m694a() {
        File[] fileArrListFiles = ((C4167hF) m696c()).f28332a.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                W02.m8647a(file);
            }
        }
    }

    /* renamed from: b */
    public final void m695b() throws C4119gU {
        File file = new File((File) this.f761b.get(), this.f762c);
        try {
            AbstractC8671a12.m9663b(file);
            file.getAbsolutePath();
            AbstractC3929dS.f26114a.getClass();
            this.f764e = new C7967Mo1(file, new C4167hF(file, this.f760a, this.f763d), false);
        } catch (C4119gU e) {
            this.f763d.getClass();
            throw e;
        }
    }

    /* renamed from: c */
    public final synchronized InterfaceC6879tK m696c() {
        C4167hF c4167hF;
        File file;
        C7967Mo1 c7967Mo1 = this.f764e;
        if (((C4167hF) c7967Mo1.f7362a) == null || (file = (File) c7967Mo1.f7363b) == null || !file.exists()) {
            if (((C4167hF) this.f764e.f7362a) != null && ((File) this.f764e.f7363b) != null) {
                W02.m8647a((File) this.f764e.f7363b);
            }
            m695b();
        }
        c4167hF = (C4167hF) this.f764e.f7362a;
        c4167hF.getClass();
        return c4167hF;
    }

    /* renamed from: d */
    public final Collection m697d() {
        C4167hF c4167hF = (C4167hF) m696c();
        c4167hF.getClass();
        C1339VH c1339vh = new C1339VH(c4167hF);
        W02.m8648b(c4167hF.f28334c, c1339vh);
        return Collections.unmodifiableList((ArrayList) c1339vh.f12486b);
    }
}

package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C3482o2;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: com.yandex.metrica.impl.ob.V6 */
/* loaded from: classes2.dex */
public class C2997V6 {

    /* renamed from: a */
    private final C2742L0 f22517a;

    /* renamed from: b */
    private final C2972U6 f22518b;

    /* renamed from: c */
    private final Context f22519c;

    /* renamed from: d */
    private final C3191cn f22520d;

    public C2997V6(Context context) {
        this(context, new C2742L0(), new C2972U6(), C3191cn.m15718a(context));
    }

    /* renamed from: a */
    public void m15301a(C3482o2.f fVar) {
        PrintWriter printWriter;
        File fileM14500a = this.f22517a.m14500a(this.f22519c, "appmetrica_crashes");
        if (!this.f22518b.m15269a(fileM14500a)) {
            return;
        }
        C2969U3 c2969u3M15167a = fVar.m16517a().m15167a();
        String str = c2969u3M15167a.m15265g() + "-" + c2969u3M15167a.m15266h();
        C3139an c3139anM15719a = this.f22520d.m15719a(str);
        try {
            c3139anM15719a.m15622a();
            this.f22517a.getClass();
            printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(fileM14500a, str))));
            try {
                printWriter.write(new C2649H7(fVar.m16521b(), fVar.m16517a(), fVar.m16522c()).m14231k());
                C2968U2.m15241a((Closeable) printWriter);
                c3139anM15719a.m15624c();
            } catch (Throwable unused) {
                C2968U2.m15241a((Closeable) printWriter);
                c3139anM15719a.m15624c();
            }
        } catch (Throwable unused2) {
            printWriter = null;
        }
    }

    public C2997V6(Context context, C2742L0 c2742l0, C2972U6 c2972u6, C3191cn c3191cn) {
        this.f22519c = context;
        this.f22517a = c2742l0;
        this.f22518b = c2972u6;
        this.f22520d = c3191cn;
    }
}

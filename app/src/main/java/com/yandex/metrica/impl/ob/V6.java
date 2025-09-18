package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C2966o2;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public class V6 {
    private final L0 a;
    private final U6 b;
    private final Context c;
    private final C2688cn d;

    public V6(Context context) {
        this(context, new L0(), new U6(), C2688cn.a(context));
    }

    public void a(C2966o2.f fVar) {
        PrintWriter printWriter;
        File fileA = this.a.a(this.c, "appmetrica_crashes");
        if (!this.b.a(fileA)) {
            return;
        }
        U3 u3A = fVar.a().a();
        String str = u3A.g() + "-" + u3A.h();
        C2638an c2638anA = this.d.a(str);
        try {
            c2638anA.a();
            this.a.getClass();
            printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(fileA, str))));
            try {
                printWriter.write(new H7(fVar.b(), fVar.a(), fVar.c()).k());
                U2.a((Closeable) printWriter);
                c2638anA.c();
            } catch (Throwable unused) {
                U2.a((Closeable) printWriter);
                c2638anA.c();
            }
        } catch (Throwable unused2) {
            printWriter = null;
        }
    }

    public V6(Context context, L0 l0, U6 u6, C2688cn c2688cn) {
        this.c = context;
        this.a = l0;
        this.b = u6;
        this.d = c2688cn;
    }
}

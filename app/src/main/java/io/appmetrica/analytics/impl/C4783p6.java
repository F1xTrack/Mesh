package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: io.appmetrica.analytics.impl.p6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4783p6 {
    public final X9 a;
    public final C4639j6 b;
    public final Context c;
    public final W9 d;

    public C4783p6(Context context) {
        this(context, new X9(), new C4639j6(), W9.a(context));
    }

    public final void a(Pg pg) {
        boolean zMkdir;
        C4881t9 c4881t9A;
        PrintWriter printWriter;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.c);
        this.b.getClass();
        if (crashesDirectory == null) {
            return;
        }
        try {
            try {
                if (crashesDirectory.exists()) {
                    if (!crashesDirectory.isDirectory()) {
                        if (!crashesDirectory.delete()) {
                            return;
                        } else {
                            zMkdir = crashesDirectory.mkdir();
                        }
                    }
                    Re re = pg.e.a;
                    String str = re.a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + re.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                    c4881t9A = this.d.a(str);
                    c4881t9A.a.lock();
                    c4881t9A.b.a();
                    this.a.getClass();
                    printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                    printWriter.write(new C4525eb(pg.a, pg.e, pg.d).k());
                    hn.a((Closeable) printWriter);
                    c4881t9A.c();
                    return;
                }
                zMkdir = crashesDirectory.mkdir();
                printWriter.write(new C4525eb(pg.a, pg.e, pg.d).k());
                hn.a((Closeable) printWriter);
                c4881t9A.c();
                return;
            } catch (Throwable unused) {
                hn.a((Closeable) printWriter);
                c4881t9A.c();
                return;
            }
            c4881t9A.a.lock();
            c4881t9A.b.a();
            this.a.getClass();
            printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
        } catch (Throwable unused2) {
            printWriter = null;
        }
        if (!zMkdir) {
            return;
        }
        Re re2 = pg.e.a;
        String str2 = re2.a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + re2.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        c4881t9A = this.d.a(str2);
    }

    public C4783p6(Context context, X9 x9, C4639j6 c4639j6, W9 w9) {
        this.c = context;
        this.a = x9;
        this.b = c4639j6;
        this.d = w9;
    }
}

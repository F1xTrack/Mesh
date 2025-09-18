package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p028io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* renamed from: io.appmetrica.analytics.impl.p6 */
/* loaded from: classes2.dex */
public final class C5365p6 {

    /* renamed from: a */
    public final C4921X9 f32382a;

    /* renamed from: b */
    public final C5215j6 f32383b;

    /* renamed from: c */
    public final Context f32384c;

    /* renamed from: d */
    public final C4897W9 f32385d;

    public C5365p6(Context context) {
        this(context, new C4921X9(), new C5215j6(), C4897W9.m19944a(context));
    }

    /* renamed from: a */
    public final void m20903a(C4737Pg c4737Pg) {
        boolean zMkdir;
        C5468t9 c5468t9M19945a;
        PrintWriter printWriter;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.f32384c);
        this.f32383b.getClass();
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
                    C4782Re c4782Re = c4737Pg.f30624e.f31089a;
                    String str = c4782Re.f30696a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + c4782Re.f30696a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                    c5468t9M19945a = this.f32385d.m19945a(str);
                    c5468t9M19945a.f32625a.lock();
                    c5468t9M19945a.f32626b.m19915a();
                    this.f32382a.getClass();
                    printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                    printWriter.write(new C5095eb(c4737Pg.f30620a, c4737Pg.f30624e, c4737Pg.f30623d).m20345k());
                    AbstractC5182hn.m20510a((Closeable) printWriter);
                    c5468t9M19945a.m21077c();
                    return;
                }
                zMkdir = crashesDirectory.mkdir();
                printWriter.write(new C5095eb(c4737Pg.f30620a, c4737Pg.f30624e, c4737Pg.f30623d).m20345k());
                AbstractC5182hn.m20510a((Closeable) printWriter);
                c5468t9M19945a.m21077c();
                return;
            } catch (Throwable unused) {
                AbstractC5182hn.m20510a((Closeable) printWriter);
                c5468t9M19945a.m21077c();
                return;
            }
            c5468t9M19945a.f32625a.lock();
            c5468t9M19945a.f32626b.m19915a();
            this.f32382a.getClass();
            printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
        } catch (Throwable unused2) {
            printWriter = null;
        }
        if (!zMkdir) {
            return;
        }
        C4782Re c4782Re2 = c4737Pg.f30624e.f31089a;
        String str2 = c4782Re2.f30696a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + c4782Re2.f30696a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        c5468t9M19945a = this.f32385d.m19945a(str2);
    }

    public C5365p6(Context context, C4921X9 c4921x9, C5215j6 c5215j6, C4897W9 c4897w9) {
        this.f32384c = context;
        this.f32382a = c4921x9;
        this.f32383b = c5215j6;
        this.f32385d = c4897w9;
    }
}

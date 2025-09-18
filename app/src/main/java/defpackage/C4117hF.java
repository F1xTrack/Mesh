package defpackage;

import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: hF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4117hF implements InterfaceC7199tK {
    public static final long f = TimeUnit.MINUTES.toMillis(30);
    public static final /* synthetic */ int g = 0;
    public final File a;
    public final boolean b;
    public final File c;
    public final C0084Av0 d;
    public final OL0 e;

    public C4117hF(File file, int i, C0084Av0 c0084Av0) {
        this.a = file;
        boolean zContains = false;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                try {
                    zContains = file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException unused) {
                    c0084Av0.getClass();
                }
            }
        } catch (Exception unused2) {
            c0084Av0.getClass();
        }
        this.b = zContains;
        File file2 = new File(this.a, AbstractC7209tN0.u(i, "v2.ols100."));
        this.c = file2;
        this.d = c0084Av0;
        File file3 = this.a;
        if (!file3.exists()) {
            AbstractC2055a12.b(file2);
        } else if (!file2.exists()) {
            W02.a(file3);
            try {
                AbstractC2055a12.b(file2);
            } catch (C3971gU unused3) {
                Objects.toString(file2);
                this.d.getClass();
            }
        }
        this.e = OL0.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C8455zw a(defpackage.C4117hF r8, java.io.File r9) {
        /*
            r8.getClass()
            java.lang.String r0 = r9.getName()
            r1 = 46
            int r2 = r0.lastIndexOf(r1)
            r3 = 0
            if (r2 > 0) goto L12
        L10:
            r1 = r3
            goto L48
        L12:
            java.lang.String r4 = r0.substring(r2)
            java.lang.String r5 = ".cnt"
            boolean r6 = r5.equals(r4)
            java.lang.String r7 = ".tmp"
            if (r6 == 0) goto L21
            goto L2a
        L21:
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L29
            r5 = r7
            goto L2a
        L29:
            r5 = r3
        L2a:
            if (r5 != 0) goto L2d
            goto L10
        L2d:
            r4 = 0
            java.lang.String r0 = r0.substring(r4, r2)
            boolean r2 = r5.equals(r7)
            if (r2 == 0) goto L43
            int r1 = r0.lastIndexOf(r1)
            if (r1 > 0) goto L3f
            goto L10
        L3f:
            java.lang.String r0 = r0.substring(r4, r1)
        L43:
            zw r1 = new zw
            r1.<init>(r5, r0)
        L48:
            if (r1 != 0) goto L4b
            goto L61
        L4b:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r1.c
            java.lang.String r8 = r8.c(r2)
            r0.<init>(r8)
            java.io.File r8 = r9.getParentFile()
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L61
            r3 = r1
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4117hF.a(hF, java.io.File):zw");
    }

    public final File b(String str) {
        return new File(AbstractC7209tN0.z(AbstractC8235ym.o(c(str)), File.separator, str, ".cnt"));
    }

    public final String c(String str) {
        String strValueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        return AbstractC1705Vq.l(sb, File.separator, strValueOf);
    }
}

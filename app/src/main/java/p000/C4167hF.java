package p000;

import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: hF */
/* loaded from: classes.dex */
public final class C4167hF implements InterfaceC6879tK {

    /* renamed from: f */
    public static final long f28330f = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: g */
    public static final /* synthetic */ int f28331g = 0;

    /* renamed from: a */
    public final File f28332a;

    /* renamed from: b */
    public final boolean f28333b;

    /* renamed from: c */
    public final File f28334c;

    /* renamed from: d */
    public final C7356Av0 f28335d;

    /* renamed from: e */
    public final OL0 f28336e;

    public C4167hF(File file, int i, C7356Av0 c7356Av0) {
        this.f28332a = file;
        boolean zContains = false;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                try {
                    zContains = file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException unused) {
                    c7356Av0.getClass();
                }
            }
        } catch (Exception unused2) {
            c7356Av0.getClass();
        }
        this.f28333b = zContains;
        File file2 = new File(this.f28332a, AbstractC11153tN0.m24909u(i, "v2.ols100."));
        this.f28334c = file2;
        this.f28335d = c7356Av0;
        File file3 = this.f28332a;
        if (!file3.exists()) {
            AbstractC8671a12.m9663b(file2);
        } else if (!file2.exists()) {
            W02.m8647a(file3);
            try {
                AbstractC8671a12.m9663b(file2);
            } catch (C4119gU unused3) {
                Objects.toString(file2);
                this.f28335d.getClass();
            }
        }
        this.f28336e = OL0.f8371f;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C7295zw m18786a(p000.C4167hF r8, java.io.File r9) {
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
            java.lang.String r2 = r1.f47105c
            java.lang.String r8 = r8.m18788c(r2)
            r0.<init>(r8)
            java.io.File r8 = r9.getParentFile()
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L61
            r3 = r1
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4167hF.m18786a(hF, java.io.File):zw");
    }

    /* renamed from: b */
    public final File m18787b(String str) {
        return new File(AbstractC11153tN0.m24914z(AbstractC7222ym.m26238o(m18788c(str)), File.separator, str, ".cnt"));
    }

    /* renamed from: c */
    public final String m18788c(String str) {
        String strValueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28334c);
        return AbstractC1374Vq.m8593l(sb, File.separator, strValueOf);
    }
}

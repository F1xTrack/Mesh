package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AG0 implements AT {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public C8330zG0 b;

    public AG0(File file) {
        this.a = file;
    }

    @Override // defpackage.AT
    public final void a() {
        AbstractC1717Vu.d(this.b);
        this.b = null;
    }

    @Override // defpackage.AT
    public final String f() {
        byte[] bArrI = i();
        if (bArrI != null) {
            return new String(bArrI, c);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // defpackage.AT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] i() {
        /*
            r8 = this;
            java.io.File r0 = r8.a
            boolean r1 = r0.exists()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto Lc
        La:
            r4 = r2
            goto L40
        Lc:
            zG0 r1 = r8.b
            if (r1 != 0) goto L1b
            zG0 r1 = new zG0     // Catch: java.io.IOException -> L18
            r1.<init>(r0)     // Catch: java.io.IOException -> L18
            r8.b = r1     // Catch: java.io.IOException -> L18
            goto L1b
        L18:
            java.util.Objects.toString(r0)
        L1b:
            zG0 r0 = r8.b
            if (r0 != 0) goto L20
            goto La
        L20:
            int[] r1 = new int[]{r3}
            int r0 = r0.S()
            byte[] r0 = new byte[r0]
            zG0 r4 = r8.b     // Catch: java.io.IOException -> L37
            ES1 r5 = new ES1     // Catch: java.io.IOException -> L37
            r6 = 18
            r7 = 0
            r5.<init>(r0, r1, r7, r6)     // Catch: java.io.IOException -> L37
            r4.o(r5)     // Catch: java.io.IOException -> L37
        L37:
            Pf r4 = new Pf
            r1 = r1[r3]
            r5 = 17
            r4.<init>(r0, r1, r5)
        L40:
            if (r4 != 0) goto L43
            return r2
        L43:
            int r0 = r4.b
            byte[] r1 = new byte[r0]
            java.lang.Object r2 = r4.c
            byte[] r2 = (byte[]) r2
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AG0.i():byte[]");
    }

    @Override // defpackage.AT
    public final void j() {
        a();
        this.a.delete();
    }

    @Override // defpackage.AT
    public final void t(long j, String str) {
        File file = this.a;
        if (this.b == null) {
            try {
                this.b = new C8330zG0(file);
            } catch (IOException unused) {
                Objects.toString(file);
            }
        }
        if (this.b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.b.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(c));
            while (!this.b.p() && this.b.S() > 65536) {
                this.b.A();
            }
        } catch (IOException unused2) {
        }
    }
}

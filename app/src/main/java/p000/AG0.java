package p000;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AG0 implements InterfaceC0030AT {

    /* renamed from: c */
    public static final Charset f148c = Charset.forName("UTF-8");

    /* renamed from: a */
    public final File f149a;

    /* renamed from: b */
    public C11903zG0 f150b;

    public AG0(File file) {
        this.f149a = file;
    }

    @Override // p000.InterfaceC0030AT
    /* renamed from: a */
    public final void mo141a() {
        AbstractC1378Vu.m8619d(this.f150b);
        this.f150b = null;
    }

    @Override // p000.InterfaceC0030AT
    /* renamed from: f */
    public final String mo142f() {
        byte[] bArrMo143i = mo143i();
        if (bArrMo143i != null) {
            return new String(bArrMo143i, f148c);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // p000.InterfaceC0030AT
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] mo143i() {
        /*
            r8 = this;
            java.io.File r0 = r8.f149a
            boolean r1 = r0.exists()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto Lc
        La:
            r4 = r2
            goto L40
        Lc:
            zG0 r1 = r8.f150b
            if (r1 != 0) goto L1b
            zG0 r1 = new zG0     // Catch: java.io.IOException -> L18
            r1.<init>(r0)     // Catch: java.io.IOException -> L18
            r8.f150b = r1     // Catch: java.io.IOException -> L18
            goto L1b
        L18:
            java.util.Objects.toString(r0)
        L1b:
            zG0 r0 = r8.f150b
            if (r0 != 0) goto L20
            goto La
        L20:
            int[] r1 = new int[]{r3}
            int r0 = r0.m26359S()
            byte[] r0 = new byte[r0]
            zG0 r4 = r8.f150b     // Catch: java.io.IOException -> L37
            ES1 r5 = new ES1     // Catch: java.io.IOException -> L37
            r6 = 18
            r7 = 0
            r5.<init>(r0, r1, r7, r6)     // Catch: java.io.IOException -> L37
            r4.m26365o(r5)     // Catch: java.io.IOException -> L37
        L37:
            Pf r4 = new Pf
            r1 = r1[r3]
            r5 = 17
            r4.<init>(r0, r1, r5)
        L40:
            if (r4 != 0) goto L43
            return r2
        L43:
            int r0 = r4.f9216b
            byte[] r1 = new byte[r0]
            java.lang.Object r2 = r4.f9217c
            byte[] r2 = (byte[]) r2
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AG0.mo143i():byte[]");
    }

    @Override // p000.InterfaceC0030AT
    /* renamed from: j */
    public final void mo144j() {
        mo141a();
        this.f149a.delete();
    }

    @Override // p000.InterfaceC0030AT
    /* renamed from: t */
    public final void mo145t(long j, String str) {
        File file = this.f149a;
        if (this.f150b == null) {
            try {
                this.f150b = new C11903zG0(file);
            } catch (IOException unused) {
                Objects.toString(file);
            }
        }
        if (this.f150b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f150b.m26362a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f148c));
            while (!this.f150b.m26366p() && this.f150b.m26359S() > 65536) {
                this.f150b.m26356A();
            }
        } catch (IOException unused2) {
        }
    }
}

package defpackage;

import android.os.StrictMode;
import com.facebook.soloader.SoLoader;
import com.facebook.soloader.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class UJ extends H21 {
    public final File a;
    public final int b;
    public final List c = Arrays.asList(new String[0]);

    public UJ(File file, int i) {
        this.a = file;
        this.b = i;
    }

    @Override // defpackage.H21
    public String b() {
        return "DirectorySoSource";
    }

    @Override // defpackage.H21
    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws NoSuchAlgorithmException, IOException {
        if (SoLoader.b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        boolean zContains = this.c.contains(str);
        File file = this.a;
        if (zContains) {
            file.getCanonicalPath();
            O90.k(3, "SoLoader");
            return 0;
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2 = null;
        }
        int i2 = 2;
        if (file2 == null) {
            file.getCanonicalPath();
            O90.k(2, "SoLoader");
            return 0;
        }
        String canonicalPath = file2.getCanonicalPath();
        O90.k(3, "SoLoader");
        int i3 = i & 1;
        int i4 = this.b;
        if (i3 == 0 || (i4 & 2) == 0) {
            i2 = 1;
            if ((i4 & 1) != 0) {
                C6826rN c6826rN = new C6826rN();
                c6826rN.a = file2;
                FileInputStream fileInputStream = new FileInputStream(c6826rN.a);
                c6826rN.b = fileInputStream;
                c6826rN.c = fileInputStream.getChannel();
                try {
                    String[] strArrA = d.a(str, c6826rN);
                    Arrays.toString(strArrA);
                    O90.k(3, "SoLoader");
                    for (String str2 : strArrA) {
                        if (!str2.startsWith("/")) {
                            SoLoader.l(str2, null, i | 1, threadPolicy);
                        }
                    }
                    c6826rN.close();
                } catch (Throwable th) {
                    try {
                        c6826rN.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                O90.k(3, "SoLoader");
            }
            try {
                SoLoader.b.L(i, canonicalPath);
            } catch (UnsatisfiedLinkError e) {
                throw AbstractC7225tS1.b(str, e);
            }
        } else {
            O90.k(3, "SoLoader");
        }
        return i2;
    }

    @Override // defpackage.H21
    public final String toString() {
        String name;
        File file = this.a;
        try {
            name = String.valueOf(file.getCanonicalPath());
        } catch (IOException unused) {
            name = file.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b());
        sb.append("[root = ");
        sb.append(name);
        sb.append(" flags = ");
        return AbstractC8235ym.l(sb, this.b, ']');
    }
}

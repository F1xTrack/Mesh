package p000;

import android.os.StrictMode;
import com.facebook.soloader.AbstractC1936d;
import com.facebook.soloader.SoLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

/* renamed from: UJ */
/* loaded from: classes.dex */
public class C1278UJ extends H21 {

    /* renamed from: a */
    public final File f11729a;

    /* renamed from: b */
    public final int f11730b;

    /* renamed from: c */
    public final List f11731c = Arrays.asList(new String[0]);

    public C1278UJ(File file, int i) {
        this.f11729a = file;
        this.f11730b = i;
    }

    @Override // p000.H21
    /* renamed from: b */
    public String mo3242b() {
        return "DirectorySoSource";
    }

    @Override // p000.H21
    /* renamed from: c */
    public final int mo3243c(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws NoSuchAlgorithmException, IOException {
        if (SoLoader.f17963b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        boolean zContains = this.f11731c.contains(str);
        File file = this.f11729a;
        if (zContains) {
            file.getCanonicalPath();
            O90.m5973k(3, "SoLoader");
            return 0;
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2 = null;
        }
        int i2 = 2;
        if (file2 == null) {
            file.getCanonicalPath();
            O90.m5973k(2, "SoLoader");
            return 0;
        }
        String canonicalPath = file2.getCanonicalPath();
        O90.m5973k(3, "SoLoader");
        int i3 = i & 1;
        int i4 = this.f11730b;
        if (i3 == 0 || (i4 & 2) == 0) {
            i2 = 1;
            if ((i4 & 1) != 0) {
                C6739rN c6739rN = new C6739rN();
                c6739rN.f41620a = file2;
                FileInputStream fileInputStream = new FileInputStream(c6739rN.f41620a);
                c6739rN.f41621b = fileInputStream;
                c6739rN.f41622c = fileInputStream.getChannel();
                try {
                    String[] strArrM11089a = AbstractC1936d.m11089a(str, c6739rN);
                    Arrays.toString(strArrM11089a);
                    O90.m5973k(3, "SoLoader");
                    for (String str2 : strArrM11089a) {
                        if (!str2.startsWith("/")) {
                            SoLoader.m11078l(str2, null, i | 1, threadPolicy);
                        }
                    }
                    c6739rN.close();
                } catch (Throwable th) {
                    try {
                        c6739rN.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                O90.m5973k(3, "SoLoader");
            }
            try {
                SoLoader.f17963b.m7562L(i, canonicalPath);
            } catch (UnsatisfiedLinkError e) {
                throw AbstractC11164tS1.m24935b(str, e);
            }
        } else {
            O90.m5973k(3, "SoLoader");
        }
        return i2;
    }

    @Override // p000.H21
    public final String toString() {
        String name;
        File file = this.f11729a;
        try {
            name = String.valueOf(file.getCanonicalPath());
        } catch (IOException unused) {
            name = file.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mo3242b());
        sb.append("[root = ");
        sb.append(name);
        sb.append(" flags = ");
        return AbstractC7222ym.m26235l(sb, this.f11730b, ']');
    }
}

package p000;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: ET */
/* loaded from: classes.dex */
public final class C0282ET {

    /* renamed from: a */
    public final String f2710a;

    /* renamed from: b */
    public final HashMap f2711b = new HashMap();

    public C0282ET(String str) {
        this.f2710a = str;
    }

    /* renamed from: a */
    public static boolean m2304a(String str, String str2) {
        String strM2661a = AbstractC0345FT.m2661a(str);
        String strM2661a2 = AbstractC0345FT.m2661a(str2);
        if (!strM2661a.equals(strM2661a2)) {
            if (!strM2661a.startsWith(strM2661a2 + '/')) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final File m2305b(Uri uri) throws IOException {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) this.f2711b.get(strDecode);
        if (file == null) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24911w("Unable to find configured root for ", uri));
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (m2304a(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            throw new IllegalArgumentException(AbstractC1374Vq.m8588g(file2, "Failed to resolve canonical path for "));
        }
    }
}

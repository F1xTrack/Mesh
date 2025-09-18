package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ET {
    public final String a;
    public final HashMap b = new HashMap();

    public ET(String str) {
        this.a = str;
    }

    public static boolean a(String str, String str2) {
        String strA = FT.a(str);
        String strA2 = FT.a(str2);
        if (!strA.equals(strA2)) {
            if (!strA.startsWith(strA2 + '/')) {
                return false;
            }
        }
        return true;
    }

    public final File b(Uri uri) throws IOException {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) this.b.get(strDecode);
        if (file == null) {
            throw new IllegalArgumentException(AbstractC7209tN0.w("Unable to find configured root for ", uri));
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (a(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            throw new IllegalArgumentException(AbstractC1705Vq.g(file2, "Failed to resolve canonical path for "));
        }
    }
}

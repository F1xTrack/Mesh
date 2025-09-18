package p000;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: Ah1 */
/* loaded from: classes.dex */
public abstract class AbstractC7329Ah1 {

    /* renamed from: a */
    public static final Charset f335a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static void m290a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(AbstractC1374Vq.m8588g(file, "not a readable directory: "));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m290a(file2);
            }
            if (!file2.delete()) {
                throw new IOException(AbstractC1374Vq.m8588g(file2, "failed to delete file: "));
            }
        }
    }
}

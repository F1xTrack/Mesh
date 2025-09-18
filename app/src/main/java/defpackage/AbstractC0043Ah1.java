package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: Ah1 */
/* loaded from: classes.dex */
public abstract class AbstractC0043Ah1 {
    public static final Charset a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(AbstractC1705Vq.g(file, "not a readable directory: "));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException(AbstractC1705Vq.g(file2, "failed to delete file: "));
            }
        }
    }
}

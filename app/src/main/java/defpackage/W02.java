package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public abstract class W02 {
    public static boolean a(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                a(file2);
            }
        }
        return file.delete();
    }

    public static void b(File file, YT yt) {
        yt.b(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    b(file2, yt);
                } else {
                    yt.a(file2);
                }
            }
        }
        yt.c(file);
    }
}

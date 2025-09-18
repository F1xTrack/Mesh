package p000;

import java.io.File;

/* loaded from: classes.dex */
public abstract class W02 {
    /* renamed from: a */
    public static boolean m8647a(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m8647a(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: b */
    public static void m8648b(File file, InterfaceC1540YT interfaceC1540YT) {
        interfaceC1540YT.mo6118b(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m8648b(file2, interfaceC1540YT);
                } else {
                    interfaceC1540YT.mo6117a(file2);
                }
            }
        }
        interfaceC1540YT.mo6119c(file);
    }
}

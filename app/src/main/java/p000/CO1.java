package p000;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public abstract class CO1 {

    /* renamed from: a */
    public static Context f1354a;

    /* renamed from: a */
    public static boolean m1179a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m1179a(file2) && z;
        }
        return z;
    }
}

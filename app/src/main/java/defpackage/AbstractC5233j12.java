package defpackage;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* renamed from: j12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5233j12 {
    public static final boolean a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (!Float.isNaN(f) || !Float.isNaN(f2)) {
                return false;
            }
        } else if (Math.abs(f2 - f) >= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static final void b(Context context) {
        O90.f(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        O90.e(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            TE teG = TE.G();
            String[] strArr = AbstractC0064Ao1.a;
            teG.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            O90.e(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(R5.a.a(context), "androidx.work.workdb");
            String[] strArr2 = AbstractC0064Ao1.a;
            int iB = AbstractC7287tn0.b(strArr2.length);
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
            for (String str : strArr2) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            for (Map.Entry entry : AbstractC7096sn0.k(linkedHashMap, new Pair(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        TE teG2 = TE.G();
                        String[] strArr3 = AbstractC0064Ao1.a;
                        file3.toString();
                        teG2.getClass();
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    TE teG3 = TE.G();
                    String[] strArr4 = AbstractC0064Ao1.a;
                    teG3.getClass();
                }
            }
        }
    }
}

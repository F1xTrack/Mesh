package p000;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* renamed from: j12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9828j12 {
    /* renamed from: a */
    public static final boolean m21957a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (!Float.isNaN(f) || !Float.isNaN(f2)) {
                return false;
            }
        } else if (Math.abs(f2 - f) >= 1.0E-5f) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final void m21958b(Context context) {
        O90.m5968f(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        O90.m5967e(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            C1210TE c1210teM7634G = C1210TE.m7634G();
            String[] strArr = AbstractC7343Ao1.f380a;
            c1210teM7634G.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            O90.m5967e(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(C1075R5.f9992a.m6895a(context), "androidx.work.workdb");
            String[] strArr2 = AbstractC7343Ao1.f380a;
            int iM24983b = AbstractC11205tn0.m24983b(strArr2.length);
            if (iM24983b < 16) {
                iM24983b = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b);
            for (String str : strArr2) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            for (Map.Entry entry : AbstractC11077sn0.m24783k(linkedHashMap, new Pair(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        C1210TE c1210teM7634G2 = C1210TE.m7634G();
                        String[] strArr3 = AbstractC7343Ao1.f380a;
                        file3.toString();
                        c1210teM7634G2.getClass();
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    C1210TE c1210teM7634G3 = C1210TE.m7634G();
                    String[] strArr4 = AbstractC7343Ao1.f380a;
                    c1210teM7634G3.getClass();
                }
            }
        }
    }
}

package p000;

import android.content.Context;
import java.io.File;

/* renamed from: R5 */
/* loaded from: classes.dex */
public final class C1075R5 {

    /* renamed from: a */
    public static final C1075R5 f9992a = new C1075R5();

    /* renamed from: a */
    public final File m6895a(Context context) {
        O90.m5968f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        O90.m5967e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}

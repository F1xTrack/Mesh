package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class R5 {
    public static final R5 a = new R5();

    public final File a(Context context) {
        O90.f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        O90.e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}

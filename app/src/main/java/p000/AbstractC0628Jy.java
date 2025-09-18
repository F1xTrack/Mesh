package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: Jy */
/* loaded from: classes.dex */
public abstract class AbstractC0628Jy {
    /* renamed from: a */
    public static File m4479a(Context context) {
        return context.getCodeCacheDir();
    }

    /* renamed from: b */
    public static Drawable m4480b(Context context, int i) {
        return context.getDrawable(i);
    }

    /* renamed from: c */
    public static File m4481c(Context context) {
        return context.getNoBackupFilesDir();
    }
}

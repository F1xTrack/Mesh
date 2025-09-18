package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public abstract class DT {
    public static File[] a(Context context) {
        return context.getExternalMediaDirs();
    }
}

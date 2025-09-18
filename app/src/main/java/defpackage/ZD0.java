package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class ZD0 {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}

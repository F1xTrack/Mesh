package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class M71 {
    public static final M71 a = new M71();

    public final R71 a(Looper looper, Handler.Callback callback) {
        return new R71(new Handler(looper, callback));
    }
}

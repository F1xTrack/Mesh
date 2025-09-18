package p000;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class NM1 extends Handler {
    private final Looper zza;

    public NM1(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    public NM1(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zza = Looper.getMainLooper();
    }
}

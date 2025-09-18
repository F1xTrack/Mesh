package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ME {
    public final Handler a = new Handler(Looper.myLooper());
    public final LE b = new LE(this);
    public final /* synthetic */ NE c;

    public ME(NE ne) {
        this.c = ne;
    }

    public void a(AudioTrack audioTrack) {
        Handler handler = this.a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new ExecutorC6359ow(handler), this.b);
    }

    public void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}

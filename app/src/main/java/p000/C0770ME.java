package p000;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* renamed from: ME */
/* loaded from: classes.dex */
public final class C0770ME {

    /* renamed from: a */
    public final Handler f7042a = new Handler(Looper.myLooper());

    /* renamed from: b */
    public final C0708LE f7043b = new C0708LE(this);

    /* renamed from: c */
    public final /* synthetic */ C0833NE f7044c;

    public C0770ME(C0833NE c0833ne) {
        this.f7044c = c0833ne;
    }

    /* renamed from: a */
    public void m5285a(AudioTrack audioTrack) {
        Handler handler = this.f7042a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new ExecutorC6585ow(handler), this.f7043b);
    }

    /* renamed from: b */
    public void m5286b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f7043b);
        this.f7042a.removeCallbacksAndMessages(null);
    }
}

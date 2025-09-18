package p000;

import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* renamed from: di */
/* loaded from: classes.dex */
public final class C3945di {

    /* renamed from: c */
    public static final GmsLogger f26220c = new GmsLogger("StreamingFormatChecker", "");

    /* renamed from: a */
    public final LinkedList f26221a = new LinkedList();

    /* renamed from: b */
    public long f26222b = -1;

    /* renamed from: a */
    public final void m17729a(E80 e80) {
        if (e80.f2508f != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LinkedList linkedList = this.f26221a;
        linkedList.add(Long.valueOf(jElapsedRealtime));
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() != 5 || jElapsedRealtime - ((Long) Preconditions.checkNotNull((Long) linkedList.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j = this.f26222b;
        if (j == -1 || jElapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f26222b = jElapsedRealtime;
            f26220c.m11117w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}

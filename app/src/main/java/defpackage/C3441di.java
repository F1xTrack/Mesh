package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* renamed from: di, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3441di {
    public static final GmsLogger c = new GmsLogger("StreamingFormatChecker", "");
    public final LinkedList a = new LinkedList();
    public long b = -1;

    public final void a(E80 e80) {
        if (e80.f != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LinkedList linkedList = this.a;
        linkedList.add(Long.valueOf(jElapsedRealtime));
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() != 5 || jElapsedRealtime - ((Long) Preconditions.checkNotNull((Long) linkedList.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j = this.b;
        if (j == -1 || jElapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5L)) {
            this.b = jElapsedRealtime;
            c.w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}

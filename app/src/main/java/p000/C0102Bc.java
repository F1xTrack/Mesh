package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: Bc */
/* loaded from: classes.dex */
public final class C0102Bc {

    /* renamed from: a */
    public final Executor f938a;

    /* renamed from: b */
    public final Handler f939b;

    public C0102Bc(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f938a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f939b = handler;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0102Bc)) {
            return false;
        }
        C0102Bc c0102Bc = (C0102Bc) obj;
        return this.f938a.equals(c0102Bc.f938a) && this.f939b.equals(c0102Bc.f939b);
    }

    public final int hashCode() {
        return ((this.f938a.hashCode() ^ 1000003) * 1000003) ^ this.f939b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f938a + ", schedulerHandler=" + this.f939b + "}";
    }
}

package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: Bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104Bc {
    public final Executor a;
    public final Handler b;

    public C0104Bc(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.b = handler;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0104Bc)) {
            return false;
        }
        C0104Bc c0104Bc = (C0104Bc) obj;
        return this.a.equals(c0104Bc.a) && this.b.equals(c0104Bc.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}

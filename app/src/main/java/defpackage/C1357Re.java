package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: Re */
/* loaded from: classes.dex */
public final class C1357Re {
    public int a;
    public final HashMap b;
    public final ExecutorService c;
    public final C2226aw d;
    public final VH e;
    public final Rect f;
    public final Matrix g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final List l;

    public C1357Re(ExecutorService executorService, C2226aw c2226aw, VH vh, Rect rect, Matrix matrix, int i, int i2, int i3, boolean z, List list) {
        this.a = ((CaptureFailedRetryQuirk) AbstractC7005sJ.a.z0(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        this.b = new HashMap();
        if (executorService == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.c = executorService;
        this.d = c2226aw;
        this.e = vh;
        this.f = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.g = matrix;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = z;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.l = list;
    }

    public final boolean a() {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final void b(int i) {
        HashMap map = this.b;
        if (map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), Boolean.TRUE);
        } else {
            AbstractC0759Jm0.f("TakePictureRequest");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1357Re)) {
            return false;
        }
        C1357Re c1357Re = (C1357Re) obj;
        if (this.c.equals(c1357Re.c)) {
            C2226aw c2226aw = c1357Re.d;
            C2226aw c2226aw2 = this.d;
            if (c2226aw2 != null ? c2226aw2.equals(c2226aw) : c2226aw == null) {
                VH vh = c1357Re.e;
                VH vh2 = this.e;
                if (vh2 != null ? vh2.equals(vh) : vh == null) {
                    if (this.f.equals(c1357Re.f) && this.g.equals(c1357Re.g) && this.h == c1357Re.h && this.i == c1357Re.i && this.j == c1357Re.j && this.k == c1357Re.k && this.l.equals(c1357Re.l)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() ^ 1000003) * (-721379959);
        C2226aw c2226aw = this.d;
        int iHashCode2 = (iHashCode ^ (c2226aw == null ? 0 : c2226aw.hashCode())) * 1000003;
        VH vh = this.e;
        return ((((((((((((((iHashCode2 ^ (vh != null ? vh.hashCode() : 0)) * (-721379959)) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003) ^ this.l.hashCode();
    }

    public final String toString() {
        return "TakePictureRequest{appExecutor=" + this.c + ", inMemoryCallback=null, onDiskCallback=" + this.d + ", outputFileOptions=" + this.e + ", secondaryOutputFileOptions=null, cropRect=" + this.f + ", sensorToBufferTransform=" + this.g + ", rotationDegrees=" + this.h + ", jpegQuality=" + this.i + ", captureMode=" + this.j + ", simultaneousCapture=" + this.k + ", sessionConfigCameraCaptureCallbacks=" + this.l + "}";
    }
}

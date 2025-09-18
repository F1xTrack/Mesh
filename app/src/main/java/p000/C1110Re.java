package p000;

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
public final class C1110Re {

    /* renamed from: a */
    public int f10347a;

    /* renamed from: b */
    public final HashMap f10348b;

    /* renamed from: c */
    public final ExecutorService f10349c;

    /* renamed from: d */
    public final C1753aw f10350d;

    /* renamed from: e */
    public final C1339VH f10351e;

    /* renamed from: f */
    public final Rect f10352f;

    /* renamed from: g */
    public final Matrix f10353g;

    /* renamed from: h */
    public final int f10354h;

    /* renamed from: i */
    public final int f10355i;

    /* renamed from: j */
    public final int f10356j;

    /* renamed from: k */
    public final boolean f10357k;

    /* renamed from: l */
    public final List f10358l;

    public C1110Re(ExecutorService executorService, C1753aw c1753aw, C1339VH c1339vh, Rect rect, Matrix matrix, int i, int i2, int i3, boolean z, List list) {
        this.f10347a = ((CaptureFailedRetryQuirk) AbstractC6815sJ.f42362a.m17864z0(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        this.f10348b = new HashMap();
        if (executorService == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f10349c = executorService;
        this.f10350d = c1753aw;
        this.f10351e = c1339vh;
        this.f10352f = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f10353g = matrix;
        this.f10354h = i;
        this.f10355i = i2;
        this.f10356j = i3;
        this.f10357k = z;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f10358l = list;
    }

    /* renamed from: a */
    public final boolean m7052a() {
        Iterator it = this.f10348b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void m7053b(int i) {
        HashMap map = this.f10348b;
        if (map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), Boolean.TRUE);
        } else {
            AbstractC7806Jm0.m4412f("TakePictureRequest");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1110Re)) {
            return false;
        }
        C1110Re c1110Re = (C1110Re) obj;
        if (this.f10349c.equals(c1110Re.f10349c)) {
            C1753aw c1753aw = c1110Re.f10350d;
            C1753aw c1753aw2 = this.f10350d;
            if (c1753aw2 != null ? c1753aw2.equals(c1753aw) : c1753aw == null) {
                C1339VH c1339vh = c1110Re.f10351e;
                C1339VH c1339vh2 = this.f10351e;
                if (c1339vh2 != null ? c1339vh2.equals(c1339vh) : c1339vh == null) {
                    if (this.f10352f.equals(c1110Re.f10352f) && this.f10353g.equals(c1110Re.f10353g) && this.f10354h == c1110Re.f10354h && this.f10355i == c1110Re.f10355i && this.f10356j == c1110Re.f10356j && this.f10357k == c1110Re.f10357k && this.f10358l.equals(c1110Re.f10358l)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f10349c.hashCode() ^ 1000003) * (-721379959);
        C1753aw c1753aw = this.f10350d;
        int iHashCode2 = (iHashCode ^ (c1753aw == null ? 0 : c1753aw.hashCode())) * 1000003;
        C1339VH c1339vh = this.f10351e;
        return ((((((((((((((iHashCode2 ^ (c1339vh != null ? c1339vh.hashCode() : 0)) * (-721379959)) ^ this.f10352f.hashCode()) * 1000003) ^ this.f10353g.hashCode()) * 1000003) ^ this.f10354h) * 1000003) ^ this.f10355i) * 1000003) ^ this.f10356j) * 1000003) ^ (this.f10357k ? 1231 : 1237)) * 1000003) ^ this.f10358l.hashCode();
    }

    public final String toString() {
        return "TakePictureRequest{appExecutor=" + this.f10349c + ", inMemoryCallback=null, onDiskCallback=" + this.f10350d + ", outputFileOptions=" + this.f10351e + ", secondaryOutputFileOptions=null, cropRect=" + this.f10352f + ", sensorToBufferTransform=" + this.f10353g + ", rotationDegrees=" + this.f10354h + ", jpegQuality=" + this.f10355i + ", captureMode=" + this.f10356j + ", simultaneousCapture=" + this.f10357k + ", sessionConfigCameraCaptureCallbacks=" + this.f10358l + "}";
    }
}

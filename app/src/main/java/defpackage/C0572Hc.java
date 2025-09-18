package defpackage;

import android.hardware.camera2.CaptureRequest;

/* renamed from: Hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572Hc {
    public final String a;
    public final Class b;
    public final CaptureRequest.Key c;

    public C0572Hc(String str, Class cls, CaptureRequest.Key key) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.b = cls;
        this.c = key;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0572Hc)) {
            return false;
        }
        C0572Hc c0572Hc = (C0572Hc) obj;
        if (this.a.equals(c0572Hc.a) && this.b.equals(c0572Hc.b)) {
            CaptureRequest.Key key = c0572Hc.c;
            CaptureRequest.Key key2 = this.c;
            if (key2 == null) {
                if (key == null) {
                    return true;
                }
            } else if (key2.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        CaptureRequest.Key key = this.c;
        return iHashCode ^ (key == null ? 0 : key.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.a + ", valueClass=" + this.b + ", token=" + this.c + "}";
    }
}

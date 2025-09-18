package p000;

import android.hardware.camera2.CaptureRequest;

/* renamed from: Hc */
/* loaded from: classes.dex */
public final class C0480Hc {

    /* renamed from: a */
    public final String f4362a;

    /* renamed from: b */
    public final Class f4363b;

    /* renamed from: c */
    public final CaptureRequest.Key f4364c;

    public C0480Hc(String str, Class cls, CaptureRequest.Key key) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f4362a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f4363b = cls;
        this.f4364c = key;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0480Hc)) {
            return false;
        }
        C0480Hc c0480Hc = (C0480Hc) obj;
        if (this.f4362a.equals(c0480Hc.f4362a) && this.f4363b.equals(c0480Hc.f4363b)) {
            CaptureRequest.Key key = c0480Hc.f4364c;
            CaptureRequest.Key key2 = this.f4364c;
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
        int iHashCode = (((this.f4362a.hashCode() ^ 1000003) * 1000003) ^ this.f4363b.hashCode()) * 1000003;
        CaptureRequest.Key key = this.f4364c;
        return iHashCode ^ (key == null ? 0 : key.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.f4362a + ", valueClass=" + this.f4363b + ", token=" + this.f4364c + "}";
    }
}

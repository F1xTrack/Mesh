package p000;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Je */
/* loaded from: classes.dex */
public final class C0608Je implements InterfaceC4012en {

    /* renamed from: a */
    public final int f5654a;

    /* renamed from: b */
    public final int f5655b;

    /* renamed from: c */
    public final String f5656c;

    /* renamed from: d */
    public final List f5657d;

    /* renamed from: e */
    public final Surface f5658e;

    public C0608Je(int i, int i2, String str, List list, Surface surface) {
        this.f5654a = i;
        this.f5655b = i2;
        this.f5656c = str;
        if (list == null) {
            throw new NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.f5657d = list;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f5658e = surface;
    }

    /* renamed from: d */
    public static C0608Je m4378d(int i, int i2, String str, ArrayList arrayList, Surface surface) {
        return new C0608Je(i, i2, str, arrayList, surface);
    }

    /* renamed from: e */
    public static C0608Je m4379e(int i, Surface surface) {
        return new C0608Je(i, -1, null, Collections.emptyList(), surface);
    }

    @Override // p000.InterfaceC4012en
    /* renamed from: a */
    public final int mo4380a() {
        return this.f5655b;
    }

    @Override // p000.InterfaceC4012en
    /* renamed from: b */
    public final String mo4381b() {
        return this.f5656c;
    }

    @Override // p000.InterfaceC4012en
    /* renamed from: c */
    public final List mo4382c() {
        return this.f5657d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0608Je)) {
            return false;
        }
        C0608Je c0608Je = (C0608Je) obj;
        if (this.f5654a == c0608Je.f5654a && this.f5655b == c0608Je.f5655b) {
            String str = c0608Je.f5656c;
            String str2 = this.f5656c;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f5657d.equals(c0608Je.f5657d) && this.f5658e.equals(c0608Je.f5658e)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC4012en
    public final int getId() {
        return this.f5654a;
    }

    public final int hashCode() {
        int i = (((this.f5654a ^ 1000003) * 1000003) ^ this.f5655b) * 1000003;
        String str = this.f5656c;
        return ((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f5657d.hashCode()) * 1000003) ^ this.f5658e.hashCode();
    }

    public final String toString() {
        return "SurfaceOutputConfig{id=" + this.f5654a + ", surfaceGroupId=" + this.f5655b + ", physicalCameraId=" + this.f5656c + ", surfaceSharingOutputConfigs=" + this.f5657d + ", surface=" + this.f5658e + "}";
    }
}

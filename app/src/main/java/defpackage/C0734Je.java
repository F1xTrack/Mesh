package defpackage;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Je, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0734Je implements InterfaceC3646en {
    public final int a;
    public final int b;
    public final String c;
    public final List d;
    public final Surface e;

    public C0734Je(int i, int i2, String str, List list, Surface surface) {
        this.a = i;
        this.b = i2;
        this.c = str;
        if (list == null) {
            throw new NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.d = list;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.e = surface;
    }

    public static C0734Je d(int i, int i2, String str, ArrayList arrayList, Surface surface) {
        return new C0734Je(i, i2, str, arrayList, surface);
    }

    public static C0734Je e(int i, Surface surface) {
        return new C0734Je(i, -1, null, Collections.emptyList(), surface);
    }

    @Override // defpackage.InterfaceC3646en
    public final int a() {
        return this.b;
    }

    @Override // defpackage.InterfaceC3646en
    public final String b() {
        return this.c;
    }

    @Override // defpackage.InterfaceC3646en
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0734Je)) {
            return false;
        }
        C0734Je c0734Je = (C0734Je) obj;
        if (this.a == c0734Je.a && this.b == c0734Je.b) {
            String str = c0734Je.c;
            String str2 = this.c;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.d.equals(c0734Je.d) && this.e.equals(c0734Je.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC3646en
    public final int getId() {
        return this.a;
    }

    public final int hashCode() {
        int i = (((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003;
        String str = this.c;
        return ((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "SurfaceOutputConfig{id=" + this.a + ", surfaceGroupId=" + this.b + ", physicalCameraId=" + this.c + ", surfaceSharingOutputConfigs=" + this.d + ", surface=" + this.e + "}";
    }
}

package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Nd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042Nd implements InterfaceC3646en {
    public final int a;
    public final int b;
    public final String c;
    public final List d;
    public final Size e;
    public final int f;
    public final int g;

    public C1042Nd(int i, int i2, String str, List list, Size size, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        if (list == null) {
            throw new NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.d = list;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.e = size;
        this.f = i3;
        this.g = i4;
    }

    public static C1042Nd d(int i, int i2, String str, ArrayList arrayList, Size size, int i3, int i4) {
        return new C1042Nd(i, i2, str, arrayList, size, i3, i4);
    }

    public static C1042Nd e(int i, Size size, int i2) {
        return new C1042Nd(i, -1, null, Collections.emptyList(), size, 35, i2);
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
        if (!(obj instanceof C1042Nd)) {
            return false;
        }
        C1042Nd c1042Nd = (C1042Nd) obj;
        if (this.a == c1042Nd.a && this.b == c1042Nd.b) {
            String str = c1042Nd.c;
            String str2 = this.c;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.d.equals(c1042Nd.d) && this.e.equals(c1042Nd.e) && this.f == c1042Nd.f && this.g == c1042Nd.g) {
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
        return ((((((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageReaderOutputConfig{id=");
        sb.append(this.a);
        sb.append(", surfaceGroupId=");
        sb.append(this.b);
        sb.append(", physicalCameraId=");
        sb.append(this.c);
        sb.append(", surfaceSharingOutputConfigs=");
        sb.append(this.d);
        sb.append(", size=");
        sb.append(this.e);
        sb.append(", imageFormat=");
        sb.append(this.f);
        sb.append(", maxImages=");
        return AbstractC1705Vq.j(sb, this.g, "}");
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ae, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2172ae implements InterfaceC3646en {
    public final int a;
    public final int b;
    public final String c;
    public final ArrayList d;
    public final int e;
    public final int f;

    public C2172ae(int i, int i2, String str, ArrayList arrayList, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = arrayList;
        this.e = i3;
        this.f = i4;
    }

    public static C2172ae d(int i, int i2, String str, ArrayList arrayList, int i3, int i4) {
        return new C2172ae(i, i2, str, arrayList, i3, i4);
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
        if (!(obj instanceof C2172ae)) {
            return false;
        }
        C2172ae c2172ae = (C2172ae) obj;
        if (this.a == c2172ae.a && this.b == c2172ae.b) {
            String str = c2172ae.c;
            String str2 = this.c;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.d.equals(c2172ae.d) && this.e == c2172ae.e && this.f == c2172ae.f) {
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
        return this.f ^ ((((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiResolutionImageReaderOutputConfig{id=");
        sb.append(this.a);
        sb.append(", surfaceGroupId=");
        sb.append(this.b);
        sb.append(", physicalCameraId=");
        sb.append(this.c);
        sb.append(", surfaceSharingOutputConfigs=");
        sb.append(this.d);
        sb.append(", imageFormat=");
        sb.append(this.e);
        sb.append(", maxImages=");
        return AbstractC1705Vq.j(sb, this.f, "}");
    }
}

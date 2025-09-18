package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ae */
/* loaded from: classes.dex */
public final class C1677ae implements InterfaceC4012en {

    /* renamed from: a */
    public final int f15597a;

    /* renamed from: b */
    public final int f15598b;

    /* renamed from: c */
    public final String f15599c;

    /* renamed from: d */
    public final ArrayList f15600d;

    /* renamed from: e */
    public final int f15601e;

    /* renamed from: f */
    public final int f15602f;

    public C1677ae(int i, int i2, String str, ArrayList arrayList, int i3, int i4) {
        this.f15597a = i;
        this.f15598b = i2;
        this.f15599c = str;
        this.f15600d = arrayList;
        this.f15601e = i3;
        this.f15602f = i4;
    }

    /* renamed from: d */
    public static C1677ae m9777d(int i, int i2, String str, ArrayList arrayList, int i3, int i4) {
        return new C1677ae(i, i2, str, arrayList, i3, i4);
    }

    @Override // p000.InterfaceC4012en
    /* renamed from: a */
    public final int mo4380a() {
        return this.f15598b;
    }

    @Override // p000.InterfaceC4012en
    /* renamed from: b */
    public final String mo4381b() {
        return this.f15599c;
    }

    @Override // p000.InterfaceC4012en
    /* renamed from: c */
    public final List mo4382c() {
        return this.f15600d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1677ae)) {
            return false;
        }
        C1677ae c1677ae = (C1677ae) obj;
        if (this.f15597a == c1677ae.f15597a && this.f15598b == c1677ae.f15598b) {
            String str = c1677ae.f15599c;
            String str2 = this.f15599c;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f15600d.equals(c1677ae.f15600d) && this.f15601e == c1677ae.f15601e && this.f15602f == c1677ae.f15602f) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC4012en
    public final int getId() {
        return this.f15597a;
    }

    public final int hashCode() {
        int i = (((this.f15597a ^ 1000003) * 1000003) ^ this.f15598b) * 1000003;
        String str = this.f15599c;
        return this.f15602f ^ ((((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f15600d.hashCode()) * 1000003) ^ this.f15601e) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiResolutionImageReaderOutputConfig{id=");
        sb.append(this.f15597a);
        sb.append(", surfaceGroupId=");
        sb.append(this.f15598b);
        sb.append(", physicalCameraId=");
        sb.append(this.f15599c);
        sb.append(", surfaceSharingOutputConfigs=");
        sb.append(this.f15600d);
        sb.append(", imageFormat=");
        sb.append(this.f15601e);
        sb.append(", maxImages=");
        return AbstractC1374Vq.m8591j(sb, this.f15602f, "}");
    }
}

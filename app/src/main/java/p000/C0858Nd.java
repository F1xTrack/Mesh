package p000;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Nd */
/* loaded from: classes.dex */
public final class C0858Nd implements InterfaceC4012en {

    /* renamed from: a */
    public final int f7913a;

    /* renamed from: b */
    public final int f7914b;

    /* renamed from: c */
    public final String f7915c;

    /* renamed from: d */
    public final List f7916d;

    /* renamed from: e */
    public final Size f7917e;

    /* renamed from: f */
    public final int f7918f;

    /* renamed from: g */
    public final int f7919g;

    public C0858Nd(int i, int i2, String str, List list, Size size, int i3, int i4) {
        this.f7913a = i;
        this.f7914b = i2;
        this.f7915c = str;
        if (list == null) {
            throw new NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.f7916d = list;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f7917e = size;
        this.f7918f = i3;
        this.f7919g = i4;
    }

    /* renamed from: d */
    public static C0858Nd m5788d(int i, int i2, String str, ArrayList arrayList, Size size, int i3, int i4) {
        return new C0858Nd(i, i2, str, arrayList, size, i3, i4);
    }

    /* renamed from: e */
    public static C0858Nd m5789e(int i, Size size, int i2) {
        return new C0858Nd(i, -1, null, Collections.emptyList(), size, 35, i2);
    }

    @Override // p000.InterfaceC4012en
    /* renamed from: a */
    public final int mo4380a() {
        return this.f7914b;
    }

    @Override // p000.InterfaceC4012en
    /* renamed from: b */
    public final String mo4381b() {
        return this.f7915c;
    }

    @Override // p000.InterfaceC4012en
    /* renamed from: c */
    public final List mo4382c() {
        return this.f7916d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0858Nd)) {
            return false;
        }
        C0858Nd c0858Nd = (C0858Nd) obj;
        if (this.f7913a == c0858Nd.f7913a && this.f7914b == c0858Nd.f7914b) {
            String str = c0858Nd.f7915c;
            String str2 = this.f7915c;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f7916d.equals(c0858Nd.f7916d) && this.f7917e.equals(c0858Nd.f7917e) && this.f7918f == c0858Nd.f7918f && this.f7919g == c0858Nd.f7919g) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC4012en
    public final int getId() {
        return this.f7913a;
    }

    public final int hashCode() {
        int i = (((this.f7913a ^ 1000003) * 1000003) ^ this.f7914b) * 1000003;
        String str = this.f7915c;
        return ((((((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f7916d.hashCode()) * 1000003) ^ this.f7917e.hashCode()) * 1000003) ^ this.f7918f) * 1000003) ^ this.f7919g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageReaderOutputConfig{id=");
        sb.append(this.f7913a);
        sb.append(", surfaceGroupId=");
        sb.append(this.f7914b);
        sb.append(", physicalCameraId=");
        sb.append(this.f7915c);
        sb.append(", surfaceSharingOutputConfigs=");
        sb.append(this.f7916d);
        sb.append(", size=");
        sb.append(this.f7917e);
        sb.append(", imageFormat=");
        sb.append(this.f7918f);
        sb.append(", maxImages=");
        return AbstractC1374Vq.m8591j(sb, this.f7919g, "}");
    }
}

package p000;

import java.util.RandomAccess;

/* renamed from: K8 */
/* loaded from: classes2.dex */
public final class C0639K8 extends AbstractC6859t0 implements RandomAccess {

    /* renamed from: a */
    public final /* synthetic */ int[] f5913a;

    public C0639K8(int[] iArr) {
        this.f5913a = iArr;
    }

    @Override // p000.AbstractC6859t0
    /* renamed from: b */
    public final int mo4090b() {
        return this.f5913a.length;
    }

    @Override // p000.AbstractC6859t0, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f5913a;
        O90.m5968f(iArr, "<this>");
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (iIntValue == iArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.f5913a[i]);
    }

    @Override // p000.AbstractC6859t0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f5913a;
        O90.m5968f(iArr, "<this>");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (iIntValue == iArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC6859t0, java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f5913a.length == 0;
    }

    @Override // p000.AbstractC6859t0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f5913a;
        O90.m5968f(iArr, "<this>");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (iIntValue == iArr[length]) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }
}

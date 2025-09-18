package defpackage;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class K8 extends AbstractC7135t0 implements RandomAccess {
    public final /* synthetic */ int[] a;

    public K8(int[] iArr) {
        this.a = iArr;
    }

    @Override // defpackage.AbstractC7135t0
    public final int b() {
        return this.a.length;
    }

    @Override // defpackage.AbstractC7135t0, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.a;
        O90.f(iArr, "<this>");
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
        return Integer.valueOf(this.a[i]);
    }

    @Override // defpackage.AbstractC7135t0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.a;
        O90.f(iArr, "<this>");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (iIntValue == iArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC7135t0, java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // defpackage.AbstractC7135t0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.a;
        O90.f(iArr, "<this>");
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

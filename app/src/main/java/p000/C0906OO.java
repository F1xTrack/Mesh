package p000;

import java.io.Serializable;
import kotlin.enums.EnumEntries;

/* renamed from: OO */
/* loaded from: classes2.dex */
public final class C0906OO extends AbstractC6859t0 implements EnumEntries, Serializable {

    /* renamed from: a */
    public final Enum[] f8406a;

    public C0906OO(Enum[] enumArr) {
        O90.m5968f(enumArr, "entries");
        this.f8406a = enumArr;
    }

    @Override // p000.AbstractC6859t0
    /* renamed from: b */
    public final int mo4090b() {
        return this.f8406a.length;
    }

    @Override // p000.AbstractC6859t0, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        O90.m5968f(r4, "element");
        return ((Enum) AbstractC0576J8.m4191r(r4.ordinal(), this.f8406a)) == r4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f8406a;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", length, ", size: "));
        }
        return enumArr[i];
    }

    @Override // p000.AbstractC6859t0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        O90.m5968f(r4, "element");
        int iOrdinal = r4.ordinal();
        if (((Enum) AbstractC0576J8.m4191r(iOrdinal, this.f8406a)) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p000.AbstractC6859t0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        O90.m5968f(r2, "element");
        return indexOf(r2);
    }
}

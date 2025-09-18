package defpackage;

import java.io.Serializable;
import kotlin.enums.EnumEntries;

/* loaded from: classes2.dex */
public final class OO extends AbstractC7135t0 implements EnumEntries, Serializable {
    public final Enum[] a;

    public OO(Enum[] enumArr) {
        O90.f(enumArr, "entries");
        this.a = enumArr;
    }

    @Override // defpackage.AbstractC7135t0
    public final int b() {
        return this.a.length;
    }

    @Override // defpackage.AbstractC7135t0, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        O90.f(r4, "element");
        return ((Enum) J8.r(r4.ordinal(), this.a)) == r4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "index: ", length, ", size: "));
        }
        return enumArr[i];
    }

    @Override // defpackage.AbstractC7135t0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        O90.f(r4, "element");
        int iOrdinal = r4.ordinal();
        if (((Enum) J8.r(iOrdinal, this.a)) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.AbstractC7135t0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        O90.f(r2, "element");
        return indexOf(r2);
    }
}

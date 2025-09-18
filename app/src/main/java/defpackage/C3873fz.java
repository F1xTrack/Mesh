package defpackage;

/* renamed from: fz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3873fz extends AbstractC8198yZ1 {
    public final Object a;

    public C3873fz(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3873fz) && O90.a(this.a, ((C3873fz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConvertedValue(convertedValue=" + this.a + ")";
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: ht0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4238ht0 extends AbstractC1134Oh1 {
    public final ArrayList a;
    public final Map b;

    public C4238ht0(ArrayList arrayList) {
        this.a = arrayList;
        Map mapN = AbstractC7096sn0.n(arrayList);
        if (mapN.size() != arrayList.size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.b = mapN;
    }

    @Override // defpackage.AbstractC1134Oh1
    public final boolean a(C1559Tt0 c1559Tt0) {
        return this.b.containsKey(c1559Tt0);
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.a + ')';
    }
}

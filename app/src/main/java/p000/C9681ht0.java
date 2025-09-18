package p000;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: ht0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9681ht0 extends AbstractC8057Oh1 {

    /* renamed from: a */
    public final ArrayList f28648a;

    /* renamed from: b */
    public final Map f28649b;

    public C9681ht0(ArrayList arrayList) {
        this.f28648a = arrayList;
        Map mapM24786n = AbstractC11077sn0.m24786n(arrayList);
        if (mapM24786n.size() != arrayList.size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f28649b = mapM24786n;
    }

    @Override // p000.AbstractC8057Oh1
    /* renamed from: a */
    public final boolean mo6116a(C8340Tt0 c8340Tt0) {
        return this.f28649b.containsKey(c8340Tt0);
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f28648a + ')';
    }
}

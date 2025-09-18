package defpackage;

import java.util.List;

/* renamed from: x02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7901x02 {
    public static C0124Bi1 a(NF0 nf0) {
        O90.f(nf0, "table");
        if (nf0.b.size() == 0) {
            return C0124Bi1.b;
        }
        List list = nf0.b;
        O90.e(list, "getRequirementList(...)");
        return new C0124Bi1(list);
    }
}

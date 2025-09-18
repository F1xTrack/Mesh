package defpackage;

import java.util.Comparator;

/* renamed from: ev */
/* loaded from: classes.dex */
public final class C3670ev extends AbstractC4052gv {
    public static AbstractC4052gv f(int i) {
        return i < 0 ? AbstractC4052gv.b : i > 0 ? AbstractC4052gv.c : AbstractC4052gv.a;
    }

    @Override // defpackage.AbstractC4052gv
    public final AbstractC4052gv a(int i, int i2) {
        return f(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // defpackage.AbstractC4052gv
    public final AbstractC4052gv b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.AbstractC4052gv
    public final AbstractC4052gv c(boolean z, boolean z2) {
        return f(z == z2 ? 0 : z ? 1 : -1);
    }

    @Override // defpackage.AbstractC4052gv
    public final AbstractC4052gv d(boolean z, boolean z2) {
        return f(z2 == z ? 0 : z2 ? 1 : -1);
    }

    @Override // defpackage.AbstractC4052gv
    public final int e() {
        return 0;
    }
}

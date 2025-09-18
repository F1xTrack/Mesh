package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class QO extends AbstractC5769lq0 {
    public final C1454Sk0 b;
    public final C1454Sk0 c;
    public final C1688Vk0 d;
    public final /* synthetic */ RO e;

    public QO(RO ro, Z41 z41) {
        if (z41 == null) {
            h(0);
            throw null;
        }
        this.e = ro;
        C1922Yk0 c1922Yk0 = (C1922Yk0) z41;
        this.b = c1922Yk0.b(new PO(this, 0));
        this.c = c1922Yk0.b(new PO(this, 1));
        this.d = new C1688Vk0(c1922Yk0, new C5994n1(1, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void h(int r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.QO.h(int):void");
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Collection a(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        if (c1559Tt0 != null) {
            return (Collection) this.b.invoke(c1559Tt0);
        }
        h(5);
        throw null;
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Set b() {
        Set set = (Set) this.e.i.invoke();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Set d() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        h(18);
        throw null;
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Collection e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        if (c1559Tt0 != null) {
            return (Collection) this.c.invoke(c1559Tt0);
        }
        h(1);
        throw null;
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC5578kq0
    public final Set f() {
        Set set = (Set) this.e.i.invoke();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    @Override // defpackage.AbstractC5769lq0, defpackage.InterfaceC3584eS0
    public final Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        if (c4317iI == null) {
            h(13);
            throw null;
        }
        if (interfaceC6099nZ == null) {
            h(14);
            throw null;
        }
        Collection collection = (Collection) this.d.invoke();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    public final InterfaceC5578kq0 i() {
        InterfaceC5578kq0 interfaceC5578kq0D0 = ((AbstractC0663Ig0) ((AbstractC5612l1) this.e.v()).b().iterator().next()).d0();
        if (interfaceC5578kq0D0 != null) {
            return interfaceC5578kq0D0;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(C1559Tt0 c1559Tt0, Collection collection) {
        if (c1559Tt0 == null) {
            h(10);
            throw null;
        }
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C7323tz0.c.h(c1559Tt0, collection, Collections.emptySet(), this.e, new DI(linkedHashSet, 1));
        return linkedHashSet;
    }
}

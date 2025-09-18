package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: Nn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1073Nn0 extends AbstractC7135t0 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public C1073Nn0(List list) {
        this.b = list;
    }

    @Override // defpackage.AbstractC7135t0
    public final int b() {
        switch (this.a) {
            case 0:
                return ((C1151On0) this.b).a.groupCount() + 1;
            default:
                return ((List) this.b).size();
        }
    }

    @Override // defpackage.AbstractC7135t0, java.util.List, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                String strGroup = ((C1151On0) this.b).a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) this.b).get(AbstractC8069xu.r(i, this));
        }
    }

    @Override // defpackage.AbstractC7135t0, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.AbstractC7135t0, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        switch (this.a) {
            case 1:
                return new C3778fT0(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.AbstractC7135t0, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.AbstractC7135t0, java.util.List
    public ListIterator listIterator() {
        switch (this.a) {
            case 1:
                return new C3778fT0(this, 0);
            default:
                return super.listIterator();
        }
    }

    public C1073Nn0(C1151On0 c1151On0) {
        this.b = c1151On0;
    }

    @Override // defpackage.AbstractC7135t0, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.a) {
            case 1:
                return new C3778fT0(this, i);
            default:
                return super.listIterator(i);
        }
    }
}

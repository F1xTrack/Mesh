package p000;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: Nn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8016Nn0 extends AbstractC6859t0 {

    /* renamed from: a */
    public final /* synthetic */ int f7995a = 0;

    /* renamed from: b */
    public final Object f7996b;

    public C8016Nn0(List list) {
        this.f7996b = list;
    }

    @Override // p000.AbstractC6859t0
    /* renamed from: b */
    public final int mo4090b() {
        switch (this.f7995a) {
            case 0:
                return ((C8068On0) this.f7996b).f8621a.groupCount() + 1;
            default:
                return ((List) this.f7996b).size();
        }
    }

    @Override // p000.AbstractC6859t0, java.util.List, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f7995a) {
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
        switch (this.f7995a) {
            case 0:
                String strGroup = ((C8068On0) this.f7996b).f8621a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) this.f7996b).get(AbstractC7167xu.m25990r(i, this));
        }
    }

    @Override // p000.AbstractC6859t0, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f7995a) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // p000.AbstractC6859t0, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        switch (this.f7995a) {
            case 1:
                return new C9373fT0(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // p000.AbstractC6859t0, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f7995a) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // p000.AbstractC6859t0, java.util.List
    public ListIterator listIterator() {
        switch (this.f7995a) {
            case 1:
                return new C9373fT0(this, 0);
            default:
                return super.listIterator();
        }
    }

    public C8016Nn0(C8068On0 c8068On0) {
        this.f7996b = c8068On0;
    }

    @Override // p000.AbstractC6859t0, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.f7995a) {
            case 1:
                return new C9373fT0(this, i);
            default:
                return super.listIterator(i);
        }
    }
}

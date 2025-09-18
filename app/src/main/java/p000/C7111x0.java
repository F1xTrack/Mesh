package p000;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: x0 */
/* loaded from: classes.dex */
public class C7111x0 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f45247a;

    /* renamed from: b */
    public final Iterator f45248b;

    /* renamed from: c */
    public Object f45249c;

    /* renamed from: d */
    public final /* synthetic */ Object f45250d;

    public C7111x0(C0379G0 c0379g0, ListIterator listIterator, byte b) {
        this.f45247a = 5;
        this.f45250d = c0379g0;
        this.f45249c = c0379g0.f3510c;
        this.f45248b = listIterator;
    }

    /* renamed from: a */
    public void m25730a() {
        C0379G0 c0379g0 = (C0379G0) this.f45250d;
        c0379g0.m2872d();
        if (c0379g0.f3510c != ((Collection) this.f45249c)) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: b */
    public void m25731b() {
        C0379G0 c0379g0 = (C0379G0) this.f45250d;
        c0379g0.m2874i();
        if (c0379g0.f3510c != ((Collection) this.f45249c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f45247a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                m25730a();
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                m25731b();
                break;
        }
        return this.f45248b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f45247a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f45248b.next();
                this.f45249c = (Collection) entry.getValue();
                return ((C7174y0) this.f45250d).m26029a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f45248b.next();
                this.f45249c = entry2;
                return entry2.getKey();
            case 2:
                m25730a();
                return this.f45248b.next();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.f45248b.next();
                this.f45249c = (Collection) entry3.getValue();
                Object key = entry3.getKey();
                Collection collection = (Collection) entry3.getValue();
                C10492oC1 c10492oC1 = (C10492oC1) ((C7174y0) this.f45250d).f46002e;
                List list = (List) collection;
                return new C11644xD1(key, list instanceof RandomAccess ? new BB1(c10492oC1, key, list, null) : new C0379G0(c10492oC1, key, list, (C0379G0) null));
            case 4:
                Map.Entry entry4 = (Map.Entry) this.f45248b.next();
                this.f45249c = entry4;
                return entry4.getKey();
            default:
                m25731b();
                return this.f45248b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f45247a) {
            case 0:
                QL1.m6671g(((Collection) this.f45249c) != null, "no calls to next() since the last call to remove()");
                this.f45248b.remove();
                ((AbstractC6922u0) ((C7174y0) this.f45250d).f46002e).f43442e -= ((Collection) this.f45249c).size();
                ((Collection) this.f45249c).clear();
                this.f45249c = null;
                break;
            case 1:
                QL1.m6671g(((Map.Entry) this.f45249c) != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) ((Map.Entry) this.f45249c).getValue();
                this.f45248b.remove();
                ((C7237z0) this.f45250d).f46566c.f43442e -= collection.size();
                collection.clear();
                this.f45249c = null;
                break;
            case 2:
                this.f45248b.remove();
                C0379G0 c0379g0 = (C0379G0) this.f45250d;
                AbstractC6922u0 abstractC6922u0 = (AbstractC6922u0) c0379g0.f3513f;
                abstractC6922u0.f43442e--;
                c0379g0.m2873h();
                break;
            case 3:
                Q12.m6551e("no calls to next() since the last call to remove()", ((Collection) this.f45249c) != null);
                this.f45248b.remove();
                Serializable serializable = ((C7174y0) this.f45250d).f46002e;
                ((Collection) this.f45249c).size();
                ((Collection) this.f45249c).clear();
                this.f45249c = null;
                break;
            case 4:
                Q12.m6551e("no calls to next() since the last call to remove()", ((Map.Entry) this.f45249c) != null);
                Collection collection2 = (Collection) ((Map.Entry) this.f45249c).getValue();
                this.f45248b.remove();
                C10492oC1 c10492oC1 = ((C11640xB1) this.f45250d).f45437c;
                collection2.size();
                collection2.clear();
                this.f45249c = null;
                break;
            default:
                this.f45248b.remove();
                C0379G0 c0379g02 = (C0379G0) this.f45250d;
                ((C10492oC1) c0379g02.f3513f).getClass();
                c0379g02.m2875k();
                break;
        }
    }

    public /* synthetic */ C7111x0(AbstractSet abstractSet, Iterator it, int i) {
        this.f45247a = i;
        this.f45250d = abstractSet;
        this.f45248b = it;
    }

    public C7111x0(C7174y0 c7174y0, byte b) {
        this.f45247a = 3;
        this.f45250d = c7174y0;
        this.f45248b = ((C1752av) c7174y0.f46001d).entrySet().iterator();
    }

    public C7111x0(C0379G0 c0379g0, byte b) {
        Iterator it;
        this.f45247a = 5;
        this.f45250d = c0379g0;
        Collection collection = c0379g0.f3510c;
        this.f45249c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f45248b = it;
    }

    public C7111x0(C0379G0 c0379g0) {
        Iterator it;
        this.f45247a = 2;
        this.f45250d = c0379g0;
        Collection collection = c0379g0.f3510c;
        this.f45249c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f45248b = it;
    }

    public C7111x0(C0379G0 c0379g0, ListIterator listIterator) {
        this.f45247a = 2;
        this.f45250d = c0379g0;
        this.f45249c = c0379g0.f3510c;
        this.f45248b = listIterator;
    }

    public C7111x0(C7174y0 c7174y0) {
        this.f45247a = 0;
        this.f45250d = c7174y0;
        this.f45248b = c7174y0.f46001d.entrySet().iterator();
    }
}

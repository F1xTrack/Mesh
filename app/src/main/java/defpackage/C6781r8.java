package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: r8 */
/* loaded from: classes.dex */
public class C6781r8 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ C6781r8(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((C5809m21) this.b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((C6000n21) this.b).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((C6191o21) this.b).f((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    return false;
                }
                ((C5677lL1) this.b).put((Comparable) entry4.getKey(), entry4.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.a) {
            case 1:
                ((C5809m21) this.b).clear();
                break;
            case 2:
                ((C6000n21) this.b).clear();
                break;
            case 3:
                ((C6191o21) this.b).clear();
                break;
            case 4:
                ((C5677lL1) this.b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((C5809m21) this.b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((C6000n21) this.b).get(entry2.getKey());
                Object value2 = entry2.getValue();
                return obj3 == value2 || (obj3 != null && obj3.equals(value2));
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((C6191o21) this.b).get(entry3.getKey());
                Object value3 = entry3.getValue();
                return obj4 == value3 || (obj4 != null && obj4.equals(value3));
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj5 = ((C5677lL1) this.b).get(entry4.getKey());
                Object value4 = entry4.getValue();
                boolean z = true;
                if (obj5 != value4) {
                    if (obj5 == null) {
                        z = false;
                    } else if (!obj5.equals(value4)) {
                        return false;
                    }
                }
                return z;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.a) {
            case 0:
                return new C7354u8((C7925x8) this.b);
            case 1:
                return new C7145t21((C5809m21) this.b, 0);
            case 2:
                return new C7145t21((C6000n21) this.b, 1);
            case 3:
                return new C7145t21((C6191o21) this.b, 2);
            default:
                return new C7145t21((C5677lL1) this.b, 3);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((C5809m21) this.b).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((C6000n21) this.b).remove(entry2.getKey());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((C6191o21) this.b).remove(entry3.getKey());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    return false;
                }
                ((C5677lL1) this.b).remove(entry4.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
            case 0:
                return ((C7925x8) this.b).c;
            case 1:
                return ((C5809m21) this.b).size();
            case 2:
                return ((C6000n21) this.b).size();
            case 3:
                return ((C6191o21) this.b).size();
            default:
                return ((C5677lL1) this.b).size();
        }
    }
}

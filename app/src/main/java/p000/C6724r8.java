package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: r8 */
/* loaded from: classes.dex */
public class C6724r8 extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ int f41350a;

    /* renamed from: b */
    public final /* synthetic */ Map f41351b;

    public /* synthetic */ C6724r8(int i, Map map) {
        this.f41350a = i;
        this.f41351b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f41350a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((C10214m21) this.f41351b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((C10342n21) this.f41351b).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((C10470o21) this.f41351b).m23319f((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    return false;
                }
                ((C10126lL1) this.f41351b).put((Comparable) entry4.getKey(), entry4.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f41350a) {
            case 1:
                ((C10214m21) this.f41351b).clear();
                break;
            case 2:
                ((C10342n21) this.f41351b).clear();
                break;
            case 3:
                ((C10470o21) this.f41351b).clear();
                break;
            case 4:
                ((C10126lL1) this.f41351b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f41350a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((C10214m21) this.f41351b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((C10342n21) this.f41351b).get(entry2.getKey());
                Object value2 = entry2.getValue();
                return obj3 == value2 || (obj3 != null && obj3.equals(value2));
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((C10470o21) this.f41351b).get(entry3.getKey());
                Object value3 = entry3.getValue();
                return obj4 == value3 || (obj4 != null && obj4.equals(value3));
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj5 = ((C10126lL1) this.f41351b).get(entry4.getKey());
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
        switch (this.f41350a) {
            case 0:
                return new C6930u8((C7119x8) this.f41351b);
            case 1:
                return new C11110t21((C10214m21) this.f41351b, 0);
            case 2:
                return new C11110t21((C10342n21) this.f41351b, 1);
            case 3:
                return new C11110t21((C10470o21) this.f41351b, 2);
            default:
                return new C11110t21((C10126lL1) this.f41351b, 3);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f41350a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((C10214m21) this.f41351b).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((C10342n21) this.f41351b).remove(entry2.getKey());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((C10470o21) this.f41351b).remove(entry3.getKey());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    return false;
                }
                ((C10126lL1) this.f41351b).remove(entry4.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f41350a) {
            case 0:
                return ((C7119x8) this.f41351b).f6450c;
            case 1:
                return ((C10214m21) this.f41351b).size();
            case 2:
                return ((C10342n21) this.f41351b).size();
            case 3:
                return ((C10470o21) this.f41351b).size();
            default:
                return ((C10126lL1) this.f41351b).size();
        }
    }
}

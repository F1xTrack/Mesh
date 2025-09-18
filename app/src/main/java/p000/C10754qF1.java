package p000;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: qF1 */
/* loaded from: classes.dex */
public final class C10754qF1 implements Map, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f40705a;

    /* renamed from: b */
    public final transient Object[] f40706b;

    /* renamed from: c */
    public transient AbstractCollection f40707c;

    /* renamed from: d */
    public transient AbstractCollection f40708d;

    /* renamed from: e */
    public transient AbstractCollection f40709e;

    public /* synthetic */ C10754qF1(int i, Object[] objArr) {
        this.f40705a = i;
        this.f40706b = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.f40705a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f40705a) {
            case 0:
                if (get(obj) != null) {
                }
                break;
            default:
                if (get(obj) != null) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f40705a) {
            case 0:
                C10370nF1 c10370nF1 = (C10370nF1) this.f40709e;
                if (c10370nF1 == null) {
                    c10370nF1 = new C10370nF1(1, this.f40706b);
                    this.f40709e = c10370nF1;
                }
                return c10370nF1.contains(obj);
            default:
                H32 h32 = (H32) this.f40709e;
                if (h32 == null) {
                    h32 = new H32(1, this.f40706b);
                    this.f40709e = h32;
                }
                return h32.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f40705a) {
            case 0:
                C9346fF1 c9346fF1 = (C9346fF1) this.f40707c;
                if (c9346fF1 != null) {
                    return c9346fF1;
                }
                C9346fF1 c9346fF12 = new C9346fF1(this, this.f40706b);
                this.f40707c = c9346fF12;
                return c9346fF12;
            default:
                C9066d32 c9066d32 = (C9066d32) this.f40707c;
                if (c9066d32 != null) {
                    return c9066d32;
                }
                C9066d32 c9066d322 = new C9066d32(this, this.f40706b);
                this.f40707c = c9066d322;
                return c9066d322;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f40705a) {
            case 0:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                }
                break;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0008  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0026  */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f40705a
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            r0 = 0
            if (r4 != 0) goto La
        L8:
            r4 = r0
            goto L1e
        La:
            java.lang.Object[] r1 = r3.f40706b
            r2 = 0
            r2 = r1[r2]
            r2.getClass()
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L8
            r4 = 1
            r4 = r1[r4]
            r4.getClass()
        L1e:
            if (r4 != 0) goto L21
            goto L22
        L21:
            r0 = r4
        L22:
            return r0
        L23:
            r0 = 0
            if (r4 != 0) goto L28
        L26:
            r4 = r0
            goto L3c
        L28:
            r1 = 0
            java.lang.Object[] r2 = r3.f40706b
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L26
            r4 = 1
            r4 = r2[r4]
            java.util.Objects.requireNonNull(r4)
        L3c:
            if (r4 != 0) goto L3f
            goto L40
        L3f:
            r0 = r4
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10754qF1.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.f40705a) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            default:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.f40705a) {
            case 0:
                C9346fF1 c9346fF1 = (C9346fF1) this.f40707c;
                if (c9346fF1 == null) {
                    c9346fF1 = new C9346fF1(this, this.f40706b);
                    this.f40707c = c9346fF1;
                }
                return AbstractC9831j22.m21969d(c9346fF1);
            default:
                C9066d32 c9066d32 = (C9066d32) this.f40707c;
                if (c9066d32 == null) {
                    c9066d32 = new C9066d32(this, this.f40706b);
                    this.f40707c = c9066d32;
                }
                Iterator it = c9066d32.iterator();
                int iHashCode = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    iHashCode += next != null ? next.hashCode() : 0;
                }
                return iHashCode;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f40705a) {
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f40705a) {
            case 0:
                C9858jF1 c9858jF1 = (C9858jF1) this.f40708d;
                if (c9858jF1 != null) {
                    return c9858jF1;
                }
                C9858jF1 c9858jF12 = new C9858jF1(this, new C10370nF1(0, this.f40706b));
                this.f40708d = c9858jF12;
                return c9858jF12;
            default:
                C10730q32 c10730q32 = (C10730q32) this.f40708d;
                if (c10730q32 != null) {
                    return c10730q32;
                }
                C10730q32 c10730q322 = new C10730q32(this, new H32(0, this.f40706b));
                this.f40708d = c10730q322;
                return c10730q322;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f40705a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.f40705a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.f40705a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.f40705a) {
        }
        return 1;
    }

    public final String toString() {
        switch (this.f40705a) {
            case 0:
                boolean z = true;
                StringBuilder sb = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb.append('{');
                Iterator it = ((C9346fF1) entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z = false;
                }
                sb.append('}');
                return sb.toString();
            default:
                boolean z2 = true;
                StringBuilder sb2 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb2.append('{');
                Iterator it2 = ((C9066d32) entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z2) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z2 = false;
                }
                sb2.append('}');
                return sb2.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.f40705a) {
            case 0:
                C10370nF1 c10370nF1 = (C10370nF1) this.f40709e;
                if (c10370nF1 != null) {
                    return c10370nF1;
                }
                C10370nF1 c10370nF12 = new C10370nF1(1, this.f40706b);
                this.f40709e = c10370nF12;
                return c10370nF12;
            default:
                H32 h32 = (H32) this.f40709e;
                if (h32 != null) {
                    return h32;
                }
                H32 h322 = new H32(1, this.f40706b);
                this.f40709e = h322;
                return h322;
        }
    }
}

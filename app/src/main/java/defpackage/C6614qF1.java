package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: qF1 */
/* loaded from: classes.dex */
public final class C6614qF1 implements Map, Serializable {
    public final /* synthetic */ int a;
    public final transient Object[] b;
    public transient AbstractCollection c;
    public transient AbstractCollection d;
    public transient AbstractCollection e;

    public /* synthetic */ C6614qF1(int i, Object[] objArr) {
        this.a = i;
        this.b = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
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
        switch (this.a) {
            case 0:
                C6041nF1 c6041nF1 = (C6041nF1) this.e;
                if (c6041nF1 == null) {
                    c6041nF1 = new C6041nF1(1, this.b);
                    this.e = c6041nF1;
                }
                return c6041nF1.contains(obj);
            default:
                H32 h32 = (H32) this.e;
                if (h32 == null) {
                    h32 = new H32(1, this.b);
                    this.e = h32;
                }
                return h32.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                C3737fF1 c3737fF1 = (C3737fF1) this.c;
                if (c3737fF1 != null) {
                    return c3737fF1;
                }
                C3737fF1 c3737fF12 = new C3737fF1(this, this.b);
                this.c = c3737fF12;
                return c3737fF12;
            default:
                C3320d32 c3320d32 = (C3320d32) this.c;
                if (c3320d32 != null) {
                    return c3320d32;
                }
                C3320d32 c3320d322 = new C3320d32(this, this.b);
                this.c = c3320d322;
                return c3320d322;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.a) {
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
            int r0 = r3.a
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
            java.lang.Object[] r1 = r3.b
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
            java.lang.Object[] r2 = r3.b
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6614qF1.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.a) {
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
        switch (this.a) {
            case 0:
                C3737fF1 c3737fF1 = (C3737fF1) this.c;
                if (c3737fF1 == null) {
                    c3737fF1 = new C3737fF1(this, this.b);
                    this.c = c3737fF1;
                }
                return AbstractC5237j22.d(c3737fF1);
            default:
                C3320d32 c3320d32 = (C3320d32) this.c;
                if (c3320d32 == null) {
                    c3320d32 = new C3320d32(this, this.b);
                    this.c = c3320d32;
                }
                Iterator it = c3320d32.iterator();
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
        switch (this.a) {
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case 0:
                C5277jF1 c5277jF1 = (C5277jF1) this.d;
                if (c5277jF1 != null) {
                    return c5277jF1;
                }
                C5277jF1 c5277jF12 = new C5277jF1(this, new C6041nF1(0, this.b));
                this.d = c5277jF12;
                return c5277jF12;
            default:
                C6578q32 c6578q32 = (C6578q32) this.d;
                if (c6578q32 != null) {
                    return c6578q32;
                }
                C6578q32 c6578q322 = new C6578q32(this, new H32(0, this.b));
                this.d = c6578q322;
                return c6578q322;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.a) {
        }
        return 1;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                boolean z = true;
                StringBuilder sb = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb.append('{');
                Iterator it = ((C3737fF1) entrySet()).iterator();
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
                Iterator it2 = ((C3320d32) entrySet()).iterator();
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
        switch (this.a) {
            case 0:
                C6041nF1 c6041nF1 = (C6041nF1) this.e;
                if (c6041nF1 != null) {
                    return c6041nF1;
                }
                C6041nF1 c6041nF12 = new C6041nF1(1, this.b);
                this.e = c6041nF12;
                return c6041nF12;
            default:
                H32 h32 = (H32) this.e;
                if (h32 != null) {
                    return h32;
                }
                H32 h322 = new H32(1, this.b);
                this.e = h322;
                return h322;
        }
    }
}

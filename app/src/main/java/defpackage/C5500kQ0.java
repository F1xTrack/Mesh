package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: kQ0 */
/* loaded from: classes.dex */
public final class C5500kQ0 implements Map, Serializable {
    public static final C5500kQ0 g = new C5500kQ0(null, new Object[0], 0);
    public transient C4151hQ0 a;
    public transient C4342iQ0 b;
    public transient C5309jQ0 c;
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public C5500kQ0(Object obj, Object[] objArr, int i) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }

    public static VY a() {
        return new VY(4);
    }

    public static C5500kQ0 b(Map map) {
        if ((map instanceof C5500kQ0) && !(map instanceof SortedMap)) {
            C5500kQ0 c5500kQ0 = (C5500kQ0) map;
            c5500kQ0.getClass();
            return c5500kQ0;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z = setEntrySet instanceof Collection;
        VY vy = new VY(z ? setEntrySet.size() : 4);
        if (z) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) vy.c;
            if (size > objArr.length) {
                vy.c = Arrays.copyOf(objArr, I70.f(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            vy.Y(entry.getKey(), entry.getValue());
        }
        return vy.p();
    }

    @Override // java.util.Map
    /* renamed from: c */
    public final V70 entrySet() {
        C4151hQ0 c4151hQ0 = this.a;
        if (c4151hQ0 != null) {
            return c4151hQ0;
        }
        C4151hQ0 c4151hQ02 = new C4151hQ0(this, this.e, this.f);
        this.a = c4151hQ02;
        return c4151hQ02;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d */
    public final V70 keySet() {
        C4342iQ0 c4342iQ0 = this.b;
        if (c4342iQ0 != null) {
            return c4342iQ0;
        }
        C4342iQ0 c4342iQ02 = new C4342iQ0(this, new C5309jQ0(this.e, 0, this.f));
        this.b = c4342iQ02;
        return c4342iQ02;
    }

    @Override // java.util.Map
    /* renamed from: e */
    public final J70 values() {
        C5309jQ0 c5309jQ0 = this.c;
        if (c5309jQ0 != null) {
            return c5309jQ0;
        }
        C5309jQ0 c5309jQ02 = new C5309jQ0(this.e, 1, this.f);
        this.c = c5309jQ02;
        return c5309jQ02;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return EU0.b(this, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0003 A[EDGE_INSN: B:94:0x0003->B:54:0x0003 BREAK  A[LOOP:0: B:66:0x0037->B:72:0x004d], EDGE_INSN: B:97:0x0003->B:54:0x0003 BREAK  A[LOOP:1: B:76:0x0062->B:82:0x0079], EDGE_INSN: B:98:0x0003->B:54:0x0003 BREAK  A[LOOP:2: B:84:0x0088->B:93:0x00a0]] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r9 = r0
            goto L9c
        L6:
            r1 = 1
            java.lang.Object[] r2 = r8.e
            int r3 = r8.f
            if (r3 != r1) goto L20
            r3 = 0
            r3 = r2[r3]
            java.util.Objects.requireNonNull(r3)
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L3
            r9 = r2[r1]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L20:
            java.lang.Object r3 = r8.d
            if (r3 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L50
            r4 = r3
            byte[] r4 = (byte[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = defpackage.J12.a(r3)
        L37:
            r3 = r3 & r5
            r6 = r4[r3]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L3
        L40:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L4d:
            int r3 = r3 + 1
            goto L37
        L50:
            boolean r4 = r3 instanceof short[]
            if (r4 == 0) goto L7c
            r4 = r3
            short[] r4 = (short[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = defpackage.J12.a(r3)
        L62:
            r3 = r3 & r5
            short r6 = r4[r3]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L3
        L6c:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L79:
            int r3 = r3 + 1
            goto L62
        L7c:
            int[] r3 = (int[]) r3
            int r4 = r3.length
            int r4 = r4 - r1
            int r5 = r9.hashCode()
            int r5 = defpackage.J12.a(r5)
        L88:
            r5 = r5 & r4
            r6 = r3[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L3
        L90:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r2[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r0
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5500kQ0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return QR1.d(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }

    public final String toString() {
        int i = this.f;
        AbstractC3588eT1.b(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        AbstractC5740lg1 it = ((C4151hQ0) entrySet()).iterator();
        boolean z = true;
        while (true) {
            N70 n70 = (N70) it;
            if (!n70.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) n70.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }
}

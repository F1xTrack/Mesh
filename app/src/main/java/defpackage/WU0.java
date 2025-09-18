package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class WU0 implements Iterable {
    public TU0 a;
    public TU0 b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public TU0 b(Object obj) {
        TU0 tu0 = this.a;
        while (tu0 != null && !tu0.a.equals(obj)) {
            tu0 = tu0.c;
        }
        return tu0;
    }

    public Object d(Object obj, Object obj2) {
        TU0 tu0B = b(obj);
        if (tu0B != null) {
            return tu0B.b;
        }
        TU0 tu0 = new TU0(obj, obj2);
        this.d++;
        TU0 tu02 = this.b;
        if (tu02 == null) {
            this.a = tu0;
            this.b = tu0;
            return null;
        }
        tu02.c = tu0;
        tu0.d = tu02;
        this.b = tu0;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((defpackage.SU0) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof defpackage.WU0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            WU0 r7 = (defpackage.WU0) r7
            int r1 = r6.d
            int r3 = r7.d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            SU0 r3 = (defpackage.SU0) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            SU0 r4 = (defpackage.SU0) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            SU0 r7 = (defpackage.SU0) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WU0.equals(java.lang.Object):boolean");
    }

    public Object h(Object obj) {
        TU0 tu0B = b(obj);
        if (tu0B == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((VU0) it.next()).a(tu0B);
            }
        }
        TU0 tu0 = tu0B.d;
        if (tu0 != null) {
            tu0.c = tu0B.c;
        } else {
            this.a = tu0B.c;
        }
        TU0 tu02 = tu0B.c;
        if (tu02 != null) {
            tu02.d = tu0;
        } else {
            this.b = tu0;
        }
        tu0B.c = null;
        tu0B.d = null;
        return tu0B.b;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            SU0 su0 = (SU0) it;
            if (!su0.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) su0.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        SU0 su0 = new SU0(this.a, this.b, 0);
        this.c.put(su0, Boolean.FALSE);
        return su0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            SU0 su0 = (SU0) it;
            if (!su0.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) su0.next()).toString());
            if (su0.hasNext()) {
                sb.append(", ");
            }
        }
    }
}

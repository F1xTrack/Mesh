package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class S32 {
    public final String a;
    public final boolean b;
    public final VK1 c;
    public final BitSet d;
    public final BitSet e;
    public final C7925x8 f;
    public final C7925x8 g;
    public final /* synthetic */ C6959s32 h;

    public S32(C6959s32 c6959s32, String str) {
        this.h = c6959s32;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new C7925x8();
        this.g = new C7925x8();
    }

    public final void a(C3300cy1 c3300cy1) {
        int iQ;
        boolean z;
        boolean zY;
        switch (c3300cy1.g) {
            case 0:
                iQ = ((C6816rJ1) c3300cy1.i).q();
                break;
            default:
                iQ = ((C7960xJ1) c3300cy1.i).m();
                break;
        }
        Boolean bool = c3300cy1.c;
        if (bool != null) {
            this.e.set(iQ, bool.booleanValue());
        }
        Boolean bool2 = c3300cy1.d;
        if (bool2 != null) {
            this.d.set(iQ, bool2.booleanValue());
        }
        if (c3300cy1.e != null) {
            Integer numValueOf = Integer.valueOf(iQ);
            C7925x8 c7925x8 = this.f;
            Long l = (Long) c7925x8.getOrDefault(numValueOf, null);
            long jLongValue = c3300cy1.e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                c7925x8.put(Integer.valueOf(iQ), Long.valueOf(jLongValue));
            }
        }
        if (c3300cy1.f != null) {
            C7925x8 c7925x82 = this.g;
            List arrayList = (List) c7925x82.getOrDefault(Integer.valueOf(iQ), null);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c7925x82.put(Integer.valueOf(iQ), arrayList);
            }
            switch (c3300cy1.g) {
                case 0:
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                arrayList.clear();
            }
            CX1.a();
            C6959s32 c6959s32 = this.h;
            C1263Py1 c1263Py1 = ((C3386dP1) c6959s32.b).g;
            GJ1 gj1 = IB1.A0;
            String str = this.a;
            if (c1263Py1.E1(str, gj1)) {
                switch (c3300cy1.g) {
                    case 0:
                        zY = ((C6816rJ1) c3300cy1.i).y();
                        break;
                    default:
                        zY = false;
                        break;
                }
                if (zY) {
                    arrayList.clear();
                }
            }
            CX1.a();
            if (!((C3386dP1) c6959s32.b).g.E1(str, gj1)) {
                arrayList.add(Long.valueOf(c3300cy1.f.longValue() / 1000));
                return;
            }
            long jLongValue2 = c3300cy1.f.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    public S32(C6959s32 c6959s32, String str, VK1 vk1, BitSet bitSet, BitSet bitSet2, C7925x8 c7925x8, C7925x8 c7925x82) {
        this.h = c6959s32;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = c7925x8;
        this.g = new C7925x8();
        Iterator it = ((C7163t8) c7925x82.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c7925x82.getOrDefault(num, null));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = vk1;
    }
}

package p000;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class S32 {

    /* renamed from: a */
    public final String f10566a;

    /* renamed from: b */
    public final boolean f10567b;

    /* renamed from: c */
    public final VK1 f10568c;

    /* renamed from: d */
    public final BitSet f10569d;

    /* renamed from: e */
    public final BitSet f10570e;

    /* renamed from: f */
    public final C7119x8 f10571f;

    /* renamed from: g */
    public final C7119x8 f10572g;

    /* renamed from: h */
    public final /* synthetic */ C10986s32 f10573h;

    public S32(C10986s32 c10986s32, String str) {
        this.f10573h = c10986s32;
        this.f10566a = str;
        this.f10567b = true;
        this.f10569d = new BitSet();
        this.f10570e = new BitSet();
        this.f10571f = new C7119x8();
        this.f10572g = new C7119x8();
    }

    /* renamed from: a */
    public final void m7174a(C9052cy1 c9052cy1) {
        int iM24265q;
        boolean z;
        boolean zM24272y;
        switch (c9052cy1.f25737g) {
            case 0:
                iM24265q = ((C10890rJ1) c9052cy1.f25739i).m24265q();
                break;
            default:
                iM24265q = ((C11656xJ1) c9052cy1.f25739i).m25829m();
                break;
        }
        Boolean bool = c9052cy1.f25733c;
        if (bool != null) {
            this.f10570e.set(iM24265q, bool.booleanValue());
        }
        Boolean bool2 = c9052cy1.f25734d;
        if (bool2 != null) {
            this.f10569d.set(iM24265q, bool2.booleanValue());
        }
        if (c9052cy1.f25735e != null) {
            Integer numValueOf = Integer.valueOf(iM24265q);
            C7119x8 c7119x8 = this.f10571f;
            Long l = (Long) c7119x8.getOrDefault(numValueOf, null);
            long jLongValue = c9052cy1.f25735e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                c7119x8.put(Integer.valueOf(iM24265q), Long.valueOf(jLongValue));
            }
        }
        if (c9052cy1.f25736f != null) {
            C7119x8 c7119x82 = this.f10572g;
            List arrayList = (List) c7119x82.getOrDefault(Integer.valueOf(iM24265q), null);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c7119x82.put(Integer.valueOf(iM24265q), arrayList);
            }
            switch (c9052cy1.f25737g) {
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
            CX1.m1205a();
            C10986s32 c10986s32 = this.f10573h;
            C8143Py1 c8143Py1 = ((C9110dP1) c10986s32.f11615b).f26037g;
            GJ1 gj1 = IB1.f4729A0;
            String str = this.f10566a;
            if (c8143Py1.m6511E1(str, gj1)) {
                switch (c9052cy1.f25737g) {
                    case 0:
                        zM24272y = ((C10890rJ1) c9052cy1.f25739i).m24272y();
                        break;
                    default:
                        zM24272y = false;
                        break;
                }
                if (zM24272y) {
                    arrayList.clear();
                }
            }
            CX1.m1205a();
            if (!((C9110dP1) c10986s32.f11615b).f26037g.m6511E1(str, gj1)) {
                arrayList.add(Long.valueOf(c9052cy1.f25736f.longValue() / 1000));
                return;
            }
            long jLongValue2 = c9052cy1.f25736f.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    public S32(C10986s32 c10986s32, String str, VK1 vk1, BitSet bitSet, BitSet bitSet2, C7119x8 c7119x8, C7119x8 c7119x82) {
        this.f10573h = c10986s32;
        this.f10566a = str;
        this.f10569d = bitSet;
        this.f10570e = bitSet2;
        this.f10571f = c7119x8;
        this.f10572g = new C7119x8();
        Iterator it = ((C6867t8) c7119x82.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c7119x82.getOrDefault(num, null));
            this.f10572g.put(num, arrayList);
        }
        this.f10567b = false;
        this.f10568c = vk1;
    }
}

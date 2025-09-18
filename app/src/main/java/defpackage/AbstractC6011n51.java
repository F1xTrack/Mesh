package defpackage;

import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: n51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6011n51 {
    public static final C0572Hc a = new C0572Hc("camera2.streamSpec.streamUseCase", Long.TYPE, null);
    public static final HashMap b;
    public static final HashMap c;

    static {
        HashMap map = new HashMap();
        b = map;
        HashMap map2 = new HashMap();
        c = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            EnumC5743lh1 enumC5743lh1 = EnumC5743lh1.b;
            hashSet.add(enumC5743lh1);
            EnumC5743lh1 enumC5743lh12 = EnumC5743lh1.f;
            hashSet.add(enumC5743lh12);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(enumC5743lh1);
            hashSet2.add(enumC5743lh12);
            hashSet2.add(EnumC5743lh1.c);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            EnumC5743lh1 enumC5743lh13 = EnumC5743lh1.a;
            hashSet3.add(enumC5743lh13);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            EnumC5743lh1 enumC5743lh14 = EnumC5743lh1.d;
            hashSet4.add(enumC5743lh14);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(enumC5743lh1);
            hashSet5.add(enumC5743lh13);
            hashSet5.add(enumC5743lh14);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(enumC5743lh1);
            hashSet6.add(enumC5743lh14);
            map2.put(3L, hashSet6);
        }
    }

    public static C3456dn a(C3456dn c3456dn, long j) {
        c3456dn.getClass();
        C0572Hc c0572Hc = a;
        if (AbstractC7209tN0.a(c3456dn, c0572Hc) && ((Long) AbstractC7209tN0.i(c3456dn, c0572Hc)).longValue() == j) {
            return null;
        }
        C0468Ft0 c0468Ft0C = C0468Ft0.c(c3456dn);
        c0468Ft0C.e(c0572Hc, Long.valueOf(j));
        return new C3456dn(6, c0468Ft0C);
    }

    public static boolean b(EnumC5743lh1 enumC5743lh1, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (enumC5743lh1 != EnumC5743lh1.e) {
            HashMap map = b;
            return map.containsKey(Long.valueOf(j)) && ((Set) map.get(Long.valueOf(j))).contains(enumC5743lh1);
        }
        HashMap map2 = c;
        if (!map2.containsKey(Long.valueOf(j))) {
            return false;
        }
        Set set = (Set) map2.get(Long.valueOf(j));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((EnumC5743lh1) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(InterfaceC7400uN0 interfaceC7400uN0, EnumC5743lh1 enumC5743lh1) {
        if (((Boolean) interfaceC7400uN0.q(InterfaceC5361jh1.a1, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        C0572Hc c0572Hc = C7540v60.b;
        if (!interfaceC7400uN0.Q(c0572Hc)) {
            return false;
        }
        int iIntValue = ((Integer) interfaceC7400uN0.w(c0572Hc)).intValue();
        int iOrdinal = enumC5743lh1.ordinal();
        if (iOrdinal == 0) {
            return iIntValue == 2;
        }
        if (iOrdinal != 3) {
            return false;
        }
        AbstractC7768wJ.a.z0(PreviewUnderExposureQuirk.class);
        return false;
    }
}

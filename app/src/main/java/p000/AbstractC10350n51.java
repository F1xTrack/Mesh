package p000;

import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: n51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10350n51 {

    /* renamed from: a */
    public static final C0480Hc f38097a = new C0480Hc("camera2.streamSpec.streamUseCase", Long.TYPE, null);

    /* renamed from: b */
    public static final HashMap f38098b;

    /* renamed from: c */
    public static final HashMap f38099c;

    static {
        HashMap map = new HashMap();
        f38098b = map;
        HashMap map2 = new HashMap();
        f38099c = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            EnumC10170lh1 enumC10170lh1 = EnumC10170lh1.f37252b;
            hashSet.add(enumC10170lh1);
            EnumC10170lh1 enumC10170lh12 = EnumC10170lh1.f37256f;
            hashSet.add(enumC10170lh12);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(enumC10170lh1);
            hashSet2.add(enumC10170lh12);
            hashSet2.add(EnumC10170lh1.f37253c);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            EnumC10170lh1 enumC10170lh13 = EnumC10170lh1.f37251a;
            hashSet3.add(enumC10170lh13);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            EnumC10170lh1 enumC10170lh14 = EnumC10170lh1.f37254d;
            hashSet4.add(enumC10170lh14);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(enumC10170lh1);
            hashSet5.add(enumC10170lh13);
            hashSet5.add(enumC10170lh14);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(enumC10170lh1);
            hashSet6.add(enumC10170lh14);
            map2.put(3L, hashSet6);
        }
    }

    /* renamed from: a */
    public static C3950dn m23076a(C3950dn c3950dn, long j) {
        c3950dn.getClass();
        C0480Hc c0480Hc = f38097a;
        if (AbstractC11153tN0.m24889a(c3950dn, c0480Hc) && ((Long) AbstractC11153tN0.m24897i(c3950dn, c0480Hc)).longValue() == j) {
            return null;
        }
        C7612Ft0 c7612Ft0M2813c = C7612Ft0.m2813c(c3950dn);
        c7612Ft0M2813c.m2815e(c0480Hc, Long.valueOf(j));
        return new C3950dn(6, c7612Ft0M2813c);
    }

    /* renamed from: b */
    public static boolean m23077b(EnumC10170lh1 enumC10170lh1, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (enumC10170lh1 != EnumC10170lh1.f37255e) {
            HashMap map = f38098b;
            return map.containsKey(Long.valueOf(j)) && ((Set) map.get(Long.valueOf(j))).contains(enumC10170lh1);
        }
        HashMap map2 = f38099c;
        if (!map2.containsKey(Long.valueOf(j))) {
            return false;
        }
        Set set = (Set) map2.get(Long.valueOf(j));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((EnumC10170lh1) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m23078c(InterfaceC11281uN0 interfaceC11281uN0, EnumC10170lh1 enumC10170lh1) {
        if (((Boolean) interfaceC11281uN0.mo4792q(InterfaceC9914jh1.f35330a1, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        C0480Hc c0480Hc = C11375v60.f44147b;
        if (!interfaceC11281uN0.mo4790Q(c0480Hc)) {
            return false;
        }
        int iIntValue = ((Integer) interfaceC11281uN0.mo4794w(c0480Hc)).intValue();
        int iOrdinal = enumC10170lh1.ordinal();
        if (iOrdinal == 0) {
            return iIntValue == 2;
        }
        if (iOrdinal != 3) {
            return false;
        }
        AbstractC7067wJ.f44776a.m17864z0(PreviewUnderExposureQuirk.class);
        return false;
    }
}

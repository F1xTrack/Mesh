package p000;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: HM */
/* loaded from: classes.dex */
public final class C0464HM implements InterfaceC0401GM {

    /* renamed from: a */
    public final DynamicRangeProfiles f4240a;

    public C0464HM(Object obj) {
        this.f4240a = (DynamicRangeProfiles) obj;
    }

    /* renamed from: d */
    public static Set m3359d(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long jLongValue = l.longValue();
            C0149CM c0149cm = (C0149CM) AbstractC0212DM.f1977a.get(l);
            AbstractC9104dM1.m17549h(c0149cm, "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            hashSet.add(c0149cm);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // p000.InterfaceC0401GM
    /* renamed from: a */
    public final DynamicRangeProfiles mo3041a() {
        return this.f4240a;
    }

    @Override // p000.InterfaceC0401GM
    /* renamed from: b */
    public final Set mo3042b() {
        return m3359d(this.f4240a.getSupportedProfiles());
    }

    @Override // p000.InterfaceC0401GM
    /* renamed from: c */
    public final Set mo3043c(C0149CM c0149cm) {
        Long lM1650a = AbstractC0212DM.m1650a(c0149cm, this.f4240a);
        AbstractC9104dM1.m17545d("DynamicRange is not supported: " + c0149cm, lM1650a != null);
        return m3359d(this.f4240a.getProfileCaptureRequestConstraints(lM1650a.longValue()));
    }
}

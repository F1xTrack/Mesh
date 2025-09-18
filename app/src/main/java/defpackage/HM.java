package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class HM implements GM {
    public final DynamicRangeProfiles a;

    public HM(Object obj) {
        this.a = (DynamicRangeProfiles) obj;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long jLongValue = l.longValue();
            CM cm = (CM) DM.a.get(l);
            AbstractC3377dM1.h(cm, "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            hashSet.add(cm);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // defpackage.GM
    public final DynamicRangeProfiles a() {
        return this.a;
    }

    @Override // defpackage.GM
    public final Set b() {
        return d(this.a.getSupportedProfiles());
    }

    @Override // defpackage.GM
    public final Set c(CM cm) {
        Long lA = DM.a(cm, this.a);
        AbstractC3377dM1.d("DynamicRange is not supported: " + cm, lA != null);
        return d(this.a.getProfileCaptureRequestConstraints(lA.longValue()));
    }
}

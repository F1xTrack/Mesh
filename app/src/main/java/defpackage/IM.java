package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class IM implements GM {
    public static final C1562Tu0 a = new C1562Tu0(12, new IM());
    public static final Set b = Collections.singleton(CM.d);

    @Override // defpackage.GM
    public final DynamicRangeProfiles a() {
        return null;
    }

    @Override // defpackage.GM
    public final Set b() {
        return b;
    }

    @Override // defpackage.GM
    public final Set c(CM cm) {
        AbstractC3377dM1.d("DynamicRange is not supported: " + cm, CM.d.equals(cm));
        return b;
    }
}

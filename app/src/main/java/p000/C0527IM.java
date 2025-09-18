package p000;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* renamed from: IM */
/* loaded from: classes.dex */
public final class C0527IM implements InterfaceC0401GM {

    /* renamed from: a */
    public static final C8342Tu0 f4905a = new C8342Tu0(12, new C0527IM());

    /* renamed from: b */
    public static final Set f4906b = Collections.singleton(C0149CM.f1329d);

    @Override // p000.InterfaceC0401GM
    /* renamed from: a */
    public final DynamicRangeProfiles mo3041a() {
        return null;
    }

    @Override // p000.InterfaceC0401GM
    /* renamed from: b */
    public final Set mo3042b() {
        return f4906b;
    }

    @Override // p000.InterfaceC0401GM
    /* renamed from: c */
    public final Set mo3043c(C0149CM c0149cm) {
        AbstractC9104dM1.m17545d("DynamicRange is not supported: " + c0149cm, C0149CM.f1329d.equals(c0149cm));
        return f4906b;
    }
}

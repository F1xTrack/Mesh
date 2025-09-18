package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC9402fh1;
import p000.C11247u60;
import p000.C9085dD0;
import p000.CG0;
import p000.EnumC10170lh1;
import p000.InterfaceC9914jh1;

/* loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements CG0 {

    /* renamed from: a */
    public static final HashSet f15957a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    /* renamed from: d */
    public static boolean m9896d() {
        return "google".equalsIgnoreCase(Build.BRAND) && f15957a.contains(Build.MODEL.toLowerCase());
    }

    /* renamed from: e */
    public static boolean m9897e(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() != 3) {
            return false;
        }
        Iterator it = linkedHashSet.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
            if (abstractC9402fh1 instanceof C9085dD0) {
                z = true;
            } else if (abstractC9402fh1 instanceof C11247u60) {
                z3 = true;
            } else if (abstractC9402fh1.f27337f.mo4790Q(InterfaceC9914jh1.f35332c1)) {
                z2 = abstractC9402fh1.f27337f.mo6166T() == EnumC10170lh1.f37254d;
            }
        }
        return z && z2 && z3;
    }
}

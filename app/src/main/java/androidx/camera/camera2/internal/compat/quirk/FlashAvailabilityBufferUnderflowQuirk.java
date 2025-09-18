package androidx.camera.camera2.internal.compat.quirk;

import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;
import p000.CG0;

/* loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements CG0 {

    /* renamed from: a */
    public static final HashSet f15931a;

    static {
        HashSet hashSet = new HashSet();
        f15931a = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}

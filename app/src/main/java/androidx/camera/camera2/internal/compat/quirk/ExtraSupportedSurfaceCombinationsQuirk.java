package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import p000.AbstractC11153tN0;
import p000.C0545Ie;
import p000.CG0;
import p000.I61;
import p000.J61;

/* loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements CG0 {

    /* renamed from: a */
    public static final I61 f15927a;

    /* renamed from: b */
    public static final I61 f15928b;

    /* renamed from: c */
    public static final HashSet f15929c;

    /* renamed from: d */
    public static final HashSet f15930d;

    static {
        I61 i61 = new I61();
        J61 j61 = J61.VGA;
        AbstractC11153tN0.m24884B(2, j61, 0L, i61);
        J61 j612 = J61.PREVIEW;
        AbstractC11153tN0.m24884B(1, j612, 0L, i61);
        J61 j613 = J61.MAXIMUM;
        AbstractC11153tN0.m24884B(2, j613, 0L, i61);
        f15927a = i61;
        I61 i612 = new I61();
        i612.m3751a(new C0545Ie(1, j612, 0L));
        i612.m3751a(new C0545Ie(1, j61, 0L));
        AbstractC11153tN0.m24884B(2, j613, 0L, i612);
        f15928b = i612;
        f15929c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
        f15930d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    }

    /* renamed from: d */
    public static boolean m9879d() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f15930d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}

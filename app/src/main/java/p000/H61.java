package p000;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class H61 {

    /* renamed from: i */
    public final String f4117i;

    /* renamed from: j */
    public final InterfaceC1868cm f4118j;

    /* renamed from: k */
    public final C0428Gn f4119k;

    /* renamed from: l */
    public final C8170Qm0 f4120l;

    /* renamed from: m */
    public final int f4121m;

    /* renamed from: n */
    public final boolean f4122n;

    /* renamed from: o */
    public final boolean f4123o;

    /* renamed from: p */
    public final boolean f4124p;

    /* renamed from: q */
    public final boolean f4125q;

    /* renamed from: r */
    public final boolean f4126r;

    /* renamed from: s */
    public C0985Pe f4127s;

    /* renamed from: u */
    public final C0588JK f4129u;

    /* renamed from: x */
    public final X11 f4132x;

    /* renamed from: a */
    public final ArrayList f4109a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f4110b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f4111c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f4112d = new ArrayList();

    /* renamed from: e */
    public final HashMap f4113e = new HashMap();

    /* renamed from: f */
    public final ArrayList f4114f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f4115g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f4116h = new ArrayList();

    /* renamed from: t */
    public final ArrayList f4128t = new ArrayList();

    /* renamed from: v */
    public final C11370v32 f4130v = new C11370v32(21);

    /* renamed from: w */
    public final C11287uQ0 f4131w = new C11287uQ0(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    public H61(Context context, String str, C7161xo c7161xo, InterfaceC1868cm interfaceC1868cm) throws NumberFormatException, C1309Uo {
        ArrayList arrayListSingletonList;
        int[] outputFormats;
        long[] jArr;
        int[] iArr;
        boolean z;
        this.f4122n = false;
        this.f4123o = false;
        this.f4124p = false;
        this.f4125q = false;
        this.f4126r = false;
        str.getClass();
        this.f4117i = str;
        interfaceC1868cm.getClass();
        this.f4118j = interfaceC1868cm;
        this.f4120l = new C8170Qm0(17);
        this.f4129u = C0588JK.m4281b(context);
        try {
            C0428Gn c0428GnM25939b = c7161xo.m25939b(str);
            this.f4119k = c0428GnM25939b;
            Integer num = (Integer) c0428GnM25939b.m3155a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f4121m = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) c0428GnM25939b.m3155a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i : iArr2) {
                    if (i == 3) {
                        this.f4122n = true;
                    } else if (i == 6) {
                        this.f4123o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i == 16) {
                        this.f4126r = true;
                    }
                }
            }
            this.f4132x = new X11(this.f4119k);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            I61 i61 = new I61();
            J61 j61 = J61.MAXIMUM;
            AbstractC11153tN0.m24884B(1, j61, 0L, i61);
            I61 i61M24908t = AbstractC11153tN0.m24908t(arrayList2, i61);
            AbstractC11153tN0.m24884B(3, j61, 0L, i61M24908t);
            I61 i61M24908t2 = AbstractC11153tN0.m24908t(arrayList2, i61M24908t);
            AbstractC11153tN0.m24884B(2, j61, 0L, i61M24908t2);
            I61 i61M24908t3 = AbstractC11153tN0.m24908t(arrayList2, i61M24908t2);
            J61 j612 = J61.PREVIEW;
            i61M24908t3.m3751a(new C0545Ie(1, j612, 0L));
            AbstractC11153tN0.m24884B(3, j61, 0L, i61M24908t3);
            I61 i61M24908t4 = AbstractC11153tN0.m24908t(arrayList2, i61M24908t3);
            i61M24908t4.m3751a(new C0545Ie(2, j612, 0L));
            AbstractC11153tN0.m24884B(3, j61, 0L, i61M24908t4);
            I61 i61M24908t5 = AbstractC11153tN0.m24908t(arrayList2, i61M24908t4);
            i61M24908t5.m3751a(new C0545Ie(1, j612, 0L));
            AbstractC11153tN0.m24884B(1, j612, 0L, i61M24908t5);
            I61 i61M24908t6 = AbstractC11153tN0.m24908t(arrayList2, i61M24908t5);
            i61M24908t6.m3751a(new C0545Ie(1, j612, 0L));
            AbstractC11153tN0.m24884B(2, j612, 0L, i61M24908t6);
            I61 i61M24908t7 = AbstractC11153tN0.m24908t(arrayList2, i61M24908t6);
            i61M24908t7.m3751a(new C0545Ie(1, j612, 0L));
            i61M24908t7.m3751a(new C0545Ie(2, j612, 0L));
            AbstractC11153tN0.m24884B(3, j61, 0L, i61M24908t7);
            arrayList2.add(i61M24908t7);
            arrayList.addAll(arrayList2);
            int i2 = this.f4121m;
            J61 j613 = J61.RECORD;
            if (i2 == 0 || i2 == 1 || i2 == 3) {
                ArrayList arrayList3 = new ArrayList();
                I61 i612 = new I61();
                i612.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(1, j613, 0L, i612);
                I61 i61M24908t8 = AbstractC11153tN0.m24908t(arrayList3, i612);
                i61M24908t8.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(2, j613, 0L, i61M24908t8);
                I61 i61M24908t9 = AbstractC11153tN0.m24908t(arrayList3, i61M24908t8);
                i61M24908t9.m3751a(new C0545Ie(2, j612, 0L));
                AbstractC11153tN0.m24884B(2, j613, 0L, i61M24908t9);
                I61 i61M24908t10 = AbstractC11153tN0.m24908t(arrayList3, i61M24908t9);
                i61M24908t10.m3751a(new C0545Ie(1, j612, 0L));
                i61M24908t10.m3751a(new C0545Ie(1, j613, 0L));
                AbstractC11153tN0.m24884B(3, j613, 0L, i61M24908t10);
                I61 i61M24908t11 = AbstractC11153tN0.m24908t(arrayList3, i61M24908t10);
                i61M24908t11.m3751a(new C0545Ie(1, j612, 0L));
                i61M24908t11.m3751a(new C0545Ie(2, j613, 0L));
                AbstractC11153tN0.m24884B(3, j613, 0L, i61M24908t11);
                I61 i61M24908t12 = AbstractC11153tN0.m24908t(arrayList3, i61M24908t11);
                i61M24908t12.m3751a(new C0545Ie(2, j612, 0L));
                i61M24908t12.m3751a(new C0545Ie(2, j612, 0L));
                AbstractC11153tN0.m24884B(3, j61, 0L, i61M24908t12);
                arrayList3.add(i61M24908t12);
                arrayList.addAll(arrayList3);
            }
            J61 j614 = J61.VGA;
            if (i2 == 1 || i2 == 3) {
                ArrayList arrayList4 = new ArrayList();
                I61 i613 = new I61();
                i613.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(1, j61, 0L, i613);
                I61 i61M24908t13 = AbstractC11153tN0.m24908t(arrayList4, i613);
                i61M24908t13.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(2, j61, 0L, i61M24908t13);
                I61 i61M24908t14 = AbstractC11153tN0.m24908t(arrayList4, i61M24908t13);
                i61M24908t14.m3751a(new C0545Ie(2, j612, 0L));
                AbstractC11153tN0.m24884B(2, j61, 0L, i61M24908t14);
                I61 i61M24908t15 = AbstractC11153tN0.m24908t(arrayList4, i61M24908t14);
                i61M24908t15.m3751a(new C0545Ie(1, j612, 0L));
                i61M24908t15.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(3, j61, 0L, i61M24908t15);
                I61 i61M24908t16 = AbstractC11153tN0.m24908t(arrayList4, i61M24908t15);
                i61M24908t16.m3751a(new C0545Ie(2, j614, 0L));
                i61M24908t16.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(2, j61, 0L, i61M24908t16);
                I61 i61M24908t17 = AbstractC11153tN0.m24908t(arrayList4, i61M24908t16);
                i61M24908t17.m3751a(new C0545Ie(2, j614, 0L));
                i61M24908t17.m3751a(new C0545Ie(2, j612, 0L));
                AbstractC11153tN0.m24884B(2, j61, 0L, i61M24908t17);
                arrayList4.add(i61M24908t17);
                arrayList.addAll(arrayList4);
            }
            if (this.f4122n) {
                ArrayList arrayList5 = new ArrayList();
                I61 i614 = new I61();
                AbstractC11153tN0.m24884B(5, j61, 0L, i614);
                I61 i61M24908t18 = AbstractC11153tN0.m24908t(arrayList5, i614);
                i61M24908t18.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(5, j61, 0L, i61M24908t18);
                I61 i61M24908t19 = AbstractC11153tN0.m24908t(arrayList5, i61M24908t18);
                i61M24908t19.m3751a(new C0545Ie(2, j612, 0L));
                AbstractC11153tN0.m24884B(5, j61, 0L, i61M24908t19);
                I61 i61M24908t20 = AbstractC11153tN0.m24908t(arrayList5, i61M24908t19);
                i61M24908t20.m3751a(new C0545Ie(1, j612, 0L));
                i61M24908t20.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(5, j61, 0L, i61M24908t20);
                I61 i61M24908t21 = AbstractC11153tN0.m24908t(arrayList5, i61M24908t20);
                i61M24908t21.m3751a(new C0545Ie(1, j612, 0L));
                i61M24908t21.m3751a(new C0545Ie(2, j612, 0L));
                AbstractC11153tN0.m24884B(5, j61, 0L, i61M24908t21);
                I61 i61M24908t22 = AbstractC11153tN0.m24908t(arrayList5, i61M24908t21);
                i61M24908t22.m3751a(new C0545Ie(2, j612, 0L));
                i61M24908t22.m3751a(new C0545Ie(2, j612, 0L));
                AbstractC11153tN0.m24884B(5, j61, 0L, i61M24908t22);
                I61 i61M24908t23 = AbstractC11153tN0.m24908t(arrayList5, i61M24908t22);
                i61M24908t23.m3751a(new C0545Ie(1, j612, 0L));
                i61M24908t23.m3751a(new C0545Ie(3, j61, 0L));
                AbstractC11153tN0.m24884B(5, j61, 0L, i61M24908t23);
                I61 i61M24908t24 = AbstractC11153tN0.m24908t(arrayList5, i61M24908t23);
                i61M24908t24.m3751a(new C0545Ie(2, j612, 0L));
                i61M24908t24.m3751a(new C0545Ie(3, j61, 0L));
                AbstractC11153tN0.m24884B(5, j61, 0L, i61M24908t24);
                arrayList5.add(i61M24908t24);
                arrayList.addAll(arrayList5);
            }
            if (this.f4123o && i2 == 0) {
                ArrayList arrayList6 = new ArrayList();
                I61 i615 = new I61();
                i615.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(1, j61, 0L, i615);
                I61 i61M24908t25 = AbstractC11153tN0.m24908t(arrayList6, i615);
                i61M24908t25.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(2, j61, 0L, i61M24908t25);
                I61 i61M24908t26 = AbstractC11153tN0.m24908t(arrayList6, i61M24908t25);
                i61M24908t26.m3751a(new C0545Ie(2, j612, 0L));
                AbstractC11153tN0.m24884B(2, j61, 0L, i61M24908t26);
                arrayList6.add(i61M24908t26);
                arrayList.addAll(arrayList6);
            }
            if (i2 == 3) {
                ArrayList arrayList7 = new ArrayList();
                I61 i616 = new I61();
                i616.m3751a(new C0545Ie(1, j612, 0L));
                i616.m3751a(new C0545Ie(1, j614, 0L));
                i616.m3751a(new C0545Ie(2, j61, 0L));
                AbstractC11153tN0.m24884B(5, j61, 0L, i616);
                I61 i61M24908t27 = AbstractC11153tN0.m24908t(arrayList7, i616);
                i61M24908t27.m3751a(new C0545Ie(1, j612, 0L));
                i61M24908t27.m3751a(new C0545Ie(1, j614, 0L));
                i61M24908t27.m3751a(new C0545Ie(3, j61, 0L));
                AbstractC11153tN0.m24884B(5, j61, 0L, i61M24908t27);
                arrayList7.add(i61M24908t27);
                arrayList.addAll(arrayList7);
            }
            ArrayList arrayList8 = this.f4109a;
            arrayList8.addAll(arrayList);
            if (((ExtraSupportedSurfaceCombinationsQuirk) this.f4120l.f9780b) == null) {
                arrayListSingletonList = new ArrayList();
            } else {
                I61 i617 = ExtraSupportedSurfaceCombinationsQuirk.f15927a;
                String str2 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2)) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayListSingletonList = arrayList9;
                    if (this.f4117i.equals("1")) {
                        arrayList9.add(ExtraSupportedSurfaceCombinationsQuirk.f15927a);
                        arrayListSingletonList = arrayList9;
                    }
                } else {
                    arrayListSingletonList = ((!"google".equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.f15929c.contains(Build.MODEL.toUpperCase(Locale.US))) || ExtraSupportedSurfaceCombinationsQuirk.m9879d()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.f15928b) : Collections.emptyList();
                }
            }
            arrayList8.addAll(arrayListSingletonList);
            if (this.f4126r) {
                ArrayList arrayList10 = new ArrayList();
                I61 i618 = new I61();
                J61 j615 = J61.ULTRA_MAXIMUM;
                i618.m3751a(new C0545Ie(2, j615, 0L));
                i618.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(1, j613, 0L, i618);
                I61 i61M24908t28 = AbstractC11153tN0.m24908t(arrayList10, i618);
                i61M24908t28.m3751a(new C0545Ie(3, j615, 0L));
                i61M24908t28.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(1, j613, 0L, i61M24908t28);
                I61 i61M24908t29 = AbstractC11153tN0.m24908t(arrayList10, i61M24908t28);
                i61M24908t29.m3751a(new C0545Ie(5, j615, 0L));
                i61M24908t29.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(1, j613, 0L, i61M24908t29);
                I61 i61M24908t30 = AbstractC11153tN0.m24908t(arrayList10, i61M24908t29);
                i61M24908t30.m3751a(new C0545Ie(2, j615, 0L));
                i61M24908t30.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(3, j61, 0L, i61M24908t30);
                I61 i61M24908t31 = AbstractC11153tN0.m24908t(arrayList10, i61M24908t30);
                i61M24908t31.m3751a(new C0545Ie(3, j615, 0L));
                i61M24908t31.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(3, j61, 0L, i61M24908t31);
                I61 i61M24908t32 = AbstractC11153tN0.m24908t(arrayList10, i61M24908t31);
                i61M24908t32.m3751a(new C0545Ie(5, j615, 0L));
                i61M24908t32.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(3, j61, 0L, i61M24908t32);
                I61 i61M24908t33 = AbstractC11153tN0.m24908t(arrayList10, i61M24908t32);
                i61M24908t33.m3751a(new C0545Ie(2, j615, 0L));
                i61M24908t33.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(2, j61, 0L, i61M24908t33);
                I61 i61M24908t34 = AbstractC11153tN0.m24908t(arrayList10, i61M24908t33);
                i61M24908t34.m3751a(new C0545Ie(3, j615, 0L));
                i61M24908t34.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(2, j61, 0L, i61M24908t34);
                I61 i61M24908t35 = AbstractC11153tN0.m24908t(arrayList10, i61M24908t34);
                i61M24908t35.m3751a(new C0545Ie(5, j615, 0L));
                i61M24908t35.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(2, j61, 0L, i61M24908t35);
                I61 i61M24908t36 = AbstractC11153tN0.m24908t(arrayList10, i61M24908t35);
                i61M24908t36.m3751a(new C0545Ie(2, j615, 0L));
                i61M24908t36.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(5, j61, 0L, i61M24908t36);
                I61 i61M24908t37 = AbstractC11153tN0.m24908t(arrayList10, i61M24908t36);
                i61M24908t37.m3751a(new C0545Ie(3, j615, 0L));
                i61M24908t37.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(5, j61, 0L, i61M24908t37);
                I61 i61M24908t38 = AbstractC11153tN0.m24908t(arrayList10, i61M24908t37);
                i61M24908t38.m3751a(new C0545Ie(5, j615, 0L));
                i61M24908t38.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(5, j61, 0L, i61M24908t38);
                arrayList10.add(i61M24908t38);
                this.f4110b.addAll(arrayList10);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f4124p = zHasSystemFeature;
            J61 j616 = J61.s1440p;
            if (zHasSystemFeature) {
                ArrayList arrayList11 = new ArrayList();
                I61 i619 = new I61();
                AbstractC11153tN0.m24884B(2, j616, 0L, i619);
                I61 i61M24908t39 = AbstractC11153tN0.m24908t(arrayList11, i619);
                AbstractC11153tN0.m24884B(1, j616, 0L, i61M24908t39);
                I61 i61M24908t40 = AbstractC11153tN0.m24908t(arrayList11, i61M24908t39);
                AbstractC11153tN0.m24884B(3, j616, 0L, i61M24908t40);
                I61 i61M24908t41 = AbstractC11153tN0.m24908t(arrayList11, i61M24908t40);
                J61 j617 = J61.s720p;
                i61M24908t41.m3751a(new C0545Ie(2, j617, 0L));
                AbstractC11153tN0.m24884B(3, j616, 0L, i61M24908t41);
                I61 i61M24908t42 = AbstractC11153tN0.m24908t(arrayList11, i61M24908t41);
                i61M24908t42.m3751a(new C0545Ie(1, j617, 0L));
                AbstractC11153tN0.m24884B(3, j616, 0L, i61M24908t42);
                I61 i61M24908t43 = AbstractC11153tN0.m24908t(arrayList11, i61M24908t42);
                i61M24908t43.m3751a(new C0545Ie(2, j617, 0L));
                AbstractC11153tN0.m24884B(2, j616, 0L, i61M24908t43);
                I61 i61M24908t44 = AbstractC11153tN0.m24908t(arrayList11, i61M24908t43);
                i61M24908t44.m3751a(new C0545Ie(2, j617, 0L));
                AbstractC11153tN0.m24884B(1, j616, 0L, i61M24908t44);
                I61 i61M24908t45 = AbstractC11153tN0.m24908t(arrayList11, i61M24908t44);
                i61M24908t45.m3751a(new C0545Ie(1, j617, 0L));
                AbstractC11153tN0.m24884B(2, j616, 0L, i61M24908t45);
                I61 i61M24908t46 = AbstractC11153tN0.m24908t(arrayList11, i61M24908t45);
                i61M24908t46.m3751a(new C0545Ie(1, j617, 0L));
                AbstractC11153tN0.m24884B(1, j616, 0L, i61M24908t46);
                arrayList11.add(i61M24908t46);
                this.f4111c.addAll(arrayList11);
            }
            if (this.f4132x.f13487b) {
                ArrayList arrayList12 = new ArrayList();
                I61 i6110 = new I61();
                AbstractC11153tN0.m24884B(1, j61, 0L, i6110);
                I61 i61M24908t47 = AbstractC11153tN0.m24908t(arrayList12, i6110);
                AbstractC11153tN0.m24884B(2, j61, 0L, i61M24908t47);
                I61 i61M24908t48 = AbstractC11153tN0.m24908t(arrayList12, i61M24908t47);
                i61M24908t48.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(3, j61, 0L, i61M24908t48);
                I61 i61M24908t49 = AbstractC11153tN0.m24908t(arrayList12, i61M24908t48);
                i61M24908t49.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(2, j61, 0L, i61M24908t49);
                I61 i61M24908t50 = AbstractC11153tN0.m24908t(arrayList12, i61M24908t49);
                i61M24908t50.m3751a(new C0545Ie(2, j612, 0L));
                AbstractC11153tN0.m24884B(2, j61, 0L, i61M24908t50);
                I61 i61M24908t51 = AbstractC11153tN0.m24908t(arrayList12, i61M24908t50);
                i61M24908t51.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(1, j613, 0L, i61M24908t51);
                I61 i61M24908t52 = AbstractC11153tN0.m24908t(arrayList12, i61M24908t51);
                i61M24908t52.m3751a(new C0545Ie(1, j612, 0L));
                i61M24908t52.m3751a(new C0545Ie(1, j613, 0L));
                AbstractC11153tN0.m24884B(2, j613, 0L, i61M24908t52);
                I61 i61M24908t53 = AbstractC11153tN0.m24908t(arrayList12, i61M24908t52);
                i61M24908t53.m3751a(new C0545Ie(1, j612, 0L));
                i61M24908t53.m3751a(new C0545Ie(1, j613, 0L));
                AbstractC11153tN0.m24884B(3, j613, 0L, i61M24908t53);
                arrayList12.add(i61M24908t53);
                this.f4114f.addAll(arrayList12);
            }
            C10525oT0 c10525oT0 = (C10525oT0) this.f4119k.m3156b().f8627a;
            c10525oT0.getClass();
            try {
                outputFormats = ((StreamConfigurationMap) c10525oT0.f39025a).getOutputFormats();
            } catch (IllegalArgumentException | NullPointerException unused) {
                AbstractC7806Jm0.m4412f("StreamConfigurationMapCompatBaseImpl");
                outputFormats = null;
            }
            int[] iArr3 = outputFormats != null ? (int[]) outputFormats.clone() : null;
            if (iArr3 != null) {
                int length = iArr3.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (iArr3[i3] == 4101) {
                        ArrayList arrayList13 = new ArrayList();
                        I61 i6111 = new I61();
                        AbstractC11153tN0.m24884B(4, j61, 0L, i6111);
                        I61 i61M24908t54 = AbstractC11153tN0.m24908t(arrayList13, i6111);
                        i61M24908t54.m3751a(new C0545Ie(1, j612, 0L));
                        AbstractC11153tN0.m24884B(4, j61, 0L, i61M24908t54);
                        arrayList13.add(i61M24908t54);
                        this.f4115g.addAll(arrayList13);
                        break;
                    }
                    i3++;
                }
            }
            C0428Gn c0428Gn = this.f4119k;
            C0480Hc c0480Hc = AbstractC10350n51.f38097a;
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 33 || (jArr = (long[]) c0428Gn.m3155a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
            this.f4125q = z2;
            if (z2 && i4 >= 33) {
                ArrayList arrayList14 = new ArrayList();
                I61 i6112 = new I61();
                AbstractC11153tN0.m24884B(1, j616, 4L, i6112);
                I61 i61M24908t55 = AbstractC11153tN0.m24908t(arrayList14, i6112);
                AbstractC11153tN0.m24884B(2, j616, 4L, i61M24908t55);
                I61 i61M24908t56 = AbstractC11153tN0.m24908t(arrayList14, i61M24908t55);
                AbstractC11153tN0.m24884B(1, j613, 3L, i61M24908t56);
                I61 i61M24908t57 = AbstractC11153tN0.m24908t(arrayList14, i61M24908t56);
                AbstractC11153tN0.m24884B(2, j613, 3L, i61M24908t57);
                I61 i61M24908t58 = AbstractC11153tN0.m24908t(arrayList14, i61M24908t57);
                AbstractC11153tN0.m24884B(3, j61, 2L, i61M24908t58);
                I61 i61M24908t59 = AbstractC11153tN0.m24908t(arrayList14, i61M24908t58);
                AbstractC11153tN0.m24884B(2, j61, 2L, i61M24908t59);
                I61 i61M24908t60 = AbstractC11153tN0.m24908t(arrayList14, i61M24908t59);
                i61M24908t60.m3751a(new C0545Ie(1, j612, 1L));
                AbstractC11153tN0.m24884B(3, j61, 2L, i61M24908t60);
                I61 i61M24908t61 = AbstractC11153tN0.m24908t(arrayList14, i61M24908t60);
                i61M24908t61.m3751a(new C0545Ie(1, j612, 1L));
                AbstractC11153tN0.m24884B(2, j61, 2L, i61M24908t61);
                I61 i61M24908t62 = AbstractC11153tN0.m24908t(arrayList14, i61M24908t61);
                i61M24908t62.m3751a(new C0545Ie(1, j612, 1L));
                AbstractC11153tN0.m24884B(1, j613, 3L, i61M24908t62);
                I61 i61M24908t63 = AbstractC11153tN0.m24908t(arrayList14, i61M24908t62);
                i61M24908t63.m3751a(new C0545Ie(1, j612, 1L));
                AbstractC11153tN0.m24884B(2, j613, 3L, i61M24908t63);
                I61 i61M24908t64 = AbstractC11153tN0.m24908t(arrayList14, i61M24908t63);
                i61M24908t64.m3751a(new C0545Ie(1, j612, 1L));
                AbstractC11153tN0.m24884B(2, j612, 1L, i61M24908t64);
                I61 i61M24908t65 = AbstractC11153tN0.m24908t(arrayList14, i61M24908t64);
                i61M24908t65.m3751a(new C0545Ie(1, j612, 1L));
                i61M24908t65.m3751a(new C0545Ie(1, j613, 3L));
                AbstractC11153tN0.m24884B(3, j613, 2L, i61M24908t65);
                I61 i61M24908t66 = AbstractC11153tN0.m24908t(arrayList14, i61M24908t65);
                i61M24908t66.m3751a(new C0545Ie(1, j612, 1L));
                i61M24908t66.m3751a(new C0545Ie(2, j613, 3L));
                AbstractC11153tN0.m24884B(3, j613, 2L, i61M24908t66);
                I61 i61M24908t67 = AbstractC11153tN0.m24908t(arrayList14, i61M24908t66);
                i61M24908t67.m3751a(new C0545Ie(1, j612, 1L));
                i61M24908t67.m3751a(new C0545Ie(2, j612, 1L));
                AbstractC11153tN0.m24884B(3, j61, 2L, i61M24908t67);
                arrayList14.add(i61M24908t67);
                this.f4116h.addAll(arrayList14);
            }
            C0428Gn c0428Gn2 = this.f4119k;
            if (i4 < 33 || (iArr = (int[]) c0428Gn2.m3155a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length == 0) {
                z = false;
            } else {
                for (int i5 : iArr) {
                    if (i5 == 2) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if (z && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList15 = new ArrayList();
                I61 i6113 = new I61();
                AbstractC11153tN0.m24884B(1, j616, 0L, i6113);
                I61 i61M24908t68 = AbstractC11153tN0.m24908t(arrayList15, i6113);
                AbstractC11153tN0.m24884B(2, j616, 0L, i61M24908t68);
                I61 i61M24908t69 = AbstractC11153tN0.m24908t(arrayList15, i61M24908t68);
                i61M24908t69.m3751a(new C0545Ie(1, j616, 0L));
                AbstractC11153tN0.m24884B(3, j61, 0L, i61M24908t69);
                I61 i61M24908t70 = AbstractC11153tN0.m24908t(arrayList15, i61M24908t69);
                i61M24908t70.m3751a(new C0545Ie(2, j616, 0L));
                AbstractC11153tN0.m24884B(3, j61, 0L, i61M24908t70);
                I61 i61M24908t71 = AbstractC11153tN0.m24908t(arrayList15, i61M24908t70);
                i61M24908t71.m3751a(new C0545Ie(1, j616, 0L));
                AbstractC11153tN0.m24884B(2, j61, 0L, i61M24908t71);
                I61 i61M24908t72 = AbstractC11153tN0.m24908t(arrayList15, i61M24908t71);
                i61M24908t72.m3751a(new C0545Ie(2, j616, 0L));
                AbstractC11153tN0.m24884B(2, j61, 0L, i61M24908t72);
                I61 i61M24908t73 = AbstractC11153tN0.m24908t(arrayList15, i61M24908t72);
                i61M24908t73.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(1, j616, 0L, i61M24908t73);
                I61 i61M24908t74 = AbstractC11153tN0.m24908t(arrayList15, i61M24908t73);
                i61M24908t74.m3751a(new C0545Ie(2, j612, 0L));
                AbstractC11153tN0.m24884B(1, j616, 0L, i61M24908t74);
                I61 i61M24908t75 = AbstractC11153tN0.m24908t(arrayList15, i61M24908t74);
                i61M24908t75.m3751a(new C0545Ie(1, j612, 0L));
                AbstractC11153tN0.m24884B(2, j616, 0L, i61M24908t75);
                I61 i61M24908t76 = AbstractC11153tN0.m24908t(arrayList15, i61M24908t75);
                i61M24908t76.m3751a(new C0545Ie(2, j612, 0L));
                AbstractC11153tN0.m24884B(2, j616, 0L, i61M24908t76);
                arrayList15.add(i61M24908t76);
                this.f4112d.addAll(arrayList15);
            }
            m3305b();
        } catch (C6448mn e) {
            throw new C1309Uo(e);
        }
    }

    /* renamed from: c */
    public static Size m3301c(StreamConfigurationMap streamConfigurationMap, int i, boolean z) {
        Size[] highResolutionOutputSizes;
        Size[] outputSizes = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        C3957dv c3957dv = new C3957dv(false);
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), c3957dv);
        Size size2 = AbstractC9318f21.f27016a;
        if (z && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), c3957dv);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), c3957dv);
    }

    /* renamed from: e */
    public static int m3302e(Range range, Range range2) {
        AbstractC9104dM1.m17550i((range.contains((Range) range2.getUpper()) || range.contains((Range) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    /* renamed from: f */
    public static int m3303f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    /* renamed from: a */
    public final boolean m3304a(C0482He c0482He, List list) {
        List list2;
        HashMap map = this.f4113e;
        if (map.containsKey(c0482He)) {
            list2 = (List) map.get(c0482He);
        } else {
            ArrayList arrayList = new ArrayList();
            boolean z = c0482He.f4393d;
            int i = c0482He.f4390a;
            if (!z) {
                int i2 = c0482He.f4391b;
                if (i2 == 8) {
                    if (i != 1) {
                        ArrayList arrayList2 = this.f4109a;
                        if (i != 2) {
                            if (c0482He.f4392c) {
                                arrayList2 = this.f4112d;
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.addAll(this.f4110b);
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        arrayList = this.f4111c;
                    }
                } else if (i2 == 10 && i == 0) {
                    arrayList.addAll(this.f4114f);
                }
            } else if (i == 0) {
                arrayList.addAll(this.f4115g);
            }
            map.put(c0482He, arrayList);
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 = ((I61) it.next()).m3752c(list) != null;
            if (z2) {
                break;
            }
        }
        return z2;
    }

    /* renamed from: b */
    public final void m3305b() throws NumberFormatException {
        Size size;
        Size size2;
        int i;
        InterfaceC1868cm interfaceC1868cm;
        CamcorderProfile camcorderProfileMo7742a;
        CamcorderProfile camcorderProfileMo7742a2;
        Size sizeM4285e = this.f4129u.m4285e();
        try {
            i = Integer.parseInt(this.f4117i);
            interfaceC1868cm = this.f4118j;
            camcorderProfileMo7742a = null;
            camcorderProfileMo7742a2 = interfaceC1868cm.mo7746j(i, 1) ? interfaceC1868cm.mo7742a(i, 1) : null;
        } catch (NumberFormatException unused) {
            Size[] outputSizes = ((StreamConfigurationMap) ((C10525oT0) this.f4119k.m3156b().f8627a).f39025a).getOutputSizes(MediaRecorder.class);
            if (outputSizes != null) {
                Arrays.sort(outputSizes, new C3957dv(true));
                int length = outputSizes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        size = AbstractC9318f21.f27019d;
                        break;
                    }
                    Size size3 = outputSizes[i2];
                    int width = size3.getWidth();
                    Size size4 = AbstractC9318f21.f27021f;
                    if (width <= size4.getWidth() && size3.getHeight() <= size4.getHeight()) {
                        size = size3;
                        break;
                    }
                    i2++;
                }
            } else {
                size = AbstractC9318f21.f27019d;
            }
        }
        if (camcorderProfileMo7742a2 != null) {
            size2 = new Size(camcorderProfileMo7742a2.videoFrameWidth, camcorderProfileMo7742a2.videoFrameHeight);
            this.f4127s = new C0985Pe(AbstractC9318f21.f27018c, new HashMap(), sizeM4285e, new HashMap(), size2, new HashMap(), new HashMap());
        }
        size = AbstractC9318f21.f27019d;
        if (interfaceC1868cm.mo7746j(i, 10)) {
            camcorderProfileMo7742a = interfaceC1868cm.mo7742a(i, 10);
        } else if (interfaceC1868cm.mo7746j(i, 8)) {
            camcorderProfileMo7742a = interfaceC1868cm.mo7742a(i, 8);
        } else if (interfaceC1868cm.mo7746j(i, 12)) {
            camcorderProfileMo7742a = interfaceC1868cm.mo7742a(i, 12);
        } else if (interfaceC1868cm.mo7746j(i, 6)) {
            camcorderProfileMo7742a = interfaceC1868cm.mo7742a(i, 6);
        } else if (interfaceC1868cm.mo7746j(i, 5)) {
            camcorderProfileMo7742a = interfaceC1868cm.mo7742a(i, 5);
        } else if (interfaceC1868cm.mo7746j(i, 4)) {
            camcorderProfileMo7742a = interfaceC1868cm.mo7742a(i, 4);
        }
        if (camcorderProfileMo7742a != null) {
            size = new Size(camcorderProfileMo7742a.videoFrameWidth, camcorderProfileMo7742a.videoFrameHeight);
        }
        size2 = size;
        this.f4127s = new C0985Pe(AbstractC9318f21.f27018c, new HashMap(), sizeM4285e, new HashMap(), size2, new HashMap(), new HashMap());
    }

    /* renamed from: d */
    public final List m3306d(C0482He c0482He, List list) {
        C0480Hc c0480Hc = AbstractC10350n51.f38097a;
        if (c0482He.f4390a == 0 && c0482He.f4391b == 8) {
            Iterator it = this.f4116h.iterator();
            while (it.hasNext()) {
                List listM3752c = ((I61) it.next()).m3752c(list);
                if (listM3752c != null) {
                    return listM3752c;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b5, code lost:
    
        if (r5.contains(r13) != false) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:322:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0d07  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0e49  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0232  */
    /* JADX WARN: Type inference failed for: r12v11, types: [android.util.Range] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [android.util.Range] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.util.Range] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [android.util.Range] */
    /* JADX WARN: Type inference failed for: r39v0, types: [H61] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair m3307g(int r40, java.util.ArrayList r41, java.util.HashMap r42, boolean r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 3933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.H61.m3307g(int, java.util.ArrayList, java.util.HashMap, boolean, boolean):android.util.Pair");
    }

    /* renamed from: h */
    public final Pair m3308h(int i, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i2, HashMap map, HashMap map2) {
        int outputMinFrameDuration;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6691qc c6691qc = (C6691qc) it.next();
            arrayList4.add(c6691qc.f41056a);
            if (map != null) {
                map.put(Integer.valueOf(arrayList4.size() - 1), c6691qc);
            }
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            Size size = (Size) list.get(i3);
            InterfaceC9914jh1 interfaceC9914jh1 = (InterfaceC9914jh1) arrayList2.get(((Integer) arrayList3.get(i3)).intValue());
            int iMo5267p = interfaceC9914jh1.mo5267p();
            arrayList4.add(C0545Ie.m3959b(i, iMo5267p, size, m3309i(iMo5267p)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList4.size() - 1), interfaceC9914jh1);
            }
            try {
                outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.f4119k.m3155a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(interfaceC9914jh1.mo5267p(), size));
            } catch (Exception unused) {
                outputMinFrameDuration = 0;
            }
            i2 = Math.min(i2, outputMinFrameDuration);
        }
        return new Pair(arrayList4, Integer.valueOf(i2));
    }

    /* renamed from: i */
    public final C0985Pe m3309i(int i) {
        StreamConfigurationMap streamConfigurationMap;
        ArrayList arrayList = this.f4128t;
        if (!arrayList.contains(Integer.valueOf(i))) {
            m3310j(this.f4127s.f9205b, AbstractC9318f21.f27020e, i);
            m3310j(this.f4127s.f9207d, AbstractC9318f21.f27022g, i);
            HashMap map = this.f4127s.f9209f;
            C0428Gn c0428Gn = this.f4119k;
            Size sizeM3301c = m3301c((StreamConfigurationMap) ((C10525oT0) c0428Gn.m3156b().f8627a).f39025a, i, true);
            if (sizeM3301c != null) {
                map.put(Integer.valueOf(i), sizeM3301c);
            }
            HashMap map2 = this.f4127s.f9210g;
            if (Build.VERSION.SDK_INT >= 31 && this.f4126r && (streamConfigurationMap = (StreamConfigurationMap) c0428Gn.m3155a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map2.put(Integer.valueOf(i), m3301c(streamConfigurationMap, i, true));
            }
            arrayList.add(Integer.valueOf(i));
        }
        return this.f4127s;
    }

    /* renamed from: j */
    public final void m3310j(HashMap map, Size size, int i) {
        if (this.f4124p) {
            Size sizeM3301c = m3301c((StreamConfigurationMap) ((C10525oT0) this.f4119k.m3156b().f8627a).f39025a, i, false);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeM3301c != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeM3301c), new C3957dv(false));
            }
            map.put(numValueOf, size);
        }
    }
}

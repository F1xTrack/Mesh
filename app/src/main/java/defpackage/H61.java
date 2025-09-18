package defpackage;

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
    public final String i;
    public final InterfaceC2577cm j;
    public final C0527Gn k;
    public final C1304Qm0 l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public C1201Pe s;
    public final JK u;
    public final X11 x;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final C7532v32 v = new C7532v32(21);
    public final C7409uQ0 w = new C7409uQ0(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    public H61(Context context, String str, C8051xo c8051xo, InterfaceC2577cm interfaceC2577cm) throws NumberFormatException, C1621Uo {
        ArrayList arrayListSingletonList;
        int[] outputFormats;
        long[] jArr;
        int[] iArr;
        boolean z;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        str.getClass();
        this.i = str;
        interfaceC2577cm.getClass();
        this.j = interfaceC2577cm;
        this.l = new C1304Qm0(17);
        this.u = JK.b(context);
        try {
            C0527Gn c0527GnB = c8051xo.b(str);
            this.k = c0527GnB;
            Integer num = (Integer) c0527GnB.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.m = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) c0527GnB.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i : iArr2) {
                    if (i == 3) {
                        this.n = true;
                    } else if (i == 6) {
                        this.o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i == 16) {
                        this.r = true;
                    }
                }
            }
            this.x = new X11(this.k);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            I61 i61 = new I61();
            J61 j61 = J61.MAXIMUM;
            AbstractC7209tN0.B(1, j61, 0L, i61);
            I61 i61T = AbstractC7209tN0.t(arrayList2, i61);
            AbstractC7209tN0.B(3, j61, 0L, i61T);
            I61 i61T2 = AbstractC7209tN0.t(arrayList2, i61T);
            AbstractC7209tN0.B(2, j61, 0L, i61T2);
            I61 i61T3 = AbstractC7209tN0.t(arrayList2, i61T2);
            J61 j612 = J61.PREVIEW;
            i61T3.a(new C0656Ie(1, j612, 0L));
            AbstractC7209tN0.B(3, j61, 0L, i61T3);
            I61 i61T4 = AbstractC7209tN0.t(arrayList2, i61T3);
            i61T4.a(new C0656Ie(2, j612, 0L));
            AbstractC7209tN0.B(3, j61, 0L, i61T4);
            I61 i61T5 = AbstractC7209tN0.t(arrayList2, i61T4);
            i61T5.a(new C0656Ie(1, j612, 0L));
            AbstractC7209tN0.B(1, j612, 0L, i61T5);
            I61 i61T6 = AbstractC7209tN0.t(arrayList2, i61T5);
            i61T6.a(new C0656Ie(1, j612, 0L));
            AbstractC7209tN0.B(2, j612, 0L, i61T6);
            I61 i61T7 = AbstractC7209tN0.t(arrayList2, i61T6);
            i61T7.a(new C0656Ie(1, j612, 0L));
            i61T7.a(new C0656Ie(2, j612, 0L));
            AbstractC7209tN0.B(3, j61, 0L, i61T7);
            arrayList2.add(i61T7);
            arrayList.addAll(arrayList2);
            int i2 = this.m;
            J61 j613 = J61.RECORD;
            if (i2 == 0 || i2 == 1 || i2 == 3) {
                ArrayList arrayList3 = new ArrayList();
                I61 i612 = new I61();
                i612.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(1, j613, 0L, i612);
                I61 i61T8 = AbstractC7209tN0.t(arrayList3, i612);
                i61T8.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(2, j613, 0L, i61T8);
                I61 i61T9 = AbstractC7209tN0.t(arrayList3, i61T8);
                i61T9.a(new C0656Ie(2, j612, 0L));
                AbstractC7209tN0.B(2, j613, 0L, i61T9);
                I61 i61T10 = AbstractC7209tN0.t(arrayList3, i61T9);
                i61T10.a(new C0656Ie(1, j612, 0L));
                i61T10.a(new C0656Ie(1, j613, 0L));
                AbstractC7209tN0.B(3, j613, 0L, i61T10);
                I61 i61T11 = AbstractC7209tN0.t(arrayList3, i61T10);
                i61T11.a(new C0656Ie(1, j612, 0L));
                i61T11.a(new C0656Ie(2, j613, 0L));
                AbstractC7209tN0.B(3, j613, 0L, i61T11);
                I61 i61T12 = AbstractC7209tN0.t(arrayList3, i61T11);
                i61T12.a(new C0656Ie(2, j612, 0L));
                i61T12.a(new C0656Ie(2, j612, 0L));
                AbstractC7209tN0.B(3, j61, 0L, i61T12);
                arrayList3.add(i61T12);
                arrayList.addAll(arrayList3);
            }
            J61 j614 = J61.VGA;
            if (i2 == 1 || i2 == 3) {
                ArrayList arrayList4 = new ArrayList();
                I61 i613 = new I61();
                i613.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(1, j61, 0L, i613);
                I61 i61T13 = AbstractC7209tN0.t(arrayList4, i613);
                i61T13.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(2, j61, 0L, i61T13);
                I61 i61T14 = AbstractC7209tN0.t(arrayList4, i61T13);
                i61T14.a(new C0656Ie(2, j612, 0L));
                AbstractC7209tN0.B(2, j61, 0L, i61T14);
                I61 i61T15 = AbstractC7209tN0.t(arrayList4, i61T14);
                i61T15.a(new C0656Ie(1, j612, 0L));
                i61T15.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(3, j61, 0L, i61T15);
                I61 i61T16 = AbstractC7209tN0.t(arrayList4, i61T15);
                i61T16.a(new C0656Ie(2, j614, 0L));
                i61T16.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(2, j61, 0L, i61T16);
                I61 i61T17 = AbstractC7209tN0.t(arrayList4, i61T16);
                i61T17.a(new C0656Ie(2, j614, 0L));
                i61T17.a(new C0656Ie(2, j612, 0L));
                AbstractC7209tN0.B(2, j61, 0L, i61T17);
                arrayList4.add(i61T17);
                arrayList.addAll(arrayList4);
            }
            if (this.n) {
                ArrayList arrayList5 = new ArrayList();
                I61 i614 = new I61();
                AbstractC7209tN0.B(5, j61, 0L, i614);
                I61 i61T18 = AbstractC7209tN0.t(arrayList5, i614);
                i61T18.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(5, j61, 0L, i61T18);
                I61 i61T19 = AbstractC7209tN0.t(arrayList5, i61T18);
                i61T19.a(new C0656Ie(2, j612, 0L));
                AbstractC7209tN0.B(5, j61, 0L, i61T19);
                I61 i61T20 = AbstractC7209tN0.t(arrayList5, i61T19);
                i61T20.a(new C0656Ie(1, j612, 0L));
                i61T20.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(5, j61, 0L, i61T20);
                I61 i61T21 = AbstractC7209tN0.t(arrayList5, i61T20);
                i61T21.a(new C0656Ie(1, j612, 0L));
                i61T21.a(new C0656Ie(2, j612, 0L));
                AbstractC7209tN0.B(5, j61, 0L, i61T21);
                I61 i61T22 = AbstractC7209tN0.t(arrayList5, i61T21);
                i61T22.a(new C0656Ie(2, j612, 0L));
                i61T22.a(new C0656Ie(2, j612, 0L));
                AbstractC7209tN0.B(5, j61, 0L, i61T22);
                I61 i61T23 = AbstractC7209tN0.t(arrayList5, i61T22);
                i61T23.a(new C0656Ie(1, j612, 0L));
                i61T23.a(new C0656Ie(3, j61, 0L));
                AbstractC7209tN0.B(5, j61, 0L, i61T23);
                I61 i61T24 = AbstractC7209tN0.t(arrayList5, i61T23);
                i61T24.a(new C0656Ie(2, j612, 0L));
                i61T24.a(new C0656Ie(3, j61, 0L));
                AbstractC7209tN0.B(5, j61, 0L, i61T24);
                arrayList5.add(i61T24);
                arrayList.addAll(arrayList5);
            }
            if (this.o && i2 == 0) {
                ArrayList arrayList6 = new ArrayList();
                I61 i615 = new I61();
                i615.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(1, j61, 0L, i615);
                I61 i61T25 = AbstractC7209tN0.t(arrayList6, i615);
                i61T25.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(2, j61, 0L, i61T25);
                I61 i61T26 = AbstractC7209tN0.t(arrayList6, i61T25);
                i61T26.a(new C0656Ie(2, j612, 0L));
                AbstractC7209tN0.B(2, j61, 0L, i61T26);
                arrayList6.add(i61T26);
                arrayList.addAll(arrayList6);
            }
            if (i2 == 3) {
                ArrayList arrayList7 = new ArrayList();
                I61 i616 = new I61();
                i616.a(new C0656Ie(1, j612, 0L));
                i616.a(new C0656Ie(1, j614, 0L));
                i616.a(new C0656Ie(2, j61, 0L));
                AbstractC7209tN0.B(5, j61, 0L, i616);
                I61 i61T27 = AbstractC7209tN0.t(arrayList7, i616);
                i61T27.a(new C0656Ie(1, j612, 0L));
                i61T27.a(new C0656Ie(1, j614, 0L));
                i61T27.a(new C0656Ie(3, j61, 0L));
                AbstractC7209tN0.B(5, j61, 0L, i61T27);
                arrayList7.add(i61T27);
                arrayList.addAll(arrayList7);
            }
            ArrayList arrayList8 = this.a;
            arrayList8.addAll(arrayList);
            if (((ExtraSupportedSurfaceCombinationsQuirk) this.l.b) == null) {
                arrayListSingletonList = new ArrayList();
            } else {
                I61 i617 = ExtraSupportedSurfaceCombinationsQuirk.a;
                String str2 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2)) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayListSingletonList = arrayList9;
                    if (this.i.equals("1")) {
                        arrayList9.add(ExtraSupportedSurfaceCombinationsQuirk.a);
                        arrayListSingletonList = arrayList9;
                    }
                } else {
                    arrayListSingletonList = ((!"google".equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.c.contains(Build.MODEL.toUpperCase(Locale.US))) || ExtraSupportedSurfaceCombinationsQuirk.d()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.b) : Collections.emptyList();
                }
            }
            arrayList8.addAll(arrayListSingletonList);
            if (this.r) {
                ArrayList arrayList10 = new ArrayList();
                I61 i618 = new I61();
                J61 j615 = J61.ULTRA_MAXIMUM;
                i618.a(new C0656Ie(2, j615, 0L));
                i618.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(1, j613, 0L, i618);
                I61 i61T28 = AbstractC7209tN0.t(arrayList10, i618);
                i61T28.a(new C0656Ie(3, j615, 0L));
                i61T28.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(1, j613, 0L, i61T28);
                I61 i61T29 = AbstractC7209tN0.t(arrayList10, i61T28);
                i61T29.a(new C0656Ie(5, j615, 0L));
                i61T29.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(1, j613, 0L, i61T29);
                I61 i61T30 = AbstractC7209tN0.t(arrayList10, i61T29);
                i61T30.a(new C0656Ie(2, j615, 0L));
                i61T30.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(3, j61, 0L, i61T30);
                I61 i61T31 = AbstractC7209tN0.t(arrayList10, i61T30);
                i61T31.a(new C0656Ie(3, j615, 0L));
                i61T31.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(3, j61, 0L, i61T31);
                I61 i61T32 = AbstractC7209tN0.t(arrayList10, i61T31);
                i61T32.a(new C0656Ie(5, j615, 0L));
                i61T32.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(3, j61, 0L, i61T32);
                I61 i61T33 = AbstractC7209tN0.t(arrayList10, i61T32);
                i61T33.a(new C0656Ie(2, j615, 0L));
                i61T33.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(2, j61, 0L, i61T33);
                I61 i61T34 = AbstractC7209tN0.t(arrayList10, i61T33);
                i61T34.a(new C0656Ie(3, j615, 0L));
                i61T34.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(2, j61, 0L, i61T34);
                I61 i61T35 = AbstractC7209tN0.t(arrayList10, i61T34);
                i61T35.a(new C0656Ie(5, j615, 0L));
                i61T35.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(2, j61, 0L, i61T35);
                I61 i61T36 = AbstractC7209tN0.t(arrayList10, i61T35);
                i61T36.a(new C0656Ie(2, j615, 0L));
                i61T36.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(5, j61, 0L, i61T36);
                I61 i61T37 = AbstractC7209tN0.t(arrayList10, i61T36);
                i61T37.a(new C0656Ie(3, j615, 0L));
                i61T37.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(5, j61, 0L, i61T37);
                I61 i61T38 = AbstractC7209tN0.t(arrayList10, i61T37);
                i61T38.a(new C0656Ie(5, j615, 0L));
                i61T38.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(5, j61, 0L, i61T38);
                arrayList10.add(i61T38);
                this.b.addAll(arrayList10);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.p = zHasSystemFeature;
            J61 j616 = J61.s1440p;
            if (zHasSystemFeature) {
                ArrayList arrayList11 = new ArrayList();
                I61 i619 = new I61();
                AbstractC7209tN0.B(2, j616, 0L, i619);
                I61 i61T39 = AbstractC7209tN0.t(arrayList11, i619);
                AbstractC7209tN0.B(1, j616, 0L, i61T39);
                I61 i61T40 = AbstractC7209tN0.t(arrayList11, i61T39);
                AbstractC7209tN0.B(3, j616, 0L, i61T40);
                I61 i61T41 = AbstractC7209tN0.t(arrayList11, i61T40);
                J61 j617 = J61.s720p;
                i61T41.a(new C0656Ie(2, j617, 0L));
                AbstractC7209tN0.B(3, j616, 0L, i61T41);
                I61 i61T42 = AbstractC7209tN0.t(arrayList11, i61T41);
                i61T42.a(new C0656Ie(1, j617, 0L));
                AbstractC7209tN0.B(3, j616, 0L, i61T42);
                I61 i61T43 = AbstractC7209tN0.t(arrayList11, i61T42);
                i61T43.a(new C0656Ie(2, j617, 0L));
                AbstractC7209tN0.B(2, j616, 0L, i61T43);
                I61 i61T44 = AbstractC7209tN0.t(arrayList11, i61T43);
                i61T44.a(new C0656Ie(2, j617, 0L));
                AbstractC7209tN0.B(1, j616, 0L, i61T44);
                I61 i61T45 = AbstractC7209tN0.t(arrayList11, i61T44);
                i61T45.a(new C0656Ie(1, j617, 0L));
                AbstractC7209tN0.B(2, j616, 0L, i61T45);
                I61 i61T46 = AbstractC7209tN0.t(arrayList11, i61T45);
                i61T46.a(new C0656Ie(1, j617, 0L));
                AbstractC7209tN0.B(1, j616, 0L, i61T46);
                arrayList11.add(i61T46);
                this.c.addAll(arrayList11);
            }
            if (this.x.b) {
                ArrayList arrayList12 = new ArrayList();
                I61 i6110 = new I61();
                AbstractC7209tN0.B(1, j61, 0L, i6110);
                I61 i61T47 = AbstractC7209tN0.t(arrayList12, i6110);
                AbstractC7209tN0.B(2, j61, 0L, i61T47);
                I61 i61T48 = AbstractC7209tN0.t(arrayList12, i61T47);
                i61T48.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(3, j61, 0L, i61T48);
                I61 i61T49 = AbstractC7209tN0.t(arrayList12, i61T48);
                i61T49.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(2, j61, 0L, i61T49);
                I61 i61T50 = AbstractC7209tN0.t(arrayList12, i61T49);
                i61T50.a(new C0656Ie(2, j612, 0L));
                AbstractC7209tN0.B(2, j61, 0L, i61T50);
                I61 i61T51 = AbstractC7209tN0.t(arrayList12, i61T50);
                i61T51.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(1, j613, 0L, i61T51);
                I61 i61T52 = AbstractC7209tN0.t(arrayList12, i61T51);
                i61T52.a(new C0656Ie(1, j612, 0L));
                i61T52.a(new C0656Ie(1, j613, 0L));
                AbstractC7209tN0.B(2, j613, 0L, i61T52);
                I61 i61T53 = AbstractC7209tN0.t(arrayList12, i61T52);
                i61T53.a(new C0656Ie(1, j612, 0L));
                i61T53.a(new C0656Ie(1, j613, 0L));
                AbstractC7209tN0.B(3, j613, 0L, i61T53);
                arrayList12.add(i61T53);
                this.f.addAll(arrayList12);
            }
            C6273oT0 c6273oT0 = (C6273oT0) this.k.b().a;
            c6273oT0.getClass();
            try {
                outputFormats = ((StreamConfigurationMap) c6273oT0.a).getOutputFormats();
            } catch (IllegalArgumentException | NullPointerException unused) {
                AbstractC0759Jm0.f("StreamConfigurationMapCompatBaseImpl");
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
                        AbstractC7209tN0.B(4, j61, 0L, i6111);
                        I61 i61T54 = AbstractC7209tN0.t(arrayList13, i6111);
                        i61T54.a(new C0656Ie(1, j612, 0L));
                        AbstractC7209tN0.B(4, j61, 0L, i61T54);
                        arrayList13.add(i61T54);
                        this.g.addAll(arrayList13);
                        break;
                    }
                    i3++;
                }
            }
            C0527Gn c0527Gn = this.k;
            C0572Hc c0572Hc = AbstractC6011n51.a;
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 33 || (jArr = (long[]) c0527Gn.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
            this.q = z2;
            if (z2 && i4 >= 33) {
                ArrayList arrayList14 = new ArrayList();
                I61 i6112 = new I61();
                AbstractC7209tN0.B(1, j616, 4L, i6112);
                I61 i61T55 = AbstractC7209tN0.t(arrayList14, i6112);
                AbstractC7209tN0.B(2, j616, 4L, i61T55);
                I61 i61T56 = AbstractC7209tN0.t(arrayList14, i61T55);
                AbstractC7209tN0.B(1, j613, 3L, i61T56);
                I61 i61T57 = AbstractC7209tN0.t(arrayList14, i61T56);
                AbstractC7209tN0.B(2, j613, 3L, i61T57);
                I61 i61T58 = AbstractC7209tN0.t(arrayList14, i61T57);
                AbstractC7209tN0.B(3, j61, 2L, i61T58);
                I61 i61T59 = AbstractC7209tN0.t(arrayList14, i61T58);
                AbstractC7209tN0.B(2, j61, 2L, i61T59);
                I61 i61T60 = AbstractC7209tN0.t(arrayList14, i61T59);
                i61T60.a(new C0656Ie(1, j612, 1L));
                AbstractC7209tN0.B(3, j61, 2L, i61T60);
                I61 i61T61 = AbstractC7209tN0.t(arrayList14, i61T60);
                i61T61.a(new C0656Ie(1, j612, 1L));
                AbstractC7209tN0.B(2, j61, 2L, i61T61);
                I61 i61T62 = AbstractC7209tN0.t(arrayList14, i61T61);
                i61T62.a(new C0656Ie(1, j612, 1L));
                AbstractC7209tN0.B(1, j613, 3L, i61T62);
                I61 i61T63 = AbstractC7209tN0.t(arrayList14, i61T62);
                i61T63.a(new C0656Ie(1, j612, 1L));
                AbstractC7209tN0.B(2, j613, 3L, i61T63);
                I61 i61T64 = AbstractC7209tN0.t(arrayList14, i61T63);
                i61T64.a(new C0656Ie(1, j612, 1L));
                AbstractC7209tN0.B(2, j612, 1L, i61T64);
                I61 i61T65 = AbstractC7209tN0.t(arrayList14, i61T64);
                i61T65.a(new C0656Ie(1, j612, 1L));
                i61T65.a(new C0656Ie(1, j613, 3L));
                AbstractC7209tN0.B(3, j613, 2L, i61T65);
                I61 i61T66 = AbstractC7209tN0.t(arrayList14, i61T65);
                i61T66.a(new C0656Ie(1, j612, 1L));
                i61T66.a(new C0656Ie(2, j613, 3L));
                AbstractC7209tN0.B(3, j613, 2L, i61T66);
                I61 i61T67 = AbstractC7209tN0.t(arrayList14, i61T66);
                i61T67.a(new C0656Ie(1, j612, 1L));
                i61T67.a(new C0656Ie(2, j612, 1L));
                AbstractC7209tN0.B(3, j61, 2L, i61T67);
                arrayList14.add(i61T67);
                this.h.addAll(arrayList14);
            }
            C0527Gn c0527Gn2 = this.k;
            if (i4 < 33 || (iArr = (int[]) c0527Gn2.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length == 0) {
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
                AbstractC7209tN0.B(1, j616, 0L, i6113);
                I61 i61T68 = AbstractC7209tN0.t(arrayList15, i6113);
                AbstractC7209tN0.B(2, j616, 0L, i61T68);
                I61 i61T69 = AbstractC7209tN0.t(arrayList15, i61T68);
                i61T69.a(new C0656Ie(1, j616, 0L));
                AbstractC7209tN0.B(3, j61, 0L, i61T69);
                I61 i61T70 = AbstractC7209tN0.t(arrayList15, i61T69);
                i61T70.a(new C0656Ie(2, j616, 0L));
                AbstractC7209tN0.B(3, j61, 0L, i61T70);
                I61 i61T71 = AbstractC7209tN0.t(arrayList15, i61T70);
                i61T71.a(new C0656Ie(1, j616, 0L));
                AbstractC7209tN0.B(2, j61, 0L, i61T71);
                I61 i61T72 = AbstractC7209tN0.t(arrayList15, i61T71);
                i61T72.a(new C0656Ie(2, j616, 0L));
                AbstractC7209tN0.B(2, j61, 0L, i61T72);
                I61 i61T73 = AbstractC7209tN0.t(arrayList15, i61T72);
                i61T73.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(1, j616, 0L, i61T73);
                I61 i61T74 = AbstractC7209tN0.t(arrayList15, i61T73);
                i61T74.a(new C0656Ie(2, j612, 0L));
                AbstractC7209tN0.B(1, j616, 0L, i61T74);
                I61 i61T75 = AbstractC7209tN0.t(arrayList15, i61T74);
                i61T75.a(new C0656Ie(1, j612, 0L));
                AbstractC7209tN0.B(2, j616, 0L, i61T75);
                I61 i61T76 = AbstractC7209tN0.t(arrayList15, i61T75);
                i61T76.a(new C0656Ie(2, j612, 0L));
                AbstractC7209tN0.B(2, j616, 0L, i61T76);
                arrayList15.add(i61T76);
                this.d.addAll(arrayList15);
            }
            b();
        } catch (C5950mn e) {
            throw new C1621Uo(e);
        }
    }

    public static Size c(StreamConfigurationMap streamConfigurationMap, int i, boolean z) {
        Size[] highResolutionOutputSizes;
        Size[] outputSizes = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        C3479dv c3479dv = new C3479dv(false);
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), c3479dv);
        Size size2 = AbstractC3696f21.a;
        if (z && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), c3479dv);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), c3479dv);
    }

    public static int e(Range range, Range range2) {
        AbstractC3377dM1.i((range.contains((Range) range2.getUpper()) || range.contains((Range) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final boolean a(C0578He c0578He, List list) {
        List list2;
        HashMap map = this.e;
        if (map.containsKey(c0578He)) {
            list2 = (List) map.get(c0578He);
        } else {
            ArrayList arrayList = new ArrayList();
            boolean z = c0578He.d;
            int i = c0578He.a;
            if (!z) {
                int i2 = c0578He.b;
                if (i2 == 8) {
                    if (i != 1) {
                        ArrayList arrayList2 = this.a;
                        if (i != 2) {
                            if (c0578He.c) {
                                arrayList2 = this.d;
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.addAll(this.b);
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        arrayList = this.c;
                    }
                } else if (i2 == 10 && i == 0) {
                    arrayList.addAll(this.f);
                }
            } else if (i == 0) {
                arrayList.addAll(this.g);
            }
            map.put(c0578He, arrayList);
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 = ((I61) it.next()).c(list) != null;
            if (z2) {
                break;
            }
        }
        return z2;
    }

    public final void b() throws NumberFormatException {
        Size size;
        Size size2;
        int i;
        InterfaceC2577cm interfaceC2577cm;
        CamcorderProfile camcorderProfileA;
        CamcorderProfile camcorderProfileA2;
        Size sizeE = this.u.e();
        try {
            i = Integer.parseInt(this.i);
            interfaceC2577cm = this.j;
            camcorderProfileA = null;
            camcorderProfileA2 = interfaceC2577cm.j(i, 1) ? interfaceC2577cm.a(i, 1) : null;
        } catch (NumberFormatException unused) {
            Size[] outputSizes = ((StreamConfigurationMap) ((C6273oT0) this.k.b().a).a).getOutputSizes(MediaRecorder.class);
            if (outputSizes != null) {
                Arrays.sort(outputSizes, new C3479dv(true));
                int length = outputSizes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        size = AbstractC3696f21.d;
                        break;
                    }
                    Size size3 = outputSizes[i2];
                    int width = size3.getWidth();
                    Size size4 = AbstractC3696f21.f;
                    if (width <= size4.getWidth() && size3.getHeight() <= size4.getHeight()) {
                        size = size3;
                        break;
                    }
                    i2++;
                }
            } else {
                size = AbstractC3696f21.d;
            }
        }
        if (camcorderProfileA2 != null) {
            size2 = new Size(camcorderProfileA2.videoFrameWidth, camcorderProfileA2.videoFrameHeight);
            this.s = new C1201Pe(AbstractC3696f21.c, new HashMap(), sizeE, new HashMap(), size2, new HashMap(), new HashMap());
        }
        size = AbstractC3696f21.d;
        if (interfaceC2577cm.j(i, 10)) {
            camcorderProfileA = interfaceC2577cm.a(i, 10);
        } else if (interfaceC2577cm.j(i, 8)) {
            camcorderProfileA = interfaceC2577cm.a(i, 8);
        } else if (interfaceC2577cm.j(i, 12)) {
            camcorderProfileA = interfaceC2577cm.a(i, 12);
        } else if (interfaceC2577cm.j(i, 6)) {
            camcorderProfileA = interfaceC2577cm.a(i, 6);
        } else if (interfaceC2577cm.j(i, 5)) {
            camcorderProfileA = interfaceC2577cm.a(i, 5);
        } else if (interfaceC2577cm.j(i, 4)) {
            camcorderProfileA = interfaceC2577cm.a(i, 4);
        }
        if (camcorderProfileA != null) {
            size = new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight);
        }
        size2 = size;
        this.s = new C1201Pe(AbstractC3696f21.c, new HashMap(), sizeE, new HashMap(), size2, new HashMap(), new HashMap());
    }

    public final List d(C0578He c0578He, List list) {
        C0572Hc c0572Hc = AbstractC6011n51.a;
        if (c0578He.a == 0 && c0578He.b == 8) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                List listC = ((I61) it.next()).c(list);
                if (listC != null) {
                    return listC;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair g(int r40, java.util.ArrayList r41, java.util.HashMap r42, boolean r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 3933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.H61.g(int, java.util.ArrayList, java.util.HashMap, boolean, boolean):android.util.Pair");
    }

    public final Pair h(int i, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i2, HashMap map, HashMap map2) {
        int outputMinFrameDuration;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6681qc c6681qc = (C6681qc) it.next();
            arrayList4.add(c6681qc.a);
            if (map != null) {
                map.put(Integer.valueOf(arrayList4.size() - 1), c6681qc);
            }
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            Size size = (Size) list.get(i3);
            InterfaceC5361jh1 interfaceC5361jh1 = (InterfaceC5361jh1) arrayList2.get(((Integer) arrayList3.get(i3)).intValue());
            int iP = interfaceC5361jh1.p();
            arrayList4.add(C0656Ie.b(i, iP, size, i(iP)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList4.size() - 1), interfaceC5361jh1);
            }
            try {
                outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(interfaceC5361jh1.p(), size));
            } catch (Exception unused) {
                outputMinFrameDuration = 0;
            }
            i2 = Math.min(i2, outputMinFrameDuration);
        }
        return new Pair(arrayList4, Integer.valueOf(i2));
    }

    public final C1201Pe i(int i) {
        StreamConfigurationMap streamConfigurationMap;
        ArrayList arrayList = this.t;
        if (!arrayList.contains(Integer.valueOf(i))) {
            j(this.s.b, AbstractC3696f21.e, i);
            j(this.s.d, AbstractC3696f21.g, i);
            HashMap map = this.s.f;
            C0527Gn c0527Gn = this.k;
            Size sizeC = c((StreamConfigurationMap) ((C6273oT0) c0527Gn.b().a).a, i, true);
            if (sizeC != null) {
                map.put(Integer.valueOf(i), sizeC);
            }
            HashMap map2 = this.s.g;
            if (Build.VERSION.SDK_INT >= 31 && this.r && (streamConfigurationMap = (StreamConfigurationMap) c0527Gn.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map2.put(Integer.valueOf(i), c(streamConfigurationMap, i, true));
            }
            arrayList.add(Integer.valueOf(i));
        }
        return this.s;
    }

    public final void j(HashMap map, Size size, int i) {
        if (this.p) {
            Size sizeC = c((StreamConfigurationMap) ((C6273oT0) this.k.b().a).a, i, false);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeC != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeC), new C3479dv(false));
            }
            map.put(numValueOf, size);
        }
    }
}

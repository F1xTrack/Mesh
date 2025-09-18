package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.lifecycle.LifecycleCamera;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: rR1 */
/* loaded from: classes.dex */
public abstract class AbstractC6840rR1 {
    public static final void a(String str, C3840fo c3840fo, AbstractC5762lo abstractC5762lo, InterfaceC6099nZ interfaceC6099nZ) throws AbstractC5762lo {
        if (c3840fo == null) {
            throw new C5837mB0(str);
        }
        if (!((Boolean) interfaceC6099nZ.invoke(c3840fo)).booleanValue()) {
            throw abstractC5762lo;
        }
    }

    public static final Collection b(Collection collection, Collection collection2) {
        O90.f(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x025f A[Catch: all -> 0x02b9, TryCatch #1 {all -> 0x02b9, blocks: (B:226:0x0257, B:231:0x0269, B:236:0x02bb, B:237:0x02c2, B:229:0x025f), top: B:247:0x0257 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0269 A[Catch: all -> 0x02b9, TRY_LEAVE, TryCatch #1 {all -> 0x02b9, blocks: (B:226:0x0257, B:231:0x0269, B:236:0x02bb, B:237:0x02c2, B:229:0x025f), top: B:247:0x0257 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02bb A[Catch: all -> 0x02b9, TRY_ENTER, TryCatch #1 {all -> 0x02b9, blocks: (B:226:0x0257, B:231:0x0269, B:236:0x02bb, B:237:0x02c2, B:229:0x025f), top: B:247:0x0257 }] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v11, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.C0920Lo r21, defpackage.CD0 r22, defpackage.C1696Vn r23, defpackage.AbstractC1963Yy r24) throws defpackage.C6526po {
        /*
            Method dump skipped, instructions count: 743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6840rR1.c(Lo, CD0, Vn, Yy):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object, java.util.Map] */
    public static final void d(C0920Lo c0920Lo, C1696Vn c1696Vn) throws AbstractC5762lo {
        String str;
        C1384Rn c1384Rn;
        EnumC1608Uj1 enumC1608Uj1;
        C1538Tm0 c1538Tm0;
        String str2;
        int i;
        C1538Tm0 c1538Tm02;
        Integer numValueOf;
        int iA;
        EncoderProfiles all;
        int i2;
        int i3;
        int i4;
        char c;
        Integer num;
        String str3 = c1696Vn.a;
        O90.c(str3);
        Integer num2 = c1696Vn.g;
        Range range = (num2 == null || (num = c1696Vn.h) == null) ? null : new Range(num2, num);
        C3840fo c3840fo = c1696Vn.k;
        Objects.toString(range);
        WQ1 wq1 = c1696Vn.c;
        C1384Rn c1384Rn2 = wq1 instanceof C1384Rn ? (C1384Rn) wq1 : null;
        WQ1 wq12 = c1696Vn.d;
        C1384Rn c1384Rn3 = wq12 instanceof C1384Rn ? (C1384Rn) wq12 : null;
        WQ1 wq13 = c1696Vn.b;
        C1384Rn c1384Rn4 = wq13 instanceof C1384Rn ? (C1384Rn) wq13 : null;
        EnumC1608Uj1 enumC1608Uj12 = c1696Vn.n;
        C1538Tm0 c1538Tm03 = C1538Tm0.b;
        if (c1384Rn4 != null) {
            C3709f60 c3709f60 = new C3709f60(2);
            C3759fN c3759fN = EnumC1608Uj1.b;
            int iOrdinal = enumC1608Uj12.ordinal();
            if (iOrdinal == 0) {
                c = 0;
            } else if (iOrdinal == 1) {
                c = 1;
            } else if (iOrdinal == 2) {
                c = 2;
            } else {
                if (iOrdinal != 3) {
                    throw new C7074sg();
                }
                c = 3;
            }
            boolean z = c >= 2;
            C0468Ft0 c0468Ft0 = c3709f60.b;
            if (z) {
                enumC1608Uj1 = enumC1608Uj12;
                c1384Rn = c1384Rn2;
                a("videoStabilizationMode", c3840fo, new C6526po(enumC1608Uj12), new C1153Oo(c1696Vn, 0));
                c0468Ft0.e(InterfaceC5361jh1.d1, 2);
            } else {
                c1384Rn = c1384Rn2;
                enumC1608Uj1 = enumC1608Uj12;
            }
            if (range != null) {
                Object upper = range.getUpper();
                O90.e(upper, "getUpper(...)");
                a("fps", c3840fo, new C6526po(((Number) upper).intValue()), new C1075No(range, 1));
                c0468Ft0.e(InterfaceC5361jh1.Z0, range);
            }
            if (c3840fo != null) {
                str = "fps";
                c0468Ft0.e(Y60.I0, new C3775fS0(c1538Tm03, null, new C1724Vw0(11, c1384Rn3 != null ? c3840fo.a() : new Size(c3840fo.c, c3840fo.d)), 0));
            } else {
                str = "fps";
            }
            C3539eD0 c3539eD0F = c3709f60.f();
            X60.g(c3539eD0F);
            C3349dD0 c3349dD0 = new C3349dD0(c3539eD0F);
            c3349dD0.p = C3349dD0.w;
            c3349dD0.H(((C1540Tn) c1384Rn4.a).a);
            c0920Lo.f = c3349dD0;
        } else {
            str = "fps";
            c1384Rn = c1384Rn2;
            enumC1608Uj1 = enumC1608Uj12;
            c0920Lo.f = null;
        }
        if (c1384Rn != null) {
            C3709f60 c3709f602 = new C3709f60(1);
            int iOrdinal2 = ((C1462Sn) c1384Rn.a).c.ordinal();
            if (iOrdinal2 == 0) {
                i4 = 1;
            } else if (iOrdinal2 == 1) {
                i4 = 2;
            } else {
                if (iOrdinal2 != 2) {
                    throw new C7074sg();
                }
                i4 = 0;
            }
            C0572Hc c0572Hc = C7540v60.b;
            Integer numValueOf2 = Integer.valueOf(i4);
            C0468Ft0 c0468Ft02 = c3709f602.b;
            c0468Ft02.e(c0572Hc, numValueOf2);
            if (c3840fo != null) {
                int i5 = c3840fo.c;
                int i6 = c3840fo.d;
                new Size(i5, i6).toString();
                c0468Ft02.e(Y60.I0, new C3775fS0(c1538Tm03, null, new C1724Vw0(11, new Size(i5, i6)), 1));
            }
            c0920Lo.g = c3709f602.a();
        } else {
            c0920Lo.g = null;
        }
        if (c1384Rn3 != null) {
            C3954gO0 c3954gO0 = c0920Lo.n;
            C4145hO0 c4145hO0 = c0920Lo.r;
            Object obj = c1384Rn3.a;
            if (c4145hO0 == null || c3954gO0 == null) {
                C7008sK c7008sK = new C7008sK();
                C2199an c2199an = C3954gO0.o0;
                c7008sK.c = c2199an;
                c7008sK.d = c2199an;
                c7008sK.e = C3954gO0.p0;
                c7008sK.a = -1L;
                C5772lr0 c5772lr0 = new C5772lr0(4);
                c5772lr0.d = -1;
                c5772lr0.c = C7253tc.a().a();
                c5772lr0.b = C1903Ye.a().q();
                c7008sK.b = c5772lr0;
                C5772lr0 c5772lr02 = (C5772lr0) c7008sK.b;
                if (c3840fo != null) {
                    Size sizeA = c3840fo.a();
                    int height = sizeA.getHeight() * sizeA.getWidth();
                    Iterator it = c3840fo.o.entrySet().iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Object next = it.next();
                    if (it.hasNext()) {
                        int iAbs = Math.abs(height - ((Number) ((Map.Entry) next).getValue()).intValue());
                        while (true) {
                            Object next2 = it.next();
                            int i7 = height;
                            int iAbs2 = Math.abs(height - ((Number) ((Map.Entry) next2).getValue()).intValue());
                            if (iAbs > iAbs2) {
                                iAbs = iAbs2;
                                next = next2;
                            }
                            if (!it.hasNext()) {
                                break;
                            } else {
                                height = i7;
                            }
                        }
                    }
                    C6496pe c6496pe = (C6496pe) ((Map.Entry) next).getKey();
                    C0575Hd c0575Hd = new C0575Hd(c6496pe, 1);
                    AbstractC3377dM1.d("Invalid quality: " + c6496pe, C6496pe.k.contains(c6496pe));
                    C3383dO1 c3383dO1 = new C3383dO1(Collections.singletonList(c6496pe), c0575Hd);
                    C1903Ye c1903Ye = (C1903Ye) c5772lr02.b;
                    if (c1903Ye == null) {
                        throw new IllegalStateException("Property \"videoSpec\" has not been set");
                    }
                    C6860rY0 c6860rY0 = new C6860rY0(3, false);
                    c6860rY0.b = c1903Ye.a;
                    c6860rY0.c = c1903Ye.b;
                    c6860rY0.d = c1903Ye.c;
                    c6860rY0.e = Integer.valueOf(c1903Ye.d);
                    c6860rY0.b = c3383dO1;
                    c5772lr02.b = c6860rY0.q();
                }
                C1618Un c1618Un = (C1618Un) obj;
                Double d = c1618Un.c;
                if (d != null) {
                    c1538Tm02 = c1538Tm03;
                    c7008sK.c((int) (d.doubleValue() * 1000000));
                } else {
                    c1538Tm02 = c1538Tm03;
                }
                Double d2 = c1618Un.d;
                if (d2 != null) {
                    double dDoubleValue = d2.doubleValue();
                    if (c3840fo == null) {
                        throw new C5837mB0("videoBitRate");
                    }
                    try {
                        iA = IQ1.a(str3, c3840fo.a(), true);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (Build.VERSION.SDK_INT < 31 || (all = CamcorderProfile.getAll(str3, iA)) == null) {
                        Integer numF = C51.f(str3);
                        numValueOf = numF != null ? Integer.valueOf(CamcorderProfile.get(numF.intValue(), iA).videoBitRate) : null;
                    } else {
                        List videoProfiles = all.getVideoProfiles();
                        O90.e(videoProfiles, "getVideoProfiles(...)");
                        Iterator it2 = videoProfiles.iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Integer numValueOf3 = Integer.valueOf(T9.i(it2.next()).getBitrate());
                        while (it2.hasNext()) {
                            Integer numValueOf4 = Integer.valueOf(T9.i(it2.next()).getBitrate());
                            if (numValueOf3.compareTo(numValueOf4) < 0) {
                                numValueOf3 = numValueOf4;
                            }
                        }
                        numValueOf = numValueOf3;
                    }
                    if (numValueOf != null) {
                        c7008sK.c((int) (numValueOf.intValue() * dDoubleValue));
                    }
                }
                String strI = ((C1903Ye) c5772lr02.b) == null ? " videoSpec" : "";
                if (((C7253tc) c5772lr02.c) == null) {
                    strI = strI.concat(" audioSpec");
                }
                if (((Integer) c5772lr02.d) == null) {
                    strI = AbstractC8235ym.i(strI, " outputFormat");
                }
                if (!strI.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:".concat(strI));
                }
                c3954gO0 = new C3954gO0(new C1978Zd((C1903Ye) c5772lr02.b, (C7253tc) c5772lr02.c, ((Integer) c5772lr02.d).intValue()), (C2199an) c7008sK.c, (C2199an) c7008sK.d, (C2199an) c7008sK.e, c7008sK.a);
            } else {
                c1538Tm02 = c1538Tm03;
            }
            C1618Un c1618Un2 = (C1618Un) obj;
            C0468Ft0 c0468Ft03 = new C3709f60(c3954gO0).b;
            if (c1618Un2.a) {
                c0468Ft03.e(Y60.D0, 1);
            } else {
                c0468Ft03.e(Y60.D0, 0);
            }
            C3759fN c3759fN2 = EnumC1608Uj1.b;
            int iOrdinal3 = enumC1608Uj1.ordinal();
            if (iOrdinal3 == 0) {
                i2 = 1;
                i3 = 0;
            } else if (iOrdinal3 == 1) {
                i2 = 1;
                i3 = 1;
            } else if (iOrdinal3 != 2) {
                i3 = 3;
                if (iOrdinal3 != 3) {
                    throw new C7074sg();
                }
                i2 = 1;
            } else {
                i2 = 1;
                i3 = 2;
            }
            if ((i3 >= i2 ? i2 : 0) != 0) {
                a("videoStabilizationMode", c3840fo, new C6526po(enumC1608Uj1), new C1153Oo(c1696Vn, i2));
                c0468Ft03.e(InterfaceC5361jh1.e1, 2);
            }
            if (range != null) {
                Object upper2 = range.getUpper();
                O90.e(upper2, "getUpper(...)");
                i = 2;
                str2 = str;
                a(str2, c3840fo, new C6526po(((Number) upper2).intValue()), new C1075No(range, 2));
                c0468Ft03.e(InterfaceC5361jh1.Z0, range);
            } else {
                str2 = str;
                i = 2;
            }
            if (c1618Un2.b) {
                C6526po c6526po = new C6526po("format", "invalid-video-hdr", "The given format does not support videoHdr! Select a format where `format.supportsVideoHdr` is true.", null);
                if (c3840fo == null) {
                    throw new C5837mB0("videoHdr");
                }
                if (!c3840fo.l) {
                    throw c6526po;
                }
                c0468Ft03.e(M60.z0, CM.e);
            }
            if (c3840fo != null) {
                c3840fo.a().toString();
                c1538Tm0 = c1538Tm02;
                c0468Ft03.e(Y60.I0, new C3775fS0(c1538Tm0, null, new C1724Vw0(11, c3840fo.a()), 0));
            } else {
                c1538Tm0 = c1538Tm02;
            }
            c0920Lo.h = new C1371Ri1(new C1449Si1(C0873Ky0.a(c0468Ft03)));
            c0920Lo.n = c3954gO0;
        } else {
            c1538Tm0 = c1538Tm03;
            str2 = str;
            i = 2;
            c0920Lo.h = null;
            c0920Lo.n = null;
        }
        WQ1 wq14 = c1696Vn.e;
        C1384Rn c1384Rn5 = wq14 instanceof C1384Rn ? (C1384Rn) wq14 : null;
        C4034gp c4034gp = c0920Lo.b;
        if (c1384Rn5 != null) {
            EnumC5646lB0 enumC5646lB0 = ((C1228Pn) c1384Rn5.a).b;
            Objects.toString(enumC5646lB0);
            C3709f60 c3709f603 = new C3709f60(0);
            C0572Hc c0572Hc2 = C6013n60.b;
            int i8 = 1;
            C0468Ft0 c0468Ft04 = c3709f603.b;
            c0468Ft04.e(c0572Hc2, 1);
            int iOrdinal4 = enumC5646lB0.ordinal();
            if (iOrdinal4 != 0) {
                if (iOrdinal4 != 1) {
                    throw new C5837mB0("device", "pixel-format-not-supported", AbstractC8235ym.k("The pixelFormat ", enumC5646lB0.a, " is not supported on the given Camera Device!"), null);
                }
                i8 = i;
            }
            c0468Ft04.e(C6013n60.e, Integer.valueOf(i8));
            if (range != null) {
                Object upper3 = range.getUpper();
                O90.e(upper3, "getUpper(...)");
                a(str2, c3840fo, new C6526po(((Number) upper3).intValue()), new C1075No(range, 0));
                c0468Ft04.d(C3456dn.L0(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), EnumC6931rw.a, range);
            }
            if (c3840fo != null) {
                c3840fo.a().toString();
                c0468Ft04.e(Y60.I0, new C3775fS0(c1538Tm0, null, new C1724Vw0(11, c3840fo.a()), 0));
            }
            C6013n60 c6013n60B = c3709f603.b();
            X60.g(c6013n60B);
            C4282i60 c4282i60 = new C4282i60(c6013n60B);
            c4282i60.H((Executor) AbstractC0608Ho.c.d, new C1562Tu0(16, c4034gp));
            c0920Lo.i = c4282i60;
        } else {
            c0920Lo.i = null;
        }
        WQ1 wq15 = c1696Vn.f;
        C1384Rn c1384Rn6 = wq15 instanceof C1384Rn ? (C1384Rn) wq15 : null;
        if (c1384Rn6 == null) {
            c0920Lo.j = null;
            return;
        }
        C6013n60 c6013n60B2 = new C3709f60(0).b();
        X60.g(c6013n60B2);
        C4282i60 c4282i602 = new C4282i60(c6013n60B2);
        c4282i602.H(AbstractC0608Ho.a, new XY((C1072Nn) c1384Rn6.a, c4034gp));
        c0920Lo.j = c4282i602;
    }

    public static final void e(C0920Lo c0920Lo, C1696Vn c1696Vn) throws C6526po {
        O90.f(c0920Lo, "<this>");
        O90.f(c1696Vn, "config");
        LifecycleCamera lifecycleCamera = c0920Lo.e;
        if (lifecycleCamera == null) {
            throw new C6526po(2, false);
        }
        C1933Yo c1933Yo = lifecycleCamera.c;
        InterfaceC1548Tp1 interfaceC1548Tp1 = (InterfaceC1548Tp1) c1933Yo.q.x().d();
        Float fValueOf = interfaceC1548Tp1 != null ? Float.valueOf(interfaceC1548Tp1.c()) : null;
        float f = c1696Vn.p;
        if (fValueOf == null || fValueOf.floatValue() != f) {
            c1933Yo.p.L(c1696Vn.p);
        }
        Integer num = (Integer) c1933Yo.q.f().d();
        boolean z = num != null && num.intValue() == 1;
        boolean z2 = c1696Vn.m == EnumC6870rb1.d;
        if (z != z2) {
            if (z2 && !c1933Yo.q.r()) {
                throw new C6526po(8, false);
            }
            c1933Yo.p.h0(z2);
        }
        int iA = c1933Yo.q.h().a();
        Double d = c1696Vn.o;
        int iA2 = d != null ? AbstractC3857ft1.a(d.doubleValue()) : 0;
        if (iA != iA2) {
            c1933Yo.p.r0(iA2);
        }
    }

    public static final C7718w21 f(ArrayList arrayList) {
        C7718w21 c7718w21 = new C7718w21();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC5578kq0 interfaceC5578kq0 = (InterfaceC5578kq0) next;
            if (interfaceC5578kq0 != null && interfaceC5578kq0 != C5387jq0.b) {
                c7718w21.add(next);
            }
        }
        return c7718w21;
    }
}

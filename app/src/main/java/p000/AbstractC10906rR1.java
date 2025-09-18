package p000;

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
public abstract class AbstractC10906rR1 {
    /* renamed from: a */
    public static final void m24336a(String str, C4076fo c4076fo, AbstractC6386lo abstractC6386lo, InterfaceC6497nZ interfaceC6497nZ) throws AbstractC6386lo {
        if (c4076fo == null) {
            throw new C10233mB0(str);
        }
        if (!((Boolean) interfaceC6497nZ.invoke(c4076fo)).booleanValue()) {
            throw abstractC6386lo;
        }
    }

    /* renamed from: b */
    public static final Collection m24337b(Collection collection, Collection collection2) {
        O90.m5968f(collection2, "collection");
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
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m24338c(p000.C0743Lo r21, p000.CD0 r22, p000.C1371Vn r23, p000.AbstractC1571Yy r24) throws p000.C6640po {
        /*
            Method dump skipped, instructions count: 743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10906rR1.m24338c(Lo, CD0, Vn, Yy):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object, java.util.Map] */
    /* renamed from: d */
    public static final void m24339d(C0743Lo c0743Lo, C1371Vn c1371Vn) throws AbstractC6386lo {
        String str;
        C1119Rn c1119Rn;
        EnumC8373Uj1 enumC8373Uj1;
        C8326Tm0 c8326Tm0;
        String str2;
        int i;
        C8326Tm0 c8326Tm02;
        Integer numValueOf;
        int iM3858a;
        EncoderProfiles all;
        int i2;
        int i3;
        int i4;
        char c;
        Integer num;
        String str3 = c1371Vn.f12732a;
        O90.m5965c(str3);
        Integer num2 = c1371Vn.f12738g;
        Range range = (num2 == null || (num = c1371Vn.f12739h) == null) ? null : new Range(num2, num);
        C4076fo c4076fo = c1371Vn.f12742k;
        Objects.toString(range);
        WQ1 wq1 = c1371Vn.f12734c;
        C1119Rn c1119Rn2 = wq1 instanceof C1119Rn ? (C1119Rn) wq1 : null;
        WQ1 wq12 = c1371Vn.f12735d;
        C1119Rn c1119Rn3 = wq12 instanceof C1119Rn ? (C1119Rn) wq12 : null;
        WQ1 wq13 = c1371Vn.f12733b;
        C1119Rn c1119Rn4 = wq13 instanceof C1119Rn ? (C1119Rn) wq13 : null;
        EnumC8373Uj1 enumC8373Uj12 = c1371Vn.f12745n;
        C8326Tm0 c8326Tm03 = C8326Tm0.f11505b;
        if (c1119Rn4 != null) {
            C9327f60 c9327f60 = new C9327f60(2);
            C4049fN c4049fN = EnumC8373Uj1.f12007b;
            int iOrdinal = enumC8373Uj12.ordinal();
            if (iOrdinal == 0) {
                c = 0;
            } else if (iOrdinal == 1) {
                c = 1;
            } else if (iOrdinal == 2) {
                c = 2;
            } else {
                if (iOrdinal != 3) {
                    throw new C6838sg();
                }
                c = 3;
            }
            boolean z = c >= 2;
            C7612Ft0 c7612Ft0 = c9327f60.f27076b;
            if (z) {
                enumC8373Uj1 = enumC8373Uj12;
                c1119Rn = c1119Rn2;
                m24336a("videoStabilizationMode", c4076fo, new C6640po(enumC8373Uj12), new C0932Oo(c1371Vn, 0));
                c7612Ft0.m2815e(InterfaceC9914jh1.f35333d1, 2);
            } else {
                c1119Rn = c1119Rn2;
                enumC8373Uj1 = enumC8373Uj12;
            }
            if (range != null) {
                Object upper = range.getUpper();
                O90.m5967e(upper, "getUpper(...)");
                m24336a("fps", c4076fo, new C6640po(((Number) upper).intValue()), new C0869No(range, 1));
                c7612Ft0.m2815e(InterfaceC9914jh1.f35329Z0, range);
            }
            if (c4076fo != null) {
                str = "fps";
                c7612Ft0.m2815e(Y60.f14167I0, new C9371fS0(c8326Tm03, null, new C8450Vw0(11, c1119Rn3 != null ? c4076fo.m18296a() : new Size(c4076fo.f27389c, c4076fo.f27390d)), 0));
            } else {
                str = "fps";
            }
            C9213eD0 c9213eD0M18191f = c9327f60.m18191f();
            X60.m8934g(c9213eD0M18191f);
            C9085dD0 c9085dD0 = new C9085dD0(c9213eD0M18191f);
            c9085dD0.f25882p = C9085dD0.f25880w;
            c9085dD0.m17506H(((C1245Tn) c1119Rn4.f10414a).f11515a);
            c0743Lo.f6861f = c9085dD0;
        } else {
            str = "fps";
            c1119Rn = c1119Rn2;
            enumC8373Uj1 = enumC8373Uj12;
            c0743Lo.f6861f = null;
        }
        if (c1119Rn != null) {
            C9327f60 c9327f602 = new C9327f60(1);
            int iOrdinal2 = ((C1182Sn) c1119Rn.f10414a).f10979c.ordinal();
            if (iOrdinal2 == 0) {
                i4 = 1;
            } else if (iOrdinal2 == 1) {
                i4 = 2;
            } else {
                if (iOrdinal2 != 2) {
                    throw new C6838sg();
                }
                i4 = 0;
            }
            C0480Hc c0480Hc = C11375v60.f44147b;
            Integer numValueOf2 = Integer.valueOf(i4);
            C7612Ft0 c7612Ft02 = c9327f602.f27076b;
            c7612Ft02.m2815e(c0480Hc, numValueOf2);
            if (c4076fo != null) {
                int i5 = c4076fo.f27389c;
                int i6 = c4076fo.f27390d;
                new Size(i5, i6).toString();
                c7612Ft02.m2815e(Y60.f14167I0, new C9371fS0(c8326Tm03, null, new C8450Vw0(11, new Size(i5, i6)), 1));
            }
            c0743Lo.f6862g = c9327f602.m18188a();
        } else {
            c0743Lo.f6862g = null;
        }
        if (c1119Rn3 != null) {
            C9491gO0 c9491gO0 = c0743Lo.f6869n;
            C9619hO0 c9619hO0 = c0743Lo.f6873r;
            Object obj = c1119Rn3.f10414a;
            if (c9619hO0 == null || c9491gO0 == null) {
                C6816sK c6816sK = new C6816sK();
                C1686an c1686an = C9491gO0.f27714o0;
                c6816sK.f42365c = c1686an;
                c6816sK.f42366d = c1686an;
                c6816sK.f42367e = C9491gO0.f27715p0;
                c6816sK.f42363a = -1L;
                C10189lr0 c10189lr0 = new C10189lr0(4);
                c10189lr0.f37325d = -1;
                c10189lr0.f37324c = C6897tc.m24946a().m23115a();
                c10189lr0.f37323b = C1551Ye.m9333a().m24419q();
                c6816sK.f42364b = c10189lr0;
                C10189lr0 c10189lr02 = (C10189lr0) c6816sK.f42364b;
                if (c4076fo != null) {
                    Size sizeM18296a = c4076fo.m18296a();
                    int height = sizeM18296a.getHeight() * sizeM18296a.getWidth();
                    Iterator it = c4076fo.f27401o.entrySet().iterator();
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
                    C6630pe c6630pe = (C6630pe) ((Map.Entry) next).getKey();
                    C0481Hd c0481Hd = new C0481Hd(c6630pe, 1);
                    AbstractC9104dM1.m17545d("Invalid quality: " + c6630pe, C6630pe.f40255k.contains(c6630pe));
                    C9108dO1 c9108dO1 = new C9108dO1(Collections.singletonList(c6630pe), c0481Hd);
                    C1551Ye c1551Ye = (C1551Ye) c10189lr02.f37323b;
                    if (c1551Ye == null) {
                        throw new IllegalStateException("Property \"videoSpec\" has not been set");
                    }
                    C10919rY0 c10919rY0 = new C10919rY0(3, false);
                    c10919rY0.f41728b = c1551Ye.f14409a;
                    c10919rY0.f41729c = c1551Ye.f14410b;
                    c10919rY0.f41730d = c1551Ye.f14411c;
                    c10919rY0.f41731e = Integer.valueOf(c1551Ye.f14412d);
                    c10919rY0.f41728b = c9108dO1;
                    c10189lr02.f37323b = c10919rY0.m24419q();
                }
                C1308Un c1308Un = (C1308Un) obj;
                Double d = c1308Un.f12045c;
                if (d != null) {
                    c8326Tm02 = c8326Tm03;
                    c6816sK.m24711c((int) (d.doubleValue() * 1000000));
                } else {
                    c8326Tm02 = c8326Tm03;
                }
                Double d2 = c1308Un.f12046d;
                if (d2 != null) {
                    double dDoubleValue = d2.doubleValue();
                    if (c4076fo == null) {
                        throw new C10233mB0("videoBitRate");
                    }
                    try {
                        iM3858a = IQ1.m3858a(str3, c4076fo.m18296a(), true);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (Build.VERSION.SDK_INT < 31 || (all = CamcorderProfile.getAll(str3, iM3858a)) == null) {
                        Integer numM979f = C51.m979f(str3);
                        numValueOf = numM979f != null ? Integer.valueOf(CamcorderProfile.get(numM979f.intValue(), iM3858a).videoBitRate) : null;
                    } else {
                        List videoProfiles = all.getVideoProfiles();
                        O90.m5967e(videoProfiles, "getVideoProfiles(...)");
                        Iterator it2 = videoProfiles.iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Integer numValueOf3 = Integer.valueOf(AbstractC1205T9.m7590i(it2.next()).getBitrate());
                        while (it2.hasNext()) {
                            Integer numValueOf4 = Integer.valueOf(AbstractC1205T9.m7590i(it2.next()).getBitrate());
                            if (numValueOf3.compareTo(numValueOf4) < 0) {
                                numValueOf3 = numValueOf4;
                            }
                        }
                        numValueOf = numValueOf3;
                    }
                    if (numValueOf != null) {
                        c6816sK.m24711c((int) (numValueOf.intValue() * dDoubleValue));
                    }
                }
                String strM26232i = ((C1551Ye) c10189lr02.f37323b) == null ? " videoSpec" : "";
                if (((C6897tc) c10189lr02.f37324c) == null) {
                    strM26232i = strM26232i.concat(" audioSpec");
                }
                if (((Integer) c10189lr02.f37325d) == null) {
                    strM26232i = AbstractC7222ym.m26232i(strM26232i, " outputFormat");
                }
                if (!strM26232i.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:".concat(strM26232i));
                }
                c9491gO0 = new C9491gO0(new C1613Zd((C1551Ye) c10189lr02.f37323b, (C6897tc) c10189lr02.f37324c, ((Integer) c10189lr02.f37325d).intValue()), (C1686an) c6816sK.f42365c, (C1686an) c6816sK.f42366d, (C1686an) c6816sK.f42367e, c6816sK.f42363a);
            } else {
                c8326Tm02 = c8326Tm03;
            }
            C1308Un c1308Un2 = (C1308Un) obj;
            C7612Ft0 c7612Ft03 = new C9327f60(c9491gO0).f27076b;
            if (c1308Un2.f12043a) {
                c7612Ft03.m2815e(Y60.f14162D0, 1);
            } else {
                c7612Ft03.m2815e(Y60.f14162D0, 0);
            }
            C4049fN c4049fN2 = EnumC8373Uj1.f12007b;
            int iOrdinal3 = enumC8373Uj1.ordinal();
            if (iOrdinal3 == 0) {
                i2 = 1;
                i3 = 0;
            } else if (iOrdinal3 == 1) {
                i2 = 1;
                i3 = 1;
            } else if (iOrdinal3 != 2) {
                i3 = 3;
                if (iOrdinal3 != 3) {
                    throw new C6838sg();
                }
                i2 = 1;
            } else {
                i2 = 1;
                i3 = 2;
            }
            if ((i3 >= i2 ? i2 : 0) != 0) {
                m24336a("videoStabilizationMode", c4076fo, new C6640po(enumC8373Uj1), new C0932Oo(c1371Vn, i2));
                c7612Ft03.m2815e(InterfaceC9914jh1.f35334e1, 2);
            }
            if (range != null) {
                Object upper2 = range.getUpper();
                O90.m5967e(upper2, "getUpper(...)");
                i = 2;
                str2 = str;
                m24336a(str2, c4076fo, new C6640po(((Number) upper2).intValue()), new C0869No(range, 2));
                c7612Ft03.m2815e(InterfaceC9914jh1.f35329Z0, range);
            } else {
                str2 = str;
                i = 2;
            }
            if (c1308Un2.f12044b) {
                C6640po c6640po = new C6640po("format", "invalid-video-hdr", "The given format does not support videoHdr! Select a format where `format.supportsVideoHdr` is true.", null);
                if (c4076fo == null) {
                    throw new C10233mB0("videoHdr");
                }
                if (!c4076fo.f27398l) {
                    throw c6640po;
                }
                c7612Ft03.m2815e(M60.f6994z0, C0149CM.f1330e);
            }
            if (c4076fo != null) {
                c4076fo.m18296a().toString();
                c8326Tm0 = c8326Tm02;
                c7612Ft03.m2815e(Y60.f14167I0, new C9371fS0(c8326Tm0, null, new C8450Vw0(11, c4076fo.m18296a()), 0));
            } else {
                c8326Tm0 = c8326Tm02;
            }
            c0743Lo.f6863h = new C8215Ri1(new C8267Si1(C7882Ky0.m4786a(c7612Ft03)));
            c0743Lo.f6869n = c9491gO0;
        } else {
            c8326Tm0 = c8326Tm03;
            str2 = str;
            i = 2;
            c0743Lo.f6863h = null;
            c0743Lo.f6869n = null;
        }
        WQ1 wq14 = c1371Vn.f12736e;
        C1119Rn c1119Rn5 = wq14 instanceof C1119Rn ? (C1119Rn) wq14 : null;
        C4140gp c4140gp = c0743Lo.f6857b;
        if (c1119Rn5 != null) {
            EnumC10105lB0 enumC10105lB0 = ((C0994Pn) c1119Rn5.f10414a).f9279b;
            Objects.toString(enumC10105lB0);
            C9327f60 c9327f603 = new C9327f60(0);
            C0480Hc c0480Hc2 = C10351n60.f38104b;
            int i8 = 1;
            C7612Ft0 c7612Ft04 = c9327f603.f27076b;
            c7612Ft04.m2815e(c0480Hc2, 1);
            int iOrdinal4 = enumC10105lB0.ordinal();
            if (iOrdinal4 != 0) {
                if (iOrdinal4 != 1) {
                    throw new C10233mB0("device", "pixel-format-not-supported", AbstractC7222ym.m26234k("The pixelFormat ", enumC10105lB0.f36944a, " is not supported on the given Camera Device!"), null);
                }
                i8 = i;
            }
            c7612Ft04.m2815e(C10351n60.f38107e, Integer.valueOf(i8));
            if (range != null) {
                Object upper3 = range.getUpper();
                O90.m5967e(upper3, "getUpper(...)");
                m24336a(str2, c4076fo, new C6640po(((Number) upper3).intValue()), new C0869No(range, 0));
                c7612Ft04.m2814d(C3950dn.m17743L0(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), EnumC6791rw.f42159a, range);
            }
            if (c4076fo != null) {
                c4076fo.m18296a().toString();
                c7612Ft04.m2815e(Y60.f14167I0, new C9371fS0(c8326Tm0, null, new C8450Vw0(11, c4076fo.m18296a()), 0));
            }
            C10351n60 c10351n60M18189b = c9327f603.m18189b();
            X60.m8934g(c10351n60M18189b);
            C9711i60 c9711i60 = new C9711i60(c10351n60M18189b);
            c9711i60.m18970H((Executor) AbstractC0492Ho.f4511c.f41680d, new C8342Tu0(16, c4140gp));
            c0743Lo.f6864i = c9711i60;
        } else {
            c0743Lo.f6864i = null;
        }
        WQ1 wq15 = c1371Vn.f12737f;
        C1119Rn c1119Rn6 = wq15 instanceof C1119Rn ? (C1119Rn) wq15 : null;
        if (c1119Rn6 == null) {
            c0743Lo.f6865j = null;
            return;
        }
        C10351n60 c10351n60M18189b2 = new C9327f60(0).m18189b();
        X60.m8934g(c10351n60M18189b2);
        C9711i60 c9711i602 = new C9711i60(c10351n60M18189b2);
        c9711i602.m18970H(AbstractC0492Ho.f4509a, new C1482XY((C0868Nn) c1119Rn6.f10414a, c4140gp));
        c0743Lo.f6865j = c9711i602;
    }

    /* renamed from: e */
    public static final void m24340e(C0743Lo c0743Lo, C1371Vn c1371Vn) throws C6640po {
        O90.m5968f(c0743Lo, "<this>");
        O90.m5968f(c1371Vn, "config");
        LifecycleCamera lifecycleCamera = c0743Lo.f6860e;
        if (lifecycleCamera == null) {
            throw new C6640po(2, false);
        }
        C1561Yo c1561Yo = lifecycleCamera.f16029c;
        InterfaceC8333Tp1 interfaceC8333Tp1 = (InterfaceC8333Tp1) c1561Yo.f14544q.mo2412x().mo1868d();
        Float fValueOf = interfaceC8333Tp1 != null ? Float.valueOf(interfaceC8333Tp1.mo6390c()) : null;
        float f = c1371Vn.f12747p;
        if (fValueOf == null || fValueOf.floatValue() != f) {
            c1561Yo.f14543p.mo904L(c1371Vn.f12747p);
        }
        Integer num = (Integer) c1561Yo.f14544q.mo2394f().mo1868d();
        boolean z = num != null && num.intValue() == 1;
        boolean z2 = c1371Vn.f12744m == EnumC10926rb1.f41747d;
        if (z != z2) {
            if (z2 && !c1561Yo.f14544q.mo2406r()) {
                throw new C6640po(8, false);
            }
            c1561Yo.f14543p.mo918h0(z2);
        }
        int iMo909a = c1561Yo.f14544q.mo2396h().mo909a();
        Double d = c1371Vn.f12746o;
        int iM18303a = d != null ? AbstractC9426ft1.m18303a(d.doubleValue()) : 0;
        if (iMo909a != iM18303a) {
            c1561Yo.f14543p.mo924r0(iM18303a);
        }
    }

    /* renamed from: f */
    public static final C11494w21 m24341f(ArrayList arrayList) {
        C11494w21 c11494w21 = new C11494w21();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC10059kq0 interfaceC10059kq0 = (InterfaceC10059kq0) next;
            if (interfaceC10059kq0 != null && interfaceC10059kq0 != C9931jq0.f35419b) {
                c11494w21.add(next);
            }
        }
        return c11494w21;
    }
}

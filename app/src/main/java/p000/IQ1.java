package p000;

import android.content.res.Resources;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class IQ1 {
    /* renamed from: a */
    public static int m3858a(String str, Size size, boolean z) {
        int i;
        int i2;
        int i3;
        int height = size.getHeight() * size.getWidth();
        Integer numM979f = C51.m979f(str);
        C9461g90 c9461g90 = new C9461g90(2, 13, 1);
        ArrayList arrayList = new ArrayList();
        Iterator it = c9461g90.iterator();
        while (true) {
            C9333f90 c9333f90 = (C9333f90) it;
            if (!c9333f90.f27092c) {
                break;
            }
            Object next = c9333f90.next();
            int iIntValue = ((Number) next).intValue();
            if (numM979f != null ? CamcorderProfile.hasProfile(numM979f.intValue(), iIntValue) : CamcorderProfile.hasProfile(iIntValue)) {
                arrayList.add(next);
            }
        }
        if (!z) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int iIntValue2 = ((Number) next2).intValue();
                switch (iIntValue2) {
                    case 2:
                        i3 = 25344;
                        break;
                    case 3:
                        i3 = 101376;
                        break;
                    case 4:
                        i3 = 345600;
                        break;
                    case 5:
                        i3 = 921600;
                        break;
                    case 6:
                        i3 = 2073600;
                        break;
                    case 7:
                        i3 = 76800;
                        break;
                    case 8:
                        i3 = 8294400;
                        break;
                    case 9:
                        i3 = 307200;
                        break;
                    case 10:
                        i3 = 8847360;
                        break;
                    case 11:
                        i3 = 3686400;
                        break;
                    case 12:
                        i3 = 2211840;
                        break;
                    case 13:
                        i3 = 33177600;
                        break;
                    default:
                        throw new Error(AbstractC7222ym.m26230g(iIntValue2, "Invalid CamcorderProfile \"", "\"!"));
                }
                if (i3 <= height) {
                    arrayList2.add(next2);
                }
            }
            arrayList = arrayList2;
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next3 = it3.next();
        if (it3.hasNext()) {
            int iIntValue3 = ((Number) next3).intValue();
            switch (iIntValue3) {
                case 2:
                    i = 25344;
                    break;
                case 3:
                    i = 101376;
                    break;
                case 4:
                    i = 345600;
                    break;
                case 5:
                    i = 921600;
                    break;
                case 6:
                    i = 2073600;
                    break;
                case 7:
                    i = 76800;
                    break;
                case 8:
                    i = 8294400;
                    break;
                case 9:
                    i = 307200;
                    break;
                case 10:
                    i = 8847360;
                    break;
                case 11:
                    i = 3686400;
                    break;
                case 12:
                    i = 2211840;
                    break;
                case 13:
                    i = 33177600;
                    break;
                default:
                    throw new Error(AbstractC7222ym.m26230g(iIntValue3, "Invalid CamcorderProfile \"", "\"!"));
            }
            int iAbs = Math.abs(i - height);
            do {
                Object next4 = it3.next();
                int iIntValue4 = ((Number) next4).intValue();
                switch (iIntValue4) {
                    case 2:
                        i2 = 25344;
                        break;
                    case 3:
                        i2 = 101376;
                        break;
                    case 4:
                        i2 = 345600;
                        break;
                    case 5:
                        i2 = 921600;
                        break;
                    case 6:
                        i2 = 2073600;
                        break;
                    case 7:
                        i2 = 76800;
                        break;
                    case 8:
                        i2 = 8294400;
                        break;
                    case 9:
                        i2 = 307200;
                        break;
                    case 10:
                        i2 = 8847360;
                        break;
                    case 11:
                        i2 = 3686400;
                        break;
                    case 12:
                        i2 = 2211840;
                        break;
                    case 13:
                        i2 = 33177600;
                        break;
                    default:
                        throw new Error(AbstractC7222ym.m26230g(iIntValue4, "Invalid CamcorderProfile \"", "\"!"));
                }
                int iAbs2 = Math.abs(i2 - height);
                if (iAbs > iAbs2) {
                    next3 = next4;
                    iAbs = iAbs2;
                }
            } while (it3.hasNext());
        }
        return ((Number) next3).intValue();
    }

    /* renamed from: b */
    public static Integer m3859b(String str, Size size) {
        EncoderProfiles all;
        O90.m5968f(str, "cameraId");
        try {
            int iM3858a = m3858a(str, size, false);
            if (Build.VERSION.SDK_INT < 31 || (all = CamcorderProfile.getAll(str, iM3858a)) == null) {
                Integer numM979f = C51.m979f(str);
                if (numM979f != null) {
                    return Integer.valueOf(CamcorderProfile.get(numM979f.intValue(), iM3858a).videoFrameRate);
                }
                return null;
            }
            List videoProfiles = all.getVideoProfiles();
            O90.m5967e(videoProfiles, "getVideoProfiles(...)");
            Iterator it = videoProfiles.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Integer numValueOf = Integer.valueOf(AbstractC1205T9.m7590i(it.next()).getFrameRate());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(AbstractC1205T9.m7590i(it.next()).getFrameRate());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            return numValueOf;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* renamed from: c */
    public static void m3860c(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            DS0.m1688a(theme);
            return;
        }
        synchronized (AbstractC11386vB1.f44238a) {
            if (!AbstractC11386vB1.f44240c) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    AbstractC11386vB1.f44239b = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                AbstractC11386vB1.f44240c = true;
            }
            Method method = AbstractC11386vB1.f44239b;
            if (method != null) {
                try {
                    method.invoke(theme, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    AbstractC11386vB1.f44239b = null;
                }
            }
        }
    }
}

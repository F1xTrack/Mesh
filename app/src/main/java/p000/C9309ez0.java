package p000;

import android.util.Size;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: ez0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9309ez0 {

    /* renamed from: a */
    public final List f26987a;

    /* renamed from: b */
    public final Size f26988b;

    /* renamed from: c */
    public final int f26989c;

    /* renamed from: d */
    public final int f26990d;

    /* renamed from: e */
    public String f26991e;

    /* renamed from: f */
    public boolean f26992f = false;

    /* renamed from: g */
    public long f26993g = 1;

    public C9309ez0(Surface surface) throws NoSuchMethodException, SecurityException {
        Size size;
        int iIntValue;
        int iIntValue2 = 0;
        this.f26987a = Collections.singletonList(surface);
        try {
            Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
            declaredMethod.setAccessible(true);
            size = (Size) declaredMethod.invoke(null, surface);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            AbstractC7806Jm0.m4412f("OutputConfigCompat");
            size = null;
        }
        this.f26988b = size;
        try {
            iIntValue2 = ((Integer) Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class).invoke(null, surface)).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            AbstractC7806Jm0.m4412f("OutputConfigCompat");
        }
        this.f26989c = iIntValue2;
        try {
            iIntValue = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", null).invoke(surface, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
            AbstractC7806Jm0.m4412f("OutputConfigCompat");
            iIntValue = -1;
        }
        this.f26990d = iIntValue;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9309ez0)) {
            return false;
        }
        C9309ez0 c9309ez0 = (C9309ez0) obj;
        if (!this.f26988b.equals(c9309ez0.f26988b) || this.f26989c != c9309ez0.f26989c || this.f26990d != c9309ez0.f26990d || this.f26992f != c9309ez0.f26992f || this.f26993g != c9309ez0.f26993g || !Objects.equals(this.f26991e, c9309ez0.f26991e)) {
            return false;
        }
        List list = this.f26987a;
        int size = list.size();
        List list2 = c9309ez0.f26987a;
        int iMin = Math.min(size, list2.size());
        for (int i = 0; i < iMin; i++) {
            if (list.get(i) != list2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f26987a.hashCode() ^ 31;
        int i = this.f26990d ^ ((iHashCode << 5) - iHashCode);
        int iHashCode2 = this.f26988b.hashCode() ^ ((i << 5) - i);
        int i2 = this.f26989c ^ ((iHashCode2 << 5) - iHashCode2);
        int i3 = (this.f26992f ? 1 : 0) ^ ((i2 << 5) - i2);
        int i4 = (i3 << 5) - i3;
        String str = this.f26991e;
        int iHashCode3 = (str == null ? 0 : str.hashCode()) ^ i4;
        int i5 = (iHashCode3 << 5) - iHashCode3;
        long j = this.f26993g;
        return ((int) (j ^ (j >>> 32))) ^ i5;
    }
}

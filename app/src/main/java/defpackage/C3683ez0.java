package defpackage;

import android.util.Size;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: ez0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3683ez0 {
    public final List a;
    public final Size b;
    public final int c;
    public final int d;
    public String e;
    public boolean f = false;
    public long g = 1;

    public C3683ez0(Surface surface) throws NoSuchMethodException, SecurityException {
        Size size;
        int iIntValue;
        int iIntValue2 = 0;
        this.a = Collections.singletonList(surface);
        try {
            Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
            declaredMethod.setAccessible(true);
            size = (Size) declaredMethod.invoke(null, surface);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            AbstractC0759Jm0.f("OutputConfigCompat");
            size = null;
        }
        this.b = size;
        try {
            iIntValue2 = ((Integer) Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class).invoke(null, surface)).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            AbstractC0759Jm0.f("OutputConfigCompat");
        }
        this.c = iIntValue2;
        try {
            iIntValue = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", null).invoke(surface, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
            AbstractC0759Jm0.f("OutputConfigCompat");
            iIntValue = -1;
        }
        this.d = iIntValue;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3683ez0)) {
            return false;
        }
        C3683ez0 c3683ez0 = (C3683ez0) obj;
        if (!this.b.equals(c3683ez0.b) || this.c != c3683ez0.c || this.d != c3683ez0.d || this.f != c3683ez0.f || this.g != c3683ez0.g || !Objects.equals(this.e, c3683ez0.e)) {
            return false;
        }
        List list = this.a;
        int size = list.size();
        List list2 = c3683ez0.a;
        int iMin = Math.min(size, list2.size());
        for (int i = 0; i < iMin; i++) {
            if (list.get(i) != list2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        int i = this.d ^ ((iHashCode << 5) - iHashCode);
        int iHashCode2 = this.b.hashCode() ^ ((i << 5) - i);
        int i2 = this.c ^ ((iHashCode2 << 5) - iHashCode2);
        int i3 = (this.f ? 1 : 0) ^ ((i2 << 5) - i2);
        int i4 = (i3 << 5) - i3;
        String str = this.e;
        int iHashCode3 = (str == null ? 0 : str.hashCode()) ^ i4;
        int i5 = (iHashCode3 << 5) - iHashCode3;
        long j = this.g;
        return ((int) (j ^ (j >>> 32))) ^ i5;
    }
}

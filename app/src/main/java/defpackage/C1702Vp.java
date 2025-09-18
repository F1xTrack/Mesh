package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: Vp */
/* loaded from: classes.dex */
public final class C1702Vp {
    public static final C0572Hc i = new C0572Hc("camerax.core.captureConfig.rotation", Integer.TYPE, null);
    public static final C0572Hc j = new C0572Hc("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final C0572Hc k = new C0572Hc("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    public final ArrayList a;
    public final C0873Ky0 b;
    public final int c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final C6974s81 g;
    public final InterfaceC7668vn h;

    public C1702Vp(ArrayList arrayList, C0873Ky0 c0873Ky0, int i2, boolean z, ArrayList arrayList2, boolean z2, C6974s81 c6974s81, InterfaceC7668vn interfaceC7668vn) {
        this.a = arrayList;
        this.b = c0873Ky0;
        this.c = i2;
        this.e = Collections.unmodifiableList(arrayList2);
        this.f = z2;
        this.g = c6974s81;
        this.h = interfaceC7668vn;
        this.d = z;
    }

    public final int a() {
        Object obj = this.g.a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public final int b() {
        Object objW = 0;
        try {
            objW = this.b.w(InterfaceC5361jh1.d1);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objW;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int c() {
        Object objW = 0;
        try {
            objW = this.b.w(InterfaceC5361jh1.e1);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objW;
        Objects.requireNonNull(num);
        return num.intValue();
    }
}

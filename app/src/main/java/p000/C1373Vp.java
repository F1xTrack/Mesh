package p000;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: Vp */
/* loaded from: classes.dex */
public final class C1373Vp {

    /* renamed from: i */
    public static final C0480Hc f12775i = new C0480Hc("camerax.core.captureConfig.rotation", Integer.TYPE, null);

    /* renamed from: j */
    public static final C0480Hc f12776j = new C0480Hc("camerax.core.captureConfig.jpegQuality", Integer.class, null);

    /* renamed from: k */
    public static final C0480Hc f12777k = new C0480Hc("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);

    /* renamed from: a */
    public final ArrayList f12778a;

    /* renamed from: b */
    public final C7882Ky0 f12779b;

    /* renamed from: c */
    public final int f12780c;

    /* renamed from: d */
    public final boolean f12781d;

    /* renamed from: e */
    public final List f12782e;

    /* renamed from: f */
    public final boolean f12783f;

    /* renamed from: g */
    public final C10996s81 f12784g;

    /* renamed from: h */
    public final InterfaceC7034vn f12785h;

    public C1373Vp(ArrayList arrayList, C7882Ky0 c7882Ky0, int i, boolean z, ArrayList arrayList2, boolean z2, C10996s81 c10996s81, InterfaceC7034vn interfaceC7034vn) {
        this.f12778a = arrayList;
        this.f12779b = c7882Ky0;
        this.f12780c = i;
        this.f12782e = Collections.unmodifiableList(arrayList2);
        this.f12783f = z2;
        this.f12784g = c10996s81;
        this.f12785h = interfaceC7034vn;
        this.f12781d = z;
    }

    /* renamed from: a */
    public final int m8575a() {
        Object obj = this.f12784g.f42279a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    /* renamed from: b */
    public final int m8576b() {
        Object objMo4794w = 0;
        try {
            objMo4794w = this.f12779b.mo4794w(InterfaceC9914jh1.f35333d1);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objMo4794w;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* renamed from: c */
    public final int m8577c() {
        Object objMo4794w = 0;
        try {
            objMo4794w = this.f12779b.mo4794w(InterfaceC9914jh1.f35334e1);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objMo4794w;
        Objects.requireNonNull(num);
        return num.intValue();
    }
}

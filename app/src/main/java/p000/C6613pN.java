package p000;

import android.content.Context;
import ru.mes.dnevnik.R;

/* renamed from: pN */
/* loaded from: classes.dex */
public final class C6613pN {

    /* renamed from: f */
    public static final int f40035f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    public final boolean f40036a;

    /* renamed from: b */
    public final int f40037b;

    /* renamed from: c */
    public final int f40038c;

    /* renamed from: d */
    public final int f40039d;

    /* renamed from: e */
    public final float f40040e;

    public C6613pN(Context context) {
        boolean zM22073b = AbstractC9900ja1.m22073b(context, R.attr.elevationOverlayEnabled, false);
        int iM22231f = AbstractC10036ke1.m22231f(context, R.attr.elevationOverlayColor, 0);
        int iM22231f2 = AbstractC10036ke1.m22231f(context, R.attr.elevationOverlayAccentColor, 0);
        int iM22231f3 = AbstractC10036ke1.m22231f(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f40036a = zM22073b;
        this.f40037b = iM22231f;
        this.f40038c = iM22231f2;
        this.f40039d = iM22231f3;
        this.f40040e = f;
    }
}

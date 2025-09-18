package defpackage;

import android.content.Context;
import ru.mes.dnevnik.R;

/* renamed from: pN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6445pN {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public C6445pN(Context context) {
        boolean zB = AbstractC5340ja1.b(context, R.attr.elevationOverlayEnabled, false);
        int iF = AbstractC5543ke1.f(context, R.attr.elevationOverlayColor, 0);
        int iF2 = AbstractC5543ke1.f(context, R.attr.elevationOverlayAccentColor, 0);
        int iF3 = AbstractC5543ke1.f(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zB;
        this.b = iF;
        this.c = iF2;
        this.d = iF3;
        this.e = f2;
    }
}

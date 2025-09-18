package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: Zv0 */
/* loaded from: classes.dex */
public final class C2033Zv0 {
    public final Bundle a;
    public IconCompat b;
    public final MQ0[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final CharSequence g;
    public final PendingIntent h;

    public C2033Zv0(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, MQ0[] mq0Arr, MQ0[] mq0Arr2, boolean z, boolean z2) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.d() == 2) {
            this.f = iconCompat.c();
        }
        this.g = C3865fw0.b(charSequence);
        this.h = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = mq0Arr;
        this.d = z;
        this.e = z2;
    }
}

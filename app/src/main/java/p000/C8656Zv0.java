package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: Zv0 */
/* loaded from: classes.dex */
public final class C8656Zv0 {

    /* renamed from: a */
    public final Bundle f15221a;

    /* renamed from: b */
    public IconCompat f15222b;

    /* renamed from: c */
    public final MQ0[] f15223c;

    /* renamed from: d */
    public final boolean f15224d;

    /* renamed from: e */
    public final boolean f15225e;

    /* renamed from: f */
    public final int f15226f;

    /* renamed from: g */
    public final CharSequence f15227g;

    /* renamed from: h */
    public final PendingIntent f15228h;

    public C8656Zv0(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, MQ0[] mq0Arr, MQ0[] mq0Arr2, boolean z, boolean z2) {
        this.f15225e = true;
        this.f15222b = iconCompat;
        if (iconCompat != null && iconCompat.m9980d() == 2) {
            this.f15226f = iconCompat.m9979c();
        }
        this.f15227g = C9431fw0.m18310b(charSequence);
        this.f15228h = pendingIntent;
        this.f15221a = bundle == null ? new Bundle() : bundle;
        this.f15223c = mq0Arr;
        this.f15224d = z;
        this.f15225e = z2;
    }
}

package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: wR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7794wR1 {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final long f;
    public final C3359dG1 g;
    public final boolean h;
    public final Long i;
    public final String j;

    public C7794wR1(Context context, C3359dG1 c3359dG1, Long l) {
        this.h = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (c3359dG1 != null) {
            this.g = c3359dG1;
            this.b = c3359dG1.f;
            this.c = c3359dG1.e;
            this.d = c3359dG1.d;
            this.h = c3359dG1.c;
            this.f = c3359dG1.b;
            this.j = c3359dG1.h;
            Bundle bundle = c3359dG1.g;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}

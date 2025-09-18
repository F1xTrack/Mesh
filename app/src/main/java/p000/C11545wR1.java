package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: wR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11545wR1 {

    /* renamed from: a */
    public final Context f44870a;

    /* renamed from: b */
    public final String f44871b;

    /* renamed from: c */
    public final String f44872c;

    /* renamed from: d */
    public final String f44873d;

    /* renamed from: e */
    public final Boolean f44874e;

    /* renamed from: f */
    public final long f44875f;

    /* renamed from: g */
    public final C9092dG1 f44876g;

    /* renamed from: h */
    public final boolean f44877h;

    /* renamed from: i */
    public final Long f44878i;

    /* renamed from: j */
    public final String f44879j;

    public C11545wR1(Context context, C9092dG1 c9092dG1, Long l) {
        this.f44877h = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f44870a = applicationContext;
        this.f44878i = l;
        if (c9092dG1 != null) {
            this.f44876g = c9092dG1;
            this.f44871b = c9092dG1.f25926f;
            this.f44872c = c9092dG1.f25925e;
            this.f44873d = c9092dG1.f25924d;
            this.f44877h = c9092dG1.f25923c;
            this.f44875f = c9092dG1.f25922b;
            this.f44879j = c9092dG1.f25928h;
            Bundle bundle = c9092dG1.f25927g;
            if (bundle != null) {
                this.f44874e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}

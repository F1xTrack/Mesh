package defpackage;

import android.app.Service;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class SY1 {
    public final Context a;

    public SY1(Service service) {
        Preconditions.checkNotNull(service);
        Context applicationContext = service.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.a = applicationContext;
    }
}

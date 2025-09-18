package p000;

import android.app.Service;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class SY1 {

    /* renamed from: a */
    public final Context f10853a;

    public SY1(Service service) {
        Preconditions.checkNotNull(service);
        Context applicationContext = service.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f10853a = applicationContext;
    }
}

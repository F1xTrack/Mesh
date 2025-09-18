package p000;

import android.content.Context;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: n32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10346n32 {

    /* renamed from: a */
    public final TelemetryLoggingClient f38067a;

    /* renamed from: b */
    public final AtomicLong f38068b = new AtomicLong(-1);

    public C10346n32(Context context) {
        this.f38067a = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("mlkit:vision").build());
    }
}

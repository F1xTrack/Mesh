package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: n32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6005n32 {
    public final TelemetryLoggingClient a;
    public final AtomicLong b = new AtomicLong(-1);

    public C6005n32(Context context) {
        this.a = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("mlkit:vision").build());
    }
}

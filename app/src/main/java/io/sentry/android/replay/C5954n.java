package io.sentry.android.replay;

import android.graphics.Bitmap;
import io.sentry.C5759D1;
import io.sentry.C5760E;
import io.sentry.EnumC5763F;
import io.sentry.EnumC6051j;
import io.sentry.android.replay.capture.C5941o;
import io.sentry.transport.C6161m;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.functions.Function2;
import p000.AbstractC8418Vg0;
import p000.AbstractC8729aT1;
import p000.C8313Tf1;
import p000.O90;
import p000.TO0;

/* renamed from: io.sentry.android.replay.n */
/* loaded from: classes2.dex */
public final class C5954n extends AbstractC8418Vg0 implements Function2 {

    /* renamed from: e */
    public final /* synthetic */ Bitmap f34002e;

    /* renamed from: f */
    public final /* synthetic */ TO0 f34003f;

    /* renamed from: g */
    public final /* synthetic */ ReplayIntegration f34004g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5954n(Bitmap bitmap, TO0 to0, ReplayIntegration replayIntegration) {
        super(2);
        this.f34002e = bitmap;
        this.f34003f = to0;
        this.f34004g = replayIntegration;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        C5760E c5760e;
        C5760E c5760e2;
        C6161m c6161mMo21372q;
        C6161m c6161mMo21372q2;
        C5950j c5950j = (C5950j) obj;
        long jLongValue = ((Number) obj2).longValue();
        O90.m5968f(c5950j, "$this$onScreenshotRecorded");
        String str = (String) this.f34003f.f11337a;
        Bitmap bitmap = this.f34002e;
        O90.m5968f(bitmap, "bitmap");
        if (c5950j.m21673m() != null && !bitmap.isRecycled()) {
            File fileM21673m = c5950j.m21673m();
            if (fileM21673m != null) {
                fileM21673m.mkdirs();
            }
            File file = new File(c5950j.m21673m(), jLongValue + ".jpg");
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, c5950j.f33988a.getSessionReplay().f33289g.screenshotQuality, fileOutputStream);
                fileOutputStream.flush();
                AbstractC8729aT1.m9749a(fileOutputStream, null);
                c5950j.f33994g.add(new C5951k(file, jLongValue, str));
            } finally {
            }
        }
        ReplayIntegration replayIntegration = this.f34004g;
        if (replayIntegration.f33889l instanceof C5941o) {
            C5759D1 c5759d1 = replayIntegration.f33880c;
            if (c5759d1 == null) {
                O90.m5977o("options");
                throw null;
            }
            if (c5759d1.getConnectionStatusProvider().mo21389b() == EnumC5763F.DISCONNECTED || (((c5760e = replayIntegration.f33881d) != null && (c6161mMo21372q2 = c5760e.mo21372q()) != null && c6161mMo21372q2.m21873c(EnumC6051j.All)) || ((c5760e2 = replayIntegration.f33881d) != null && (c6161mMo21372q = c5760e2.mo21372q()) != null && c6161mMo21372q.m21873c(EnumC6051j.Replay)))) {
                replayIntegration.pause();
            }
        }
        return C8313Tf1.f11463a;
    }
}

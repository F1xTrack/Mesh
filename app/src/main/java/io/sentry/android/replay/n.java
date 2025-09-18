package io.sentry.android.replay;

import android.graphics.Bitmap;
import defpackage.AbstractC1676Vg0;
import defpackage.AbstractC2141aT1;
import defpackage.C1518Tf1;
import defpackage.O90;
import defpackage.TO0;
import io.sentry.D1;
import io.sentry.E;
import io.sentry.EnumC5134j;
import io.sentry.F;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class n extends AbstractC1676Vg0 implements Function2 {
    public final /* synthetic */ Bitmap e;
    public final /* synthetic */ TO0 f;
    public final /* synthetic */ ReplayIntegration g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Bitmap bitmap, TO0 to0, ReplayIntegration replayIntegration) {
        super(2);
        this.e = bitmap;
        this.f = to0;
        this.g = replayIntegration;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        E e;
        E e2;
        io.sentry.transport.m mVarQ;
        io.sentry.transport.m mVarQ2;
        j jVar = (j) obj;
        long jLongValue = ((Number) obj2).longValue();
        O90.f(jVar, "$this$onScreenshotRecorded");
        String str = (String) this.f.a;
        Bitmap bitmap = this.e;
        O90.f(bitmap, "bitmap");
        if (jVar.m() != null && !bitmap.isRecycled()) {
            File fileM = jVar.m();
            if (fileM != null) {
                fileM.mkdirs();
            }
            File file = new File(jVar.m(), jLongValue + ".jpg");
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, jVar.a.getSessionReplay().g.screenshotQuality, fileOutputStream);
                fileOutputStream.flush();
                AbstractC2141aT1.a(fileOutputStream, null);
                jVar.g.add(new k(file, jLongValue, str));
            } finally {
            }
        }
        ReplayIntegration replayIntegration = this.g;
        if (replayIntegration.l instanceof io.sentry.android.replay.capture.o) {
            D1 d1 = replayIntegration.c;
            if (d1 == null) {
                O90.o("options");
                throw null;
            }
            if (d1.getConnectionStatusProvider().b() == F.DISCONNECTED || (((e = replayIntegration.d) != null && (mVarQ2 = e.q()) != null && mVarQ2.c(EnumC5134j.All)) || ((e2 = replayIntegration.d) != null && (mVarQ = e2.q()) != null && mVarQ.c(EnumC5134j.Replay)))) {
                replayIntegration.pause();
            }
        }
        return C1518Tf1.a;
    }
}

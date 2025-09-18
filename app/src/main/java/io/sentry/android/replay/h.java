package io.sentry.android.replay;

import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC5908mZ;
import defpackage.O90;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class h extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ j f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i) {
        super(0);
        this.e = i;
        this.f = jVar;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() throws IOException {
        switch (this.e) {
            case 0:
                j jVar = this.f;
                if (jVar.m() == null) {
                    return null;
                }
                File file = new File(jVar.m(), ".ongoing_segment");
                if (!file.exists()) {
                    file.createNewFile();
                }
                return file;
            default:
                j jVar2 = this.f;
                D1 d1 = jVar2.a;
                O90.f(d1, "options");
                io.sentry.protocol.t tVar = jVar2.b;
                O90.f(tVar, "replayId");
                String cacheDirPath = d1.getCacheDirPath();
                if (cacheDirPath == null || cacheDirPath.length() == 0) {
                    d1.getLogger().k(EnumC5148n1.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                    return null;
                }
                String cacheDirPath2 = d1.getCacheDirPath();
                O90.c(cacheDirPath2);
                File file2 = new File(cacheDirPath2, "replay_" + tVar);
                file2.mkdirs();
                return file2;
        }
    }
}

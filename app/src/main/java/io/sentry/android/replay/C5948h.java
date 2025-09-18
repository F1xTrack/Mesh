package io.sentry.android.replay;

import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.protocol.C6104t;
import java.io.File;
import java.io.IOException;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;
import p000.O90;

/* renamed from: io.sentry.android.replay.h */
/* loaded from: classes2.dex */
public final class C5948h extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f33982e;

    /* renamed from: f */
    public final /* synthetic */ C5950j f33983f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5948h(C5950j c5950j, int i) {
        super(0);
        this.f33982e = i;
        this.f33983f = c5950j;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() throws IOException {
        switch (this.f33982e) {
            case 0:
                C5950j c5950j = this.f33983f;
                if (c5950j.m21673m() == null) {
                    return null;
                }
                File file = new File(c5950j.m21673m(), ".ongoing_segment");
                if (!file.exists()) {
                    file.createNewFile();
                }
                return file;
            default:
                C5950j c5950j2 = this.f33983f;
                C5759D1 c5759d1 = c5950j2.f33988a;
                O90.m5968f(c5759d1, "options");
                C6104t c6104t = c5950j2.f33989b;
                O90.m5968f(c6104t, "replayId");
                String cacheDirPath = c5759d1.getCacheDirPath();
                if (cacheDirPath == null || cacheDirPath.length() == 0) {
                    c5759d1.getLogger().mo21407k(EnumC6069n1.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                    return null;
                }
                String cacheDirPath2 = c5759d1.getCacheDirPath();
                O90.m5965c(cacheDirPath2);
                File file2 = new File(cacheDirPath2, "replay_" + c6104t);
                file2.mkdirs();
                return file2;
        }
    }
}

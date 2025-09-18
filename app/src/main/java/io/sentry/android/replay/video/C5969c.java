package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import p000.AbstractC11374v51;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6434mZ;
import p000.O90;

/* renamed from: io.sentry.android.replay.video.c */
/* loaded from: classes2.dex */
public final class C5969c extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public static final C5969c f34054e = new C5969c(0);

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        boolean z = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        O90.m5967e(codecInfos, "MediaCodecList(MediaCode…)\n            .codecInfos");
        int length = codecInfos.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String name = codecInfos[i].getName();
            O90.m5967e(name, "it.name");
            if (AbstractC11374v51.m25351p(name, "c2.exynos", false)) {
                z = true;
                break;
            }
            i++;
        }
        return Boolean.valueOf(z);
    }
}

package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import defpackage.AbstractC1676Vg0;
import defpackage.AbstractC7538v51;
import defpackage.InterfaceC5908mZ;
import defpackage.O90;

/* loaded from: classes2.dex */
public final class c extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public static final c e = new c(0);

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        boolean z = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        O90.e(codecInfos, "MediaCodecList(MediaCode…)\n            .codecInfos");
        int length = codecInfos.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String name = codecInfos[i].getName();
            O90.e(name, "it.name");
            if (AbstractC7538v51.p(name, "c2.exynos", false)) {
                z = true;
                break;
            }
            i++;
        }
        return Boolean.valueOf(z);
    }
}

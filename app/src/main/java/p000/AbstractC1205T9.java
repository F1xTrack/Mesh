package p000;

import android.content.ClipData;
import android.media.AudioProfile;
import android.media.EncoderProfiles;
import android.view.ContentInfo;

/* renamed from: T9 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1205T9 {
    /* renamed from: h */
    public static /* bridge */ /* synthetic */ AudioProfile m7589h(Object obj) {
        return (AudioProfile) obj;
    }

    /* renamed from: i */
    public static /* bridge */ /* synthetic */ EncoderProfiles.VideoProfile m7590i(Object obj) {
        return (EncoderProfiles.VideoProfile) obj;
    }

    /* renamed from: l */
    public static /* synthetic */ ContentInfo.Builder m7593l(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ ContentInfo m7595n(Object obj) {
        return (ContentInfo) obj;
    }
}

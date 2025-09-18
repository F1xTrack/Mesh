package defpackage;

import android.content.ClipData;
import android.media.AudioProfile;
import android.media.EncoderProfiles;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class T9 {
    public static /* bridge */ /* synthetic */ AudioProfile h(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* bridge */ /* synthetic */ EncoderProfiles.VideoProfile i(Object obj) {
        return (EncoderProfiles.VideoProfile) obj;
    }

    public static /* synthetic */ ContentInfo.Builder l(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo n(Object obj) {
        return (ContentInfo) obj;
    }
}

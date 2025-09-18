package p000;

import android.content.Context;
import android.media.AudioRecord;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import java.util.ArrayList;
import java.util.List;

/* renamed from: V5 */
/* loaded from: classes.dex */
public abstract class AbstractC1327V5 {
    /* renamed from: a */
    public static C7213yd m8292a(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new C7150xd(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new C7276zd(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return C7213yd.m26204e(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    /* renamed from: b */
    public static EncoderProfiles m8293b(int i, String str) {
        return CamcorderProfile.getAll(str, i);
    }

    /* renamed from: c */
    public static void m8294c(AudioRecord.Builder builder, Context context) {
        builder.setContext(context);
    }
}

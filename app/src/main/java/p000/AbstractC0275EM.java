package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.media.EncoderProfiles;
import java.util.ArrayList;
import java.util.List;

/* renamed from: EM */
/* loaded from: classes.dex */
public abstract class AbstractC0275EM {
    /* renamed from: a */
    public static C7213yd m2168a(EncoderProfiles encoderProfiles) {
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
            arrayList2.add(new C7276zd(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return C7213yd.m26204e(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    /* renamed from: b */
    public static C0149CM m2169b(C0428Gn c0428Gn) {
        Long l = (Long) c0428Gn.m3155a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l != null) {
            return (C0149CM) AbstractC0212DM.f1977a.get(l);
        }
        return null;
    }
}

package defpackage;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;

/* loaded from: classes.dex */
public abstract class S5 {
    public static int a(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }

    public static int b(AudioRecord audioRecord, AudioTimestamp audioTimestamp) {
        return audioRecord.getTimestamp(audioTimestamp, 0);
    }
}

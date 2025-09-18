package defpackage;

/* loaded from: classes.dex */
public final class SP extends Enum {
    public static final SP A;
    public static final SP B;
    public static final /* synthetic */ SP[] C;
    public static final C0396Ev0 b;
    public static final SP c;
    public static final SP d;
    public static final SP e;
    public static final SP f;
    public static final SP g;
    public static final SP h;
    public static final SP i;
    public static final SP j;
    public static final SP k;
    public static final SP l;
    public static final SP m;
    public static final SP n;
    public static final SP o;
    public static final SP p;
    public static final SP q;
    public static final SP r;
    public static final SP s;
    public static final SP t;
    public static final SP u;
    public static final SP v;
    public static final SP w;
    public static final SP x;
    public static final SP y;
    public static final SP z;
    public final String a;

    static {
        SP sp = new SP("EVENT_LOAD_START", 0, "onVideoLoadStart");
        c = sp;
        SP sp2 = new SP("EVENT_LOAD", 1, "onVideoLoad");
        d = sp2;
        SP sp3 = new SP("EVENT_ERROR", 2, "onVideoError");
        e = sp3;
        SP sp4 = new SP("EVENT_PROGRESS", 3, "onVideoProgress");
        f = sp4;
        SP sp5 = new SP("EVENT_BANDWIDTH", 4, "onVideoBandwidthUpdate");
        g = sp5;
        SP sp6 = new SP("EVENT_CONTROLS_VISIBILITY_CHANGE", 5, "onControlsVisibilityChange");
        h = sp6;
        SP sp7 = new SP("EVENT_SEEK", 6, "onVideoSeek");
        i = sp7;
        SP sp8 = new SP("EVENT_END", 7, "onVideoEnd");
        j = sp8;
        SP sp9 = new SP("EVENT_FULLSCREEN_WILL_PRESENT", 8, "onVideoFullscreenPlayerWillPresent");
        k = sp9;
        SP sp10 = new SP("EVENT_FULLSCREEN_DID_PRESENT", 9, "onVideoFullscreenPlayerDidPresent");
        l = sp10;
        SP sp11 = new SP("EVENT_FULLSCREEN_WILL_DISMISS", 10, "onVideoFullscreenPlayerWillDismiss");
        m = sp11;
        SP sp12 = new SP("EVENT_FULLSCREEN_DID_DISMISS", 11, "onVideoFullscreenPlayerDidDismiss");
        n = sp12;
        SP sp13 = new SP("EVENT_READY", 12, "onReadyForDisplay");
        o = sp13;
        SP sp14 = new SP("EVENT_BUFFER", 13, "onVideoBuffer");
        p = sp14;
        SP sp15 = new SP("EVENT_PLAYBACK_STATE_CHANGED", 14, "onVideoPlaybackStateChanged");
        q = sp15;
        SP sp16 = new SP("EVENT_IDLE", 15, "onVideoIdle");
        r = sp16;
        SP sp17 = new SP("EVENT_TIMED_METADATA", 16, "onTimedMetadata");
        s = sp17;
        SP sp18 = new SP("EVENT_AUDIO_BECOMING_NOISY", 17, "onVideoAudioBecomingNoisy");
        t = sp18;
        SP sp19 = new SP("EVENT_AUDIO_FOCUS_CHANGE", 18, "onAudioFocusChanged");
        u = sp19;
        SP sp20 = new SP("EVENT_PLAYBACK_RATE_CHANGE", 19, "onPlaybackRateChange");
        v = sp20;
        SP sp21 = new SP("EVENT_VOLUME_CHANGE", 20, "onVolumeChange");
        w = sp21;
        SP sp22 = new SP("EVENT_AUDIO_TRACKS", 21, "onAudioTracks");
        x = sp22;
        SP sp23 = new SP("EVENT_TEXT_TRACKS", 22, "onTextTracks");
        y = sp23;
        SP sp24 = new SP("EVENT_TEXT_TRACK_DATA_CHANGED", 23, "onTextTrackDataChanged");
        z = sp24;
        SP sp25 = new SP("EVENT_VIDEO_TRACKS", 24, "onVideoTracks");
        A = sp25;
        SP sp26 = new SP("EVENT_ON_RECEIVE_AD_EVENT", 25, "onReceiveAdEvent");
        SP sp27 = new SP("EVENT_PICTURE_IN_PICTURE_STATUS_CHANGED", 26, "onPictureInPictureStatusChanged");
        B = sp27;
        SP[] spArr = {sp, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp10, sp11, sp12, sp13, sp14, sp15, sp16, sp17, sp18, sp19, sp20, sp21, sp22, sp23, sp24, sp25, sp26, sp27};
        C = spArr;
        F02.c(spArr);
        b = new C0396Ev0(13);
    }

    public SP(String str, int i2, String str2) {
        super(str, i2);
        this.a = str2;
    }

    public static SP valueOf(String str) {
        return (SP) Enum.valueOf(SP.class, str);
    }

    public static SP[] values() {
        return (SP[]) C.clone();
    }
}

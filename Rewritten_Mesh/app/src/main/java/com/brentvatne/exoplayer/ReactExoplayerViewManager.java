package com.brentvatne.exoplayer;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingResourceException;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC0576J8;
import p000.AbstractC0852NX;
import p000.AbstractC10516oO1;
import p000.AbstractC10922rZ1;
import p000.AbstractC11077sn0;
import p000.AbstractC11374v51;
import p000.AbstractC11674xS1;
import p000.C10174lj1;
import p000.C10302mj1;
import p000.C10430nj1;
import p000.C10686pj1;
import p000.C10891rK0;
import p000.C11019sK0;
import p000.C11070sj1;
import p000.C11326uj1;
import p000.C3961dz;
import p000.C9328f61;
import p000.C9406fj1;
import p000.C9662hj1;
import p000.C9817ix0;
import p000.EnumC0738Lj;
import p000.EnumC1158SP;
import p000.EnumC6561oa;
import p000.InterfaceC6947uP;
import p000.InterfaceC9355fK0;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.OZ1;
import p000.S91;
import p000.VL0;

@Metadata(m22266d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 _2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001`B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010%\u001a\u00020!H\u0007¢\u0006\u0004\b&\u0010$J!\u0010(\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b(\u0010\u001dJ!\u0010*\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b*\u0010\u001dJ!\u0010,\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b,\u0010\u001dJ\u001f\u0010.\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010-\u001a\u00020!H\u0007¢\u0006\u0004\b.\u0010$J\u001f\u00100\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010/\u001a\u00020!H\u0007¢\u0006\u0004\b0\u0010$J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u00101\u001a\u00020!H\u0007¢\u0006\u0004\b2\u0010$J\u001f\u00104\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0007H\u0007¢\u0006\u0004\b4\u0010 J\u001f\u00107\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u00106\u001a\u000205H\u0007¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u00109\u001a\u000205H\u0007¢\u0006\u0004\b:\u00108J\u001f\u0010<\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010;\u001a\u00020!H\u0007¢\u0006\u0004\b<\u0010$J\u001f\u0010>\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010=\u001a\u000205H\u0007¢\u0006\u0004\b>\u00108J\u001f\u0010@\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010?\u001a\u000205H\u0007¢\u0006\u0004\b@\u00108J\u001f\u0010B\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010A\u001a\u00020!H\u0007¢\u0006\u0004\bB\u0010$J\u001f\u0010D\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010C\u001a\u00020!H\u0007¢\u0006\u0004\bD\u0010$J\u001f\u0010F\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010E\u001a\u00020!H\u0007¢\u0006\u0004\bF\u0010$J\u001f\u0010H\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u0007H\u0007¢\u0006\u0004\bH\u0010 J\u001f\u0010J\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010I\u001a\u00020!H\u0007¢\u0006\u0004\bJ\u0010$J\u001f\u0010L\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010K\u001a\u00020!H\u0007¢\u0006\u0004\bL\u0010$J\u001f\u0010O\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010N\u001a\u00020MH\u0007¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020!H\u0007¢\u0006\u0004\bR\u0010$J\u001f\u0010T\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010S\u001a\u00020!H\u0007¢\u0006\u0004\bT\u0010$J!\u0010U\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\bU\u0010\u001dJ\u001f\u0010W\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010V\u001a\u00020MH\u0007¢\u0006\u0004\bW\u0010PJ\u001f\u0010Y\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010X\u001a\u00020!H\u0007¢\u0006\u0004\bY\u0010$J!\u0010[\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010Z\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b[\u0010\u001dJ!\u0010]\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\\\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b]\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010^¨\u0006a"}, m22267d2 = {"Lcom/brentvatne/exoplayer/ReactExoplayerViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LrK0;", "LfK0;", "config", "<init>", "(LfK0;)V", "", "getName", "()Ljava/lang/String;", "LS91;", "themedReactContext", "createViewInstance", "(LS91;)LrK0;", "view", "LTf1;", "onDropViewInstance", "(LrK0;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "reactContext", "addEventEmitters", "(LS91;LrK0;)V", "videoView", "Lcom/facebook/react/bridge/ReadableMap;", ReactExoplayerViewManager.PROP_SRC, "setSrc", "(LrK0;Lcom/facebook/react/bridge/ReadableMap;)V", ReactExoplayerViewManager.PROP_RESIZE_MODE, "setResizeMode", "(LrK0;Ljava/lang/String;)V", "", ReactExoplayerViewManager.PROP_REPEAT, "setRepeat", "(LrK0;Z)V", "preventsSleep", "setPreventsDisplaySleepDuringVideoPlayback", ReactExoplayerViewManager.PROP_SELECTED_VIDEO_TRACK, "setSelectedVideoTrack", ReactExoplayerViewManager.PROP_SELECTED_AUDIO_TRACK, "setSelectedAudioTrack", ReactExoplayerViewManager.PROP_SELECTED_TEXT_TRACK, "setSelectedTextTrack", ReactExoplayerViewManager.PROP_PAUSED, "setPaused", ReactExoplayerViewManager.PROP_MUTED, "setMuted", ReactExoplayerViewManager.PROP_ENTER_PICTURE_IN_PICTURE_ON_LEAVE, "setEnterPictureInPictureOnLeave", ReactExoplayerViewManager.PROP_AUDIO_OUTPUT, "setAudioOutput", "", ReactExoplayerViewManager.PROP_VOLUME, "setVolume", "(LrK0;F)V", ReactExoplayerViewManager.PROP_PROGRESS_UPDATE_INTERVAL, "setProgressUpdateInterval", ReactExoplayerViewManager.PROP_REPORT_BANDWIDTH, "setReportBandwidth", ReactExoplayerViewManager.PROP_RATE, "setRate", ReactExoplayerViewManager.PROP_MAXIMUM_BIT_RATE, "setMaxBitRate", ReactExoplayerViewManager.PROP_PLAY_IN_BACKGROUND, "setPlayInBackground", ReactExoplayerViewManager.PROP_DISABLE_FOCUS, "setDisableFocus", ReactExoplayerViewManager.PROP_FOCUSABLE, "setFocusable", ReactExoplayerViewManager.PROP_BUFFERING_STRATEGY, "setBufferingStrategy", ReactExoplayerViewManager.PROP_DISABLE_DISCONNECT_ERROR, "setDisableDisconnectError", ReactExoplayerViewManager.PROP_FULLSCREEN, "setFullscreen", "", ReactExoplayerViewManager.PROP_VIEW_TYPE, "setViewType", "(LrK0;I)V", ReactExoplayerViewManager.PROP_HIDE_SHUTTER_VIEW, "setHideShutterView", ReactExoplayerViewManager.PROP_CONTROLS, "setControls", "setSubtitleStyle", "color", "setShutterColor", ReactExoplayerViewManager.PROP_SHOW_NOTIFICATION_CONTROLS, "setShowNotificationControls", "debugConfig", "setDebug", ReactExoplayerViewManager.PROP_CONTROLS_STYLES, "setControlsStyles", "LfK0;", "Companion", "sK0", "react-native-video_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ReactExoplayerViewManager extends ViewGroupManager<C10891rK0> {
    public static final C11019sK0 Companion = new C11019sK0();
    private static final String PROP_AUDIO_OUTPUT = "audioOutput";
    private static final String PROP_BUFFERING_STRATEGY = "bufferingStrategy";
    private static final String PROP_CONTROLS = "controls";
    private static final String PROP_CONTROLS_STYLES = "controlsStyles";
    private static final String PROP_DEBUG = "debug";
    private static final String PROP_DISABLE_DISCONNECT_ERROR = "disableDisconnectError";
    private static final String PROP_DISABLE_FOCUS = "disableFocus";
    private static final String PROP_ENTER_PICTURE_IN_PICTURE_ON_LEAVE = "enterPictureInPictureOnLeave";
    private static final String PROP_FOCUSABLE = "focusable";
    private static final String PROP_FULLSCREEN = "fullscreen";
    private static final String PROP_HIDE_SHUTTER_VIEW = "hideShutterView";
    private static final String PROP_MAXIMUM_BIT_RATE = "maxBitRate";
    private static final String PROP_MUTED = "muted";
    private static final String PROP_PAUSED = "paused";
    private static final String PROP_PLAY_IN_BACKGROUND = "playInBackground";
    private static final String PROP_PREVENTS_DISPLAY_SLEEP_DURING_VIDEO_PLAYBACK = "preventsDisplaySleepDuringVideoPlayback";
    private static final String PROP_PROGRESS_UPDATE_INTERVAL = "progressUpdateInterval";
    private static final String PROP_RATE = "rate";
    private static final String PROP_REPEAT = "repeat";
    private static final String PROP_REPORT_BANDWIDTH = "reportBandwidth";
    private static final String PROP_RESIZE_MODE = "resizeMode";
    private static final String PROP_SELECTED_AUDIO_TRACK = "selectedAudioTrack";
    private static final String PROP_SELECTED_AUDIO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_AUDIO_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_TEXT_TRACK = "selectedTextTrack";
    private static final String PROP_SELECTED_TEXT_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_TEXT_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_VIDEO_TRACK = "selectedVideoTrack";
    private static final String PROP_SELECTED_VIDEO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_VIDEO_TRACK_VALUE = "value";
    private static final String PROP_SHOW_NOTIFICATION_CONTROLS = "showNotificationControls";
    private static final String PROP_SHUTTER_COLOR = "shutterColor";
    private static final String PROP_SRC = "src";
    private static final String PROP_SUBTITLE_STYLE = "subtitleStyle";
    private static final String PROP_VIEW_TYPE = "viewType";
    private static final String PROP_VOLUME = "volume";
    private static final String REACT_CLASS = "RCTVideo";
    private static final String TAG = "ExoViewManager";
    private final InterfaceC9355fK0 config;

    public ReactExoplayerViewManager(InterfaceC9355fK0 interfaceC9355fK0) {
        O90.m5968f(interfaceC9355fK0, "config");
        this.config = interfaceC9355fK0;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        EnumC1158SP.f10718b.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC1158SP enumC1158SP : AbstractC0576J8.m4173D(EnumC1158SP.values())) {
            linkedHashMap.put("top".concat(AbstractC11374v51.m25335J("on", enumC1158SP.f10743a)), AbstractC11077sn0.m24779g(new Pair("registrationName", enumC1158SP.f10743a)));
        }
        return linkedHashMap;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @InterfaceC9871jM0(name = PROP_AUDIO_OUTPUT)
    public final void setAudioOutput(C10891rK0 videoView, String str) {
        EnumC6561oa enumC6561oa;
        O90.m5968f(videoView, "videoView");
        O90.m5968f(str, PROP_AUDIO_OUTPUT);
        EnumC6561oa.f39093c.getClass();
        EnumC6561oa[] enumC6561oaArrValues = EnumC6561oa.values();
        int length = enumC6561oaArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                enumC6561oa = EnumC6561oa.f39094d;
                break;
            }
            enumC6561oa = enumC6561oaArrValues[i];
            if (enumC6561oa.f39096a.equalsIgnoreCase(str)) {
                break;
            } else {
                i++;
            }
        }
        videoView.setAudioOutput(enumC6561oa);
    }

    @InterfaceC9871jM0(name = PROP_BUFFERING_STRATEGY)
    public final void setBufferingStrategy(C10891rK0 videoView, String str) {
        EnumC0738Lj enumC0738LjValueOf;
        O90.m5968f(videoView, "videoView");
        O90.m5968f(str, PROP_BUFFERING_STRATEGY);
        try {
            enumC0738LjValueOf = EnumC0738Lj.valueOf(str);
        } catch (Exception unused) {
            AbstractC10922rZ1.m24429c("BufferingStrategy", "cannot parse buffering strategy ".concat(str));
            enumC0738LjValueOf = EnumC0738Lj.f6821a;
        }
        videoView.setBufferingStrategy(enumC0738LjValueOf);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = PROP_CONTROLS)
    public final void setControls(C10891rK0 videoView, boolean z) {
        O90.m5968f(videoView, "videoView");
        videoView.setControls(z);
    }

    @InterfaceC9871jM0(name = PROP_CONTROLS_STYLES)
    public final void setControlsStyles(C10891rK0 videoView, ReadableMap readableMap) {
        O90.m5968f(videoView, "videoView");
        C3961dz c3961dz = new C3961dz();
        if (readableMap != null) {
            c3961dz.f26457a = AbstractC10516oO1.m23378c(readableMap, "hideSeekBar", false);
            c3961dz.f26458b = AbstractC10516oO1.m23378c(readableMap, "hideDuration", false);
            c3961dz.f26459c = AbstractC10516oO1.m23378c(readableMap, "hidePosition", false);
            c3961dz.f26460d = AbstractC10516oO1.m23378c(readableMap, "hidePlayPause", false);
            c3961dz.f26461e = AbstractC10516oO1.m23378c(readableMap, "hideForward", false);
            c3961dz.f26462f = AbstractC10516oO1.m23378c(readableMap, "hideRewind", false);
            c3961dz.f26463g = AbstractC10516oO1.m23378c(readableMap, "hideNext", false);
            c3961dz.f26464h = AbstractC10516oO1.m23378c(readableMap, "hidePrevious", false);
            c3961dz.f26465i = AbstractC10516oO1.m23378c(readableMap, "hideFullscreen", false);
            c3961dz.f26470n = AbstractC10516oO1.m23381f(10000, "seekIncrementMS", readableMap);
            c3961dz.f26466j = AbstractC10516oO1.m23378c(readableMap, "hideNavigationBarOnFullScreenMode", true);
            c3961dz.f26467k = AbstractC10516oO1.m23378c(readableMap, "hideNotificationBarOnFullScreenMode", true);
            c3961dz.f26468l = AbstractC10516oO1.m23383h(readableMap, "liveLabel", null);
            c3961dz.f26469m = AbstractC10516oO1.m23378c(readableMap, "hideSettingButton", true);
        }
        videoView.setControlsStyles(c3961dz);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = PROP_DEBUG)
    public final void setDebug(C10891rK0 videoView, ReadableMap debugConfig) {
        O90.m5968f(videoView, "videoView");
        boolean zM23378c = AbstractC10516oO1.m23378c(debugConfig, "enable", false);
        boolean zM23378c2 = AbstractC10516oO1.m23378c(debugConfig, "thread", false);
        if (zM23378c) {
            AbstractC10922rZ1.f41734a = 2;
            AbstractC10922rZ1.f41735b = zM23378c2;
        } else {
            AbstractC10922rZ1.f41734a = 5;
            AbstractC10922rZ1.f41735b = zM23378c2;
        }
        videoView.setDebug(zM23378c);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = PROP_DISABLE_DISCONNECT_ERROR)
    public final void setDisableDisconnectError(C10891rK0 videoView, boolean z) {
        O90.m5968f(videoView, "videoView");
        videoView.setDisableDisconnectError(z);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = PROP_DISABLE_FOCUS)
    public final void setDisableFocus(C10891rK0 videoView, boolean z) {
        O90.m5968f(videoView, "videoView");
        videoView.setDisableFocus(z);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = PROP_ENTER_PICTURE_IN_PICTURE_ON_LEAVE)
    public final void setEnterPictureInPictureOnLeave(C10891rK0 videoView, boolean z) {
        O90.m5968f(videoView, "videoView");
        videoView.setEnterPictureInPictureOnLeave(z);
    }

    @InterfaceC9871jM0(defaultBoolean = true, name = PROP_FOCUSABLE)
    public final void setFocusable(C10891rK0 videoView, boolean z) {
        O90.m5968f(videoView, "videoView");
        videoView.setFocusable(z);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = PROP_FULLSCREEN)
    public final void setFullscreen(C10891rK0 videoView, boolean z) {
        O90.m5968f(videoView, "videoView");
        videoView.setFullscreen(z);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = PROP_HIDE_SHUTTER_VIEW)
    public final void setHideShutterView(C10891rK0 videoView, boolean z) {
        O90.m5968f(videoView, "videoView");
        videoView.setHideShutterView(z);
    }

    @InterfaceC9871jM0(name = PROP_MAXIMUM_BIT_RATE)
    public final void setMaxBitRate(C10891rK0 videoView, float f) {
        O90.m5968f(videoView, "videoView");
        videoView.setMaxBitRateModifier((int) f);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = PROP_MUTED)
    public final void setMuted(C10891rK0 videoView, boolean z) {
        O90.m5968f(videoView, "videoView");
        videoView.setMutedModifier(z);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = PROP_PAUSED)
    public final void setPaused(C10891rK0 videoView, boolean z) {
        O90.m5968f(videoView, "videoView");
        videoView.setPausedModifier(z);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = PROP_PLAY_IN_BACKGROUND)
    public final void setPlayInBackground(C10891rK0 videoView, boolean z) {
        O90.m5968f(videoView, "videoView");
        videoView.setPlayInBackground(z);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = PROP_PREVENTS_DISPLAY_SLEEP_DURING_VIDEO_PLAYBACK)
    public final void setPreventsDisplaySleepDuringVideoPlayback(C10891rK0 videoView, boolean preventsSleep) {
        O90.m5968f(videoView, "videoView");
        videoView.setPreventsDisplaySleepDuringVideoPlayback(preventsSleep);
    }

    @InterfaceC9871jM0(defaultFloat = 250.0f, name = PROP_PROGRESS_UPDATE_INTERVAL)
    public final void setProgressUpdateInterval(C10891rK0 videoView, float f) {
        O90.m5968f(videoView, "videoView");
        videoView.setProgressUpdateInterval(f);
    }

    @InterfaceC9871jM0(name = PROP_RATE)
    public final void setRate(C10891rK0 videoView, float f) {
        O90.m5968f(videoView, "videoView");
        videoView.setRateModifier(f);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = PROP_REPEAT)
    public final void setRepeat(C10891rK0 videoView, boolean z) {
        O90.m5968f(videoView, "videoView");
        videoView.setRepeatModifier(z);
    }

    @InterfaceC9871jM0(defaultBoolean = false, name = PROP_REPORT_BANDWIDTH)
    public final void setReportBandwidth(C10891rK0 videoView, boolean z) {
        O90.m5968f(videoView, "videoView");
        videoView.setReportBandwidth(z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0019, code lost:
    
        if (r5.equals("contain") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0030, code lost:
    
        if (r5.equals(com.huawei.hms.rn.push.constants.LocalNotification.Importance.NONE) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0032, code lost:
    
        r4.setResizeModeModifier(0);
     */
    @p000.InterfaceC9871jM0(name = com.brentvatne.exoplayer.ReactExoplayerViewManager.PROP_RESIZE_MODE)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setResizeMode(p000.C10891rK0 r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "videoView"
            p000.O90.m5968f(r4, r0)
            java.lang.String r0 = "resizeMode"
            p000.O90.m5968f(r5, r0)
            int r0 = r5.hashCode()
            r1 = 0
            switch(r0) {
                case -1881872635: goto L36;
                case 3387192: goto L2a;
                case 94852023: goto L1c;
                case 951526612: goto L13;
                default: goto L12;
            }
        L12:
            goto L3e
        L13:
            java.lang.String r0 = "contain"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L32
            goto L3e
        L1c:
            java.lang.String r0 = "cover"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L25
            goto L3e
        L25:
            r5 = 4
            r4.setResizeModeModifier(r5)
            goto L5e
        L2a:
            java.lang.String r0 = "none"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L3e
        L32:
            r4.setResizeModeModifier(r1)
            goto L5e
        L36:
            java.lang.String r0 = "stretch"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5a
        L3e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported resize mode: "
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r5 = " - falling back to fit"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "ExoViewManager"
            p000.AbstractC10922rZ1.m24431e(r0, r5)
            r4.setResizeModeModifier(r1)
            goto L5e
        L5a:
            r5 = 3
            r4.setResizeModeModifier(r5)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brentvatne.exoplayer.ReactExoplayerViewManager.setResizeMode(rK0, java.lang.String):void");
    }

    @InterfaceC9871jM0(name = PROP_SELECTED_AUDIO_TRACK)
    public final void setSelectedAudioTrack(C10891rK0 videoView, ReadableMap readableMap) throws MissingResourceException, NumberFormatException {
        String strM23383h;
        O90.m5968f(videoView, "videoView");
        String str = null;
        if (readableMap != null) {
            String strM23383h2 = AbstractC10516oO1.m23383h(readableMap, "type", null);
            strM23383h = AbstractC10516oO1.m23383h(readableMap, "value", null);
            str = strM23383h2;
        } else {
            strM23383h = null;
        }
        videoView.f41553R = str;
        videoView.f41554S = strM23383h;
        videoView.m24307a0(1, str, strM23383h);
    }

    @InterfaceC9871jM0(name = PROP_SELECTED_TEXT_TRACK)
    public final void setSelectedTextTrack(C10891rK0 videoView, ReadableMap readableMap) throws MissingResourceException, NumberFormatException {
        String strM23383h;
        O90.m5968f(videoView, "videoView");
        String str = null;
        if (readableMap != null) {
            String strM23383h2 = AbstractC10516oO1.m23383h(readableMap, "type", null);
            strM23383h = AbstractC10516oO1.m23383h(readableMap, "value", null);
            str = strM23383h2;
        } else {
            strM23383h = null;
        }
        videoView.f41557V = str;
        videoView.f41558W = strM23383h;
        videoView.m24307a0(3, str, strM23383h);
    }

    @InterfaceC9871jM0(name = PROP_SELECTED_VIDEO_TRACK)
    public final void setSelectedVideoTrack(C10891rK0 videoView, ReadableMap readableMap) throws MissingResourceException, NumberFormatException {
        String strM23383h;
        O90.m5968f(videoView, "videoView");
        String str = null;
        if (readableMap != null) {
            String strM23383h2 = AbstractC10516oO1.m23383h(readableMap, "type", null);
            strM23383h = AbstractC10516oO1.m23383h(readableMap, "value", null);
            str = strM23383h2;
        } else {
            strM23383h = null;
        }
        videoView.f41555T = str;
        videoView.f41556U = strM23383h;
        if (videoView.f41582r) {
            return;
        }
        videoView.m24307a0(2, str, strM23383h);
    }

    @InterfaceC9871jM0(name = PROP_SHOW_NOTIFICATION_CONTROLS)
    public final void setShowNotificationControls(C10891rK0 videoView, boolean z) {
        O90.m5968f(videoView, "videoView");
        videoView.setShowNotificationControls(z);
    }

    @InterfaceC9871jM0(defaultInt = -16777216, name = PROP_SHUTTER_COLOR)
    public final void setShutterColor(C10891rK0 videoView, int color) {
        O90.m5968f(videoView, "videoView");
        videoView.setShutterColor(Integer.valueOf(color));
    }

    @InterfaceC9871jM0(name = PROP_SRC)
    public final void setSrc(C10891rK0 videoView, ReadableMap readableMap) {
        O90.m5968f(videoView, "videoView");
        Context applicationContext = videoView.getContext().getApplicationContext();
        O90.m5965c(applicationContext);
        videoView.setSrc(AbstractC11674xS1.m25895b(applicationContext, readableMap));
    }

    @InterfaceC9871jM0(name = PROP_SUBTITLE_STYLE)
    public final void setSubtitleStyle(C10891rK0 videoView, ReadableMap readableMap) {
        O90.m5968f(videoView, "videoView");
        C9328f61 c9328f61 = new C9328f61();
        c9328f61.f27077a = AbstractC10516oO1.m23381f(-1, "fontSize", readableMap);
        c9328f61.f27080d = AbstractC10516oO1.m23381f(0, "paddingBottom", readableMap);
        c9328f61.f27079c = AbstractC10516oO1.m23381f(0, "paddingTop", readableMap);
        c9328f61.f27078b = AbstractC10516oO1.m23381f(0, "paddingLeft", readableMap);
        AbstractC10516oO1.m23381f(0, "paddingRight", readableMap);
        c9328f61.f27081e = AbstractC10516oO1.m23380e(readableMap, "opacity", 1.0f);
        c9328f61.f27082f = AbstractC10516oO1.m23378c(readableMap, "subtitlesFollowVideo", true);
        videoView.setSubtitleStyle(c9328f61);
    }

    @InterfaceC9871jM0(defaultInt = 1, name = PROP_VIEW_TYPE)
    public final void setViewType(C10891rK0 videoView, int i) {
        O90.m5968f(videoView, "videoView");
        videoView.setViewType(i);
    }

    @InterfaceC9871jM0(defaultFloat = 1.0f, name = PROP_VOLUME)
    public final void setVolume(C10891rK0 videoView, float f) {
        O90.m5968f(videoView, "videoView");
        videoView.setVolumeModifier(f);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(S91 reactContext, C10891rK0 view) {
        O90.m5968f(reactContext, "reactContext");
        O90.m5968f(view, "view");
        super.addEventEmitters(reactContext, (S91) view);
        C11326uj1 c11326uj1 = view.f41559a;
        c11326uj1.getClass();
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(reactContext, view.getId());
        int iM6093d = OZ1.m6093d(reactContext);
        if (interfaceC6947uPM6091b != null) {
            C9817ix0 c9817ix0 = new C9817ix0(iM6093d, view.getId(), interfaceC6947uPM6091b);
            c11326uj1.f43812a = new C9406fj1(c9817ix0, 6);
            c11326uj1.f43813b = new C10302mj1(c9817ix0, c11326uj1);
            c11326uj1.f43814c = new C10430nj1(c9817ix0);
            c11326uj1.f43815d = new C10686pj1(0, c9817ix0);
            c11326uj1.f43816e = new C10686pj1(1, c9817ix0);
            c11326uj1.f43817f = new C11070sj1(c9817ix0, 0);
            c11326uj1.f43818g = new C11070sj1(c9817ix0, 1);
            c11326uj1.f43819h = new C9406fj1(c9817ix0, 7);
            c11326uj1.f43820i = new C9406fj1(c9817ix0, 8);
            c11326uj1.f43821j = new C9406fj1(c9817ix0, 0);
            c11326uj1.f43822k = new C9406fj1(c9817ix0, 1);
            c11326uj1.f43823l = new C9406fj1(c9817ix0, 2);
            c11326uj1.f43824m = new C9406fj1(c9817ix0, 3);
            c11326uj1.f43825n = new C9662hj1(c9817ix0, 0);
            c11326uj1.f43826o = new C9662hj1(c9817ix0, 1);
            c11326uj1.f43827p = new C9406fj1(c9817ix0, 4);
            c11326uj1.f43828q = new C9662hj1(c9817ix0, 2);
            c11326uj1.f43829r = new C9406fj1(c9817ix0, 5);
            c11326uj1.f43830s = new C9662hj1(c9817ix0, 3);
            c11326uj1.f43831t = new C9662hj1(c9817ix0, 4);
            c11326uj1.f43832u = new C9662hj1(c9817ix0, 5);
            c11326uj1.f43833v = new C10174lj1(c9817ix0, c11326uj1, 0);
            c11326uj1.f43834w = new C10174lj1(c9817ix0, c11326uj1, 1);
            c11326uj1.f43835x = new C10174lj1(c9817ix0, c11326uj1, 2);
            c11326uj1.f43836y = new C9662hj1(c9817ix0, 6);
            c11326uj1.f43837z = new C9662hj1(c9817ix0, 7);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C10891rK0 createViewInstance(S91 themedReactContext) {
        O90.m5968f(themedReactContext, "themedReactContext");
        ArrayList arrayList = VL0.f12523c.m25317A().f12525a;
        if (arrayList.size() > 2) {
            AbstractC10922rZ1.m24428b("ReactNativeVideoManager", "multiple Video displayed ?");
        }
        arrayList.add(this);
        return new C10891rK0(themedReactContext, this.config);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(C10891rK0 view) {
        O90.m5968f(view, "view");
        view.f41591v1.abandonAudioFocus(view.f41597y1);
        view.m24306Z();
        view.f41589u1.removeLifecycleEventListener(view);
        view.m24306Z();
        view.f41534C1 = true;
        view.m24296K();
        VL0.f12523c.m25317A().f12525a.remove(this);
    }
}

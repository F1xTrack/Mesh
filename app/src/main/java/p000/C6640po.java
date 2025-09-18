package p000;


/* renamed from: po */
/* loaded from: classes2.dex */
public final class C6640po extends AbstractC6386lo {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6640po(int i, boolean z) {
        super("session", "camera-not-ready", "The Camera is not ready yet! Wait for the onInitialized() callback!", null);
        switch (i) {
            case 8:
                super("device", "flash-not-available", "The Camera Device does not have a flash unit! Make sure you select a device where `device.hasFlash`/`device.hasTorch` is true.", null);
                break;
            case 12:
                super("capture", "frame-invalid", "Trying to access an already closed Frame! Are you trying to access the Image data outside of a Frame Processor's lifetime?\n- If you want to use `console.log(frame)`, use `console.log(frame.toString())` instead.\n- If you want to do async processing, use `runAsync(...)` instead.\n- If you want to use runOnJS, increment it's ref-count: `frame.incrementRefCount()`", null);
                break;
            case 22:
                super("format", "low-light-boost-not-supported-with-hdr", "The low light boost extension does not work when HDR is enabled! Disable either `lowLightBoost` or `videoHdr`/`photoHdr`.", null);
                break;
            case 24:
                super(AttributionReporter.SYSTEM_PERMISSION, "microphone-permission-denied", "The Microphone permission was denied! If you want to record Video without sound, pass `audio={false}`.", null);
                break;
            case 25:
                super("device", "no-device", "No device was set! Use `useCameraDevice(..)` or `Camera.getAvailableCameraDevices()` to select a suitable Camera device.", null);
                break;
            case 27:
                super("capture", "no-recording-in-progress", "There was no active video recording in progress! Did you call stopRecording() twice?", null);
                break;
            case 29:
                super("capture", "photo-not-enabled", "Photo capture is disabled! Pass `photo={true}` to enable photo capture.", null);
                break;
            default:
                break;
        }
    }

    public C6640po(String str, String str2) {
        super("parameter", "invalid-parameter", AbstractC11153tN0.m24912x("The given value for ", str, " could not be parsed! (Received: ", str2, ")"), null);
    }

    public C6640po(int i) {
        super("format", "invalid-fps", AbstractC7222ym.m26230g(i, "The given format cannot run at ", " FPS! Make sure your FPS is lower than `format.maxFps` but higher than `format.minFps`."), null);
    }

    public C6640po(EnumC8373Uj1 enumC8373Uj1) {
        O90.m5968f(enumC8373Uj1, "mode");
        StringBuilder sb = new StringBuilder("The given format does not support the videoStabilizationMode \"");
        String str = enumC8373Uj1.f12013a;
        sb.append(str);
        sb.append("\"! Select a format that contains ");
        sb.append(str);
        sb.append(" in `format.supportedVideoStabilizationModes`.");
        super("format", "invalid-video-stabilization-mode", sb.toString(), null);
    }

    public C6640po(String str) {
        super("capture", "invalid-path", AbstractC7222ym.m26234k("The given path (", str, ") is invalid, or not writable!"), null);
    }
}

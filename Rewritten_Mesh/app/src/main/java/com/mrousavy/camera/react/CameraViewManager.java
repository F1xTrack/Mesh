package com.mrousavy.camera.react;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.AbstractC10889rJ0;
import p000.AbstractC7293zu;
import p000.C0926Oi;
import p000.C4049fN;
import p000.C4076fo;
import p000.C4140gp;
import p000.C4145gu;
import p000.C4203hp;
import p000.C6640po;
import p000.EnumC0919Ob;
import p000.EnumC10105lB0;
import p000.EnumC10493oD0;
import p000.EnumC10926rb1;
import p000.EnumC4208hu;
import p000.EnumC8373Uj1;
import p000.EnumC8982cS0;
import p000.EnumC9693hz0;
import p000.InterfaceC9871jM0;
import p000.NV1;
import p000.O90;
import p000.S91;

@Metadata(m22266d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0016\u0018\u0000 Z2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001[B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001f\u0010\u001bJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0018H\u0007¢\u0006\u0004\b!\u0010\u001bJ\u001f\u0010#\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0018H\u0007¢\u0006\u0004\b#\u0010\u001bJ\u001f\u0010%\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0018H\u0007¢\u0006\u0004\b%\u0010\u001bJ\u001f\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0018H\u0007¢\u0006\u0004\b'\u0010\u001bJ!\u0010)\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b)\u0010\u0017J\u001f\u0010+\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0018H\u0007¢\u0006\u0004\b+\u0010\u001bJ\u001f\u0010-\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0018H\u0007¢\u0006\u0004\b-\u0010\u001bJ!\u0010/\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b/\u0010\u0017J\u001f\u00101\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0018H\u0007¢\u0006\u0004\b1\u0010\u001bJ!\u00104\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\b4\u00105J!\u00107\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b7\u0010\u0017J!\u00109\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b9\u0010\u0017J\u001f\u0010<\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010>\u001a\u00020:H\u0007¢\u0006\u0004\b?\u0010=J\u001f\u0010A\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u0018H\u0007¢\u0006\u0004\bA\u0010\u001bJ!\u0010C\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u0010B\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\bC\u0010\u0017J\u001f\u0010E\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u0018H\u0007¢\u0006\u0004\bE\u0010\u001bJ\u001f\u0010H\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010G\u001a\u00020FH\u0007¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010J\u001a\u00020FH\u0007¢\u0006\u0004\bK\u0010IJ\u001f\u0010M\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u0018H\u0007¢\u0006\u0004\bM\u0010\u001bJ\u001f\u0010O\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u0018H\u0007¢\u0006\u0004\bO\u0010\u001bJ!\u0010Q\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\bQ\u0010\u0017J\u001f\u0010S\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010R\u001a\u00020FH\u0007¢\u0006\u0004\bS\u0010IJ\u001f\u0010U\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010T\u001a\u00020FH\u0007¢\u0006\u0004\bU\u0010IJ!\u0010W\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u0010V\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\bW\u0010\u0017J!\u0010Y\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\b\u0010X\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\bY\u00105¨\u0006\\"}, m22267d2 = {"Lcom/mrousavy/camera/react/CameraViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lgp;", "<init>", "()V", "LS91;", "context", "createViewInstance", "(LS91;)Lgp;", "view", "LTf1;", "onAfterUpdateTransaction", "(Lgp;)V", "", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "onDropViewInstance", "cameraId", "setCameraId", "(Lgp;Ljava/lang/String;)V", "", "isMirrored", "setIsMirrored", "(Lgp;Z)V", "preview", "setPreview", "photo", "setPhoto", "video", "setVideo", "audio", "setAudio", "enableLocation", "setEnableLocation", "enableFrameProcessor", "setEnableFrameProcessor", "pixelFormat", "setPixelFormat", "enableDepthData", "setEnableDepthData", "enableZoomGesture", "setEnableZoomGesture", "videoStabilizationMode", "setVideoStabilizationMode", "enablePortraitEffectsMatteDelivery", "setEnablePortraitEffectsMatteDelivery", "Lcom/facebook/react/bridge/ReadableMap;", "format", "setFormat", "(Lgp;Lcom/facebook/react/bridge/ReadableMap;)V", "resizeMode", "setResizeMode", "androidPreviewViewType", "setAndroidPreviewViewType", "", "minFps", "setMinFps", "(Lgp;I)V", "maxFps", "setMaxFps", "photoHdr", "setPhotoHdr", "photoQualityBalance", "setPhotoQualityBalance", "videoHdr", "setVideoHdr", "", "videoBitRateOverride", "setVideoBitRateOverride", "(Lgp;D)V", "videoBitRateMultiplier", "setVideoBitRateMultiplier", "lowLightBoost", "setLowLightBoost", "isActive", "setIsActive", "torch", "setTorch", "zoom", "setZoom", "exposure", "setExposure", "outputOrientation", "setOrientation", "codeScannerOptions", "setCodeScanner", "Companion", "hp", "react-native-vision-camera_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CameraViewManager extends ViewGroupManager<C4140gp> {
    public static final C4203hp Companion = new C4203hp();
    public static final String TAG = "CameraView";

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        c0926OiM24254a.m6125k("topCameraViewReady", AbstractC10889rJ0.m24256c("registrationName", "onViewReady"));
        c0926OiM24254a.m6125k("topCameraInitialized", AbstractC10889rJ0.m24256c("registrationName", "onInitialized"));
        c0926OiM24254a.m6125k("topCameraStarted", AbstractC10889rJ0.m24256c("registrationName", "onStarted"));
        c0926OiM24254a.m6125k("topCameraStopped", AbstractC10889rJ0.m24256c("registrationName", "onStopped"));
        c0926OiM24254a.m6125k("topCameraShutter", AbstractC10889rJ0.m24256c("registrationName", "onShutter"));
        c0926OiM24254a.m6125k("topCameraError", AbstractC10889rJ0.m24256c("registrationName", "onError"));
        c0926OiM24254a.m6125k("topCameraCodeScanned", AbstractC10889rJ0.m24256c("registrationName", "onCodeScanned"));
        c0926OiM24254a.m6125k("topCameraPreviewStarted", AbstractC10889rJ0.m24256c("registrationName", "onPreviewStarted"));
        c0926OiM24254a.m6125k("topCameraPreviewStopped", AbstractC10889rJ0.m24256c("registrationName", "onPreviewStopped"));
        c0926OiM24254a.m6125k("topCameraOutputOrientationChanged", AbstractC10889rJ0.m24256c("registrationName", "onOutputOrientationChanged"));
        c0926OiM24254a.m6125k("topCameraPreviewOrientationChanged", AbstractC10889rJ0.m24256c("registrationName", "onPreviewOrientationChanged"));
        c0926OiM24254a.m6125k("topCameraAverageFpsChanged", AbstractC10889rJ0.m24256c("registrationName", "onAverageFpsChanged"));
        return c0926OiM24254a.m6122h();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CameraView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @InterfaceC9871jM0(name = "androidPreviewViewType")
    public final void setAndroidPreviewViewType(C4140gp view, String androidPreviewViewType) throws C6640po {
        EnumC10493oD0 enumC10493oD0;
        O90.m5968f(view, "view");
        if (androidPreviewViewType == null) {
            view.setAndroidPreviewViewType(EnumC10493oD0.f38890c);
            return;
        }
        EnumC10493oD0.f38889b.getClass();
        if (O90.m5963a(androidPreviewViewType, "surface-view")) {
            enumC10493oD0 = EnumC10493oD0.f38890c;
        } else {
            if (!O90.m5963a(androidPreviewViewType, "texture-view")) {
                throw new C6640po("androidPreviewViewType", androidPreviewViewType);
            }
            enumC10493oD0 = EnumC10493oD0.f38891d;
        }
        view.setAndroidPreviewViewType(enumC10493oD0);
    }

    @InterfaceC9871jM0(name = "audio")
    public final void setAudio(C4140gp view, boolean audio) {
        O90.m5968f(view, "view");
        view.setAudio(audio);
    }

    @InterfaceC9871jM0(name = "cameraId")
    public final void setCameraId(C4140gp view, String cameraId) {
        O90.m5968f(view, "view");
        O90.m5968f(cameraId, "cameraId");
        view.setCameraId(cameraId);
    }

    @InterfaceC9871jM0(name = "codeScannerOptions")
    public final void setCodeScanner(C4140gp view, ReadableMap codeScannerOptions) throws C6640po {
        EnumC4208hu enumC4208hu;
        O90.m5968f(view, "view");
        if (codeScannerOptions == null) {
            view.setCodeScannerOptions(null);
            return;
        }
        ReadableArray array = codeScannerOptions.getArray("codeTypes");
        if (array == null) {
            throw new C6640po("codeScanner", codeScannerOptions.toString());
        }
        ArrayList<Object> arrayList = array.toArrayList();
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        for (Object obj : arrayList) {
            NV1 nv1 = EnumC4208hu.f28652b;
            O90.m5966d(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            nv1.getClass();
            switch (str.hashCode()) {
                case -1310519683:
                    if (!str.equals("ean-13")) {
                        throw new C6640po("codeType", str);
                    }
                    enumC4208hu = EnumC4208hu.f28657g;
                    break;
                case -869195177:
                    if (!str.equals("code-128")) {
                        throw new C6640po("codeType", str);
                    }
                    enumC4208hu = EnumC4208hu.f28653c;
                    break;
                case -720296449:
                    if (!str.equals("pdf-417")) {
                        throw new C6640po("codeType", str);
                    }
                    enumC4208hu = EnumC4208hu.f28663m;
                    break;
                case 3617:
                    if (!str.equals("qr")) {
                        throw new C6640po("codeType", str);
                    }
                    enumC4208hu = EnumC4208hu.f28662l;
                    break;
                case 104603:
                    if (!str.equals("itf")) {
                        throw new C6640po("codeType", str);
                    }
                    enumC4208hu = EnumC4208hu.f28659i;
                    break;
                case 93330745:
                    if (!str.equals("aztec")) {
                        throw new C6640po("codeType", str);
                    }
                    enumC4208hu = EnumC4208hu.f28664n;
                    break;
                case 96272509:
                    if (!str.equals("ean-8")) {
                        throw new C6640po("codeType", str);
                    }
                    enumC4208hu = EnumC4208hu.f28658h;
                    break;
                case 111485180:
                    if (!str.equals("upc-a")) {
                        throw new C6640po("codeType", str);
                    }
                    enumC4208hu = EnumC4208hu.f28661k;
                    break;
                case 111485184:
                    if (!str.equals("upc-e")) {
                        throw new C6640po("codeType", str);
                    }
                    enumC4208hu = EnumC4208hu.f28660j;
                    break;
                case 941726090:
                    if (!str.equals("codabar")) {
                        throw new C6640po("codeType", str);
                    }
                    enumC4208hu = EnumC4208hu.f28656f;
                    break;
                case 941792838:
                    if (!str.equals("code-39")) {
                        throw new C6640po("codeType", str);
                    }
                    enumC4208hu = EnumC4208hu.f28654d;
                    break;
                case 941793018:
                    if (!str.equals("code-93")) {
                        throw new C6640po("codeType", str);
                    }
                    enumC4208hu = EnumC4208hu.f28655e;
                    break;
                case 1350827844:
                    if (!str.equals("data-matrix")) {
                        throw new C6640po("codeType", str);
                    }
                    enumC4208hu = EnumC4208hu.f28665o;
                    break;
                default:
                    throw new C6640po("codeType", str);
            }
            arrayList2.add(enumC4208hu);
        }
        view.setCodeScannerOptions(new C4145gu(arrayList2));
    }

    @InterfaceC9871jM0(name = "enableDepthData")
    public final void setEnableDepthData(C4140gp view, boolean enableDepthData) {
        O90.m5968f(view, "view");
        view.setEnableDepthData(enableDepthData);
    }

    @InterfaceC9871jM0(name = "enableFrameProcessor")
    public final void setEnableFrameProcessor(C4140gp view, boolean enableFrameProcessor) {
        O90.m5968f(view, "view");
        view.setEnableFrameProcessor(enableFrameProcessor);
    }

    @InterfaceC9871jM0(name = "enableLocation")
    public final void setEnableLocation(C4140gp view, boolean enableLocation) {
        O90.m5968f(view, "view");
        view.setEnableLocation(enableLocation);
    }

    @InterfaceC9871jM0(name = "enablePortraitEffectsMatteDelivery")
    public final void setEnablePortraitEffectsMatteDelivery(C4140gp view, boolean enablePortraitEffectsMatteDelivery) {
        O90.m5968f(view, "view");
        view.setEnablePortraitEffectsMatteDelivery(enablePortraitEffectsMatteDelivery);
    }

    @InterfaceC9871jM0(name = "enableZoomGesture")
    public final void setEnableZoomGesture(C4140gp view, boolean enableZoomGesture) {
        O90.m5968f(view, "view");
        view.setEnableZoomGesture(enableZoomGesture);
    }

    @InterfaceC9871jM0(name = "exposure")
    public final void setExposure(C4140gp view, double exposure) {
        O90.m5968f(view, "view");
        view.setExposure(exposure);
    }

    @InterfaceC9871jM0(name = "format")
    public final void setFormat(C4140gp view, ReadableMap format) throws C6640po {
        O90.m5968f(view, "view");
        if (format == null) {
            view.setFormat(null);
            return;
        }
        ReadableArray array = format.getArray("videoStabilizationModes");
        if (array == null) {
            throw new C6640po("format", format.toString());
        }
        ArrayList<Object> arrayList = array.toArrayList();
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        for (Object obj : arrayList) {
            C4049fN c4049fN = EnumC8373Uj1.f12007b;
            O90.m5966d(obj, "null cannot be cast to non-null type kotlin.String");
            c4049fN.getClass();
            arrayList2.add(C4049fN.m18223m((String) obj));
        }
        C4049fN c4049fN2 = EnumC0919Ob.f8507b;
        String string = format.getString("autoFocusSystem");
        c4049fN2.getClass();
        view.setFormat(new C4076fo(format.getInt("videoWidth"), format.getInt("videoHeight"), format.getInt("photoWidth"), format.getInt("photoHeight"), format.getDouble("minFps"), format.getDouble("maxFps"), format.getDouble("minISO"), format.getDouble("maxISO"), format.getDouble("fieldOfView"), arrayList2, O90.m5963a(string, "contrast-detection") ? EnumC0919Ob.f8508c : EnumC0919Ob.f8509d, format.getBoolean("supportsVideoHdr"), format.getBoolean("supportsPhotoHdr"), format.getBoolean("supportsDepthCapture")));
    }

    @InterfaceC9871jM0(name = "isActive")
    public final void setIsActive(C4140gp view, boolean isActive) {
        O90.m5968f(view, "view");
        view.setActive(isActive);
    }

    @InterfaceC9871jM0(name = "isMirrored")
    public final void setIsMirrored(C4140gp view, boolean isMirrored) {
        O90.m5968f(view, "view");
        view.setMirrored(isMirrored);
    }

    @InterfaceC9871jM0(name = "lowLightBoost")
    public final void setLowLightBoost(C4140gp view, boolean lowLightBoost) {
        O90.m5968f(view, "view");
        view.setLowLightBoost(lowLightBoost);
    }

    @InterfaceC9871jM0(defaultInt = -1, name = "maxFps")
    public final void setMaxFps(C4140gp view, int maxFps) {
        O90.m5968f(view, "view");
        view.setMaxFps(maxFps > 0 ? Integer.valueOf(maxFps) : null);
    }

    @InterfaceC9871jM0(defaultInt = -1, name = "minFps")
    public final void setMinFps(C4140gp view, int minFps) {
        O90.m5968f(view, "view");
        view.setMinFps(minFps > 0 ? Integer.valueOf(minFps) : null);
    }

    @InterfaceC9871jM0(name = "outputOrientation")
    public final void setOrientation(C4140gp view, String outputOrientation) {
        O90.m5968f(view, "view");
        if (outputOrientation == null) {
            view.setOutputOrientation(EnumC9693hz0.f28706c);
            return;
        }
        EnumC9693hz0.f28705b.getClass();
        EnumC9693hz0 enumC9693hz0 = (!O90.m5963a(outputOrientation, "device") && O90.m5963a(outputOrientation, "preview")) ? EnumC9693hz0.f28707d : EnumC9693hz0.f28706c;
        view.setOutputOrientation(enumC9693hz0);
    }

    @InterfaceC9871jM0(name = "photo")
    public final void setPhoto(C4140gp view, boolean photo) {
        O90.m5968f(view, "view");
        view.setPhoto(photo);
    }

    @InterfaceC9871jM0(name = "photoHdr")
    public final void setPhotoHdr(C4140gp view, boolean photoHdr) {
        O90.m5968f(view, "view");
        view.setPhotoHdr(photoHdr);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0040  */
    @p000.InterfaceC9871jM0(name = "photoQualityBalance")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPhotoQualityBalance(p000.C4140gp r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            p000.O90.m5968f(r3, r0)
            if (r4 == 0) goto L49
            OL0 r0 = p000.EnumC11139tG0.f42982b
            r0.getClass()
            int r0 = r4.hashCode()
            r1 = -1924829944(0xffffffff8d456d08, float:-6.0836553E-31)
            if (r0 == r1) goto L38
            r1 = 109641799(0x6890047, float:5.153408E-35)
            if (r0 == r1) goto L2c
            r1 = 651215103(0x26d0c0ff, float:1.4485211E-15)
            if (r0 == r1) goto L20
            goto L40
        L20:
            java.lang.String r0 = "quality"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L29
            goto L40
        L29:
            tG0 r4 = p000.EnumC11139tG0.f42985e
            goto L45
        L2c:
            java.lang.String r0 = "speed"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L35
            goto L40
        L35:
            tG0 r4 = p000.EnumC11139tG0.f42983c
            goto L45
        L38:
            java.lang.String r0 = "balanced"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L43
        L40:
            tG0 r4 = p000.EnumC11139tG0.f42984d
            goto L45
        L43:
            tG0 r4 = p000.EnumC11139tG0.f42984d
        L45:
            r3.setPhotoQualityBalance(r4)
            goto L4e
        L49:
            tG0 r4 = p000.EnumC11139tG0.f42984d
            r3.setPhotoQualityBalance(r4)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.react.CameraViewManager.setPhotoQualityBalance(gp, java.lang.String):void");
    }

    @InterfaceC9871jM0(name = "pixelFormat")
    public final void setPixelFormat(C4140gp view, String pixelFormat) throws C6640po {
        EnumC10105lB0 enumC10105lB0;
        O90.m5968f(view, "view");
        if (pixelFormat == null) {
            view.setPixelFormat(EnumC10105lB0.f36940c);
            return;
        }
        EnumC10105lB0.f36939b.getClass();
        int iHashCode = pixelFormat.hashCode();
        if (iHashCode == -284840886) {
            if (pixelFormat.equals("unknown")) {
                enumC10105lB0 = EnumC10105lB0.f36942e;
                view.setPixelFormat(enumC10105lB0);
                return;
            }
            throw new C6640po("pixelFormat", pixelFormat);
        }
        if (iHashCode == 112845) {
            if (pixelFormat.equals("rgb")) {
                enumC10105lB0 = EnumC10105lB0.f36941d;
                view.setPixelFormat(enumC10105lB0);
                return;
            }
            throw new C6640po("pixelFormat", pixelFormat);
        }
        if (iHashCode == 120026 && pixelFormat.equals("yuv")) {
            enumC10105lB0 = EnumC10105lB0.f36940c;
            view.setPixelFormat(enumC10105lB0);
            return;
        }
        throw new C6640po("pixelFormat", pixelFormat);
    }

    @InterfaceC9871jM0(defaultBoolean = true, name = "preview")
    public final void setPreview(C4140gp view, boolean preview) {
        O90.m5968f(view, "view");
        view.setPreview(preview);
    }

    @InterfaceC9871jM0(name = "resizeMode")
    public final void setResizeMode(C4140gp view, String resizeMode) throws C6640po {
        EnumC8982cS0 enumC8982cS0;
        O90.m5968f(view, "view");
        if (resizeMode == null) {
            view.setResizeMode(EnumC8982cS0.f17520c);
            return;
        }
        EnumC8982cS0.f17519b.getClass();
        if (O90.m5963a(resizeMode, "cover")) {
            enumC8982cS0 = EnumC8982cS0.f17520c;
        } else {
            if (!O90.m5963a(resizeMode, "contain")) {
                throw new C6640po("resizeMode", resizeMode);
            }
            enumC8982cS0 = EnumC8982cS0.f17521d;
        }
        view.setResizeMode(enumC8982cS0);
    }

    @InterfaceC9871jM0(name = "torch")
    public final void setTorch(C4140gp view, String torch) {
        O90.m5968f(view, "view");
        if (torch == null) {
            view.setTorch(EnumC10926rb1.f41746c);
            return;
        }
        EnumC10926rb1.f41745b.getClass();
        EnumC10926rb1 enumC10926rb1 = (!O90.m5963a(torch, "off") && O90.m5963a(torch, "on")) ? EnumC10926rb1.f41747d : EnumC10926rb1.f41746c;
        view.setTorch(enumC10926rb1);
    }

    @InterfaceC9871jM0(name = "video")
    public final void setVideo(C4140gp view, boolean video) {
        O90.m5968f(view, "view");
        view.setVideo(video);
    }

    @InterfaceC9871jM0(defaultDouble = -1.0d, name = "videoBitRateMultiplier")
    public final void setVideoBitRateMultiplier(C4140gp view, double videoBitRateMultiplier) {
        O90.m5968f(view, "view");
        if (videoBitRateMultiplier == -1.0d) {
            view.setVideoBitRateMultiplier(null);
        } else {
            view.setVideoBitRateMultiplier(Double.valueOf(videoBitRateMultiplier));
        }
    }

    @InterfaceC9871jM0(defaultDouble = -1.0d, name = "videoBitRateOverride")
    public final void setVideoBitRateOverride(C4140gp view, double videoBitRateOverride) {
        O90.m5968f(view, "view");
        if (videoBitRateOverride == -1.0d) {
            view.setVideoBitRateOverride(null);
        } else {
            view.setVideoBitRateOverride(Double.valueOf(videoBitRateOverride));
        }
    }

    @InterfaceC9871jM0(name = "videoHdr")
    public final void setVideoHdr(C4140gp view, boolean videoHdr) {
        O90.m5968f(view, "view");
        view.setVideoHdr(videoHdr);
    }

    @InterfaceC9871jM0(name = "videoStabilizationMode")
    public final void setVideoStabilizationMode(C4140gp view, String videoStabilizationMode) {
        O90.m5968f(view, "view");
        if (videoStabilizationMode == null) {
            view.setVideoStabilizationMode(null);
        } else {
            EnumC8373Uj1.f12007b.getClass();
            view.setVideoStabilizationMode(C4049fN.m18223m(videoStabilizationMode));
        }
    }

    @InterfaceC9871jM0(name = "zoom")
    public final void setZoom(C4140gp view, double zoom) {
        O90.m5968f(view, "view");
        view.setZoom((float) zoom);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C4140gp createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        return new C4140gp(context);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C4140gp view) {
        O90.m5968f(view, "view");
        super.onAfterUpdateTransaction((CameraViewManager) view);
        view.m18651d();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(C4140gp view) {
        O90.m5968f(view, "view");
        view.f28009G.close();
        super.onDropViewInstance((CameraViewManager) view);
    }
}

package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* renamed from: pQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6454pQ {
    public static final DQ[] c;
    public static final DQ[][] d;
    public static final HashSet e;
    public static final String f;
    public final ArrayList a;
    public final ByteOrder b;

    static {
        DQ[] dqArr = {new DQ("ImageWidth", 256, 3, 4), new DQ("ImageLength", 257, 3, 4), new DQ("Make", 271, 2), new DQ("Model", 272, 2), new DQ("Orientation", 274, 3), new DQ("XResolution", 282, 5), new DQ("YResolution", 283, 5), new DQ("ResolutionUnit", 296, 3), new DQ("Software", 305, 2), new DQ("DateTime", 306, 2), new DQ("YCbCrPositioning", 531, 3), new DQ("SubIFDPointer", 330, 4), new DQ("ExifIFDPointer", 34665, 4), new DQ("GPSInfoIFDPointer", 34853, 4)};
        DQ[] dqArr2 = {new DQ("ExposureTime", 33434, 5), new DQ("FNumber", 33437, 5), new DQ("ExposureProgram", 34850, 3), new DQ("PhotographicSensitivity", 34855, 3), new DQ("SensitivityType", 34864, 3), new DQ("ExifVersion", 36864, 2), new DQ("DateTimeOriginal", 36867, 2), new DQ("DateTimeDigitized", 36868, 2), new DQ("ComponentsConfiguration", 37121, 7), new DQ("ShutterSpeedValue", 37377, 10), new DQ("ApertureValue", 37378, 5), new DQ("BrightnessValue", 37379, 10), new DQ("ExposureBiasValue", 37380, 10), new DQ("MaxApertureValue", 37381, 5), new DQ("MeteringMode", 37383, 3), new DQ("LightSource", 37384, 3), new DQ("Flash", 37385, 3), new DQ("FocalLength", 37386, 5), new DQ("SubSecTime", 37520, 2), new DQ("SubSecTimeOriginal", 37521, 2), new DQ("SubSecTimeDigitized", 37522, 2), new DQ("FlashpixVersion", 40960, 7), new DQ("ColorSpace", 40961, 3), new DQ("PixelXDimension", 40962, 3, 4), new DQ("PixelYDimension", 40963, 3, 4), new DQ("InteroperabilityIFDPointer", 40965, 4), new DQ("FocalPlaneResolutionUnit", 41488, 3), new DQ("SensingMethod", 41495, 3), new DQ("FileSource", 41728, 7), new DQ("SceneType", 41729, 7), new DQ("CustomRendered", 41985, 3), new DQ("ExposureMode", 41986, 3), new DQ("WhiteBalance", 41987, 3), new DQ("SceneCaptureType", 41990, 3), new DQ("Contrast", 41992, 3), new DQ("Saturation", 41993, 3), new DQ("Sharpness", 41994, 3)};
        DQ[] dqArr3 = {new DQ("GPSVersionID", 0, 1), new DQ("GPSLatitudeRef", 1, 2), new DQ("GPSLatitude", 2, 5, 10), new DQ("GPSLongitudeRef", 3, 2), new DQ("GPSLongitude", 4, 5, 10), new DQ("GPSAltitudeRef", 5, 1), new DQ("GPSAltitude", 6, 5), new DQ("GPSTimeStamp", 7, 5), new DQ("GPSSpeedRef", 12, 2), new DQ("GPSTrackRef", 14, 2), new DQ("GPSImgDirectionRef", 16, 2), new DQ("GPSDestBearingRef", 23, 2), new DQ("GPSDestDistanceRef", 25, 2)};
        c = new DQ[]{new DQ("SubIFDPointer", 330, 4), new DQ("ExifIFDPointer", 34665, 4), new DQ("GPSInfoIFDPointer", 34853, 4), new DQ("InteroperabilityIFDPointer", 40965, 4)};
        d = new DQ[][]{dqArr, dqArr2, dqArr3, new DQ[]{new DQ("InteroperabilityIndex", 1, 2)}};
        e = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        f = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public C6454pQ(ByteOrder byteOrder, ArrayList arrayList) {
        AbstractC3377dM1.i(arrayList.size() == 4, "Malformed attributes list. Number of IFDs mismatch.");
        this.b = byteOrder;
        this.a = arrayList;
    }

    public final Map a(int i) {
        AbstractC3377dM1.f(i, 0, 4, AbstractC8235ym.g(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map) this.a.get(i);
    }
}

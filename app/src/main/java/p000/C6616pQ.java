package p000;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* renamed from: pQ */
/* loaded from: classes.dex */
public final class C6616pQ {

    /* renamed from: c */
    public static final C0216DQ[] f40055c;

    /* renamed from: d */
    public static final C0216DQ[][] f40056d;

    /* renamed from: e */
    public static final HashSet f40057e;

    /* renamed from: f */
    public static final String f40058f;

    /* renamed from: a */
    public final ArrayList f40059a;

    /* renamed from: b */
    public final ByteOrder f40060b;

    static {
        C0216DQ[] c0216dqArr = {new C0216DQ("ImageWidth", 256, 3, 4), new C0216DQ("ImageLength", 257, 3, 4), new C0216DQ("Make", 271, 2), new C0216DQ("Model", 272, 2), new C0216DQ("Orientation", 274, 3), new C0216DQ("XResolution", 282, 5), new C0216DQ("YResolution", 283, 5), new C0216DQ("ResolutionUnit", 296, 3), new C0216DQ("Software", 305, 2), new C0216DQ("DateTime", 306, 2), new C0216DQ("YCbCrPositioning", 531, 3), new C0216DQ("SubIFDPointer", 330, 4), new C0216DQ("ExifIFDPointer", 34665, 4), new C0216DQ("GPSInfoIFDPointer", 34853, 4)};
        C0216DQ[] c0216dqArr2 = {new C0216DQ("ExposureTime", 33434, 5), new C0216DQ("FNumber", 33437, 5), new C0216DQ("ExposureProgram", 34850, 3), new C0216DQ("PhotographicSensitivity", 34855, 3), new C0216DQ("SensitivityType", 34864, 3), new C0216DQ("ExifVersion", 36864, 2), new C0216DQ("DateTimeOriginal", 36867, 2), new C0216DQ("DateTimeDigitized", 36868, 2), new C0216DQ("ComponentsConfiguration", 37121, 7), new C0216DQ("ShutterSpeedValue", 37377, 10), new C0216DQ("ApertureValue", 37378, 5), new C0216DQ("BrightnessValue", 37379, 10), new C0216DQ("ExposureBiasValue", 37380, 10), new C0216DQ("MaxApertureValue", 37381, 5), new C0216DQ("MeteringMode", 37383, 3), new C0216DQ("LightSource", 37384, 3), new C0216DQ("Flash", 37385, 3), new C0216DQ("FocalLength", 37386, 5), new C0216DQ("SubSecTime", 37520, 2), new C0216DQ("SubSecTimeOriginal", 37521, 2), new C0216DQ("SubSecTimeDigitized", 37522, 2), new C0216DQ("FlashpixVersion", 40960, 7), new C0216DQ("ColorSpace", 40961, 3), new C0216DQ("PixelXDimension", 40962, 3, 4), new C0216DQ("PixelYDimension", 40963, 3, 4), new C0216DQ("InteroperabilityIFDPointer", 40965, 4), new C0216DQ("FocalPlaneResolutionUnit", 41488, 3), new C0216DQ("SensingMethod", 41495, 3), new C0216DQ("FileSource", 41728, 7), new C0216DQ("SceneType", 41729, 7), new C0216DQ("CustomRendered", 41985, 3), new C0216DQ("ExposureMode", 41986, 3), new C0216DQ("WhiteBalance", 41987, 3), new C0216DQ("SceneCaptureType", 41990, 3), new C0216DQ("Contrast", 41992, 3), new C0216DQ("Saturation", 41993, 3), new C0216DQ("Sharpness", 41994, 3)};
        C0216DQ[] c0216dqArr3 = {new C0216DQ("GPSVersionID", 0, 1), new C0216DQ("GPSLatitudeRef", 1, 2), new C0216DQ("GPSLatitude", 2, 5, 10), new C0216DQ("GPSLongitudeRef", 3, 2), new C0216DQ("GPSLongitude", 4, 5, 10), new C0216DQ("GPSAltitudeRef", 5, 1), new C0216DQ("GPSAltitude", 6, 5), new C0216DQ("GPSTimeStamp", 7, 5), new C0216DQ("GPSSpeedRef", 12, 2), new C0216DQ("GPSTrackRef", 14, 2), new C0216DQ("GPSImgDirectionRef", 16, 2), new C0216DQ("GPSDestBearingRef", 23, 2), new C0216DQ("GPSDestDistanceRef", 25, 2)};
        f40055c = new C0216DQ[]{new C0216DQ("SubIFDPointer", 330, 4), new C0216DQ("ExifIFDPointer", 34665, 4), new C0216DQ("GPSInfoIFDPointer", 34853, 4), new C0216DQ("InteroperabilityIFDPointer", 40965, 4)};
        f40056d = new C0216DQ[][]{c0216dqArr, c0216dqArr2, c0216dqArr3, new C0216DQ[]{new C0216DQ("InteroperabilityIndex", 1, 2)}};
        f40057e = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        f40058f = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public C6616pQ(ByteOrder byteOrder, ArrayList arrayList) {
        AbstractC9104dM1.m17550i(arrayList.size() == 4, "Malformed attributes list. Number of IFDs mismatch.");
        this.f40060b = byteOrder;
        this.f40059a = arrayList;
    }

    /* renamed from: a */
    public final Map m23774a(int i) {
        AbstractC9104dM1.m17547f(i, 0, 4, AbstractC7222ym.m26230g(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map) this.f40059a.get(i);
    }
}

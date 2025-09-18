package p000;

import android.location.Location;
import com.yandex.varioqub.config.model.ConfigValue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: kQ */
/* loaded from: classes.dex */
public final class C6299kQ {

    /* renamed from: b */
    public static final C6809sD f36489b = new C6809sD(3);

    /* renamed from: c */
    public static final C6809sD f36490c = new C6809sD(4);

    /* renamed from: d */
    public static final C6809sD f36491d = new C6809sD(5);

    /* renamed from: e */
    public static final List f36492e = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");

    /* renamed from: f */
    public static final List f36493f = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a */
    public final C7137xQ f36494a;

    public C6299kQ(C7137xQ c7137xQ) {
        this.f36494a = c7137xQ;
    }

    /* renamed from: a */
    public final void m22201a(Location location) throws NumberFormatException {
        C7137xQ c7137xQ = this.f36494a;
        if (location == null) {
            return;
        }
        c7137xQ.m25862G("GPSProcessingMethod", location.getProvider());
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        if (latitude < -90.0d || latitude > 90.0d || Double.isNaN(latitude)) {
            throw new IllegalArgumentException("Latitude value " + latitude + " is not valid.");
        }
        if (longitude < -180.0d || longitude > 180.0d || Double.isNaN(longitude)) {
            throw new IllegalArgumentException("Longitude value " + longitude + " is not valid.");
        }
        c7137xQ.m25862G("GPSLatitudeRef", latitude >= ConfigValue.DOUBLE_DEFAULT_VALUE ? "N" : "S");
        c7137xQ.m25862G("GPSLatitude", C7137xQ.m25851b(Math.abs(latitude)));
        c7137xQ.m25862G("GPSLongitudeRef", longitude >= ConfigValue.DOUBLE_DEFAULT_VALUE ? "E" : "W");
        c7137xQ.m25862G("GPSLongitude", C7137xQ.m25851b(Math.abs(longitude)));
        double altitude = location.getAltitude();
        String str = altitude >= ConfigValue.DOUBLE_DEFAULT_VALUE ? "0" : "1";
        c7137xQ.m25862G("GPSAltitude", new C7011vQ(Math.abs(altitude)).toString());
        c7137xQ.m25862G("GPSAltitudeRef", str);
        c7137xQ.m25862G("GPSSpeedRef", "K");
        c7137xQ.m25862G("GPSSpeed", new C7011vQ((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = C7137xQ.f45591R.format(new Date(location.getTime())).split("\\s+", -1);
        c7137xQ.m25862G("GPSDateStamp", strArrSplit[0]);
        c7137xQ.m25862G("GPSTimeStamp", strArrSplit[1]);
    }

    /* renamed from: b */
    public final void m22202b(C6299kQ c6299kQ) throws NumberFormatException {
        ArrayList arrayList = new ArrayList(f36492e);
        arrayList.removeAll(f36493f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String strM25869e = this.f36494a.m25869e(str);
            C7137xQ c7137xQ = c6299kQ.f36494a;
            String strM25869e2 = c7137xQ.m25869e(str);
            if (strM25869e != null && !strM25869e.equals(strM25869e2)) {
                c7137xQ.m25862G(str, strM25869e);
            }
        }
    }

    /* renamed from: c */
    public final int m22203c() {
        switch (this.f36494a.m25870f(0, "Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: d */
    public final void m22204d() throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C6809sD c6809sD = f36491d;
        String str = ((SimpleDateFormat) c6809sD.get()).format(new Date(jCurrentTimeMillis));
        C7137xQ c7137xQ = this.f36494a;
        c7137xQ.m25862G("DateTime", str);
        try {
            c7137xQ.m25862G("SubSecTime", Long.toString(jCurrentTimeMillis - ((SimpleDateFormat) c6809sD.get()).parse(str).getTime()));
        } catch (ParseException unused) {
        }
        c7137xQ.m25858C();
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6299kQ.toString():java.lang.String");
    }
}

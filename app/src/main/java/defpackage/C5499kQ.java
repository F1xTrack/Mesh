package defpackage;

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

/* renamed from: kQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5499kQ {
    public static final C6987sD b = new C6987sD(3);
    public static final C6987sD c = new C6987sD(4);
    public static final C6987sD d = new C6987sD(5);
    public static final List e = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    public static final List f = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");
    public final C7979xQ a;

    public C5499kQ(C7979xQ c7979xQ) {
        this.a = c7979xQ;
    }

    public final void a(Location location) throws NumberFormatException {
        C7979xQ c7979xQ = this.a;
        if (location == null) {
            return;
        }
        c7979xQ.G("GPSProcessingMethod", location.getProvider());
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        if (latitude < -90.0d || latitude > 90.0d || Double.isNaN(latitude)) {
            throw new IllegalArgumentException("Latitude value " + latitude + " is not valid.");
        }
        if (longitude < -180.0d || longitude > 180.0d || Double.isNaN(longitude)) {
            throw new IllegalArgumentException("Longitude value " + longitude + " is not valid.");
        }
        c7979xQ.G("GPSLatitudeRef", latitude >= ConfigValue.DOUBLE_DEFAULT_VALUE ? "N" : "S");
        c7979xQ.G("GPSLatitude", C7979xQ.b(Math.abs(latitude)));
        c7979xQ.G("GPSLongitudeRef", longitude >= ConfigValue.DOUBLE_DEFAULT_VALUE ? "E" : "W");
        c7979xQ.G("GPSLongitude", C7979xQ.b(Math.abs(longitude)));
        double altitude = location.getAltitude();
        String str = altitude >= ConfigValue.DOUBLE_DEFAULT_VALUE ? "0" : "1";
        c7979xQ.G("GPSAltitude", new C7599vQ(Math.abs(altitude)).toString());
        c7979xQ.G("GPSAltitudeRef", str);
        c7979xQ.G("GPSSpeedRef", "K");
        c7979xQ.G("GPSSpeed", new C7599vQ((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = C7979xQ.R.format(new Date(location.getTime())).split("\\s+", -1);
        c7979xQ.G("GPSDateStamp", strArrSplit[0]);
        c7979xQ.G("GPSTimeStamp", strArrSplit[1]);
    }

    public final void b(C5499kQ c5499kQ) throws NumberFormatException {
        ArrayList arrayList = new ArrayList(e);
        arrayList.removeAll(f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String strE = this.a.e(str);
            C7979xQ c7979xQ = c5499kQ.a;
            String strE2 = c7979xQ.e(str);
            if (strE != null && !strE.equals(strE2)) {
                c7979xQ.G(str, strE);
            }
        }
    }

    public final int c() {
        switch (this.a.f(0, "Orientation")) {
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

    public final void d() throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C6987sD c6987sD = d;
        String str = ((SimpleDateFormat) c6987sD.get()).format(new Date(jCurrentTimeMillis));
        C7979xQ c7979xQ = this.a;
        c7979xQ.G("DateTime", str);
        try {
            c7979xQ.G("SubSecTime", Long.toString(jCurrentTimeMillis - ((SimpleDateFormat) c6987sD.get()).parse(str).getTime()));
        } catch (ParseException unused) {
        }
        c7979xQ.C();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5499kQ.toString():java.lang.String");
    }
}

package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.KotlinVersion;

/* renamed from: xQ */
/* loaded from: classes.dex */
public final class C7979xQ {
    public static final SimpleDateFormat R;
    public static final C7408uQ V;
    public static final C7408uQ[][] W;
    public static final C7408uQ[] X;
    public static final HashMap[] Y;
    public static final HashMap[] Z;
    public static final HashSet a0;
    public static final HashMap b0;
    public static final Charset c0;
    public static final byte[] d0;
    public static final byte[] e0;
    public static final Pattern f0;
    public static final Pattern g0;
    public static final Pattern h0;
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final HashMap[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public byte[] m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public static final boolean t = Log.isLoggable("ExifInterface", 3);
    public static final List u = Arrays.asList(1, 6, 3, 8);
    public static final List v = Arrays.asList(2, 7, 4, 5);
    public static final int[] w = {8, 8, 8};
    public static final int[] x = {8};
    public static final byte[] y = {-1, -40, -1};
    public static final byte[] z = {102, 116, 121, 112};
    public static final byte[] A = {109, 105, 102, 49};
    public static final byte[] B = {104, 101, 105, 99};
    public static final byte[] C = {79, 76, 89, 77, 80, 0};
    public static final byte[] D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] E = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] F = {101, 88, 73, 102};
    public static final byte[] G = {73, 72, 68, 82};
    public static final byte[] H = {73, 69, 78, 68};
    public static final byte[] I = {82, 73, 70, 70};
    public static final byte[] J = {87, 69, 66, 80};
    public static final byte[] K = {69, 88, 73, 70};
    public static final byte[] L = {-99, 1, 42};
    public static final byte[] M = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] N = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] O = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] P = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] S = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] T = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] U = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        C7408uQ[] c7408uQArr = {new C7408uQ("NewSubfileType", 254, 4), new C7408uQ("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new C7408uQ("ImageWidth", 256, 3, 4), new C7408uQ("ImageLength", 257, 3, 4), new C7408uQ("BitsPerSample", 258, 3), new C7408uQ("Compression", 259, 3), new C7408uQ("PhotometricInterpretation", 262, 3), new C7408uQ("ImageDescription", 270, 2), new C7408uQ("Make", 271, 2), new C7408uQ("Model", 272, 2), new C7408uQ("StripOffsets", 273, 3, 4), new C7408uQ("Orientation", 274, 3), new C7408uQ("SamplesPerPixel", 277, 3), new C7408uQ("RowsPerStrip", 278, 3, 4), new C7408uQ("StripByteCounts", 279, 3, 4), new C7408uQ("XResolution", 282, 5), new C7408uQ("YResolution", 283, 5), new C7408uQ("PlanarConfiguration", 284, 3), new C7408uQ("ResolutionUnit", 296, 3), new C7408uQ("TransferFunction", 301, 3), new C7408uQ("Software", 305, 2), new C7408uQ("DateTime", 306, 2), new C7408uQ("Artist", 315, 2), new C7408uQ("WhitePoint", 318, 5), new C7408uQ("PrimaryChromaticities", 319, 5), new C7408uQ("SubIFDPointer", 330, 4), new C7408uQ("JPEGInterchangeFormat", 513, 4), new C7408uQ("JPEGInterchangeFormatLength", 514, 4), new C7408uQ("YCbCrCoefficients", 529, 5), new C7408uQ("YCbCrSubSampling", 530, 3), new C7408uQ("YCbCrPositioning", 531, 3), new C7408uQ("ReferenceBlackWhite", 532, 5), new C7408uQ("Copyright", 33432, 2), new C7408uQ("ExifIFDPointer", 34665, 4), new C7408uQ("GPSInfoIFDPointer", 34853, 4), new C7408uQ("SensorTopBorder", 4, 4), new C7408uQ("SensorLeftBorder", 5, 4), new C7408uQ("SensorBottomBorder", 6, 4), new C7408uQ("SensorRightBorder", 7, 4), new C7408uQ("ISO", 23, 3), new C7408uQ("JpgFromRaw", 46, 7), new C7408uQ("Xmp", 700, 1)};
        C7408uQ[] c7408uQArr2 = {new C7408uQ("ExposureTime", 33434, 5), new C7408uQ("FNumber", 33437, 5), new C7408uQ("ExposureProgram", 34850, 3), new C7408uQ("SpectralSensitivity", 34852, 2), new C7408uQ("PhotographicSensitivity", 34855, 3), new C7408uQ("OECF", 34856, 7), new C7408uQ("SensitivityType", 34864, 3), new C7408uQ("StandardOutputSensitivity", 34865, 4), new C7408uQ("RecommendedExposureIndex", 34866, 4), new C7408uQ("ISOSpeed", 34867, 4), new C7408uQ("ISOSpeedLatitudeyyy", 34868, 4), new C7408uQ("ISOSpeedLatitudezzz", 34869, 4), new C7408uQ("ExifVersion", 36864, 2), new C7408uQ("DateTimeOriginal", 36867, 2), new C7408uQ("DateTimeDigitized", 36868, 2), new C7408uQ("OffsetTime", 36880, 2), new C7408uQ("OffsetTimeOriginal", 36881, 2), new C7408uQ("OffsetTimeDigitized", 36882, 2), new C7408uQ("ComponentsConfiguration", 37121, 7), new C7408uQ("CompressedBitsPerPixel", 37122, 5), new C7408uQ("ShutterSpeedValue", 37377, 10), new C7408uQ("ApertureValue", 37378, 5), new C7408uQ("BrightnessValue", 37379, 10), new C7408uQ("ExposureBiasValue", 37380, 10), new C7408uQ("MaxApertureValue", 37381, 5), new C7408uQ("SubjectDistance", 37382, 5), new C7408uQ("MeteringMode", 37383, 3), new C7408uQ("LightSource", 37384, 3), new C7408uQ("Flash", 37385, 3), new C7408uQ("FocalLength", 37386, 5), new C7408uQ("SubjectArea", 37396, 3), new C7408uQ("MakerNote", 37500, 7), new C7408uQ("UserComment", 37510, 7), new C7408uQ("SubSecTime", 37520, 2), new C7408uQ("SubSecTimeOriginal", 37521, 2), new C7408uQ("SubSecTimeDigitized", 37522, 2), new C7408uQ("FlashpixVersion", 40960, 7), new C7408uQ("ColorSpace", 40961, 3), new C7408uQ("PixelXDimension", 40962, 3, 4), new C7408uQ("PixelYDimension", 40963, 3, 4), new C7408uQ("RelatedSoundFile", 40964, 2), new C7408uQ("InteroperabilityIFDPointer", 40965, 4), new C7408uQ("FlashEnergy", 41483, 5), new C7408uQ("SpatialFrequencyResponse", 41484, 7), new C7408uQ("FocalPlaneXResolution", 41486, 5), new C7408uQ("FocalPlaneYResolution", 41487, 5), new C7408uQ("FocalPlaneResolutionUnit", 41488, 3), new C7408uQ("SubjectLocation", 41492, 3), new C7408uQ("ExposureIndex", 41493, 5), new C7408uQ("SensingMethod", 41495, 3), new C7408uQ("FileSource", 41728, 7), new C7408uQ("SceneType", 41729, 7), new C7408uQ("CFAPattern", 41730, 7), new C7408uQ("CustomRendered", 41985, 3), new C7408uQ("ExposureMode", 41986, 3), new C7408uQ("WhiteBalance", 41987, 3), new C7408uQ("DigitalZoomRatio", 41988, 5), new C7408uQ("FocalLengthIn35mmFilm", 41989, 3), new C7408uQ("SceneCaptureType", 41990, 3), new C7408uQ("GainControl", 41991, 3), new C7408uQ("Contrast", 41992, 3), new C7408uQ("Saturation", 41993, 3), new C7408uQ("Sharpness", 41994, 3), new C7408uQ("DeviceSettingDescription", 41995, 7), new C7408uQ("SubjectDistanceRange", 41996, 3), new C7408uQ("ImageUniqueID", 42016, 2), new C7408uQ("CameraOwnerName", 42032, 2), new C7408uQ("BodySerialNumber", 42033, 2), new C7408uQ("LensSpecification", 42034, 5), new C7408uQ("LensMake", 42035, 2), new C7408uQ("LensModel", 42036, 2), new C7408uQ("Gamma", 42240, 5), new C7408uQ("DNGVersion", 50706, 1), new C7408uQ("DefaultCropSize", 50720, 3, 4)};
        C7408uQ[] c7408uQArr3 = {new C7408uQ("GPSVersionID", 0, 1), new C7408uQ("GPSLatitudeRef", 1, 2), new C7408uQ("GPSLatitude", 2, 5, 10), new C7408uQ("GPSLongitudeRef", 3, 2), new C7408uQ("GPSLongitude", 4, 5, 10), new C7408uQ("GPSAltitudeRef", 5, 1), new C7408uQ("GPSAltitude", 6, 5), new C7408uQ("GPSTimeStamp", 7, 5), new C7408uQ("GPSSatellites", 8, 2), new C7408uQ("GPSStatus", 9, 2), new C7408uQ("GPSMeasureMode", 10, 2), new C7408uQ("GPSDOP", 11, 5), new C7408uQ("GPSSpeedRef", 12, 2), new C7408uQ("GPSSpeed", 13, 5), new C7408uQ("GPSTrackRef", 14, 2), new C7408uQ("GPSTrack", 15, 5), new C7408uQ("GPSImgDirectionRef", 16, 2), new C7408uQ("GPSImgDirection", 17, 5), new C7408uQ("GPSMapDatum", 18, 2), new C7408uQ("GPSDestLatitudeRef", 19, 2), new C7408uQ("GPSDestLatitude", 20, 5), new C7408uQ("GPSDestLongitudeRef", 21, 2), new C7408uQ("GPSDestLongitude", 22, 5), new C7408uQ("GPSDestBearingRef", 23, 2), new C7408uQ("GPSDestBearing", 24, 5), new C7408uQ("GPSDestDistanceRef", 25, 2), new C7408uQ("GPSDestDistance", 26, 5), new C7408uQ("GPSProcessingMethod", 27, 7), new C7408uQ("GPSAreaInformation", 28, 7), new C7408uQ("GPSDateStamp", 29, 2), new C7408uQ("GPSDifferential", 30, 3), new C7408uQ("GPSHPositioningError", 31, 5)};
        C7408uQ[] c7408uQArr4 = {new C7408uQ("InteroperabilityIndex", 1, 2)};
        C7408uQ[] c7408uQArr5 = {new C7408uQ("NewSubfileType", 254, 4), new C7408uQ("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new C7408uQ("ThumbnailImageWidth", 256, 3, 4), new C7408uQ("ThumbnailImageLength", 257, 3, 4), new C7408uQ("BitsPerSample", 258, 3), new C7408uQ("Compression", 259, 3), new C7408uQ("PhotometricInterpretation", 262, 3), new C7408uQ("ImageDescription", 270, 2), new C7408uQ("Make", 271, 2), new C7408uQ("Model", 272, 2), new C7408uQ("StripOffsets", 273, 3, 4), new C7408uQ("ThumbnailOrientation", 274, 3), new C7408uQ("SamplesPerPixel", 277, 3), new C7408uQ("RowsPerStrip", 278, 3, 4), new C7408uQ("StripByteCounts", 279, 3, 4), new C7408uQ("XResolution", 282, 5), new C7408uQ("YResolution", 283, 5), new C7408uQ("PlanarConfiguration", 284, 3), new C7408uQ("ResolutionUnit", 296, 3), new C7408uQ("TransferFunction", 301, 3), new C7408uQ("Software", 305, 2), new C7408uQ("DateTime", 306, 2), new C7408uQ("Artist", 315, 2), new C7408uQ("WhitePoint", 318, 5), new C7408uQ("PrimaryChromaticities", 319, 5), new C7408uQ("SubIFDPointer", 330, 4), new C7408uQ("JPEGInterchangeFormat", 513, 4), new C7408uQ("JPEGInterchangeFormatLength", 514, 4), new C7408uQ("YCbCrCoefficients", 529, 5), new C7408uQ("YCbCrSubSampling", 530, 3), new C7408uQ("YCbCrPositioning", 531, 3), new C7408uQ("ReferenceBlackWhite", 532, 5), new C7408uQ("Copyright", 33432, 2), new C7408uQ("ExifIFDPointer", 34665, 4), new C7408uQ("GPSInfoIFDPointer", 34853, 4), new C7408uQ("DNGVersion", 50706, 1), new C7408uQ("DefaultCropSize", 50720, 3, 4)};
        V = new C7408uQ("StripOffsets", 273, 3);
        W = new C7408uQ[][]{c7408uQArr, c7408uQArr2, c7408uQArr3, c7408uQArr4, c7408uQArr5, c7408uQArr, new C7408uQ[]{new C7408uQ("ThumbnailImage", 256, 7), new C7408uQ("CameraSettingsIFDPointer", 8224, 4), new C7408uQ("ImageProcessingIFDPointer", 8256, 4)}, new C7408uQ[]{new C7408uQ("PreviewImageStart", 257, 4), new C7408uQ("PreviewImageLength", 258, 4)}, new C7408uQ[]{new C7408uQ("AspectFrame", 4371, 3)}, new C7408uQ[]{new C7408uQ("ColorSpace", 55, 3)}};
        X = new C7408uQ[]{new C7408uQ("SubIFDPointer", 330, 4), new C7408uQ("ExifIFDPointer", 34665, 4), new C7408uQ("GPSInfoIFDPointer", 34853, 4), new C7408uQ("InteroperabilityIFDPointer", 40965, 4), new C7408uQ("CameraSettingsIFDPointer", 8224, 1), new C7408uQ("ImageProcessingIFDPointer", 8256, 1)};
        Y = new HashMap[10];
        Z = new HashMap[10];
        a0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        b0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        c0 = charsetForName;
        d0 = "Exif\u0000\u0000".getBytes(charsetForName);
        e0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        R = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C7408uQ[][] c7408uQArr6 = W;
            if (i >= c7408uQArr6.length) {
                HashMap map = b0;
                C7408uQ[] c7408uQArr7 = X;
                map.put(Integer.valueOf(c7408uQArr7[0].a), 5);
                map.put(Integer.valueOf(c7408uQArr7[1].a), 1);
                map.put(Integer.valueOf(c7408uQArr7[2].a), 2);
                map.put(Integer.valueOf(c7408uQArr7[3].a), 3);
                map.put(Integer.valueOf(c7408uQArr7[4].a), 7);
                map.put(Integer.valueOf(c7408uQArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                f0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                g0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                h0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            Y[i] = new HashMap();
            Z[i] = new HashMap();
            for (C7408uQ c7408uQ : c7408uQArr6[i]) {
                Y[i].put(Integer.valueOf(c7408uQ.a), c7408uQ);
                Z[i].put(c7408uQ.b, c7408uQ);
            }
            i++;
        }
    }

    public C7979xQ(String str) throws Throwable {
        boolean z2;
        C7408uQ[][] c7408uQArr = W;
        this.e = new HashMap[c7408uQArr.length];
        this.f = new HashSet(c7408uQArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.c = null;
        this.a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    AbstractC8359zQ.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z2 = true;
                } catch (Exception unused) {
                    z2 = false;
                }
                if (z2) {
                    this.b = fileInputStream2.getFD();
                } else {
                    this.b = null;
                }
                u(fileInputStream2);
                P02.b(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                P02.b(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String b(double d) {
        long j = (long) d;
        double d2 = d - j;
        long j2 = (long) (d2 * 60.0d);
        return j + "/1," + j2 + "/1," + Math.round((d2 - (j2 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    public static double c(String str, String str2) {
        try {
            String[] strArrSplit = str.split(StringUtils.COMMA, -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d3 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d2 / 60.0d) + d;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d3;
            }
            return -d3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(C7026sQ c7026sQ, C8039xk c8039xk, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (c7026sQ.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = c0;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            int i = c7026sQ.readInt();
            c8039xk.write(bArr3);
            c8039xk.c(i);
            if (i % 2 == 1) {
                i++;
            }
            P02.d(c7026sQ, c8039xk, i);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public static Pair r(String str) throws NumberFormatException {
        if (str.contains(StringUtils.COMMA)) {
            String[] strArrSplit = str.split(StringUtils.COMMA, -1);
            Pair pairR = r(strArrSplit[0]);
            if (((Integer) pairR.first).intValue() == 2) {
                return pairR;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairR2 = r(strArrSplit[i]);
                int iIntValue = (((Integer) pairR2.first).equals(pairR.first) || ((Integer) pairR2.second).equals(pairR.first)) ? ((Integer) pairR.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairR.second).intValue() == -1 || !(((Integer) pairR2.first).equals(pairR.second) || ((Integer) pairR2.second).equals(pairR.second))) ? -1 : ((Integer) pairR.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairR = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairR = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairR;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    return (j < 0 || j > 65535) ? j < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static ByteOrder x(C7026sQ c7026sQ) throws IOException {
        short s = c7026sQ.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    public final void A(String str) {
        for (int i = 0; i < W.length; i++) {
            this.e[i].remove(str);
        }
    }

    public final void B(int i, String str, String str2) {
        HashMap[] mapArr = this.e;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x00fa A[Catch: all -> 0x010a, Exception -> 0x010d, TryCatch #19 {Exception -> 0x010d, all -> 0x010a, blocks: (B:217:0x00f6, B:219:0x00fa, B:226:0x0118, B:225:0x0110), top: B:265:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0110 A[Catch: all -> 0x010a, Exception -> 0x010d, TryCatch #19 {Exception -> 0x010d, all -> 0x010a, blocks: (B:217:0x00f6, B:219:0x00fa, B:226:0x0118, B:225:0x0110), top: B:265:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7979xQ.C():void");
    }

    public final void D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        C7026sQ c7026sQ = new C7026sQ(bufferedInputStream);
        C8039xk c8039xk = new C8039xk(bufferedOutputStream, ByteOrder.BIG_ENDIAN, 1);
        if (c7026sQ.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        c8039xk.a(-1);
        if (c7026sQ.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        c8039xk.a(-40);
        String strE = e("Xmp");
        HashMap[] mapArr = this.e;
        C7217tQ c7217tQ = (strE == null || !this.s) ? null : (C7217tQ) mapArr[0].remove("Xmp");
        c8039xk.a(-1);
        c8039xk.a(-31);
        L(c8039xk);
        if (c7217tQ != null) {
            mapArr[0].put("Xmp", c7217tQ);
        }
        byte[] bArr = new byte[4096];
        while (c7026sQ.readByte() == -1) {
            byte b = c7026sQ.readByte();
            if (b == -39 || b == -38) {
                c8039xk.a(-1);
                c8039xk.a(b);
                P02.e(c7026sQ, c8039xk);
                return;
            }
            if (b != -31) {
                c8039xk.a(-1);
                c8039xk.a(b);
                int unsignedShort = c7026sQ.readUnsignedShort();
                c8039xk.e((short) unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int i2 = c7026sQ.read(bArr, 0, Math.min(i, 4096));
                    if (i2 >= 0) {
                        c8039xk.write(bArr, 0, i2);
                        i -= i2;
                    }
                }
            } else {
                int unsignedShort2 = c7026sQ.readUnsignedShort();
                int i3 = unsignedShort2 - 2;
                if (i3 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i3 >= 6) {
                    if (c7026sQ.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, d0)) {
                        c7026sQ.a(unsignedShort2 - 8);
                    }
                }
                c8039xk.a(-1);
                c8039xk.a(b);
                c8039xk.e((short) unsignedShort2);
                if (i3 >= 6) {
                    i3 = unsignedShort2 - 8;
                    c8039xk.write(bArr2);
                }
                while (i3 > 0) {
                    int i4 = c7026sQ.read(bArr, 0, Math.min(i3, 4096));
                    if (i4 >= 0) {
                        c8039xk.write(bArr, 0, i4);
                        i3 -= i4;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        C7026sQ c7026sQ = new C7026sQ(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C8039xk c8039xk = new C8039xk(bufferedOutputStream, byteOrder, 1);
        P02.d(c7026sQ, c8039xk, E.length);
        if (this.o == 0) {
            int i = c7026sQ.readInt();
            c8039xk.c(i);
            P02.d(c7026sQ, c8039xk, i + 8);
        } else {
            P02.d(c7026sQ, c8039xk, (r2 - r7.length) - 8);
            c7026sQ.a(c7026sQ.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            C8039xk c8039xk2 = new C8039xk(byteArrayOutputStream, byteOrder, 1);
            L(c8039xk2);
            byte[] byteArray = ((ByteArrayOutputStream) c8039xk2.b).toByteArray();
            c8039xk.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            c8039xk.c((int) crc32.getValue());
            P02.b(byteArrayOutputStream);
            P02.e(c7026sQ, c8039xk);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            P02.b(byteArrayOutputStream2);
            throw th;
        }
    }

    public final void F(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        C8039xk c8039xk;
        int i;
        int i2;
        boolean z2;
        int i3;
        byte[] bArr;
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C7026sQ c7026sQ = new C7026sQ(bufferedInputStream, byteOrder);
        C8039xk c8039xk2 = new C8039xk(bufferedOutputStream, byteOrder, 1);
        byte[] bArr2 = I;
        P02.d(c7026sQ, c8039xk2, bArr2.length);
        byte[] bArr3 = J;
        c7026sQ.a(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    C8039xk c8039xk3 = new C8039xk(byteArrayOutputStream2, byteOrder, 1);
                    int i4 = this.o;
                    if (i4 != 0) {
                        P02.d(c7026sQ, c8039xk3, (i4 - ((bArr2.length + 4) + bArr3.length)) - 8);
                        c7026sQ.a(4);
                        int i5 = c7026sQ.readInt();
                        if (i5 % 2 != 0) {
                            i5++;
                        }
                        c7026sQ.a(i5);
                        L(c8039xk3);
                    } else {
                        byte[] bArr4 = new byte[4];
                        if (c7026sQ.read(bArr4) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr5 = M;
                        boolean zEquals = Arrays.equals(bArr4, bArr5);
                        byte[] bArr6 = O;
                        byte[] bArr7 = N;
                        if (!zEquals) {
                            if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                                int i6 = c7026sQ.readInt();
                                int i7 = i6 % 2 == 1 ? i6 + 1 : i6;
                                byte[] bArr8 = new byte[3];
                                boolean zEquals2 = Arrays.equals(bArr4, bArr6);
                                byte[] bArr9 = L;
                                if (zEquals2) {
                                    c7026sQ.read(bArr8);
                                    byte[] bArr10 = new byte[3];
                                    c8039xk = c8039xk2;
                                    if (c7026sQ.read(bArr10) != 3 || !Arrays.equals(bArr9, bArr10)) {
                                        throw new IOException("Encountered error while checking VP8 signature");
                                    }
                                    i = c7026sQ.readInt();
                                    i2 = (i << 18) >> 18;
                                    i7 -= 10;
                                    i3 = (i << 2) >> 18;
                                    z2 = false;
                                } else {
                                    c8039xk = c8039xk2;
                                    if (!Arrays.equals(bArr4, bArr7)) {
                                        i = 0;
                                        i2 = 0;
                                        z2 = false;
                                        i3 = 0;
                                    } else {
                                        if (c7026sQ.readByte() != 47) {
                                            throw new IOException("Encountered error while checking VP8L signature");
                                        }
                                        i = c7026sQ.readInt();
                                        z2 = true;
                                        i2 = (i & 16383) + 1;
                                        i3 = ((i & 268419072) >>> 14) + 1;
                                        if ((i & 268435456) == 0) {
                                            z2 = false;
                                        }
                                        i7 -= 5;
                                    }
                                }
                                c8039xk3.write(bArr5);
                                c8039xk3.c(10);
                                byte[] bArr11 = new byte[10];
                                if (z2) {
                                    bArr11[0] = (byte) (bArr11[0] | 16);
                                }
                                bArr11[0] = (byte) (bArr11[0] | 8);
                                int i8 = i2 - 1;
                                int i9 = i3 - 1;
                                bArr = bArr3;
                                bArr11[4] = (byte) i8;
                                bArr11[5] = (byte) (i8 >> 8);
                                bArr11[6] = (byte) (i8 >> 16);
                                bArr11[7] = (byte) i9;
                                bArr11[8] = (byte) (i9 >> 8);
                                bArr11[9] = (byte) (i9 >> 16);
                                c8039xk3.write(bArr11);
                                c8039xk3.write(bArr4);
                                c8039xk3.c(i6);
                                if (Arrays.equals(bArr4, bArr6)) {
                                    c8039xk3.write(bArr8);
                                    c8039xk3.write(bArr9);
                                    c8039xk3.c(i);
                                } else if (Arrays.equals(bArr4, bArr7)) {
                                    c8039xk3.write(47);
                                    c8039xk3.c(i);
                                }
                                P02.d(c7026sQ, c8039xk3, i7);
                                L(c8039xk3);
                            }
                            P02.e(c7026sQ, c8039xk3);
                            byte[] bArr12 = bArr;
                            C8039xk c8039xk4 = c8039xk;
                            c8039xk4.c(byteArrayOutputStream2.size() + bArr12.length);
                            c8039xk4.write(bArr12);
                            byteArrayOutputStream2.writeTo(c8039xk4);
                            P02.b(byteArrayOutputStream2);
                        }
                        int i10 = c7026sQ.readInt();
                        byte[] bArr13 = new byte[i10 % 2 == 1 ? i10 + 1 : i10];
                        c7026sQ.read(bArr13);
                        byte b = (byte) (bArr13[0] | 8);
                        bArr13[0] = b;
                        boolean z3 = ((b >> 1) & 1) == 1;
                        c8039xk3.write(bArr5);
                        c8039xk3.c(i10);
                        c8039xk3.write(bArr13);
                        if (z3) {
                            d(c7026sQ, c8039xk3, P, null);
                            while (true) {
                                byte[] bArr14 = new byte[4];
                                bufferedInputStream.read(bArr14);
                                if (!Arrays.equals(bArr14, Q)) {
                                    break;
                                }
                                int i11 = c7026sQ.readInt();
                                c8039xk3.write(bArr14);
                                c8039xk3.c(i11);
                                if (i11 % 2 == 1) {
                                    i11++;
                                }
                                P02.d(c7026sQ, c8039xk3, i11);
                            }
                            L(c8039xk3);
                        } else {
                            d(c7026sQ, c8039xk3, bArr6, bArr7);
                            L(c8039xk3);
                        }
                    }
                    c8039xk = c8039xk2;
                    bArr = bArr3;
                    P02.e(c7026sQ, c8039xk3);
                    byte[] bArr122 = bArr;
                    C8039xk c8039xk42 = c8039xk;
                    c8039xk42.c(byteArrayOutputStream2.size() + bArr122.length);
                    c8039xk42.write(bArr122);
                    byteArrayOutputStream2.writeTo(c8039xk42);
                    P02.b(byteArrayOutputStream2);
                } catch (Exception e) {
                    e = e;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    P02.b(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:221:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(java.lang.String r19, java.lang.String r20) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7979xQ.G(java.lang.String, java.lang.String):void");
    }

    public final void H(C7026sQ c7026sQ) throws Throwable {
        C7217tQ c7217tQ;
        HashMap map = this.e[4];
        C7217tQ c7217tQ2 = (C7217tQ) map.get("Compression");
        if (c7217tQ2 == null) {
            this.n = 6;
            s(c7026sQ, map);
            return;
        }
        int iH = c7217tQ2.h(this.g);
        this.n = iH;
        if (iH != 1) {
            if (iH == 6) {
                s(c7026sQ, map);
                return;
            } else if (iH != 7) {
                return;
            }
        }
        C7217tQ c7217tQ3 = (C7217tQ) map.get("BitsPerSample");
        if (c7217tQ3 != null) {
            int[] iArr = (int[]) c7217tQ3.j(this.g);
            int[] iArr2 = w;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.d != 3 || (c7217tQ = (C7217tQ) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iH2 = c7217tQ.h(this.g);
                if ((iH2 != 1 || !Arrays.equals(iArr, x)) && (iH2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            C7217tQ c7217tQ4 = (C7217tQ) map.get("StripOffsets");
            C7217tQ c7217tQ5 = (C7217tQ) map.get("StripByteCounts");
            if (c7217tQ4 == null || c7217tQ5 == null) {
                return;
            }
            long[] jArrC = P02.c(c7217tQ4.j(this.g));
            long[] jArrC2 = P02.c(c7217tQ5.j(this.g));
            if (jArrC == null || jArrC.length == 0 || jArrC2 == null || jArrC2.length == 0 || jArrC.length != jArrC2.length) {
                return;
            }
            long j = 0;
            for (long j2 : jArrC2) {
                j += j2;
            }
            int i = (int) j;
            byte[] bArr = new byte[i];
            this.j = true;
            this.i = true;
            this.h = true;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < jArrC.length; i4++) {
                int i5 = (int) jArrC[i4];
                int i6 = (int) jArrC2[i4];
                if (i4 < jArrC.length - 1 && i5 + i6 != jArrC[i4 + 1]) {
                    this.j = false;
                }
                int i7 = i5 - i2;
                if (i7 < 0) {
                    return;
                }
                long j3 = i7;
                if (c7026sQ.skip(j3) != j3) {
                    return;
                }
                int i8 = i2 + i7;
                byte[] bArr2 = new byte[i6];
                if (c7026sQ.read(bArr2) != i6) {
                    return;
                }
                i2 = i8 + i6;
                System.arraycopy(bArr2, 0, bArr, i3, i6);
                i3 += i6;
            }
            this.m = bArr;
            if (this.j) {
                this.k = (int) jArrC[0];
                this.l = i;
            }
        }
    }

    public final void I(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.e;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        C7217tQ c7217tQ = (C7217tQ) mapArr[i].get("ImageLength");
        C7217tQ c7217tQ2 = (C7217tQ) mapArr[i].get("ImageWidth");
        C7217tQ c7217tQ3 = (C7217tQ) mapArr[i2].get("ImageLength");
        C7217tQ c7217tQ4 = (C7217tQ) mapArr[i2].get("ImageWidth");
        if (c7217tQ == null || c7217tQ2 == null || c7217tQ3 == null || c7217tQ4 == null) {
            return;
        }
        int iH = c7217tQ.h(this.g);
        int iH2 = c7217tQ2.h(this.g);
        int iH3 = c7217tQ3.h(this.g);
        int iH4 = c7217tQ4.h(this.g);
        if (iH >= iH3 || iH2 >= iH4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void J(C7789wQ c7789wQ, int i) throws Throwable {
        C7217tQ c7217tQE;
        C7217tQ c7217tQE2;
        HashMap[] mapArr = this.e;
        C7217tQ c7217tQ = (C7217tQ) mapArr[i].get("DefaultCropSize");
        C7217tQ c7217tQ2 = (C7217tQ) mapArr[i].get("SensorTopBorder");
        C7217tQ c7217tQ3 = (C7217tQ) mapArr[i].get("SensorLeftBorder");
        C7217tQ c7217tQ4 = (C7217tQ) mapArr[i].get("SensorBottomBorder");
        C7217tQ c7217tQ5 = (C7217tQ) mapArr[i].get("SensorRightBorder");
        if (c7217tQ != null) {
            if (c7217tQ.a == 5) {
                C7599vQ[] c7599vQArr = (C7599vQ[]) c7217tQ.j(this.g);
                if (c7599vQArr == null || c7599vQArr.length != 2) {
                    Arrays.toString(c7599vQArr);
                    return;
                }
                c7217tQE = C7217tQ.d(new C7599vQ[]{c7599vQArr[0]}, this.g);
                c7217tQE2 = C7217tQ.d(new C7599vQ[]{c7599vQArr[1]}, this.g);
            } else {
                int[] iArr = (int[]) c7217tQ.j(this.g);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    c7217tQE = C7217tQ.e(iArr[0], this.g);
                    c7217tQE2 = C7217tQ.e(iArr[1], this.g);
                }
            }
            mapArr[i].put("ImageWidth", c7217tQE);
            mapArr[i].put("ImageLength", c7217tQE2);
            return;
        }
        if (c7217tQ2 != null && c7217tQ3 != null && c7217tQ4 != null && c7217tQ5 != null) {
            int iH = c7217tQ2.h(this.g);
            int iH2 = c7217tQ4.h(this.g);
            int iH3 = c7217tQ5.h(this.g);
            int iH4 = c7217tQ3.h(this.g);
            if (iH2 <= iH || iH3 <= iH4) {
                return;
            }
            C7217tQ c7217tQE3 = C7217tQ.e(iH2 - iH, this.g);
            C7217tQ c7217tQE4 = C7217tQ.e(iH3 - iH4, this.g);
            mapArr[i].put("ImageLength", c7217tQE3);
            mapArr[i].put("ImageWidth", c7217tQE4);
            return;
        }
        C7217tQ c7217tQ6 = (C7217tQ) mapArr[i].get("ImageLength");
        C7217tQ c7217tQ7 = (C7217tQ) mapArr[i].get("ImageWidth");
        if (c7217tQ6 == null || c7217tQ7 == null) {
            C7217tQ c7217tQ8 = (C7217tQ) mapArr[i].get("JPEGInterchangeFormat");
            C7217tQ c7217tQ9 = (C7217tQ) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c7217tQ8 == null || c7217tQ9 == null) {
                return;
            }
            int iH5 = c7217tQ8.h(this.g);
            int iH6 = c7217tQ8.h(this.g);
            c7789wQ.c(iH5);
            byte[] bArr = new byte[iH6];
            c7789wQ.read(bArr);
            i(new C7026sQ(bArr), iH5, i);
        }
    }

    public final void K() throws Throwable {
        I(0, 5);
        I(0, 4);
        I(5, 4);
        HashMap[] mapArr = this.e;
        C7217tQ c7217tQ = (C7217tQ) mapArr[1].get("PixelXDimension");
        C7217tQ c7217tQ2 = (C7217tQ) mapArr[1].get("PixelYDimension");
        if (c7217tQ != null && c7217tQ2 != null) {
            mapArr[0].put("ImageWidth", c7217tQ);
            mapArr[0].put("ImageLength", c7217tQ2);
        }
        if (mapArr[4].isEmpty() && t(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        t(mapArr[4]);
        B(0, "ThumbnailOrientation", "Orientation");
        B(0, "ThumbnailImageLength", "ImageLength");
        B(0, "ThumbnailImageWidth", "ImageWidth");
        B(5, "ThumbnailOrientation", "Orientation");
        B(5, "ThumbnailImageLength", "ImageLength");
        B(5, "ThumbnailImageWidth", "ImageWidth");
        B(4, "Orientation", "ThumbnailOrientation");
        B(4, "ImageLength", "ThumbnailImageLength");
        B(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void L(C8039xk c8039xk) throws IOException {
        HashMap[] mapArr;
        int[] iArr;
        HashMap[] mapArr2;
        HashMap[] mapArr3;
        Object[] objArr;
        int i;
        int i2 = 1;
        C7408uQ[][] c7408uQArr = W;
        int[] iArr2 = new int[c7408uQArr.length];
        int[] iArr3 = new int[c7408uQArr.length];
        C7408uQ[] c7408uQArr2 = X;
        for (C7408uQ c7408uQ : c7408uQArr2) {
            A(c7408uQ.b);
        }
        if (this.h) {
            if (this.i) {
                A("StripOffsets");
                A("StripByteCounts");
            } else {
                A("JPEGInterchangeFormat");
                A("JPEGInterchangeFormatLength");
            }
        }
        int i3 = 0;
        while (true) {
            int length = c7408uQArr.length;
            mapArr = this.e;
            if (i3 >= length) {
                break;
            }
            Object[] array = mapArr[i3].entrySet().toArray();
            int length2 = array.length;
            int i4 = 0;
            while (i4 < length2) {
                Map.Entry entry = (Map.Entry) array[i4];
                if (entry.getValue() == null) {
                    objArr = array;
                    mapArr[i3].remove(entry.getKey());
                    i = 1;
                } else {
                    objArr = array;
                    i = i2;
                }
                i4 += i;
                i2 = i;
                array = objArr;
            }
            i3 += i2;
        }
        int i5 = i2;
        if (!mapArr[i5].isEmpty()) {
            mapArr[0].put(c7408uQArr2[i5].b, C7217tQ.b(0L, this.g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(c7408uQArr2[2].b, C7217tQ.b(0L, this.g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(c7408uQArr2[3].b, C7217tQ.b(0L, this.g));
        }
        if (this.h) {
            if (this.i) {
                mapArr[4].put("StripOffsets", C7217tQ.e(0, this.g));
                mapArr[4].put("StripByteCounts", C7217tQ.e(this.l, this.g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", C7217tQ.b(0L, this.g));
                mapArr[4].put("JPEGInterchangeFormatLength", C7217tQ.b(this.l, this.g));
            }
        }
        int i6 = 0;
        while (true) {
            int length3 = c7408uQArr.length;
            iArr = T;
            if (i6 >= length3) {
                break;
            }
            Iterator it = mapArr[i6].entrySet().iterator();
            int i7 = 0;
            while (it.hasNext()) {
                C7217tQ c7217tQ = (C7217tQ) ((Map.Entry) it.next()).getValue();
                c7217tQ.getClass();
                int i8 = iArr[c7217tQ.a] * c7217tQ.b;
                if (i8 > 4) {
                    i7 += i8;
                }
            }
            iArr3[i6] = iArr3[i6] + i7;
            i6++;
        }
        int size = 8;
        for (int i9 = 0; i9 < c7408uQArr.length; i9++) {
            if (!mapArr[i9].isEmpty()) {
                iArr2[i9] = size;
                size += (mapArr[i9].size() * 12) + 6 + iArr3[i9];
            }
        }
        if (this.h) {
            if (this.i) {
                mapArr[4].put("StripOffsets", C7217tQ.e(size, this.g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", C7217tQ.b(size, this.g));
            }
            this.k = size;
            size += this.l;
        }
        if (this.d == 4) {
            size += 8;
        }
        if (t) {
            for (int i10 = 0; i10 < c7408uQArr.length; i10++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i10), Integer.valueOf(iArr2[i10]), Integer.valueOf(mapArr[i10].size()), Integer.valueOf(iArr3[i10]), Integer.valueOf(size));
            }
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(c7408uQArr2[1].b, C7217tQ.b(iArr2[1], this.g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(c7408uQArr2[2].b, C7217tQ.b(iArr2[2], this.g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(c7408uQArr2[3].b, C7217tQ.b(iArr2[3], this.g));
        }
        int i11 = this.d;
        if (i11 == 4) {
            c8039xk.e((short) size);
            c8039xk.write(d0);
        } else if (i11 == 13) {
            c8039xk.c(size);
            c8039xk.write(F);
        } else if (i11 == 14) {
            c8039xk.write(K);
            c8039xk.c(size);
        }
        c8039xk.e(this.g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        c8039xk.c = this.g;
        c8039xk.e((short) 42);
        c8039xk.c((int) 8);
        int i12 = 0;
        while (i12 < c7408uQArr.length) {
            if (mapArr[i12].isEmpty()) {
                mapArr2 = mapArr;
            } else {
                c8039xk.e((short) mapArr[i12].size());
                int size2 = (mapArr[i12].size() * 12) + iArr2[i12] + 2 + 4;
                for (Map.Entry entry2 : mapArr[i12].entrySet()) {
                    int i13 = ((C7408uQ) Z[i12].get(entry2.getKey())).a;
                    C7217tQ c7217tQ2 = (C7217tQ) entry2.getValue();
                    c7217tQ2.getClass();
                    int i14 = c7217tQ2.a;
                    int i15 = iArr[i14];
                    int i16 = c7217tQ2.b;
                    int i17 = i15 * i16;
                    c8039xk.e((short) i13);
                    c8039xk.e((short) i14);
                    c8039xk.c(i16);
                    if (i17 > 4) {
                        mapArr3 = mapArr;
                        c8039xk.c(size2);
                        size2 += i17;
                    } else {
                        mapArr3 = mapArr;
                        c8039xk.write(c7217tQ2.d);
                        if (i17 < 4) {
                            while (i17 < 4) {
                                c8039xk.a(0);
                                i17++;
                            }
                        }
                    }
                    mapArr = mapArr3;
                }
                mapArr2 = mapArr;
                if (i12 != 0 || mapArr2[4].isEmpty()) {
                    c8039xk.c((int) 0);
                } else {
                    c8039xk.c(iArr2[4]);
                }
                Iterator it2 = mapArr2[i12].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((C7217tQ) ((Map.Entry) it2.next()).getValue()).d;
                    if (bArr.length > 4) {
                        c8039xk.write(bArr, 0, bArr.length);
                    }
                }
            }
            i12++;
            mapArr = mapArr2;
        }
        if (this.h) {
            c8039xk.write(p());
        }
        if (this.d == 14 && size % 2 == 1) {
            c8039xk.a(0);
        }
        c8039xk.c = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strE = e("DateTimeOriginal");
        HashMap[] mapArr = this.e;
        if (strE != null && e("DateTime") == null) {
            mapArr[0].put("DateTime", C7217tQ.a(strE));
        }
        if (e("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C7217tQ.b(0L, this.g));
        }
        if (e("ImageLength") == null) {
            mapArr[0].put("ImageLength", C7217tQ.b(0L, this.g));
        }
        if (e("Orientation") == null) {
            mapArr[0].put("Orientation", C7217tQ.b(0L, this.g));
        }
        if (e("LightSource") == null) {
            mapArr[1].put("LightSource", C7217tQ.b(0L, this.g));
        }
    }

    public final String e(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C7217tQ c7217tQG = g(str);
        if (c7217tQG != null) {
            if (!a0.contains(str)) {
                return c7217tQG.i(this.g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c7217tQG.a;
                if (i != 5 && i != 10) {
                    return null;
                }
                C7599vQ[] c7599vQArr = (C7599vQ[]) c7217tQG.j(this.g);
                if (c7599vQArr == null || c7599vQArr.length != 3) {
                    Arrays.toString(c7599vQArr);
                    return null;
                }
                C7599vQ c7599vQ = c7599vQArr[0];
                Integer numValueOf = Integer.valueOf((int) (c7599vQ.a / c7599vQ.b));
                C7599vQ c7599vQ2 = c7599vQArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c7599vQ2.a / c7599vQ2.b));
                C7599vQ c7599vQ3 = c7599vQArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c7599vQ3.a / c7599vQ3.b)));
            }
            try {
                return Double.toString(c7217tQG.g(this.g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int f(int i, String str) {
        C7217tQ c7217tQG = g(str);
        if (c7217tQG == null) {
            return i;
        }
        try {
            return c7217tQG.h(this.g);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public final C7217tQ g(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < W.length; i++) {
            C7217tQ c7217tQ = (C7217tQ) this.e[i].get(str);
            if (c7217tQ != null) {
                return c7217tQ;
            }
        }
        return null;
    }

    public final void h(C7789wQ c7789wQ) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AQ.a(mediaMetadataRetriever, new C6835rQ(c7789wQ));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C7217tQ.e(Integer.parseInt(strExtractMetadata), this.g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C7217tQ.e(Integer.parseInt(strExtractMetadata2), this.g));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", C7217tQ.e(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c7789wQ.c(i2);
                    byte[] bArr = new byte[6];
                    if (c7789wQ.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, d0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (c7789wQ.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.o = i4;
                    y(0, bArr2);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x006a A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0141 A[LOOP:0: B:115:0x0023->B:187:0x0141, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00fb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(defpackage.C7026sQ r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7979xQ.i(sQ, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7979xQ.j(java.io.BufferedInputStream):int");
    }

    public final void k(C7789wQ c7789wQ) throws Throwable {
        int i;
        int i2;
        n(c7789wQ);
        HashMap[] mapArr = this.e;
        C7217tQ c7217tQ = (C7217tQ) mapArr[1].get("MakerNote");
        if (c7217tQ != null) {
            C7789wQ c7789wQ2 = new C7789wQ(c7217tQ.d);
            c7789wQ2.b = this.g;
            byte[] bArr = C;
            byte[] bArr2 = new byte[bArr.length];
            c7789wQ2.readFully(bArr2);
            c7789wQ2.c(0L);
            byte[] bArr3 = D;
            byte[] bArr4 = new byte[bArr3.length];
            c7789wQ2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c7789wQ2.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c7789wQ2.c(12L);
            }
            z(c7789wQ2, 6);
            C7217tQ c7217tQ2 = (C7217tQ) mapArr[7].get("PreviewImageStart");
            C7217tQ c7217tQ3 = (C7217tQ) mapArr[7].get("PreviewImageLength");
            if (c7217tQ2 != null && c7217tQ3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c7217tQ2);
                mapArr[5].put("JPEGInterchangeFormatLength", c7217tQ3);
            }
            C7217tQ c7217tQ4 = (C7217tQ) mapArr[8].get("AspectFrame");
            if (c7217tQ4 != null) {
                int[] iArr = (int[]) c7217tQ4.j(this.g);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C7217tQ c7217tQE = C7217tQ.e(i5, this.g);
                C7217tQ c7217tQE2 = C7217tQ.e(i6, this.g);
                mapArr[0].put("ImageWidth", c7217tQE);
                mapArr[0].put("ImageLength", c7217tQE2);
            }
        }
    }

    public final void l(C7026sQ c7026sQ) throws Throwable {
        if (t) {
            Objects.toString(c7026sQ);
        }
        c7026sQ.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = E;
        c7026sQ.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c7026sQ.readInt();
                byte[] bArr2 = new byte[4];
                if (c7026sQ.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, H)) {
                    return;
                }
                if (Arrays.equals(bArr2, F)) {
                    byte[] bArr3 = new byte[i];
                    if (c7026sQ.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + P02.a(bArr2));
                    }
                    int i3 = c7026sQ.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.o = i2;
                        y(0, bArr3);
                        K();
                        H(new C7026sQ(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c7026sQ.a(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void m(C7026sQ c7026sQ) throws Throwable {
        if (t) {
            Objects.toString(c7026sQ);
        }
        c7026sQ.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c7026sQ.read(bArr);
        c7026sQ.read(bArr2);
        c7026sQ.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c7026sQ.a(i - c7026sQ.c);
        c7026sQ.read(bArr4);
        i(new C7026sQ(bArr4), i, 5);
        c7026sQ.a(i3 - c7026sQ.c);
        c7026sQ.b = ByteOrder.BIG_ENDIAN;
        int i4 = c7026sQ.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c7026sQ.readUnsignedShort();
            int unsignedShort2 = c7026sQ.readUnsignedShort();
            if (unsignedShort == V.a) {
                short s = c7026sQ.readShort();
                short s2 = c7026sQ.readShort();
                C7217tQ c7217tQE = C7217tQ.e(s, this.g);
                C7217tQ c7217tQE2 = C7217tQ.e(s2, this.g);
                HashMap[] mapArr = this.e;
                mapArr[0].put("ImageLength", c7217tQE);
                mapArr[0].put("ImageWidth", c7217tQE2);
                return;
            }
            c7026sQ.a(unsignedShort2);
        }
    }

    public final void n(C7789wQ c7789wQ) throws Throwable {
        v(c7789wQ);
        z(c7789wQ, 0);
        J(c7789wQ, 0);
        J(c7789wQ, 5);
        J(c7789wQ, 4);
        K();
        if (this.d == 8) {
            HashMap[] mapArr = this.e;
            C7217tQ c7217tQ = (C7217tQ) mapArr[1].get("MakerNote");
            if (c7217tQ != null) {
                C7789wQ c7789wQ2 = new C7789wQ(c7217tQ.d);
                c7789wQ2.b = this.g;
                c7789wQ2.a(6);
                z(c7789wQ2, 9);
                C7217tQ c7217tQ2 = (C7217tQ) mapArr[9].get("ColorSpace");
                if (c7217tQ2 != null) {
                    mapArr[1].put("ColorSpace", c7217tQ2);
                }
            }
        }
    }

    public final void o(C7789wQ c7789wQ) throws Throwable {
        if (t) {
            Objects.toString(c7789wQ);
        }
        n(c7789wQ);
        HashMap[] mapArr = this.e;
        C7217tQ c7217tQ = (C7217tQ) mapArr[0].get("JpgFromRaw");
        if (c7217tQ != null) {
            i(new C7026sQ(c7217tQ.d), (int) c7217tQ.c, 5);
        }
        C7217tQ c7217tQ2 = (C7217tQ) mapArr[0].get("ISO");
        C7217tQ c7217tQ3 = (C7217tQ) mapArr[1].get("PhotographicSensitivity");
        if (c7217tQ2 == null || c7217tQ3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c7217tQ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] p() throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r8.h
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte[] r0 = r8.m
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.content.res.AssetManager$AssetInputStream r0 = r8.c     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            if (r0 == 0) goto L28
            boolean r2 = r0.markSupported()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L21
            if (r2 == 0) goto L24
            r0.reset()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L21
        L18:
            r2 = r1
            goto L52
        L1a:
            r2 = move-exception
            r7 = r1
            r1 = r0
            r0 = r2
            r2 = r7
            goto L97
        L21:
            r2 = r1
            goto La0
        L24:
            defpackage.P02.b(r0)
            return r1
        L28:
            java.lang.String r0 = r8.a     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            if (r0 == 0) goto L3d
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            java.lang.String r2 = r8.a     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            goto L18
        L34:
            r2 = move-exception
            r0 = r2
            r2 = r1
            goto L97
        L39:
            r0 = r1
            r2 = r0
            goto La0
        L3d:
            java.io.FileDescriptor r0 = r8.b     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            java.io.FileDescriptor r0 = defpackage.AbstractC8359zQ.b(r0)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            r3 = 0
            defpackage.AbstractC8359zQ.c(r0, r3, r2)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            r7 = r2
            r2 = r0
            r0 = r7
        L52:
            int r3 = r8.k     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r4 = r8.o     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r3 = r3 + r4
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            long r3 = r0.skip(r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r5 = r8.k     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r6 = r8.o     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r5 = r5 + r6
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r4 = "Corrupted image"
            if (r3 != 0) goto L8a
            int r3 = r8.l     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r5 = r0.read(r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r6 = r8.l     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            if (r5 != r6) goto L84
            r8.m = r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            defpackage.P02.b(r0)
            if (r2 == 0) goto L7e
            defpackage.AbstractC8359zQ.a(r2)     // Catch: java.lang.Exception -> L7e
        L7e:
            return r3
        L7f:
            r1 = move-exception
            r7 = r1
            r1 = r0
        L82:
            r0 = r7
            goto L97
        L84:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            throw r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
        L8a:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            throw r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
        L90:
            r2 = move-exception
            r7 = r2
            r2 = r0
            goto L82
        L94:
            r2 = r0
            r0 = r1
            goto La0
        L97:
            defpackage.P02.b(r1)
            if (r2 == 0) goto L9f
            defpackage.AbstractC8359zQ.a(r2)     // Catch: java.lang.Exception -> L9f
        L9f:
            throw r0
        La0:
            defpackage.P02.b(r0)
            if (r2 == 0) goto La8
            defpackage.AbstractC8359zQ.a(r2)     // Catch: java.lang.Exception -> La8
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7979xQ.p():byte[]");
    }

    public final void q(C7026sQ c7026sQ) throws Throwable {
        if (t) {
            Objects.toString(c7026sQ);
        }
        c7026sQ.b = ByteOrder.LITTLE_ENDIAN;
        c7026sQ.a(I.length);
        int i = c7026sQ.readInt() + 8;
        byte[] bArr = J;
        c7026sQ.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c7026sQ.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c7026sQ.readInt();
                int i3 = length + 8;
                if (Arrays.equals(K, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c7026sQ.read(bArr3) == i2) {
                        this.o = i3;
                        y(0, bArr3);
                        H(new C7026sQ(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + P02.a(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c7026sQ.a(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void s(C7026sQ c7026sQ, HashMap map) throws Throwable {
        C7217tQ c7217tQ = (C7217tQ) map.get("JPEGInterchangeFormat");
        C7217tQ c7217tQ2 = (C7217tQ) map.get("JPEGInterchangeFormatLength");
        if (c7217tQ == null || c7217tQ2 == null) {
            return;
        }
        int iH = c7217tQ.h(this.g);
        int iH2 = c7217tQ2.h(this.g);
        if (this.d == 7) {
            iH += this.p;
        }
        if (iH <= 0 || iH2 <= 0) {
            return;
        }
        this.h = true;
        if (this.a == null && this.c == null && this.b == null) {
            byte[] bArr = new byte[iH2];
            c7026sQ.skip(iH);
            c7026sQ.read(bArr);
            this.m = bArr;
        }
        this.k = iH;
        this.l = iH2;
    }

    public final boolean t(HashMap map) {
        C7217tQ c7217tQ = (C7217tQ) map.get("ImageLength");
        C7217tQ c7217tQ2 = (C7217tQ) map.get("ImageWidth");
        if (c7217tQ == null || c7217tQ2 == null) {
            return false;
        }
        return c7217tQ.h(this.g) <= 512 && c7217tQ2.h(this.g) <= 512;
    }

    public final void u(InputStream inputStream) throws Throwable {
        boolean z2 = t;
        for (int i = 0; i < W.length; i++) {
            try {
                this.e[i] = new HashMap();
            } catch (IOException | UnsupportedOperationException unused) {
                a();
                if (!z2) {
                    return;
                }
            } catch (Throwable th) {
                a();
                if (z2) {
                    w();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iJ = j(bufferedInputStream);
        this.d = iJ;
        if (iJ == 4 || iJ == 9 || iJ == 13 || iJ == 14) {
            C7026sQ c7026sQ = new C7026sQ(bufferedInputStream);
            int i2 = this.d;
            if (i2 == 4) {
                i(c7026sQ, 0, 0);
            } else if (i2 == 13) {
                l(c7026sQ);
            } else if (i2 == 9) {
                m(c7026sQ);
            } else if (i2 == 14) {
                q(c7026sQ);
            }
        } else {
            C7789wQ c7789wQ = new C7789wQ(bufferedInputStream);
            int i3 = this.d;
            if (i3 == 12) {
                h(c7789wQ);
            } else if (i3 == 7) {
                k(c7789wQ);
            } else if (i3 == 10) {
                o(c7789wQ);
            } else {
                n(c7789wQ);
            }
            c7789wQ.c(this.o);
            H(c7789wQ);
        }
        a();
        if (!z2) {
            return;
        }
        w();
    }

    public final void v(C7789wQ c7789wQ) throws IOException {
        ByteOrder byteOrderX = x(c7789wQ);
        this.g = byteOrderX;
        c7789wQ.b = byteOrderX;
        int unsignedShort = c7789wQ.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = c7789wQ.readInt();
        if (i2 < 8) {
            throw new IOException(AbstractC7209tN0.u(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c7789wQ.a(i3);
        }
    }

    public final void w() throws Throwable {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.e;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C7217tQ c7217tQ = (C7217tQ) entry.getValue();
                c7217tQ.toString();
                c7217tQ.i(this.g);
            }
            i++;
        }
    }

    public final void y(int i, byte[] bArr) throws IOException {
        C7789wQ c7789wQ = new C7789wQ(bArr);
        v(c7789wQ);
        z(c7789wQ, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(defpackage.C7789wQ r29, int r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7979xQ.z(wQ, int):void");
    }

    public C7979xQ(InputStream inputStream) throws Throwable {
        C7408uQ[][] c7408uQArr = W;
        this.e = new HashMap[c7408uQArr.length];
        this.f = new HashSet(c7408uQArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        this.a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC8359zQ.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.c = null;
                this.b = fileInputStream.getFD();
            } catch (Exception unused) {
            }
        } else {
            this.c = null;
            this.b = null;
        }
        u(inputStream);
    }
}

package p000;

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
public final class C7137xQ {

    /* renamed from: R */
    public static final SimpleDateFormat f45591R;

    /* renamed from: V */
    public static final C6948uQ f45595V;

    /* renamed from: W */
    public static final C6948uQ[][] f45596W;

    /* renamed from: X */
    public static final C6948uQ[] f45597X;

    /* renamed from: Y */
    public static final HashMap[] f45598Y;

    /* renamed from: Z */
    public static final HashMap[] f45599Z;

    /* renamed from: a0 */
    public static final HashSet f45600a0;

    /* renamed from: b0 */
    public static final HashMap f45601b0;

    /* renamed from: c0 */
    public static final Charset f45602c0;

    /* renamed from: d0 */
    public static final byte[] f45603d0;

    /* renamed from: e0 */
    public static final byte[] f45604e0;

    /* renamed from: f0 */
    public static final Pattern f45605f0;

    /* renamed from: g0 */
    public static final Pattern f45606g0;

    /* renamed from: h0 */
    public static final Pattern f45607h0;

    /* renamed from: a */
    public final String f45615a;

    /* renamed from: b */
    public final FileDescriptor f45616b;

    /* renamed from: c */
    public final AssetManager.AssetInputStream f45617c;

    /* renamed from: d */
    public int f45618d;

    /* renamed from: e */
    public final HashMap[] f45619e;

    /* renamed from: f */
    public final HashSet f45620f;

    /* renamed from: g */
    public ByteOrder f45621g;

    /* renamed from: h */
    public boolean f45622h;

    /* renamed from: i */
    public boolean f45623i;

    /* renamed from: j */
    public boolean f45624j;

    /* renamed from: k */
    public int f45625k;

    /* renamed from: l */
    public int f45626l;

    /* renamed from: m */
    public byte[] f45627m;

    /* renamed from: n */
    public int f45628n;

    /* renamed from: o */
    public int f45629o;

    /* renamed from: p */
    public int f45630p;

    /* renamed from: q */
    public int f45631q;

    /* renamed from: r */
    public int f45632r;

    /* renamed from: s */
    public boolean f45633s;

    /* renamed from: t */
    public static final boolean f45608t = Log.isLoggable("ExifInterface", 3);

    /* renamed from: u */
    public static final List f45609u = Arrays.asList(1, 6, 3, 8);

    /* renamed from: v */
    public static final List f45610v = Arrays.asList(2, 7, 4, 5);

    /* renamed from: w */
    public static final int[] f45611w = {8, 8, 8};

    /* renamed from: x */
    public static final int[] f45612x = {8};

    /* renamed from: y */
    public static final byte[] f45613y = {-1, -40, -1};

    /* renamed from: z */
    public static final byte[] f45614z = {102, 116, 121, 112};

    /* renamed from: A */
    public static final byte[] f45574A = {109, 105, 102, 49};

    /* renamed from: B */
    public static final byte[] f45575B = {104, 101, 105, 99};

    /* renamed from: C */
    public static final byte[] f45576C = {79, 76, 89, 77, 80, 0};

    /* renamed from: D */
    public static final byte[] f45577D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: E */
    public static final byte[] f45578E = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: F */
    public static final byte[] f45579F = {101, 88, 73, 102};

    /* renamed from: G */
    public static final byte[] f45580G = {73, 72, 68, 82};

    /* renamed from: H */
    public static final byte[] f45581H = {73, 69, 78, 68};

    /* renamed from: I */
    public static final byte[] f45582I = {82, 73, 70, 70};

    /* renamed from: J */
    public static final byte[] f45583J = {87, 69, 66, 80};

    /* renamed from: K */
    public static final byte[] f45584K = {69, 88, 73, 70};

    /* renamed from: L */
    public static final byte[] f45585L = {-99, 1, 42};

    /* renamed from: M */
    public static final byte[] f45586M = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: N */
    public static final byte[] f45587N = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: O */
    public static final byte[] f45588O = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: P */
    public static final byte[] f45589P = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: Q */
    public static final byte[] f45590Q = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: S */
    public static final String[] f45592S = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: T */
    public static final int[] f45593T = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: U */
    public static final byte[] f45594U = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        C6948uQ[] c6948uQArr = {new C6948uQ("NewSubfileType", 254, 4), new C6948uQ("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new C6948uQ("ImageWidth", 256, 3, 4), new C6948uQ("ImageLength", 257, 3, 4), new C6948uQ("BitsPerSample", 258, 3), new C6948uQ("Compression", 259, 3), new C6948uQ("PhotometricInterpretation", 262, 3), new C6948uQ("ImageDescription", 270, 2), new C6948uQ("Make", 271, 2), new C6948uQ("Model", 272, 2), new C6948uQ("StripOffsets", 273, 3, 4), new C6948uQ("Orientation", 274, 3), new C6948uQ("SamplesPerPixel", 277, 3), new C6948uQ("RowsPerStrip", 278, 3, 4), new C6948uQ("StripByteCounts", 279, 3, 4), new C6948uQ("XResolution", 282, 5), new C6948uQ("YResolution", 283, 5), new C6948uQ("PlanarConfiguration", 284, 3), new C6948uQ("ResolutionUnit", 296, 3), new C6948uQ("TransferFunction", 301, 3), new C6948uQ("Software", 305, 2), new C6948uQ("DateTime", 306, 2), new C6948uQ("Artist", 315, 2), new C6948uQ("WhitePoint", 318, 5), new C6948uQ("PrimaryChromaticities", 319, 5), new C6948uQ("SubIFDPointer", 330, 4), new C6948uQ("JPEGInterchangeFormat", 513, 4), new C6948uQ("JPEGInterchangeFormatLength", 514, 4), new C6948uQ("YCbCrCoefficients", 529, 5), new C6948uQ("YCbCrSubSampling", 530, 3), new C6948uQ("YCbCrPositioning", 531, 3), new C6948uQ("ReferenceBlackWhite", 532, 5), new C6948uQ("Copyright", 33432, 2), new C6948uQ("ExifIFDPointer", 34665, 4), new C6948uQ("GPSInfoIFDPointer", 34853, 4), new C6948uQ("SensorTopBorder", 4, 4), new C6948uQ("SensorLeftBorder", 5, 4), new C6948uQ("SensorBottomBorder", 6, 4), new C6948uQ("SensorRightBorder", 7, 4), new C6948uQ("ISO", 23, 3), new C6948uQ("JpgFromRaw", 46, 7), new C6948uQ("Xmp", 700, 1)};
        C6948uQ[] c6948uQArr2 = {new C6948uQ("ExposureTime", 33434, 5), new C6948uQ("FNumber", 33437, 5), new C6948uQ("ExposureProgram", 34850, 3), new C6948uQ("SpectralSensitivity", 34852, 2), new C6948uQ("PhotographicSensitivity", 34855, 3), new C6948uQ("OECF", 34856, 7), new C6948uQ("SensitivityType", 34864, 3), new C6948uQ("StandardOutputSensitivity", 34865, 4), new C6948uQ("RecommendedExposureIndex", 34866, 4), new C6948uQ("ISOSpeed", 34867, 4), new C6948uQ("ISOSpeedLatitudeyyy", 34868, 4), new C6948uQ("ISOSpeedLatitudezzz", 34869, 4), new C6948uQ("ExifVersion", 36864, 2), new C6948uQ("DateTimeOriginal", 36867, 2), new C6948uQ("DateTimeDigitized", 36868, 2), new C6948uQ("OffsetTime", 36880, 2), new C6948uQ("OffsetTimeOriginal", 36881, 2), new C6948uQ("OffsetTimeDigitized", 36882, 2), new C6948uQ("ComponentsConfiguration", 37121, 7), new C6948uQ("CompressedBitsPerPixel", 37122, 5), new C6948uQ("ShutterSpeedValue", 37377, 10), new C6948uQ("ApertureValue", 37378, 5), new C6948uQ("BrightnessValue", 37379, 10), new C6948uQ("ExposureBiasValue", 37380, 10), new C6948uQ("MaxApertureValue", 37381, 5), new C6948uQ("SubjectDistance", 37382, 5), new C6948uQ("MeteringMode", 37383, 3), new C6948uQ("LightSource", 37384, 3), new C6948uQ("Flash", 37385, 3), new C6948uQ("FocalLength", 37386, 5), new C6948uQ("SubjectArea", 37396, 3), new C6948uQ("MakerNote", 37500, 7), new C6948uQ("UserComment", 37510, 7), new C6948uQ("SubSecTime", 37520, 2), new C6948uQ("SubSecTimeOriginal", 37521, 2), new C6948uQ("SubSecTimeDigitized", 37522, 2), new C6948uQ("FlashpixVersion", 40960, 7), new C6948uQ("ColorSpace", 40961, 3), new C6948uQ("PixelXDimension", 40962, 3, 4), new C6948uQ("PixelYDimension", 40963, 3, 4), new C6948uQ("RelatedSoundFile", 40964, 2), new C6948uQ("InteroperabilityIFDPointer", 40965, 4), new C6948uQ("FlashEnergy", 41483, 5), new C6948uQ("SpatialFrequencyResponse", 41484, 7), new C6948uQ("FocalPlaneXResolution", 41486, 5), new C6948uQ("FocalPlaneYResolution", 41487, 5), new C6948uQ("FocalPlaneResolutionUnit", 41488, 3), new C6948uQ("SubjectLocation", 41492, 3), new C6948uQ("ExposureIndex", 41493, 5), new C6948uQ("SensingMethod", 41495, 3), new C6948uQ("FileSource", 41728, 7), new C6948uQ("SceneType", 41729, 7), new C6948uQ("CFAPattern", 41730, 7), new C6948uQ("CustomRendered", 41985, 3), new C6948uQ("ExposureMode", 41986, 3), new C6948uQ("WhiteBalance", 41987, 3), new C6948uQ("DigitalZoomRatio", 41988, 5), new C6948uQ("FocalLengthIn35mmFilm", 41989, 3), new C6948uQ("SceneCaptureType", 41990, 3), new C6948uQ("GainControl", 41991, 3), new C6948uQ("Contrast", 41992, 3), new C6948uQ("Saturation", 41993, 3), new C6948uQ("Sharpness", 41994, 3), new C6948uQ("DeviceSettingDescription", 41995, 7), new C6948uQ("SubjectDistanceRange", 41996, 3), new C6948uQ("ImageUniqueID", 42016, 2), new C6948uQ("CameraOwnerName", 42032, 2), new C6948uQ("BodySerialNumber", 42033, 2), new C6948uQ("LensSpecification", 42034, 5), new C6948uQ("LensMake", 42035, 2), new C6948uQ("LensModel", 42036, 2), new C6948uQ("Gamma", 42240, 5), new C6948uQ("DNGVersion", 50706, 1), new C6948uQ("DefaultCropSize", 50720, 3, 4)};
        C6948uQ[] c6948uQArr3 = {new C6948uQ("GPSVersionID", 0, 1), new C6948uQ("GPSLatitudeRef", 1, 2), new C6948uQ("GPSLatitude", 2, 5, 10), new C6948uQ("GPSLongitudeRef", 3, 2), new C6948uQ("GPSLongitude", 4, 5, 10), new C6948uQ("GPSAltitudeRef", 5, 1), new C6948uQ("GPSAltitude", 6, 5), new C6948uQ("GPSTimeStamp", 7, 5), new C6948uQ("GPSSatellites", 8, 2), new C6948uQ("GPSStatus", 9, 2), new C6948uQ("GPSMeasureMode", 10, 2), new C6948uQ("GPSDOP", 11, 5), new C6948uQ("GPSSpeedRef", 12, 2), new C6948uQ("GPSSpeed", 13, 5), new C6948uQ("GPSTrackRef", 14, 2), new C6948uQ("GPSTrack", 15, 5), new C6948uQ("GPSImgDirectionRef", 16, 2), new C6948uQ("GPSImgDirection", 17, 5), new C6948uQ("GPSMapDatum", 18, 2), new C6948uQ("GPSDestLatitudeRef", 19, 2), new C6948uQ("GPSDestLatitude", 20, 5), new C6948uQ("GPSDestLongitudeRef", 21, 2), new C6948uQ("GPSDestLongitude", 22, 5), new C6948uQ("GPSDestBearingRef", 23, 2), new C6948uQ("GPSDestBearing", 24, 5), new C6948uQ("GPSDestDistanceRef", 25, 2), new C6948uQ("GPSDestDistance", 26, 5), new C6948uQ("GPSProcessingMethod", 27, 7), new C6948uQ("GPSAreaInformation", 28, 7), new C6948uQ("GPSDateStamp", 29, 2), new C6948uQ("GPSDifferential", 30, 3), new C6948uQ("GPSHPositioningError", 31, 5)};
        C6948uQ[] c6948uQArr4 = {new C6948uQ("InteroperabilityIndex", 1, 2)};
        C6948uQ[] c6948uQArr5 = {new C6948uQ("NewSubfileType", 254, 4), new C6948uQ("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new C6948uQ("ThumbnailImageWidth", 256, 3, 4), new C6948uQ("ThumbnailImageLength", 257, 3, 4), new C6948uQ("BitsPerSample", 258, 3), new C6948uQ("Compression", 259, 3), new C6948uQ("PhotometricInterpretation", 262, 3), new C6948uQ("ImageDescription", 270, 2), new C6948uQ("Make", 271, 2), new C6948uQ("Model", 272, 2), new C6948uQ("StripOffsets", 273, 3, 4), new C6948uQ("ThumbnailOrientation", 274, 3), new C6948uQ("SamplesPerPixel", 277, 3), new C6948uQ("RowsPerStrip", 278, 3, 4), new C6948uQ("StripByteCounts", 279, 3, 4), new C6948uQ("XResolution", 282, 5), new C6948uQ("YResolution", 283, 5), new C6948uQ("PlanarConfiguration", 284, 3), new C6948uQ("ResolutionUnit", 296, 3), new C6948uQ("TransferFunction", 301, 3), new C6948uQ("Software", 305, 2), new C6948uQ("DateTime", 306, 2), new C6948uQ("Artist", 315, 2), new C6948uQ("WhitePoint", 318, 5), new C6948uQ("PrimaryChromaticities", 319, 5), new C6948uQ("SubIFDPointer", 330, 4), new C6948uQ("JPEGInterchangeFormat", 513, 4), new C6948uQ("JPEGInterchangeFormatLength", 514, 4), new C6948uQ("YCbCrCoefficients", 529, 5), new C6948uQ("YCbCrSubSampling", 530, 3), new C6948uQ("YCbCrPositioning", 531, 3), new C6948uQ("ReferenceBlackWhite", 532, 5), new C6948uQ("Copyright", 33432, 2), new C6948uQ("ExifIFDPointer", 34665, 4), new C6948uQ("GPSInfoIFDPointer", 34853, 4), new C6948uQ("DNGVersion", 50706, 1), new C6948uQ("DefaultCropSize", 50720, 3, 4)};
        f45595V = new C6948uQ("StripOffsets", 273, 3);
        f45596W = new C6948uQ[][]{c6948uQArr, c6948uQArr2, c6948uQArr3, c6948uQArr4, c6948uQArr5, c6948uQArr, new C6948uQ[]{new C6948uQ("ThumbnailImage", 256, 7), new C6948uQ("CameraSettingsIFDPointer", 8224, 4), new C6948uQ("ImageProcessingIFDPointer", 8256, 4)}, new C6948uQ[]{new C6948uQ("PreviewImageStart", 257, 4), new C6948uQ("PreviewImageLength", 258, 4)}, new C6948uQ[]{new C6948uQ("AspectFrame", 4371, 3)}, new C6948uQ[]{new C6948uQ("ColorSpace", 55, 3)}};
        f45597X = new C6948uQ[]{new C6948uQ("SubIFDPointer", 330, 4), new C6948uQ("ExifIFDPointer", 34665, 4), new C6948uQ("GPSInfoIFDPointer", 34853, 4), new C6948uQ("InteroperabilityIFDPointer", 40965, 4), new C6948uQ("CameraSettingsIFDPointer", 8224, 1), new C6948uQ("ImageProcessingIFDPointer", 8256, 1)};
        f45598Y = new HashMap[10];
        f45599Z = new HashMap[10];
        f45600a0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f45601b0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f45602c0 = charsetForName;
        f45603d0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f45604e0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f45591R = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C6948uQ[][] c6948uQArr6 = f45596W;
            if (i >= c6948uQArr6.length) {
                HashMap map = f45601b0;
                C6948uQ[] c6948uQArr7 = f45597X;
                map.put(Integer.valueOf(c6948uQArr7[0].f43689a), 5);
                map.put(Integer.valueOf(c6948uQArr7[1].f43689a), 1);
                map.put(Integer.valueOf(c6948uQArr7[2].f43689a), 2);
                map.put(Integer.valueOf(c6948uQArr7[3].f43689a), 3);
                map.put(Integer.valueOf(c6948uQArr7[4].f43689a), 7);
                map.put(Integer.valueOf(c6948uQArr7[5].f43689a), 8);
                Pattern.compile(".*[1-9].*");
                f45605f0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f45606g0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f45607h0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f45598Y[i] = new HashMap();
            f45599Z[i] = new HashMap();
            for (C6948uQ c6948uQ : c6948uQArr6[i]) {
                f45598Y[i].put(Integer.valueOf(c6948uQ.f43689a), c6948uQ);
                f45599Z[i].put(c6948uQ.f43690b, c6948uQ);
            }
            i++;
        }
    }

    public C7137xQ(String str) throws Throwable {
        boolean z;
        C6948uQ[][] c6948uQArr = f45596W;
        this.f45619e = new HashMap[c6948uQArr.length];
        this.f45620f = new HashSet(c6948uQArr.length);
        this.f45621g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f45617c = null;
        this.f45615a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    AbstractC7263zQ.m26435c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z = true;
                } catch (Exception unused) {
                    z = false;
                }
                if (z) {
                    this.f45616b = fileInputStream2.getFD();
                } else {
                    this.f45616b = null;
                }
                m25884u(fileInputStream2);
                P02.m6197b(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                P02.m6197b(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: b */
    public static String m25851b(double d) {
        long j = (long) d;
        double d2 = d - j;
        long j2 = (long) (d2 * 60.0d);
        return j + "/1," + j2 + "/1," + Math.round((d2 - (j2 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    /* renamed from: c */
    public static double m25852c(String str, String str2) {
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

    /* renamed from: d */
    public static void m25853d(C6822sQ c6822sQ, C7157xk c7157xk, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (c6822sQ.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f45602c0;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            int i = c6822sQ.readInt();
            c7157xk.write(bArr3);
            c7157xk.m25933c(i);
            if (i % 2 == 1) {
                i++;
            }
            P02.m6199d(c6822sQ, c7157xk, i);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* renamed from: r */
    public static Pair m25854r(String str) throws NumberFormatException {
        if (str.contains(StringUtils.COMMA)) {
            String[] strArrSplit = str.split(StringUtils.COMMA, -1);
            Pair pairM25854r = m25854r(strArrSplit[0]);
            if (((Integer) pairM25854r.first).intValue() == 2) {
                return pairM25854r;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairM25854r2 = m25854r(strArrSplit[i]);
                int iIntValue = (((Integer) pairM25854r2.first).equals(pairM25854r.first) || ((Integer) pairM25854r2.second).equals(pairM25854r.first)) ? ((Integer) pairM25854r.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairM25854r.second).intValue() == -1 || !(((Integer) pairM25854r2.first).equals(pairM25854r.second) || ((Integer) pairM25854r2.second).equals(pairM25854r.second))) ? -1 : ((Integer) pairM25854r.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairM25854r = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairM25854r = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairM25854r;
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

    /* renamed from: x */
    public static ByteOrder m25855x(C6822sQ c6822sQ) throws IOException {
        short s = c6822sQ.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s));
    }

    /* renamed from: A */
    public final void m25856A(String str) {
        for (int i = 0; i < f45596W.length; i++) {
            this.f45619e[i].remove(str);
        }
    }

    /* renamed from: B */
    public final void m25857B(int i, String str, String str2) {
        HashMap[] mapArr = this.f45619e;
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
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25858C() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7137xQ.m25858C():void");
    }

    /* renamed from: D */
    public final void m25859D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (f45608t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        C6822sQ c6822sQ = new C6822sQ(bufferedInputStream);
        C7157xk c7157xk = new C7157xk(bufferedOutputStream, ByteOrder.BIG_ENDIAN, 1);
        if (c6822sQ.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        c7157xk.m25932a(-1);
        if (c6822sQ.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        c7157xk.m25932a(-40);
        String strM25869e = m25869e("Xmp");
        HashMap[] mapArr = this.f45619e;
        C6885tQ c6885tQ = (strM25869e == null || !this.f45633s) ? null : (C6885tQ) mapArr[0].remove("Xmp");
        c7157xk.m25932a(-1);
        c7157xk.m25932a(-31);
        m25867L(c7157xk);
        if (c6885tQ != null) {
            mapArr[0].put("Xmp", c6885tQ);
        }
        byte[] bArr = new byte[4096];
        while (c6822sQ.readByte() == -1) {
            byte b = c6822sQ.readByte();
            if (b == -39 || b == -38) {
                c7157xk.m25932a(-1);
                c7157xk.m25932a(b);
                P02.m6200e(c6822sQ, c7157xk);
                return;
            }
            if (b != -31) {
                c7157xk.m25932a(-1);
                c7157xk.m25932a(b);
                int unsignedShort = c6822sQ.readUnsignedShort();
                c7157xk.m25934e((short) unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid length");
                }
                while (i > 0) {
                    int i2 = c6822sQ.read(bArr, 0, Math.min(i, 4096));
                    if (i2 >= 0) {
                        c7157xk.write(bArr, 0, i2);
                        i -= i2;
                    }
                }
            } else {
                int unsignedShort2 = c6822sQ.readUnsignedShort();
                int i3 = unsignedShort2 - 2;
                if (i3 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i3 >= 6) {
                    if (c6822sQ.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f45603d0)) {
                        c6822sQ.m24738a(unsignedShort2 - 8);
                    }
                }
                c7157xk.m25932a(-1);
                c7157xk.m25932a(b);
                c7157xk.m25934e((short) unsignedShort2);
                if (i3 >= 6) {
                    i3 = unsignedShort2 - 8;
                    c7157xk.write(bArr2);
                }
                while (i3 > 0) {
                    int i4 = c6822sQ.read(bArr, 0, Math.min(i3, 4096));
                    if (i4 >= 0) {
                        c7157xk.write(bArr, 0, i4);
                        i3 -= i4;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /* renamed from: E */
    public final void m25860E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f45608t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        C6822sQ c6822sQ = new C6822sQ(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C7157xk c7157xk = new C7157xk(bufferedOutputStream, byteOrder, 1);
        P02.m6199d(c6822sQ, c7157xk, f45578E.length);
        if (this.f45629o == 0) {
            int i = c6822sQ.readInt();
            c7157xk.m25933c(i);
            P02.m6199d(c6822sQ, c7157xk, i + 8);
        } else {
            P02.m6199d(c6822sQ, c7157xk, (r2 - r7.length) - 8);
            c6822sQ.m24738a(c6822sQ.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            C7157xk c7157xk2 = new C7157xk(byteArrayOutputStream, byteOrder, 1);
            m25867L(c7157xk2);
            byte[] byteArray = ((ByteArrayOutputStream) c7157xk2.f45762b).toByteArray();
            c7157xk.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            c7157xk.m25933c((int) crc32.getValue());
            P02.m6197b(byteArrayOutputStream);
            P02.m6200e(c6822sQ, c7157xk);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            P02.m6197b(byteArrayOutputStream2);
            throw th;
        }
    }

    /* renamed from: F */
    public final void m25861F(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        C7157xk c7157xk;
        int i;
        int i2;
        boolean z;
        int i3;
        byte[] bArr;
        if (f45608t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C6822sQ c6822sQ = new C6822sQ(bufferedInputStream, byteOrder);
        C7157xk c7157xk2 = new C7157xk(bufferedOutputStream, byteOrder, 1);
        byte[] bArr2 = f45582I;
        P02.m6199d(c6822sQ, c7157xk2, bArr2.length);
        byte[] bArr3 = f45583J;
        c6822sQ.m24738a(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    C7157xk c7157xk3 = new C7157xk(byteArrayOutputStream2, byteOrder, 1);
                    int i4 = this.f45629o;
                    if (i4 != 0) {
                        P02.m6199d(c6822sQ, c7157xk3, (i4 - ((bArr2.length + 4) + bArr3.length)) - 8);
                        c6822sQ.m24738a(4);
                        int i5 = c6822sQ.readInt();
                        if (i5 % 2 != 0) {
                            i5++;
                        }
                        c6822sQ.m24738a(i5);
                        m25867L(c7157xk3);
                    } else {
                        byte[] bArr4 = new byte[4];
                        if (c6822sQ.read(bArr4) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr5 = f45586M;
                        boolean zEquals = Arrays.equals(bArr4, bArr5);
                        byte[] bArr6 = f45588O;
                        byte[] bArr7 = f45587N;
                        if (!zEquals) {
                            if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                                int i6 = c6822sQ.readInt();
                                int i7 = i6 % 2 == 1 ? i6 + 1 : i6;
                                byte[] bArr8 = new byte[3];
                                boolean zEquals2 = Arrays.equals(bArr4, bArr6);
                                byte[] bArr9 = f45585L;
                                if (zEquals2) {
                                    c6822sQ.read(bArr8);
                                    byte[] bArr10 = new byte[3];
                                    c7157xk = c7157xk2;
                                    if (c6822sQ.read(bArr10) != 3 || !Arrays.equals(bArr9, bArr10)) {
                                        throw new IOException("Encountered error while checking VP8 signature");
                                    }
                                    i = c6822sQ.readInt();
                                    i2 = (i << 18) >> 18;
                                    i7 -= 10;
                                    i3 = (i << 2) >> 18;
                                    z = false;
                                } else {
                                    c7157xk = c7157xk2;
                                    if (!Arrays.equals(bArr4, bArr7)) {
                                        i = 0;
                                        i2 = 0;
                                        z = false;
                                        i3 = 0;
                                    } else {
                                        if (c6822sQ.readByte() != 47) {
                                            throw new IOException("Encountered error while checking VP8L signature");
                                        }
                                        i = c6822sQ.readInt();
                                        z = true;
                                        i2 = (i & 16383) + 1;
                                        i3 = ((i & 268419072) >>> 14) + 1;
                                        if ((i & 268435456) == 0) {
                                            z = false;
                                        }
                                        i7 -= 5;
                                    }
                                }
                                c7157xk3.write(bArr5);
                                c7157xk3.m25933c(10);
                                byte[] bArr11 = new byte[10];
                                if (z) {
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
                                c7157xk3.write(bArr11);
                                c7157xk3.write(bArr4);
                                c7157xk3.m25933c(i6);
                                if (Arrays.equals(bArr4, bArr6)) {
                                    c7157xk3.write(bArr8);
                                    c7157xk3.write(bArr9);
                                    c7157xk3.m25933c(i);
                                } else if (Arrays.equals(bArr4, bArr7)) {
                                    c7157xk3.write(47);
                                    c7157xk3.m25933c(i);
                                }
                                P02.m6199d(c6822sQ, c7157xk3, i7);
                                m25867L(c7157xk3);
                            }
                            P02.m6200e(c6822sQ, c7157xk3);
                            byte[] bArr12 = bArr;
                            C7157xk c7157xk4 = c7157xk;
                            c7157xk4.m25933c(byteArrayOutputStream2.size() + bArr12.length);
                            c7157xk4.write(bArr12);
                            byteArrayOutputStream2.writeTo(c7157xk4);
                            P02.m6197b(byteArrayOutputStream2);
                        }
                        int i10 = c6822sQ.readInt();
                        byte[] bArr13 = new byte[i10 % 2 == 1 ? i10 + 1 : i10];
                        c6822sQ.read(bArr13);
                        byte b = (byte) (bArr13[0] | 8);
                        bArr13[0] = b;
                        boolean z2 = ((b >> 1) & 1) == 1;
                        c7157xk3.write(bArr5);
                        c7157xk3.m25933c(i10);
                        c7157xk3.write(bArr13);
                        if (z2) {
                            m25853d(c6822sQ, c7157xk3, f45589P, null);
                            while (true) {
                                byte[] bArr14 = new byte[4];
                                bufferedInputStream.read(bArr14);
                                if (!Arrays.equals(bArr14, f45590Q)) {
                                    break;
                                }
                                int i11 = c6822sQ.readInt();
                                c7157xk3.write(bArr14);
                                c7157xk3.m25933c(i11);
                                if (i11 % 2 == 1) {
                                    i11++;
                                }
                                P02.m6199d(c6822sQ, c7157xk3, i11);
                            }
                            m25867L(c7157xk3);
                        } else {
                            m25853d(c6822sQ, c7157xk3, bArr6, bArr7);
                            m25867L(c7157xk3);
                        }
                    }
                    c7157xk = c7157xk2;
                    bArr = bArr3;
                    P02.m6200e(c6822sQ, c7157xk3);
                    byte[] bArr122 = bArr;
                    C7157xk c7157xk42 = c7157xk;
                    c7157xk42.m25933c(byteArrayOutputStream2.size() + bArr122.length);
                    c7157xk42.write(bArr122);
                    byteArrayOutputStream2.writeTo(c7157xk42);
                    P02.m6197b(byteArrayOutputStream2);
                } catch (Exception e) {
                    e = e;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    P02.m6197b(byteArrayOutputStream);
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
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25862G(java.lang.String r19, java.lang.String r20) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7137xQ.m25862G(java.lang.String, java.lang.String):void");
    }

    /* renamed from: H */
    public final void m25863H(C6822sQ c6822sQ) throws Throwable {
        C6885tQ c6885tQ;
        HashMap map = this.f45619e[4];
        C6885tQ c6885tQ2 = (C6885tQ) map.get("Compression");
        if (c6885tQ2 == null) {
            this.f45628n = 6;
            m25882s(c6822sQ, map);
            return;
        }
        int iM24926h = c6885tQ2.m24926h(this.f45621g);
        this.f45628n = iM24926h;
        if (iM24926h != 1) {
            if (iM24926h == 6) {
                m25882s(c6822sQ, map);
                return;
            } else if (iM24926h != 7) {
                return;
            }
        }
        C6885tQ c6885tQ3 = (C6885tQ) map.get("BitsPerSample");
        if (c6885tQ3 != null) {
            int[] iArr = (int[]) c6885tQ3.m24928j(this.f45621g);
            int[] iArr2 = f45611w;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f45618d != 3 || (c6885tQ = (C6885tQ) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iM24926h2 = c6885tQ.m24926h(this.f45621g);
                if ((iM24926h2 != 1 || !Arrays.equals(iArr, f45612x)) && (iM24926h2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            C6885tQ c6885tQ4 = (C6885tQ) map.get("StripOffsets");
            C6885tQ c6885tQ5 = (C6885tQ) map.get("StripByteCounts");
            if (c6885tQ4 == null || c6885tQ5 == null) {
                return;
            }
            long[] jArrM6198c = P02.m6198c(c6885tQ4.m24928j(this.f45621g));
            long[] jArrM6198c2 = P02.m6198c(c6885tQ5.m24928j(this.f45621g));
            if (jArrM6198c == null || jArrM6198c.length == 0 || jArrM6198c2 == null || jArrM6198c2.length == 0 || jArrM6198c.length != jArrM6198c2.length) {
                return;
            }
            long j = 0;
            for (long j2 : jArrM6198c2) {
                j += j2;
            }
            int i = (int) j;
            byte[] bArr = new byte[i];
            this.f45624j = true;
            this.f45623i = true;
            this.f45622h = true;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < jArrM6198c.length; i4++) {
                int i5 = (int) jArrM6198c[i4];
                int i6 = (int) jArrM6198c2[i4];
                if (i4 < jArrM6198c.length - 1 && i5 + i6 != jArrM6198c[i4 + 1]) {
                    this.f45624j = false;
                }
                int i7 = i5 - i2;
                if (i7 < 0) {
                    return;
                }
                long j3 = i7;
                if (c6822sQ.skip(j3) != j3) {
                    return;
                }
                int i8 = i2 + i7;
                byte[] bArr2 = new byte[i6];
                if (c6822sQ.read(bArr2) != i6) {
                    return;
                }
                i2 = i8 + i6;
                System.arraycopy(bArr2, 0, bArr, i3, i6);
                i3 += i6;
            }
            this.f45627m = bArr;
            if (this.f45624j) {
                this.f45625k = (int) jArrM6198c[0];
                this.f45626l = i;
            }
        }
    }

    /* renamed from: I */
    public final void m25864I(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f45619e;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        C6885tQ c6885tQ = (C6885tQ) mapArr[i].get("ImageLength");
        C6885tQ c6885tQ2 = (C6885tQ) mapArr[i].get("ImageWidth");
        C6885tQ c6885tQ3 = (C6885tQ) mapArr[i2].get("ImageLength");
        C6885tQ c6885tQ4 = (C6885tQ) mapArr[i2].get("ImageWidth");
        if (c6885tQ == null || c6885tQ2 == null || c6885tQ3 == null || c6885tQ4 == null) {
            return;
        }
        int iM24926h = c6885tQ.m24926h(this.f45621g);
        int iM24926h2 = c6885tQ2.m24926h(this.f45621g);
        int iM24926h3 = c6885tQ3.m24926h(this.f45621g);
        int iM24926h4 = c6885tQ4.m24926h(this.f45621g);
        if (iM24926h >= iM24926h3 || iM24926h2 >= iM24926h4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* renamed from: J */
    public final void m25865J(C7074wQ c7074wQ, int i) throws Throwable {
        C6885tQ c6885tQM24923e;
        C6885tQ c6885tQM24923e2;
        HashMap[] mapArr = this.f45619e;
        C6885tQ c6885tQ = (C6885tQ) mapArr[i].get("DefaultCropSize");
        C6885tQ c6885tQ2 = (C6885tQ) mapArr[i].get("SensorTopBorder");
        C6885tQ c6885tQ3 = (C6885tQ) mapArr[i].get("SensorLeftBorder");
        C6885tQ c6885tQ4 = (C6885tQ) mapArr[i].get("SensorBottomBorder");
        C6885tQ c6885tQ5 = (C6885tQ) mapArr[i].get("SensorRightBorder");
        if (c6885tQ != null) {
            if (c6885tQ.f43059a == 5) {
                C7011vQ[] c7011vQArr = (C7011vQ[]) c6885tQ.m24928j(this.f45621g);
                if (c7011vQArr == null || c7011vQArr.length != 2) {
                    Arrays.toString(c7011vQArr);
                    return;
                }
                c6885tQM24923e = C6885tQ.m24922d(new C7011vQ[]{c7011vQArr[0]}, this.f45621g);
                c6885tQM24923e2 = C6885tQ.m24922d(new C7011vQ[]{c7011vQArr[1]}, this.f45621g);
            } else {
                int[] iArr = (int[]) c6885tQ.m24928j(this.f45621g);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    c6885tQM24923e = C6885tQ.m24923e(iArr[0], this.f45621g);
                    c6885tQM24923e2 = C6885tQ.m24923e(iArr[1], this.f45621g);
                }
            }
            mapArr[i].put("ImageWidth", c6885tQM24923e);
            mapArr[i].put("ImageLength", c6885tQM24923e2);
            return;
        }
        if (c6885tQ2 != null && c6885tQ3 != null && c6885tQ4 != null && c6885tQ5 != null) {
            int iM24926h = c6885tQ2.m24926h(this.f45621g);
            int iM24926h2 = c6885tQ4.m24926h(this.f45621g);
            int iM24926h3 = c6885tQ5.m24926h(this.f45621g);
            int iM24926h4 = c6885tQ3.m24926h(this.f45621g);
            if (iM24926h2 <= iM24926h || iM24926h3 <= iM24926h4) {
                return;
            }
            C6885tQ c6885tQM24923e3 = C6885tQ.m24923e(iM24926h2 - iM24926h, this.f45621g);
            C6885tQ c6885tQM24923e4 = C6885tQ.m24923e(iM24926h3 - iM24926h4, this.f45621g);
            mapArr[i].put("ImageLength", c6885tQM24923e3);
            mapArr[i].put("ImageWidth", c6885tQM24923e4);
            return;
        }
        C6885tQ c6885tQ6 = (C6885tQ) mapArr[i].get("ImageLength");
        C6885tQ c6885tQ7 = (C6885tQ) mapArr[i].get("ImageWidth");
        if (c6885tQ6 == null || c6885tQ7 == null) {
            C6885tQ c6885tQ8 = (C6885tQ) mapArr[i].get("JPEGInterchangeFormat");
            C6885tQ c6885tQ9 = (C6885tQ) mapArr[i].get("JPEGInterchangeFormatLength");
            if (c6885tQ8 == null || c6885tQ9 == null) {
                return;
            }
            int iM24926h5 = c6885tQ8.m24926h(this.f45621g);
            int iM24926h6 = c6885tQ8.m24926h(this.f45621g);
            c7074wQ.m25616c(iM24926h5);
            byte[] bArr = new byte[iM24926h6];
            c7074wQ.read(bArr);
            m25873i(new C6822sQ(bArr), iM24926h5, i);
        }
    }

    /* renamed from: K */
    public final void m25866K() throws Throwable {
        m25864I(0, 5);
        m25864I(0, 4);
        m25864I(5, 4);
        HashMap[] mapArr = this.f45619e;
        C6885tQ c6885tQ = (C6885tQ) mapArr[1].get("PixelXDimension");
        C6885tQ c6885tQ2 = (C6885tQ) mapArr[1].get("PixelYDimension");
        if (c6885tQ != null && c6885tQ2 != null) {
            mapArr[0].put("ImageWidth", c6885tQ);
            mapArr[0].put("ImageLength", c6885tQ2);
        }
        if (mapArr[4].isEmpty() && m25883t(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        m25883t(mapArr[4]);
        m25857B(0, "ThumbnailOrientation", "Orientation");
        m25857B(0, "ThumbnailImageLength", "ImageLength");
        m25857B(0, "ThumbnailImageWidth", "ImageWidth");
        m25857B(5, "ThumbnailOrientation", "Orientation");
        m25857B(5, "ThumbnailImageLength", "ImageLength");
        m25857B(5, "ThumbnailImageWidth", "ImageWidth");
        m25857B(4, "Orientation", "ThumbnailOrientation");
        m25857B(4, "ImageLength", "ThumbnailImageLength");
        m25857B(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: L */
    public final void m25867L(C7157xk c7157xk) throws IOException {
        HashMap[] mapArr;
        int[] iArr;
        HashMap[] mapArr2;
        HashMap[] mapArr3;
        Object[] objArr;
        int i;
        int i2 = 1;
        C6948uQ[][] c6948uQArr = f45596W;
        int[] iArr2 = new int[c6948uQArr.length];
        int[] iArr3 = new int[c6948uQArr.length];
        C6948uQ[] c6948uQArr2 = f45597X;
        for (C6948uQ c6948uQ : c6948uQArr2) {
            m25856A(c6948uQ.f43690b);
        }
        if (this.f45622h) {
            if (this.f45623i) {
                m25856A("StripOffsets");
                m25856A("StripByteCounts");
            } else {
                m25856A("JPEGInterchangeFormat");
                m25856A("JPEGInterchangeFormatLength");
            }
        }
        int i3 = 0;
        while (true) {
            int length = c6948uQArr.length;
            mapArr = this.f45619e;
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
            mapArr[0].put(c6948uQArr2[i5].f43690b, C6885tQ.m24920b(0L, this.f45621g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(c6948uQArr2[2].f43690b, C6885tQ.m24920b(0L, this.f45621g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(c6948uQArr2[3].f43690b, C6885tQ.m24920b(0L, this.f45621g));
        }
        if (this.f45622h) {
            if (this.f45623i) {
                mapArr[4].put("StripOffsets", C6885tQ.m24923e(0, this.f45621g));
                mapArr[4].put("StripByteCounts", C6885tQ.m24923e(this.f45626l, this.f45621g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", C6885tQ.m24920b(0L, this.f45621g));
                mapArr[4].put("JPEGInterchangeFormatLength", C6885tQ.m24920b(this.f45626l, this.f45621g));
            }
        }
        int i6 = 0;
        while (true) {
            int length3 = c6948uQArr.length;
            iArr = f45593T;
            if (i6 >= length3) {
                break;
            }
            Iterator it = mapArr[i6].entrySet().iterator();
            int i7 = 0;
            while (it.hasNext()) {
                C6885tQ c6885tQ = (C6885tQ) ((Map.Entry) it.next()).getValue();
                c6885tQ.getClass();
                int i8 = iArr[c6885tQ.f43059a] * c6885tQ.f43060b;
                if (i8 > 4) {
                    i7 += i8;
                }
            }
            iArr3[i6] = iArr3[i6] + i7;
            i6++;
        }
        int size = 8;
        for (int i9 = 0; i9 < c6948uQArr.length; i9++) {
            if (!mapArr[i9].isEmpty()) {
                iArr2[i9] = size;
                size += (mapArr[i9].size() * 12) + 6 + iArr3[i9];
            }
        }
        if (this.f45622h) {
            if (this.f45623i) {
                mapArr[4].put("StripOffsets", C6885tQ.m24923e(size, this.f45621g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", C6885tQ.m24920b(size, this.f45621g));
            }
            this.f45625k = size;
            size += this.f45626l;
        }
        if (this.f45618d == 4) {
            size += 8;
        }
        if (f45608t) {
            for (int i10 = 0; i10 < c6948uQArr.length; i10++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i10), Integer.valueOf(iArr2[i10]), Integer.valueOf(mapArr[i10].size()), Integer.valueOf(iArr3[i10]), Integer.valueOf(size));
            }
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(c6948uQArr2[1].f43690b, C6885tQ.m24920b(iArr2[1], this.f45621g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(c6948uQArr2[2].f43690b, C6885tQ.m24920b(iArr2[2], this.f45621g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(c6948uQArr2[3].f43690b, C6885tQ.m24920b(iArr2[3], this.f45621g));
        }
        int i11 = this.f45618d;
        if (i11 == 4) {
            c7157xk.m25934e((short) size);
            c7157xk.write(f45603d0);
        } else if (i11 == 13) {
            c7157xk.m25933c(size);
            c7157xk.write(f45579F);
        } else if (i11 == 14) {
            c7157xk.write(f45584K);
            c7157xk.m25933c(size);
        }
        c7157xk.m25934e(this.f45621g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        c7157xk.f45763c = this.f45621g;
        c7157xk.m25934e((short) 42);
        c7157xk.m25933c((int) 8);
        int i12 = 0;
        while (i12 < c6948uQArr.length) {
            if (mapArr[i12].isEmpty()) {
                mapArr2 = mapArr;
            } else {
                c7157xk.m25934e((short) mapArr[i12].size());
                int size2 = (mapArr[i12].size() * 12) + iArr2[i12] + 2 + 4;
                for (Map.Entry entry2 : mapArr[i12].entrySet()) {
                    int i13 = ((C6948uQ) f45599Z[i12].get(entry2.getKey())).f43689a;
                    C6885tQ c6885tQ2 = (C6885tQ) entry2.getValue();
                    c6885tQ2.getClass();
                    int i14 = c6885tQ2.f43059a;
                    int i15 = iArr[i14];
                    int i16 = c6885tQ2.f43060b;
                    int i17 = i15 * i16;
                    c7157xk.m25934e((short) i13);
                    c7157xk.m25934e((short) i14);
                    c7157xk.m25933c(i16);
                    if (i17 > 4) {
                        mapArr3 = mapArr;
                        c7157xk.m25933c(size2);
                        size2 += i17;
                    } else {
                        mapArr3 = mapArr;
                        c7157xk.write(c6885tQ2.f43062d);
                        if (i17 < 4) {
                            while (i17 < 4) {
                                c7157xk.m25932a(0);
                                i17++;
                            }
                        }
                    }
                    mapArr = mapArr3;
                }
                mapArr2 = mapArr;
                if (i12 != 0 || mapArr2[4].isEmpty()) {
                    c7157xk.m25933c((int) 0);
                } else {
                    c7157xk.m25933c(iArr2[4]);
                }
                Iterator it2 = mapArr2[i12].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((C6885tQ) ((Map.Entry) it2.next()).getValue()).f43062d;
                    if (bArr.length > 4) {
                        c7157xk.write(bArr, 0, bArr.length);
                    }
                }
            }
            i12++;
            mapArr = mapArr2;
        }
        if (this.f45622h) {
            c7157xk.write(m25880p());
        }
        if (this.f45618d == 14 && size % 2 == 1) {
            c7157xk.m25932a(0);
        }
        c7157xk.f45763c = ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: a */
    public final void m25868a() {
        String strM25869e = m25869e("DateTimeOriginal");
        HashMap[] mapArr = this.f45619e;
        if (strM25869e != null && m25869e("DateTime") == null) {
            mapArr[0].put("DateTime", C6885tQ.m24919a(strM25869e));
        }
        if (m25869e("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C6885tQ.m24920b(0L, this.f45621g));
        }
        if (m25869e("ImageLength") == null) {
            mapArr[0].put("ImageLength", C6885tQ.m24920b(0L, this.f45621g));
        }
        if (m25869e("Orientation") == null) {
            mapArr[0].put("Orientation", C6885tQ.m24920b(0L, this.f45621g));
        }
        if (m25869e("LightSource") == null) {
            mapArr[1].put("LightSource", C6885tQ.m24920b(0L, this.f45621g));
        }
    }

    /* renamed from: e */
    public final String m25869e(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        C6885tQ c6885tQM25871g = m25871g(str);
        if (c6885tQM25871g != null) {
            if (!f45600a0.contains(str)) {
                return c6885tQM25871g.m24927i(this.f45621g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c6885tQM25871g.f43059a;
                if (i != 5 && i != 10) {
                    return null;
                }
                C7011vQ[] c7011vQArr = (C7011vQ[]) c6885tQM25871g.m24928j(this.f45621g);
                if (c7011vQArr == null || c7011vQArr.length != 3) {
                    Arrays.toString(c7011vQArr);
                    return null;
                }
                C7011vQ c7011vQ = c7011vQArr[0];
                Integer numValueOf = Integer.valueOf((int) (c7011vQ.f44371a / c7011vQ.f44372b));
                C7011vQ c7011vQ2 = c7011vQArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c7011vQ2.f44371a / c7011vQ2.f44372b));
                C7011vQ c7011vQ3 = c7011vQArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c7011vQ3.f44371a / c7011vQ3.f44372b)));
            }
            try {
                return Double.toString(c6885tQM25871g.m24925g(this.f45621g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    public final int m25870f(int i, String str) {
        C6885tQ c6885tQM25871g = m25871g(str);
        if (c6885tQM25871g == null) {
            return i;
        }
        try {
            return c6885tQM25871g.m24926h(this.f45621g);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: g */
    public final C6885tQ m25871g(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f45596W.length; i++) {
            C6885tQ c6885tQ = (C6885tQ) this.f45619e[i].get(str);
            if (c6885tQ != null) {
                return c6885tQ;
            }
        }
        return null;
    }

    /* renamed from: h */
    public final void m25872h(C7074wQ c7074wQ) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC0027AQ.m179a(mediaMetadataRetriever, new C6742rQ(c7074wQ));
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
                HashMap[] mapArr = this.f45619e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C6885tQ.m24923e(Integer.parseInt(strExtractMetadata), this.f45621g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C6885tQ.m24923e(Integer.parseInt(strExtractMetadata2), this.f45621g));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", C6885tQ.m24923e(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f45621g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c7074wQ.m25616c(i2);
                    byte[] bArr = new byte[6];
                    if (c7074wQ.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, f45603d0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (c7074wQ.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.f45629o = i4;
                    m25887y(0, bArr2);
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
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25873i(p000.C6822sQ r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7137xQ.m25873i(sQ, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m25874j(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7137xQ.m25874j(java.io.BufferedInputStream):int");
    }

    /* renamed from: k */
    public final void m25875k(C7074wQ c7074wQ) throws Throwable {
        int i;
        int i2;
        m25878n(c7074wQ);
        HashMap[] mapArr = this.f45619e;
        C6885tQ c6885tQ = (C6885tQ) mapArr[1].get("MakerNote");
        if (c6885tQ != null) {
            C7074wQ c7074wQ2 = new C7074wQ(c6885tQ.f43062d);
            c7074wQ2.f42425b = this.f45621g;
            byte[] bArr = f45576C;
            byte[] bArr2 = new byte[bArr.length];
            c7074wQ2.readFully(bArr2);
            c7074wQ2.m25616c(0L);
            byte[] bArr3 = f45577D;
            byte[] bArr4 = new byte[bArr3.length];
            c7074wQ2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c7074wQ2.m25616c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c7074wQ2.m25616c(12L);
            }
            m25888z(c7074wQ2, 6);
            C6885tQ c6885tQ2 = (C6885tQ) mapArr[7].get("PreviewImageStart");
            C6885tQ c6885tQ3 = (C6885tQ) mapArr[7].get("PreviewImageLength");
            if (c6885tQ2 != null && c6885tQ3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c6885tQ2);
                mapArr[5].put("JPEGInterchangeFormatLength", c6885tQ3);
            }
            C6885tQ c6885tQ4 = (C6885tQ) mapArr[8].get("AspectFrame");
            if (c6885tQ4 != null) {
                int[] iArr = (int[]) c6885tQ4.m24928j(this.f45621g);
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
                C6885tQ c6885tQM24923e = C6885tQ.m24923e(i5, this.f45621g);
                C6885tQ c6885tQM24923e2 = C6885tQ.m24923e(i6, this.f45621g);
                mapArr[0].put("ImageWidth", c6885tQM24923e);
                mapArr[0].put("ImageLength", c6885tQM24923e2);
            }
        }
    }

    /* renamed from: l */
    public final void m25876l(C6822sQ c6822sQ) throws Throwable {
        if (f45608t) {
            Objects.toString(c6822sQ);
        }
        c6822sQ.f42425b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f45578E;
        c6822sQ.m24738a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c6822sQ.readInt();
                byte[] bArr2 = new byte[4];
                if (c6822sQ.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, f45580G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f45581H)) {
                    return;
                }
                if (Arrays.equals(bArr2, f45579F)) {
                    byte[] bArr3 = new byte[i];
                    if (c6822sQ.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + P02.m6196a(bArr2));
                    }
                    int i3 = c6822sQ.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.f45629o = i2;
                        m25887y(0, bArr3);
                        m25866K();
                        m25863H(new C6822sQ(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c6822sQ.m24738a(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: m */
    public final void m25877m(C6822sQ c6822sQ) throws Throwable {
        if (f45608t) {
            Objects.toString(c6822sQ);
        }
        c6822sQ.m24738a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c6822sQ.read(bArr);
        c6822sQ.read(bArr2);
        c6822sQ.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c6822sQ.m24738a(i - c6822sQ.f42426c);
        c6822sQ.read(bArr4);
        m25873i(new C6822sQ(bArr4), i, 5);
        c6822sQ.m24738a(i3 - c6822sQ.f42426c);
        c6822sQ.f42425b = ByteOrder.BIG_ENDIAN;
        int i4 = c6822sQ.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c6822sQ.readUnsignedShort();
            int unsignedShort2 = c6822sQ.readUnsignedShort();
            if (unsignedShort == f45595V.f43689a) {
                short s = c6822sQ.readShort();
                short s2 = c6822sQ.readShort();
                C6885tQ c6885tQM24923e = C6885tQ.m24923e(s, this.f45621g);
                C6885tQ c6885tQM24923e2 = C6885tQ.m24923e(s2, this.f45621g);
                HashMap[] mapArr = this.f45619e;
                mapArr[0].put("ImageLength", c6885tQM24923e);
                mapArr[0].put("ImageWidth", c6885tQM24923e2);
                return;
            }
            c6822sQ.m24738a(unsignedShort2);
        }
    }

    /* renamed from: n */
    public final void m25878n(C7074wQ c7074wQ) throws Throwable {
        m25885v(c7074wQ);
        m25888z(c7074wQ, 0);
        m25865J(c7074wQ, 0);
        m25865J(c7074wQ, 5);
        m25865J(c7074wQ, 4);
        m25866K();
        if (this.f45618d == 8) {
            HashMap[] mapArr = this.f45619e;
            C6885tQ c6885tQ = (C6885tQ) mapArr[1].get("MakerNote");
            if (c6885tQ != null) {
                C7074wQ c7074wQ2 = new C7074wQ(c6885tQ.f43062d);
                c7074wQ2.f42425b = this.f45621g;
                c7074wQ2.m24738a(6);
                m25888z(c7074wQ2, 9);
                C6885tQ c6885tQ2 = (C6885tQ) mapArr[9].get("ColorSpace");
                if (c6885tQ2 != null) {
                    mapArr[1].put("ColorSpace", c6885tQ2);
                }
            }
        }
    }

    /* renamed from: o */
    public final void m25879o(C7074wQ c7074wQ) throws Throwable {
        if (f45608t) {
            Objects.toString(c7074wQ);
        }
        m25878n(c7074wQ);
        HashMap[] mapArr = this.f45619e;
        C6885tQ c6885tQ = (C6885tQ) mapArr[0].get("JpgFromRaw");
        if (c6885tQ != null) {
            m25873i(new C6822sQ(c6885tQ.f43062d), (int) c6885tQ.f43061c, 5);
        }
        C6885tQ c6885tQ2 = (C6885tQ) mapArr[0].get("ISO");
        C6885tQ c6885tQ3 = (C6885tQ) mapArr[1].get("PhotographicSensitivity");
        if (c6885tQ2 == null || c6885tQ3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c6885tQ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] m25880p() throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r8.f45622h
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte[] r0 = r8.f45627m
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.content.res.AssetManager$AssetInputStream r0 = r8.f45617c     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
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
            p000.P02.m6197b(r0)
            return r1
        L28:
            java.lang.String r0 = r8.f45615a     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            if (r0 == 0) goto L3d
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            java.lang.String r2 = r8.f45615a     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
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
            java.io.FileDescriptor r0 = r8.f45616b     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            java.io.FileDescriptor r0 = p000.AbstractC7263zQ.m26434b(r0)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L39
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            r3 = 0
            p000.AbstractC7263zQ.m26435c(r0, r3, r2)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L90 java.lang.Exception -> L94
            r7 = r2
            r2 = r0
            r0 = r7
        L52:
            int r3 = r8.f45625k     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r4 = r8.f45629o     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r3 = r3 + r4
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            long r3 = r0.skip(r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r5 = r8.f45625k     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r6 = r8.f45629o     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r5 = r5 + r6
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r4 = "Corrupted image"
            if (r3 != 0) goto L8a
            int r3 = r8.f45626l     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r5 = r0.read(r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            int r6 = r8.f45626l     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            if (r5 != r6) goto L84
            r8.f45627m = r3     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> La0
            p000.P02.m6197b(r0)
            if (r2 == 0) goto L7e
            p000.AbstractC7263zQ.m26433a(r2)     // Catch: java.lang.Exception -> L7e
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
            p000.P02.m6197b(r1)
            if (r2 == 0) goto L9f
            p000.AbstractC7263zQ.m26433a(r2)     // Catch: java.lang.Exception -> L9f
        L9f:
            throw r0
        La0:
            p000.P02.m6197b(r0)
            if (r2 == 0) goto La8
            p000.AbstractC7263zQ.m26433a(r2)     // Catch: java.lang.Exception -> La8
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7137xQ.m25880p():byte[]");
    }

    /* renamed from: q */
    public final void m25881q(C6822sQ c6822sQ) throws Throwable {
        if (f45608t) {
            Objects.toString(c6822sQ);
        }
        c6822sQ.f42425b = ByteOrder.LITTLE_ENDIAN;
        c6822sQ.m24738a(f45582I.length);
        int i = c6822sQ.readInt() + 8;
        byte[] bArr = f45583J;
        c6822sQ.m24738a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c6822sQ.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c6822sQ.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f45584K, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c6822sQ.read(bArr3) == i2) {
                        this.f45629o = i3;
                        m25887y(0, bArr3);
                        m25863H(new C6822sQ(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + P02.m6196a(bArr2));
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
                c6822sQ.m24738a(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: s */
    public final void m25882s(C6822sQ c6822sQ, HashMap map) throws Throwable {
        C6885tQ c6885tQ = (C6885tQ) map.get("JPEGInterchangeFormat");
        C6885tQ c6885tQ2 = (C6885tQ) map.get("JPEGInterchangeFormatLength");
        if (c6885tQ == null || c6885tQ2 == null) {
            return;
        }
        int iM24926h = c6885tQ.m24926h(this.f45621g);
        int iM24926h2 = c6885tQ2.m24926h(this.f45621g);
        if (this.f45618d == 7) {
            iM24926h += this.f45630p;
        }
        if (iM24926h <= 0 || iM24926h2 <= 0) {
            return;
        }
        this.f45622h = true;
        if (this.f45615a == null && this.f45617c == null && this.f45616b == null) {
            byte[] bArr = new byte[iM24926h2];
            c6822sQ.skip(iM24926h);
            c6822sQ.read(bArr);
            this.f45627m = bArr;
        }
        this.f45625k = iM24926h;
        this.f45626l = iM24926h2;
    }

    /* renamed from: t */
    public final boolean m25883t(HashMap map) {
        C6885tQ c6885tQ = (C6885tQ) map.get("ImageLength");
        C6885tQ c6885tQ2 = (C6885tQ) map.get("ImageWidth");
        if (c6885tQ == null || c6885tQ2 == null) {
            return false;
        }
        return c6885tQ.m24926h(this.f45621g) <= 512 && c6885tQ2.m24926h(this.f45621g) <= 512;
    }

    /* renamed from: u */
    public final void m25884u(InputStream inputStream) throws Throwable {
        boolean z = f45608t;
        for (int i = 0; i < f45596W.length; i++) {
            try {
                this.f45619e[i] = new HashMap();
            } catch (IOException | UnsupportedOperationException unused) {
                m25868a();
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                m25868a();
                if (z) {
                    m25886w();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iM25874j = m25874j(bufferedInputStream);
        this.f45618d = iM25874j;
        if (iM25874j == 4 || iM25874j == 9 || iM25874j == 13 || iM25874j == 14) {
            C6822sQ c6822sQ = new C6822sQ(bufferedInputStream);
            int i2 = this.f45618d;
            if (i2 == 4) {
                m25873i(c6822sQ, 0, 0);
            } else if (i2 == 13) {
                m25876l(c6822sQ);
            } else if (i2 == 9) {
                m25877m(c6822sQ);
            } else if (i2 == 14) {
                m25881q(c6822sQ);
            }
        } else {
            C7074wQ c7074wQ = new C7074wQ(bufferedInputStream);
            int i3 = this.f45618d;
            if (i3 == 12) {
                m25872h(c7074wQ);
            } else if (i3 == 7) {
                m25875k(c7074wQ);
            } else if (i3 == 10) {
                m25879o(c7074wQ);
            } else {
                m25878n(c7074wQ);
            }
            c7074wQ.m25616c(this.f45629o);
            m25863H(c7074wQ);
        }
        m25868a();
        if (!z) {
            return;
        }
        m25886w();
    }

    /* renamed from: v */
    public final void m25885v(C7074wQ c7074wQ) throws IOException {
        ByteOrder byteOrderM25855x = m25855x(c7074wQ);
        this.f45621g = byteOrderM25855x;
        c7074wQ.f42425b = byteOrderM25855x;
        int unsignedShort = c7074wQ.readUnsignedShort();
        int i = this.f45618d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = c7074wQ.readInt();
        if (i2 < 8) {
            throw new IOException(AbstractC11153tN0.m24909u(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c7074wQ.m24738a(i3);
        }
    }

    /* renamed from: w */
    public final void m25886w() throws Throwable {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f45619e;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C6885tQ c6885tQ = (C6885tQ) entry.getValue();
                c6885tQ.toString();
                c6885tQ.m24927i(this.f45621g);
            }
            i++;
        }
    }

    /* renamed from: y */
    public final void m25887y(int i, byte[] bArr) throws IOException {
        C7074wQ c7074wQ = new C7074wQ(bArr);
        m25885v(c7074wQ);
        m25888z(c7074wQ, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01cc  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25888z(p000.C7074wQ r29, int r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7137xQ.m25888z(wQ, int):void");
    }

    public C7137xQ(InputStream inputStream) throws Throwable {
        C6948uQ[][] c6948uQArr = f45596W;
        this.f45619e = new HashMap[c6948uQArr.length];
        this.f45620f = new HashSet(c6948uQArr.length);
        this.f45621g = ByteOrder.BIG_ENDIAN;
        this.f45615a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f45617c = (AssetManager.AssetInputStream) inputStream;
            this.f45616b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                AbstractC7263zQ.m26435c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f45617c = null;
                this.f45616b = fileInputStream.getFD();
            } catch (Exception unused) {
            }
        } else {
            this.f45617c = null;
            this.f45616b = null;
        }
        m25884u(inputStream);
    }
}

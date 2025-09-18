package com.reactnative.ivpusic.imagepicker;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.yalantis.ucrop.UCropActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import p000.AbstractActivityC11909zJ0;
import p000.AbstractC0345FT;
import p000.AbstractC3982eJ;
import p000.C0758M2;
import p000.C0821N2;
import p000.C0827N8;
import p000.C0884O2;
import p000.C0947P2;
import p000.C1010Q2;
import p000.C1135S2;
import p000.C6457mw;
import p000.C7137xQ;
import p000.C8467We1;
import p000.C8692aB0;
import p000.O02;
import p000.PA0;
import p000.QS0;
import p000.YO1;

/* loaded from: classes2.dex */
class PickerModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int CAMERA_PICKER_REQUEST = 61111;
    private static final String E_ACTIVITY_DOES_NOT_EXIST = "E_ACTIVITY_DOES_NOT_EXIST";
    private static final String E_CALLBACK_ERROR = "E_CALLBACK_ERROR";
    private static final String E_CAMERA_IS_NOT_AVAILABLE = "E_CAMERA_IS_NOT_AVAILABLE";
    private static final String E_CANNOT_LAUNCH_CAMERA = "E_CANNOT_LAUNCH_CAMERA";
    private static final String E_ERROR_WHILE_CLEANING_FILES = "E_ERROR_WHILE_CLEANING_FILES";
    private static final String E_FAILED_TO_OPEN_CAMERA = "E_FAILED_TO_OPEN_CAMERA";
    private static final String E_FAILED_TO_SHOW_PICKER = "E_FAILED_TO_SHOW_PICKER";
    private static final String E_NO_CAMERA_PERMISSION_KEY = "E_NO_CAMERA_PERMISSION";
    private static final String E_NO_CAMERA_PERMISSION_MSG = "User did not grant camera permission.";
    private static final String E_NO_IMAGE_DATA_FOUND = "E_NO_IMAGE_DATA_FOUND";
    private static final String E_NO_LIBRARY_PERMISSION_KEY = "E_NO_LIBRARY_PERMISSION";
    private static final String E_NO_LIBRARY_PERMISSION_MSG = "User did not grant library permission.";
    private static final String E_PICKER_CANCELLED_KEY = "E_PICKER_CANCELLED";
    private static final String E_PICKER_CANCELLED_MSG = "User cancelled image selection";
    private static final int IMAGE_PICKER_REQUEST = 61110;
    private C6457mw compression;
    private String cropperActiveWidgetColor;
    private boolean cropperCircleOverlay;
    private String cropperStatusBarColor;
    private String cropperToolbarColor;
    private String cropperToolbarTitle;
    private String cropperToolbarWidgetColor;
    private boolean cropping;
    private boolean disableCropperColorSetters;
    private boolean enableRotationGesture;
    private boolean freeStyleCropEnabled;
    private int height;
    private boolean hideBottomControls;
    private boolean includeBase64;
    private boolean includeExif;
    private Uri mCameraCaptureURI;
    private String mCurrentMediaPath;
    private String mediaType;
    private boolean multiple;
    private ReadableMap options;
    private ReactApplicationContext reactContext;
    private QS0 resultCollector;
    private boolean showCropFrame;
    private boolean showCropGuidelines;
    private boolean useFrontCamera;
    private int width;

    public PickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mediaType = "any";
        this.multiple = false;
        this.includeBase64 = false;
        this.includeExif = false;
        this.cropping = false;
        this.cropperCircleOverlay = false;
        this.freeStyleCropEnabled = false;
        this.showCropGuidelines = true;
        this.showCropFrame = true;
        this.hideBottomControls = false;
        this.enableRotationGesture = false;
        this.disableCropperColorSetters = false;
        this.useFrontCamera = false;
        this.cropperActiveWidgetColor = null;
        this.cropperStatusBarColor = null;
        this.cropperToolbarColor = null;
        this.cropperToolbarTitle = null;
        this.cropperToolbarWidgetColor = null;
        this.width = 0;
        this.height = 0;
        this.resultCollector = new QS0();
        this.compression = new C6457mw();
        reactApplicationContext.addActivityEventListener(this);
        this.reactContext = reactApplicationContext;
    }

    private void cameraPickerResult(Activity activity, int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.resultCollector.m6713c(E_PICKER_CANCELLED_KEY, E_PICKER_CANCELLED_MSG);
            return;
        }
        if (i2 == -1) {
            Uri uri = this.mCameraCaptureURI;
            if (uri == null) {
                this.resultCollector.m6713c(E_NO_IMAGE_DATA_FOUND, "Cannot resolve image url");
                return;
            }
            if (this.cropping) {
                new Bundle().putString("com.yalantis.ucrop.CompressionFormatName", Bitmap.CompressFormat.JPEG.name());
                startCropping(activity, uri);
                return;
            }
            try {
                this.resultCollector.m6715e(1);
                WritableMap selection = getSelection(activity, uri, true);
                if (selection != null) {
                    this.resultCollector.m6714d(selection);
                }
            } catch (Exception e) {
                this.resultCollector.m6713c(E_NO_IMAGE_DATA_FOUND, e.getMessage());
            }
        }
    }

    private void configureCropperColors(C8467We1 c8467We1) {
        String str = this.cropperActiveWidgetColor;
        if (str != null) {
            c8467We1.f13309a.putInt("com.yalantis.ucrop.UcropColorControlsWidgetActive", Color.parseColor(str));
        }
        String str2 = this.cropperToolbarColor;
        if (str2 != null) {
            c8467We1.f13309a.putInt("com.yalantis.ucrop.ToolbarColor", Color.parseColor(str2));
        }
        String str3 = this.cropperStatusBarColor;
        if (str3 != null) {
            c8467We1.f13309a.putInt("com.yalantis.ucrop.StatusBarColor", Color.parseColor(str3));
        }
        String str4 = this.cropperToolbarWidgetColor;
        if (str4 != null) {
            c8467We1.f13309a.putInt("com.yalantis.ucrop.UcropToolbarWidgetColor", Color.parseColor(str4));
        }
    }

    private File createExternalStoragePrivateFile(Context context, Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        String extension = getExtension(context, uri);
        File file = new File(context.getExternalCacheDir(), "/temp/" + System.currentTimeMillis() + "." + extension);
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[inputStreamOpenInputStream.available()];
            inputStreamOpenInputStream.read(bArr);
            fileOutputStream.write(bArr);
            inputStreamOpenInputStream.close();
            fileOutputStream.close();
        } catch (IOException unused) {
            file.toString();
        }
        return file;
    }

    private File createImageFile() throws IOException {
        String str = "image-" + UUID.randomUUID().toString();
        File externalFilesDir = this.reactContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File fileCreateTempFile = File.createTempFile(str, ".jpg", externalFilesDir);
        this.mCurrentMediaPath = "file:" + fileCreateTempFile.getAbsolutePath();
        return fileCreateTempFile;
    }

    private File createVideoFile() throws IOException {
        String str = "video-" + UUID.randomUUID().toString();
        File externalFilesDir = this.reactContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists() && !externalFilesDir.isDirectory()) {
            externalFilesDir.mkdirs();
        }
        File fileCreateTempFile = File.createTempFile(str, ".mp4", externalFilesDir);
        this.mCurrentMediaPath = "file:" + fileCreateTempFile.getAbsolutePath();
        return fileCreateTempFile;
    }

    private void croppingResult(Activity activity, int i, int i2, Intent intent) throws Exception {
        if (intent == null) {
            this.resultCollector.m6713c(E_PICKER_CANCELLED_KEY, E_PICKER_CANCELLED_MSG);
            return;
        }
        Uri uriFromFile = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        if (uriFromFile == null) {
            this.resultCollector.m6713c(E_NO_IMAGE_DATA_FOUND, "Cannot find image data");
            return;
        }
        try {
            if (this.width > 0 && this.height > 0) {
                C6457mw c6457mw = this.compression;
                ReactApplicationContext reactApplicationContext = this.reactContext;
                String path = uriFromFile.getPath();
                int i3 = this.width;
                int i4 = this.height;
                c6457mw.getClass();
                uriFromFile = Uri.fromFile(C6457mw.m23018a(reactApplicationContext, path, i3, i4, i3, i4, 100));
            }
            WritableMap selection = getSelection(activity, uriFromFile, false);
            if (selection == null) {
                throw new Exception("Cannot crop video files");
            }
            selection.putMap("cropRect", getCroppedRectMap(intent));
            this.resultCollector.m6715e(1);
            this.resultCollector.m6714d(selection);
        } catch (Exception e) {
            this.resultCollector.m6713c(E_NO_IMAGE_DATA_FOUND, e.getMessage());
        }
    }

    public void deleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteRecursive(file2);
            }
        }
        file.delete();
    }

    private void getAsyncSelection(Activity activity, Uri uri, boolean z) throws Exception {
        String strResolveRealPath = resolveRealPath(activity, uri, z);
        if (strResolveRealPath == null || strResolveRealPath.isEmpty()) {
            this.resultCollector.m6713c(E_NO_IMAGE_DATA_FOUND, "Cannot resolve asset path.");
            return;
        }
        String mimeType = getMimeType(strResolveRealPath);
        if (mimeType == null || !mimeType.startsWith("video/")) {
            this.resultCollector.m6714d(getImage(activity, strResolveRealPath));
        } else {
            getVideo(activity, strResolveRealPath, mimeType);
        }
    }

    private String getBase64StringFromFile(String str) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            byte[] bArr = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static WritableMap getCroppedRectMap(Intent intent) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("x", intent.getIntExtra("com.yalantis.ucrop.OffsetX", -1));
        writableNativeMap.putInt("y", intent.getIntExtra("com.yalantis.ucrop.OffsetY", -1));
        writableNativeMap.putInt(Snapshot.WIDTH, intent.getIntExtra("com.yalantis.ucrop.ImageWidth", -1));
        writableNativeMap.putInt(Snapshot.HEIGHT, intent.getIntExtra("com.yalantis.ucrop.ImageHeight", -1));
        return writableNativeMap;
    }

    private WritableMap getImage(Activity activity, String str) throws Exception {
        File fileM23018a;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (str.startsWith("http://") || str.startsWith("https://")) {
            throw new Exception("Cannot select remote files");
        }
        BitmapFactory.Options optionsValidateImage = validateImage(str);
        int iM25870f = new C7137xQ(str).m25870f(1, "Orientation");
        boolean z = iM25870f == 6 || iM25870f == 8 || iM25870f == 5 || iM25870f == 7;
        C6457mw c6457mw = this.compression;
        ReactApplicationContext reactApplicationContext = this.reactContext;
        ReadableMap readableMap = this.options;
        c6457mw.getClass();
        Integer numValueOf = readableMap.hasKey("compressImageMaxWidth") ? Integer.valueOf(readableMap.getInt("compressImageMaxWidth")) : null;
        Integer numValueOf2 = readableMap.hasKey("compressImageMaxHeight") ? Integer.valueOf(readableMap.getInt("compressImageMaxHeight")) : null;
        Double dValueOf = readableMap.hasKey("compressImageQuality") ? Double.valueOf(readableMap.getDouble("compressImageQuality")) : null;
        boolean z2 = dValueOf == null || dValueOf.doubleValue() == 1.0d;
        boolean z3 = numValueOf == null || numValueOf.intValue() >= optionsValidateImage.outWidth;
        boolean z4 = numValueOf2 == null || numValueOf2.intValue() >= optionsValidateImage.outHeight;
        boolean z5 = z;
        List listAsList = Arrays.asList(ClipboardModule.MIMETYPE_JPEG, ClipboardModule.MIMETYPE_JPG, ClipboardModule.MIMETYPE_PNG, "image/gif", "image/tiff");
        String str2 = optionsValidateImage.outMimeType;
        boolean z6 = str2 != null && listAsList.contains(str2.toLowerCase());
        if (z2 && z3 && z4 && z6) {
            fileM23018a = new File(str);
        } else {
            int iDoubleValue = dValueOf != null ? (int) (dValueOf.doubleValue() * 100.0d) : 100;
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(optionsValidateImage.outWidth);
            }
            if (numValueOf2 == null) {
                numValueOf2 = Integer.valueOf(optionsValidateImage.outHeight);
            }
            fileM23018a = C6457mw.m23018a(reactApplicationContext, str, optionsValidateImage.outWidth, optionsValidateImage.outHeight, numValueOf.intValue(), numValueOf2.intValue(), iDoubleValue);
        }
        String path = fileM23018a.getPath();
        BitmapFactory.Options optionsValidateImage2 = validateImage(path);
        long jLastModified = new File(str).lastModified();
        writableNativeMap.putString("path", "file://" + path);
        writableNativeMap.putInt(Snapshot.WIDTH, z5 ? optionsValidateImage2.outHeight : optionsValidateImage2.outWidth);
        writableNativeMap.putInt(Snapshot.HEIGHT, z5 ? optionsValidateImage2.outWidth : optionsValidateImage2.outHeight);
        writableNativeMap.putString("mime", optionsValidateImage2.outMimeType);
        writableNativeMap.putInt("size", (int) new File(path).length());
        writableNativeMap.putString("modificationDate", String.valueOf(jLastModified));
        writableNativeMap.putString("filename", new File(str).getName());
        if (this.includeBase64) {
            writableNativeMap.putString("data", getBase64StringFromFile(path));
        }
        if (this.includeExif) {
            try {
                writableNativeMap.putMap("exif", O02.m5926a(str));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return writableNativeMap;
    }

    private String getMimeType(String str) {
        Uri uriFromFile = Uri.fromFile(new File(str));
        if (uriFromFile.getScheme().equals(RemoteMessageConst.Notification.CONTENT)) {
            return this.reactContext.getContentResolver().getType(uriFromFile);
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uriFromFile.toString());
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
        }
        return null;
    }

    private WritableMap getSelection(Activity activity, Uri uri, boolean z) throws Exception {
        String strResolveRealPath = resolveRealPath(activity, uri, z);
        if (strResolveRealPath == null || strResolveRealPath.isEmpty()) {
            throw new Exception("Cannot resolve asset path.");
        }
        String mimeType = getMimeType(strResolveRealPath);
        if (mimeType == null || !mimeType.startsWith("video/")) {
            return getImage(activity, strResolveRealPath);
        }
        getVideo(activity, strResolveRealPath, mimeType);
        return null;
    }

    public String getTmpDir(Activity activity) {
        String str = activity.getCacheDir() + "/react-native-image-crop-picker";
        new File(str).mkdir();
        return str;
    }

    private void getVideo(Activity activity, String str, String str2) throws Exception {
        validateVideo(str);
        new Thread(new RunnableC2403d(this, activity, str, getTmpDir(activity) + "/" + UUID.randomUUID().toString() + ".mp4", str2)).run();
    }

    public static Long getVideoDuration(String str) throws IllegalArgumentException {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            return Long.valueOf(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)));
        } catch (Exception unused) {
            return -1L;
        }
    }

    private void imagePickerResult(Activity activity, int i, int i2, Intent intent) {
        ClipData clipData;
        if (i2 == 0) {
            this.resultCollector.m6713c(E_PICKER_CANCELLED_KEY, E_PICKER_CANCELLED_MSG);
            return;
        }
        if (i2 == -1) {
            if (this.multiple) {
                ClipData clipData2 = intent.getClipData();
                try {
                    if (clipData2 == null) {
                        this.resultCollector.m6715e(1);
                        getAsyncSelection(activity, intent.getData(), false);
                        return;
                    }
                    this.resultCollector.m6715e(clipData2.getItemCount());
                    for (int i3 = 0; i3 < clipData2.getItemCount(); i3++) {
                        getAsyncSelection(activity, clipData2.getItemAt(i3).getUri(), false);
                    }
                    return;
                } catch (Exception e) {
                    this.resultCollector.m6713c(E_NO_IMAGE_DATA_FOUND, e.getMessage());
                    return;
                }
            }
            Uri data = intent.getData();
            if (data == null && (clipData = intent.getClipData()) != null && clipData.getItemCount() > 0) {
                data = clipData.getItemAt(0).getUri();
            }
            if (data == null) {
                this.resultCollector.m6713c(E_NO_IMAGE_DATA_FOUND, "Cannot resolve image url");
                return;
            }
            if (this.cropping) {
                startCropping(activity, data);
                return;
            }
            try {
                getAsyncSelection(activity, data, false);
            } catch (Exception e2) {
                this.resultCollector.m6713c(E_NO_IMAGE_DATA_FOUND, e2.getMessage());
            }
        }
    }

    public void initiateCamera(Activity activity) {
        String str;
        File fileCreateImageFile;
        try {
            if (this.mediaType.equals("video")) {
                str = "android.media.action.VIDEO_CAPTURE";
                fileCreateImageFile = createVideoFile();
            } else {
                str = "android.media.action.IMAGE_CAPTURE";
                fileCreateImageFile = createImageFile();
            }
            Intent intent = new Intent(str);
            Uri uriM2663d = AbstractC0345FT.m2663d(activity, activity.getApplicationContext().getPackageName() + ".provider", fileCreateImageFile);
            this.mCameraCaptureURI = uriM2663d;
            intent.putExtra("output", uriM2663d);
            if (this.useFrontCamera) {
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            }
            if (intent.resolveActivity(activity.getPackageManager()) == null) {
                this.resultCollector.m6713c(E_CANNOT_LAUNCH_CAMERA, "Cannot launch camera");
            } else {
                activity.startActivityForResult(intent, CAMERA_PICKER_REQUEST);
            }
        } catch (Exception e) {
            this.resultCollector.m6712b(E_FAILED_TO_OPEN_CAMERA, e);
        }
    }

    public void initiatePicker(Activity activity) {
        C8692aB0 c8692aB0;
        try {
            C0821N2 c0821n2 = C0821N2.f7467a;
            if (this.cropping || this.mediaType.equals("photo")) {
                C0947P2 c0947p2 = new C0947P2();
                c8692aB0 = new C8692aB0();
                c8692aB0.f15379a = c0947p2;
            } else if (this.cropping) {
                C0884O2 c0884o2 = C0884O2.f8189a;
                c8692aB0 = new C8692aB0();
                c8692aB0.f15379a = c0884o2;
            } else if (this.mediaType.equals("video")) {
                C1010Q2 c1010q2 = C1010Q2.f9405a;
                c8692aB0 = new C8692aB0();
                c8692aB0.f15379a = c1010q2;
            } else {
                c8692aB0 = new C8692aB0();
                c8692aB0.f15379a = c0821n2;
            }
            activity.startActivityForResult(this.multiple ? new C0758M2().mo4866a(activity, c8692aB0) : new C1135S2(0).m7152d(activity, c8692aB0), IMAGE_PICKER_REQUEST);
        } catch (Exception e) {
            this.resultCollector.m6712b(E_FAILED_TO_SHOW_PICKER, e);
        }
    }

    private boolean isCameraAvailable(Activity activity) {
        return activity.getPackageManager().hasSystemFeature("android.hardware.camera") || activity.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void permissionsCheck(Activity activity, Promise promise, List<String> list, Callable<Void> callable) throws Exception {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        if (Build.VERSION.SDK_INT > 29) {
            arrayList2.remove("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (AbstractC3982eJ.m17899a(activity, str) != 0) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            ((AbstractActivityC11909zJ0) ((PA0) activity)).m26369k((String[]) arrayList.toArray(new String[arrayList.size()]), 1, new C0827N8(promise, 18, callable));
        } else {
            try {
                callable.call();
            } catch (Exception e) {
                promise.reject(E_CALLBACK_ERROR, "Unknown error", e);
            }
        }
    }

    private String resolveRealPath(Activity activity, Uri uri, boolean z) throws IOException {
        int i = Build.VERSION.SDK_INT;
        String path = z ? Uri.parse(this.mCurrentMediaPath).getPath() : YO1.m9286a(activity, uri);
        if (i >= 29) {
            return (path.startsWith(Uri.fromFile(activity.getExternalCacheDir()).getPath()) || path.startsWith(Uri.fromFile(activity.getExternalFilesDir(null)).getPath()) || path.startsWith(Uri.fromFile(activity.getCacheDir()).getPath()) || path.startsWith(Uri.fromFile(activity.getFilesDir()).getPath())) ? path : YO1.m9286a(activity, Uri.fromFile(createExternalStoragePrivateFile(activity, uri)));
        }
        return path;
    }

    private void setConfiguration(ReadableMap readableMap) {
        this.mediaType = readableMap.hasKey("mediaType") ? readableMap.getString("mediaType") : "any";
        this.multiple = readableMap.hasKey("multiple") && readableMap.getBoolean("multiple");
        this.includeBase64 = readableMap.hasKey("includeBase64") && readableMap.getBoolean("includeBase64");
        this.includeExif = readableMap.hasKey("includeExif") && readableMap.getBoolean("includeExif");
        this.width = readableMap.hasKey(Snapshot.WIDTH) ? readableMap.getInt(Snapshot.WIDTH) : 0;
        this.height = readableMap.hasKey(Snapshot.HEIGHT) ? readableMap.getInt(Snapshot.HEIGHT) : 0;
        this.cropping = readableMap.hasKey("cropping") && readableMap.getBoolean("cropping");
        this.cropperActiveWidgetColor = readableMap.hasKey("cropperActiveWidgetColor") ? readableMap.getString("cropperActiveWidgetColor") : null;
        this.cropperStatusBarColor = readableMap.hasKey("cropperStatusBarColor") ? readableMap.getString("cropperStatusBarColor") : null;
        this.cropperToolbarColor = readableMap.hasKey("cropperToolbarColor") ? readableMap.getString("cropperToolbarColor") : null;
        this.cropperToolbarTitle = readableMap.hasKey("cropperToolbarTitle") ? readableMap.getString("cropperToolbarTitle") : null;
        this.cropperToolbarWidgetColor = readableMap.hasKey("cropperToolbarWidgetColor") ? readableMap.getString("cropperToolbarWidgetColor") : null;
        this.cropperCircleOverlay = readableMap.hasKey("cropperCircleOverlay") && readableMap.getBoolean("cropperCircleOverlay");
        this.freeStyleCropEnabled = readableMap.hasKey("freeStyleCropEnabled") && readableMap.getBoolean("freeStyleCropEnabled");
        this.showCropGuidelines = !readableMap.hasKey("showCropGuidelines") || readableMap.getBoolean("showCropGuidelines");
        this.showCropFrame = !readableMap.hasKey("showCropFrame") || readableMap.getBoolean("showCropFrame");
        this.hideBottomControls = readableMap.hasKey("hideBottomControls") && readableMap.getBoolean("hideBottomControls");
        this.enableRotationGesture = readableMap.hasKey("enableRotationGesture") && readableMap.getBoolean("enableRotationGesture");
        this.disableCropperColorSetters = readableMap.hasKey("disableCropperColorSetters") && readableMap.getBoolean("disableCropperColorSetters");
        this.useFrontCamera = readableMap.hasKey("useFrontCamera") && readableMap.getBoolean("useFrontCamera");
        this.options = readableMap;
    }

    public void startCropping(Activity activity, Uri uri) {
        int i;
        C8467We1 c8467We1 = new C8467We1();
        String strName = Bitmap.CompressFormat.JPEG.name();
        Bundle bundle = c8467We1.f13309a;
        bundle.putString("com.yalantis.ucrop.CompressionFormatName", strName);
        bundle.putInt("com.yalantis.ucrop.CompressionQuality", 100);
        bundle.putBoolean("com.yalantis.ucrop.CircleDimmedLayer", this.cropperCircleOverlay);
        bundle.putBoolean("com.yalantis.ucrop.FreeStyleCrop", this.freeStyleCropEnabled);
        bundle.putBoolean("com.yalantis.ucrop.ShowCropGrid", this.showCropGuidelines);
        bundle.putBoolean("com.yalantis.ucrop.ShowCropFrame", this.showCropFrame);
        bundle.putBoolean("com.yalantis.ucrop.HideBottomControls", this.hideBottomControls);
        String str = this.cropperToolbarTitle;
        if (str != null) {
            bundle.putString("com.yalantis.ucrop.UcropToolbarTitleText", str);
        }
        if (this.enableRotationGesture) {
            bundle.putIntArray("com.yalantis.ucrop.AllowedGestures", new int[]{3, 3, 3});
        }
        if (!this.disableCropperColorSetters) {
            configureCropperColors(c8467We1);
        }
        Uri uriFromFile = Uri.fromFile(new File(getTmpDir(activity), UUID.randomUUID().toString() + ".jpg"));
        Intent intent = new Intent();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("com.yalantis.ucrop.InputUri", uri);
        bundle2.putParcelable("com.yalantis.ucrop.OutputUri", uriFromFile);
        bundle2.putAll(bundle);
        int i2 = this.width;
        if (i2 > 0 && (i = this.height) > 0) {
            bundle2.putFloat("com.yalantis.ucrop.AspectRatioX", i2);
            bundle2.putFloat("com.yalantis.ucrop.AspectRatioY", i);
        }
        intent.setClass(activity, UCropActivity.class);
        intent.putExtras(bundle2);
        activity.startActivityForResult(intent, 69);
    }

    private BitmapFactory.Options validateImage(String str) throws Exception {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inDither = true;
        BitmapFactory.decodeFile(str, options);
        if (options.outMimeType == null || options.outWidth == 0 || options.outHeight == 0) {
            throw new Exception("Invalid image selected");
        }
        return options;
    }

    public Bitmap validateVideo(String str) throws Exception {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
        if (frameAtTime != null) {
            return frameAtTime;
        }
        throw new Exception("Cannot retrieve video data");
    }

    @ReactMethod
    public void clean(Promise promise) throws Exception {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
        } else {
            permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new CallableC2400a(this, currentActivity, promise, 0));
        }
    }

    @ReactMethod
    public void cleanSingle(String str, Promise promise) throws Exception {
        if (str == null) {
            promise.reject(E_ERROR_WHILE_CLEANING_FILES, "Cannot cleanup empty path");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
        } else {
            permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new CallableC2400a(str, this, promise));
        }
    }

    public String getExtension(Context context, Uri uri) {
        return uri.getScheme().equals(RemoteMessageConst.Notification.CONTENT) ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageCropPicker";
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) throws Exception {
        if (i == IMAGE_PICKER_REQUEST) {
            imagePickerResult(activity, i, i2, intent);
        } else if (i == CAMERA_PICKER_REQUEST) {
            cameraPickerResult(activity, i, i2, intent);
        } else if (i == 69) {
            croppingResult(activity, i, i2, intent);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void openCamera(ReadableMap readableMap, Promise promise) throws Exception {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
        } else {
            if (!isCameraAvailable(currentActivity)) {
                promise.reject(E_CAMERA_IS_NOT_AVAILABLE, "Camera not available");
                return;
            }
            setConfiguration(readableMap);
            this.resultCollector.m6716f(false, promise);
            permissionsCheck(currentActivity, promise, Arrays.asList("android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"), new CallableC2401b(this, currentActivity, 0));
        }
    }

    @ReactMethod
    public void openCropper(ReadableMap readableMap, Promise promise) throws Exception {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
            return;
        }
        setConfiguration(readableMap);
        this.resultCollector.m6716f(false, promise);
        permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new CallableC2400a(this, currentActivity, Uri.parse(readableMap.getString("path")), 2));
    }

    @ReactMethod
    public void openPicker(ReadableMap readableMap, Promise promise) throws Exception {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Activity doesn't exist");
            return;
        }
        setConfiguration(readableMap);
        this.resultCollector.m6716f(this.multiple, promise);
        permissionsCheck(currentActivity, promise, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), new CallableC2401b(this, currentActivity, 1));
    }
}

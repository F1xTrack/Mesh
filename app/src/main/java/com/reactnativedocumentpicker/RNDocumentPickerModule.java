package com.reactnativedocumentpicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import p000.AH0;
import p000.AbstractC0852NX;
import p000.AbstractC11153tN0;
import p000.C11905zH0;

/* loaded from: classes2.dex */
public class RNDocumentPickerModule extends NativeDocumentPickerSpec {
    private static final String E_ACTIVITY_DOES_NOT_EXIST = "ACTIVITY_DOES_NOT_EXIST";
    private static final String E_DOCUMENT_PICKER_CANCELED = "DOCUMENT_PICKER_CANCELED";
    private static final String E_FAILED_TO_SHOW_PICKER = "FAILED_TO_SHOW_PICKER";
    private static final String E_INVALID_DATA_RETURNED = "INVALID_DATA_RETURNED";
    private static final String E_UNABLE_TO_OPEN_FILE_TYPE = "UNABLE_TO_OPEN_FILE_TYPE";
    private static final String E_UNEXPECTED_EXCEPTION = "UNEXPECTED_EXCEPTION";
    private static final String E_UNKNOWN_ACTIVITY_RESULT = "UNKNOWN_ACTIVITY_RESULT";
    private static final String FIELD_COPY_ERROR = "copyError";
    private static final String FIELD_FILE_COPY_URI = "fileCopyUri";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_SIZE = "size";
    private static final String FIELD_TYPE = "type";
    private static final String FIELD_URI = "uri";
    public static final String NAME = "RNDocumentPicker";
    private static final String OPTION_COPY_TO = "copyTo";
    private static final String OPTION_MULTIPLE = "allowMultiSelection";
    private static final String OPTION_TYPE = "type";
    private static final int PICK_DIR_REQUEST_CODE = 42;
    private static final int READ_REQUEST_CODE = 41;
    private final ActivityEventListener activityEventListener;
    private String copyTo;
    private Promise promise;

    public RNDocumentPickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C11905zH0 c11905zH0 = new C11905zH0(this, 0);
        this.activityEventListener = c11905zH0;
        reactApplicationContext.addActivityEventListener(c11905zH0);
    }

    public void onPickDirectoryResult(int i, Intent intent) {
        if (i != -1) {
            sendError(E_UNKNOWN_ACTIVITY_RESULT, AbstractC11153tN0.m24909u(i, "Unknown activity result: "));
            return;
        }
        if (intent == null || intent.getData() == null) {
            sendError(E_INVALID_DATA_RETURNED, "Invalid data returned by intent");
            return;
        }
        Uri data = intent.getData();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(FIELD_URI, data.toString());
        this.promise.resolve(writableMapCreateMap);
    }

    private String[] readableArrayToStringArray(ReadableArray readableArray) {
        int size = readableArray.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = readableArray.getString(i);
        }
        return strArr;
    }

    public void sendError(String str, String str2) {
        sendError(str, str2, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
        super.invalidate();
    }

    public void onShowActivityResult(int i, Intent intent, Promise promise) {
        Uri data;
        ClipData clipData;
        if (i != -1) {
            sendError(E_UNKNOWN_ACTIVITY_RESULT, AbstractC11153tN0.m24909u(i, "Unknown activity result: "));
            return;
        }
        if (intent != null) {
            data = intent.getData();
            clipData = intent.getClipData();
        } else {
            data = null;
            clipData = null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (clipData != null && clipData.getItemCount() > 0) {
                int itemCount = clipData.getItemCount();
                for (int i2 = 0; i2 < itemCount; i2++) {
                    arrayList.add(clipData.getItemAt(i2).getUri());
                }
            } else {
                if (data == null) {
                    sendError(E_INVALID_DATA_RETURNED, "Invalid data returned by intent");
                    return;
                }
                arrayList.add(data);
            }
            new AH0(getReactApplicationContext(), arrayList, this.copyTo, promise).execute(new Void[0]);
        } catch (Exception e) {
            sendError(E_UNEXPECTED_EXCEPTION, e.getLocalizedMessage(), e);
        }
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    @ReactMethod
    public void pick(ReadableMap readableMap, Promise promise) {
        ReadableArray array;
        Activity currentActivity = getCurrentActivity();
        this.promise = promise;
        this.copyTo = readableMap.hasKey(OPTION_COPY_TO) ? readableMap.getString(OPTION_COPY_TO) : null;
        if (currentActivity == null) {
            sendError(E_ACTIVITY_DOES_NOT_EXIST, "Current activity does not exist");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            boolean z = false;
            if (!readableMap.isNull("type") && (array = readableMap.getArray("type")) != null) {
                if (array.size() > 1) {
                    String[] strArr = readableArrayToStringArray(array);
                    intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
                    intent.setType(AbstractC0852NX.m5761j(strArr));
                } else if (array.size() == 1) {
                    intent.setType(array.getString(0));
                }
            }
            if (!readableMap.isNull(OPTION_MULTIPLE) && readableMap.getBoolean(OPTION_MULTIPLE)) {
                z = true;
            }
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
            currentActivity.startActivityForResult(intent, READ_REQUEST_CODE, Bundle.EMPTY);
        } catch (ActivityNotFoundException e) {
            sendError(E_UNABLE_TO_OPEN_FILE_TYPE, e.getLocalizedMessage());
        } catch (Exception e2) {
            e2.printStackTrace();
            sendError(E_FAILED_TO_SHOW_PICKER, e2.getLocalizedMessage());
        }
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    @ReactMethod
    public void pickDirectory(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Current activity does not exist");
            return;
        }
        this.promise = promise;
        try {
            currentActivity.startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 42, null);
        } catch (Exception e) {
            sendError(E_FAILED_TO_SHOW_PICKER, "Failed to create directory picker", e);
        }
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    public void releaseSecureAccess(ReadableArray readableArray, Promise promise) {
        promise.reject("RNDocumentPicker:releaseSecureAccess", "releaseSecureAccess is not supported on Android");
    }

    private void sendError(String str, String str2, Exception exc) {
        Promise promise = this.promise;
        if (promise != null) {
            this.promise = null;
            promise.reject(str, str2, exc);
        }
    }
}

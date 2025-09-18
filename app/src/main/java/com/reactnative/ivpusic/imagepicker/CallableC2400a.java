package com.reactnative.ivpusic.imagepicker;

import android.app.Activity;
import android.net.Uri;
import com.facebook.react.bridge.Promise;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.reactnative.ivpusic.imagepicker.a */
/* loaded from: classes2.dex */
public final class CallableC2400a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f20233a;

    /* renamed from: b */
    public final /* synthetic */ PickerModule f20234b;

    /* renamed from: c */
    public final /* synthetic */ Object f20235c;

    /* renamed from: d */
    public final /* synthetic */ Object f20236d;

    public /* synthetic */ CallableC2400a(PickerModule pickerModule, Activity activity, Object obj, int i) {
        this.f20233a = i;
        this.f20234b = pickerModule;
        this.f20236d = activity;
        this.f20235c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        File file;
        String strSubstring;
        File file2;
        switch (this.f20233a) {
            case 0:
                Promise promise = (Promise) this.f20235c;
                PickerModule pickerModule = this.f20234b;
                try {
                    file = new File(pickerModule.getTmpDir((Activity) this.f20236d));
                } catch (Exception e) {
                    e.printStackTrace();
                    promise.reject("E_ERROR_WHILE_CLEANING_FILES", e.getMessage());
                }
                if (!file.exists()) {
                    throw new Exception("File does not exist");
                }
                pickerModule.deleteRecursive(file);
                promise.resolve(null);
                return null;
            case 1:
                Promise promise2 = (Promise) this.f20235c;
                try {
                    strSubstring = (String) this.f20236d;
                    if (strSubstring.startsWith("file://")) {
                        strSubstring = strSubstring.substring(7);
                    }
                    file2 = new File(strSubstring);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    promise2.reject("E_ERROR_WHILE_CLEANING_FILES", e2.getMessage());
                }
                if (file2.exists()) {
                    this.f20234b.deleteRecursive(file2);
                    promise2.resolve(null);
                    return null;
                }
                throw new Exception("File does not exist. Path: " + strSubstring);
            default:
                this.f20234b.startCropping((Activity) this.f20236d, (Uri) this.f20235c);
                return null;
        }
    }

    public CallableC2400a(String str, PickerModule pickerModule, Promise promise) {
        this.f20233a = 1;
        this.f20236d = str;
        this.f20234b = pickerModule;
        this.f20235c = promise;
    }
}

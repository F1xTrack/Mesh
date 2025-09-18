package com.reactnative.ivpusic.imagepicker;

import android.app.Activity;
import android.net.Uri;
import com.facebook.react.bridge.Promise;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class a implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerModule b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(PickerModule pickerModule, Activity activity, Object obj, int i) {
        this.a = i;
        this.b = pickerModule;
        this.d = activity;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        File file;
        String strSubstring;
        File file2;
        switch (this.a) {
            case 0:
                Promise promise = (Promise) this.c;
                PickerModule pickerModule = this.b;
                try {
                    file = new File(pickerModule.getTmpDir((Activity) this.d));
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
                Promise promise2 = (Promise) this.c;
                try {
                    strSubstring = (String) this.d;
                    if (strSubstring.startsWith("file://")) {
                        strSubstring = strSubstring.substring(7);
                    }
                    file2 = new File(strSubstring);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    promise2.reject("E_ERROR_WHILE_CLEANING_FILES", e2.getMessage());
                }
                if (file2.exists()) {
                    this.b.deleteRecursive(file2);
                    promise2.resolve(null);
                    return null;
                }
                throw new Exception("File does not exist. Path: " + strSubstring);
            default:
                this.b.startCropping((Activity) this.d, (Uri) this.c);
                return null;
        }
    }

    public a(String str, PickerModule pickerModule, Promise promise) {
        this.a = 1;
        this.d = str;
        this.b = pickerModule;
        this.c = promise;
    }
}

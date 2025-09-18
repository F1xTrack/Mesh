package com.google.firebase.crashlytics.ndk;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean z = JniNativeApi.b;
        return str.toLowerCase().endsWith(".apk");
    }
}

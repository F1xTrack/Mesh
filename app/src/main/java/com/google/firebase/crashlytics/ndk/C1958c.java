package com.google.firebase.crashlytics.ndk;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.firebase.crashlytics.ndk.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C1958c implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean z = JniNativeApi.f18454b;
        return str.toLowerCase().endsWith(".apk");
    }
}

package com.vk.push.common.utils;

import defpackage.O90;
import defpackage.OS0;
import defpackage.RQ1;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"existsSafe", "", "Ljava/io/File;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FileExtensionKt {
    public static final boolean existsSafe(File file) {
        Object objB;
        O90.f(file, "<this>");
        try {
            objB = Boolean.valueOf(file.exists());
        } catch (Throwable th) {
            objB = RQ1.b(th);
        }
        Object obj = Boolean.FALSE;
        if (objB instanceof OS0) {
            objB = obj;
        }
        return ((Boolean) objB).booleanValue();
    }
}

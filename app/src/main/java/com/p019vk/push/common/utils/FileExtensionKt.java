package com.p019vk.push.common.utils;

import java.io.File;
import kotlin.Metadata;
import p000.O90;
import p000.OS0;
import p000.RQ1;

@Metadata(m22266d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m22267d2 = {"existsSafe", "", "Ljava/io/File;", "common_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class FileExtensionKt {
    public static final boolean existsSafe(File file) {
        Object objM7015b;
        O90.m5968f(file, "<this>");
        try {
            objM7015b = Boolean.valueOf(file.exists());
        } catch (Throwable th) {
            objM7015b = RQ1.m7015b(th);
        }
        Object obj = Boolean.FALSE;
        if (objM7015b instanceof OS0) {
            objM7015b = obj;
        }
        return ((Boolean) objM7015b).booleanValue();
    }
}

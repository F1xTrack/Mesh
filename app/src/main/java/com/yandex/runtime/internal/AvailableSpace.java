package com.yandex.runtime.internal;

import java.io.File;

/* loaded from: classes2.dex */
class AvailableSpace {
    public static long getAvailableSpaceOnFilesystem(String str) throws Exception {
        return new File(str).getUsableSpace();
    }
}

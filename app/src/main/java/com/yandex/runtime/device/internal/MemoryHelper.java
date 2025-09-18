package com.yandex.runtime.device.internal;

import android.app.ActivityManager;
import com.yandex.runtime.Runtime;

/* loaded from: classes2.dex */
class MemoryHelper {
    public static int getAllowedMemorySize() {
        return ((ActivityManager) Runtime.getApplicationContext().getSystemService("activity")).getMemoryClass();
    }
}

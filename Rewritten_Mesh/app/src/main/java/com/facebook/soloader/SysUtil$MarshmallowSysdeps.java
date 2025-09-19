package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.TreeSet;
import p000.InterfaceC0902OK;

@InterfaceC0902OK
@TargetApi(23)
/* loaded from: classes.dex */
final class SysUtil$MarshmallowSysdeps {
    private SysUtil$MarshmallowSysdeps() {
    }

    @InterfaceC0902OK
    public static String[] getSupportedAbis() {
        String[] strArr = Build.SUPPORTED_ABIS;
        TreeSet treeSet = new TreeSet();
        if (is64Bit()) {
            treeSet.add("arm64-v8a");
            treeSet.add("x86_64");
        } else {
            treeSet.add("armeabi-v7a");
            treeSet.add("x86");
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (treeSet.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @InterfaceC0902OK
    public static boolean is64Bit() {
        return Process.is64Bit();
    }
}

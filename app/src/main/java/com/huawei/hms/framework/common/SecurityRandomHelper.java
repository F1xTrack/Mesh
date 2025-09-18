package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import p000.AbstractC7261zO;

/* loaded from: classes.dex */
public class SecurityRandomHelper {

    @SuppressLint({"StaticFieldLeak"})
    public static volatile SecurityRandomHelper instance;

    private SecurityRandomHelper() {
    }

    public static SecurityRandomHelper getInstance() {
        if (instance == null) {
            synchronized (SecurityRandomHelper.class) {
                try {
                    if (instance == null) {
                        instance = new SecurityRandomHelper();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public byte[] generateSecureRandom(int i) {
        return AbstractC7261zO.m26397b(i);
    }

    public String generateSecureRandomStr(int i) {
        return AbstractC7261zO.m26398c(i);
    }
}

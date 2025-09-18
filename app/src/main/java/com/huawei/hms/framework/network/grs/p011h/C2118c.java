package com.huawei.hms.framework.network.grs.p011h;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.huawei.hms.framework.network.grs.h.c */
/* loaded from: classes.dex */
public class C2118c {

    /* renamed from: a */
    private static final String f19114a = "c";

    /* renamed from: a */
    public static String m11866a(String str, Context context) throws IOException {
        Logger.m11680d(f19114a, "Io getConfigContent, fileName: " + str);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStreamOpen = null;
        try {
            try {
                if (!new File(str).isDirectory()) {
                    inputStreamOpen = context.getAssets().open(str);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = inputStreamOpen.read(bArr);
                        if (i == -1) {
                            byteArrayOutputStream.flush();
                            String string = byteArrayOutputStream.toString("UTF-8");
                            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
                            IoUtils.closeSecure(inputStreamOpen);
                            return string;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                }
            } catch (IOException unused) {
                Logger.m11691w(f19114a, "local config file is not exist.filename is {%s}", str);
            }
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStreamOpen);
            return "";
        } catch (Throwable th) {
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStreamOpen);
            throw th;
        }
    }
}

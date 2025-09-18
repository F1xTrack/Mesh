package com.huawei.hms.push;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.huawei.hms.support.log.HMSLog;
import java.lang.reflect.Field;
import p000.AbstractC1374Vq;

/* renamed from: com.huawei.hms.push.s */
/* loaded from: classes.dex */
public class C2233s {
    /* renamed from: a */
    public static int m12521a(Context context, String str, String str2) throws NoSuchFieldException, NumberFormatException {
        try {
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier == 0) {
                Field field = Class.forName(context.getPackageName() + ".R$" + str).getField(str2);
                identifier = Integer.parseInt(field.get(field.getName()).toString());
                if (identifier == 0) {
                    HMSLog.m12622i("ResourceLoader", "Error-resourceType=" + str + "--resourceName=" + str2 + "--resourceId =" + identifier);
                }
            }
            return identifier;
        } catch (ClassNotFoundException e) {
            HMSLog.m12621e("ResourceLoader", AbstractC1374Vq.m8590i("!!!! ResourceLoader: ClassNotFoundException-resourceType=", str, "--resourceName=", str2), e);
            return 0;
        } catch (IllegalAccessException e2) {
            HMSLog.m12621e("ResourceLoader", AbstractC1374Vq.m8590i("!!!! ResourceLoader: IllegalAccessException-resourceType=", str, "--resourceName=", str2), e2);
            return 0;
        } catch (NumberFormatException e3) {
            HMSLog.m12621e("ResourceLoader", AbstractC1374Vq.m8590i("!!!! ResourceLoader: NumberFormatException-resourceType=", str, "--resourceName=", str2), e3);
            return 0;
        } catch (IllegalArgumentException e4) {
            HMSLog.m12621e("ResourceLoader", AbstractC1374Vq.m8590i("!!!! ResourceLoader: IllegalArgumentException-resourceType=", str, "--resourceName=", str2), e4);
            return 0;
        } catch (NoSuchFieldException e5) {
            HMSLog.m12621e("ResourceLoader", AbstractC1374Vq.m8590i("!!!! ResourceLoader: NoSuchFieldException-resourceType=", str, "--resourceName=", str2), e5);
            return 0;
        }
    }

    /* renamed from: a */
    public static int m12520a(Context context, String str) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt(str);
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.m12623w("ResourceLoader", "load meta data resource failed.");
            return 0;
        }
    }
}

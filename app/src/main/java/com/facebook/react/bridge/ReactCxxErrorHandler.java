package com.facebook.react.bridge;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.AbstractC3929dS;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes.dex */
public class ReactCxxErrorHandler {
    private static Method mHandleErrorFunc;
    private static Object mObject;

    @InterfaceC0965PK
    private static void handleError(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (mHandleErrorFunc != null) {
            try {
                mHandleErrorFunc.invoke(mObject, new Exception(str));
            } catch (Exception unused) {
                AbstractC3929dS.m17675h("ReactCxxErrorHandler");
            }
        }
    }

    @InterfaceC0965PK
    public static void setHandleErrorFunc(Object obj, Method method) {
        mObject = obj;
        mHandleErrorFunc = method;
    }
}

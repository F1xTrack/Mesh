package com.facebook.react.modules.core;

import android.util.JsonWriter;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.JsonWriterHelper;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.JavascriptException;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import java.io.IOException;
import java.io.StringWriter;
import p000.AbstractC3929dS;
import p000.AbstractC7626Ga0;
import p000.InterfaceC1839cJ;
import p000.InterfaceC9101dL0;

@InterfaceC9101dL0(name = NativeExceptionsManagerSpec.NAME)
/* loaded from: classes.dex */
public class ExceptionsManagerModule extends NativeExceptionsManagerSpec {
    private final InterfaceC1839cJ mDevSupportManager;

    public ExceptionsManagerModule(InterfaceC1839cJ interfaceC1839cJ) {
        super(null);
        this.mDevSupportManager = interfaceC1839cJ;
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void dismissRedbox() {
        this.mDevSupportManager.getClass();
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportException(ReadableMap readableMap) throws IOException {
        String string = readableMap.hasKey("message") ? readableMap.getString("message") : "";
        ReadableArray array = readableMap.hasKey("stack") ? readableMap.getArray("stack") : Arguments.createArray();
        boolean z = readableMap.hasKey("isFatal") ? readableMap.getBoolean("isFatal") : false;
        String string2 = null;
        if (readableMap.getType("extraData") != ReadableType.Null) {
            try {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                JsonWriterHelper.value(jsonWriter, readableMap.getDynamic("extraData"));
                jsonWriter.close();
                stringWriter.close();
                string2 = stringWriter.toString();
            } catch (IOException unused) {
            }
        }
        if (z) {
            throw new JavascriptException(AbstractC7626Ga0.m3094a(array, string));
        }
        AbstractC7626Ga0.m3094a(array, string);
        AbstractC3929dS.m17672e("ReactNative");
        if (string2 != null) {
            AbstractC3929dS.m17668a(string2, "ReactNative", "extraData: %s");
        }
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportFatalException(String str, ReadableArray readableArray, double d) throws IOException {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt(NotificationConstants.f19487ID, (int) d);
        javaOnlyMap.putBoolean("isFatal", true);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportSoftException(String str, ReadableArray readableArray, double d) throws IOException {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt(NotificationConstants.f19487ID, (int) d);
        javaOnlyMap.putBoolean("isFatal", false);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void updateExceptionMessage(String str, ReadableArray readableArray, double d) {
        this.mDevSupportManager.getClass();
    }
}
